// swift-tools-version:5.8
import PackageDescription

let package = Package(
    name: "ValhallaMobile",
    platforms: [
        .iOS("16.4")
        // .tvOS(.v13),
        // .watchOS(.v6),
        // .macOS(.v10_13)
    ],
    products: [
        .library(
            name: "Valhalla",
            targets: ["Valhalla"]
        )
    ],
    dependencies: [
        .package(url: "https://github.com/nortiz1349/valhalla-openapi-models-swift.git", from: "0.0.4"),
        .package(url: "https://github.com/nortiz1349/Light-Swift-Untar.git", from: "1.0.5"),
    ],
    targets: [
        .target(
            name: "Valhalla",
            dependencies: [
                "ValhallaObjc",
                "ValhallaWrapper",
                .product(name: "ValhallaConfigModels", package: "valhalla-openapi-models-swift"),
                .product(name: "ValhallaModels", package: "valhalla-openapi-models-swift"),
                .product(name: "Light-Swift-Untar", package: "Light-Swift-Untar"),
            ],
            path: "Sources/Valhalla",
            resources: [
                .process("SupportData")
            ]
        ),
        .target(
            name: "ValhallaObjc",
            dependencies: ["ValhallaWrapper"],
            path: "Sources/ValhallaObjc",
            linkerSettings: [.linkedLibrary("z")]
        ),
        .binaryTarget(
            name: "ValhallaWrapper",
            url: "https://github.com/Rallista/valhalla-mobile/releases/download/0.1.7/valhalla-wrapper.xcframework.zip",
            checksum: "4b3b97dcd5e10f08e32d8517b90b7bd819b9eaf2b4c7493b2de8da89717ad43c"
        ),
    ],
    cLanguageStandard: .gnu17,
    cxxLanguageStandard: .cxx17
)
