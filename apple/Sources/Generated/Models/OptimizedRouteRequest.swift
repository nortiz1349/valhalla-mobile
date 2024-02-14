//
// OptimizedRouteRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
    import AnyCodable
#endif

public struct OptimizedRouteRequest: Codable, JSONEncodable, Hashable {
    /** An identifier to disambiguate requests (echoed by the server). */
    public var id: String?
    /** The list of locations. The first and last are assumed to be the start and end points, and all intermediate points are locations that you want to visit along the way. */
    public var locations: [Coordinate]
    public var costing: MatrixCostingModel
    public var costingOptions: CostingOptions?
    public var directionsOptions: DirectionsOptions?

    public init(id: String? = nil, locations: [Coordinate], costing: MatrixCostingModel, costingOptions: CostingOptions? = nil, directionsOptions: DirectionsOptions? = nil) {
        self.id = id
        self.locations = locations
        self.costing = costing
        self.costingOptions = costingOptions
        self.directionsOptions = directionsOptions
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case locations
        case costing
        case costingOptions = "costing_options"
        case directionsOptions = "directions_options"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encode(locations, forKey: .locations)
        try container.encode(costing, forKey: .costing)
        try container.encodeIfPresent(costingOptions, forKey: .costingOptions)
        try container.encodeIfPresent(directionsOptions, forKey: .directionsOptions)
    }
}
