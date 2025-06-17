// swift-tools-version:5.8
import PackageDescription

let package = Package(
    name: "ValhallaMobile",
    platforms: [
        .iOS("16.3"),
        .macOS("13")
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
            url: "https://github.com/nortiz1349/valhalla-mobile/releases/download/0.2.1/valhalla-wrapper.xcframework.zip",
            checksum: "21db1c87c47177ec886bb190b85964822be30de64fb9f3861578bc1b4d4da3bd"
        )
    ],
    cLanguageStandard: .gnu17,
    cxxLanguageStandard: .cxx17
)
