/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package Models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * Values: edgePeriodNames,edgePeriodLength,edgePeriodSpeed,edgePeriodRoadClass,edgePeriodBeginHeading,edgePeriodEndHeading,edgePeriodBeginShapeIndex,edgePeriodEndShapeIndex,edgePeriodTraversability,edgePeriodUse,edgePeriodToll,edgePeriodUnpaved,edgePeriodTunnel,edgePeriodBridge,edgePeriodRoundabout,edgePeriodInternalIntersection,edgePeriodDriveOnRight,edgePeriodSurface,edgePeriodSignPeriodExitNumber,edgePeriodSignPeriodExitBranch,edgePeriodSignPeriodExitToward,edgePeriodSignPeriodExitName,edgePeriodTravelMode,edgePeriodVehicleType,edgePeriodPedestrianType,edgePeriodBicycleType,edgePeriodTransitType,edgePeriodId,edgePeriodWayId,edgePeriodWeightedGrade,edgePeriodMaxUpwardGrade,edgePeriodMaxDownwardGrade,edgePeriodMeanElevation,edgePeriodLaneCount,edgePeriodCycleLane,edgePeriodBicycleNetwork,edgePeriodSacScale,edgePeriodSidewalk,edgePeriodDensity,edgePeriodSpeedLimit,edgePeriodTruckSpeed,edgePeriodTruckRoute,nodePeriodIntersectingEdgePeriodBeginHeading,nodePeriodIntersectingEdgePeriodFromEdgeNameConsistency,nodePeriodIntersectingEdgePeriodToEdgeNameConsistency,nodePeriodIntersectingEdgePeriodDriveability,nodePeriodIntersectingEdgePeriodCyclability,nodePeriodIntersectingEdgePeriodWalkability,nodePeriodIntersectingEdgePeriodUse,nodePeriodIntersectingEdgePeriodRoadClass,nodePeriodElapsedTime,nodePeriodAdminIndex,nodePeriodType,nodePeriodFork,nodePeriodTimeZone,osmChangeset,shape,adminPeriodCountryCode,adminPeriodCountryText,adminPeriodStateCode,adminPeriodStateText,matchedPeriodPoint,matchedPeriodType,matchedPeriodEdgeIndex,matchedPeriodBeginRouteDiscontinuity,matchedPeriodEndRouteDiscontinuity,matchedPeriodDistanceAlongEdge,matchedPeriodDistanceFromTracePoint
 */

@JsonClass(generateAdapter = false)
enum class TraceAttributeKey(val value: kotlin.String) {

    @Json(name = "edge.names")
    edgePeriodNames("edge.names"),

    @Json(name = "edge.length")
    edgePeriodLength("edge.length"),

    @Json(name = "edge.speed")
    edgePeriodSpeed("edge.speed"),

    @Json(name = "edge.road_class")
    edgePeriodRoadClass("edge.road_class"),

    @Json(name = "edge.begin_heading")
    edgePeriodBeginHeading("edge.begin_heading"),

    @Json(name = "edge.end_heading")
    edgePeriodEndHeading("edge.end_heading"),

    @Json(name = "edge.begin_shape_index")
    edgePeriodBeginShapeIndex("edge.begin_shape_index"),

    @Json(name = "edge.end_shape_index")
    edgePeriodEndShapeIndex("edge.end_shape_index"),

    @Json(name = "edge.traversability")
    edgePeriodTraversability("edge.traversability"),

    @Json(name = "edge.use")
    edgePeriodUse("edge.use"),

    @Json(name = "edge.toll")
    edgePeriodToll("edge.toll"),

    @Json(name = "edge.unpaved")
    edgePeriodUnpaved("edge.unpaved"),

    @Json(name = "edge.tunnel")
    edgePeriodTunnel("edge.tunnel"),

    @Json(name = "edge.bridge")
    edgePeriodBridge("edge.bridge"),

    @Json(name = "edge.roundabout")
    edgePeriodRoundabout("edge.roundabout"),

    @Json(name = "edge.internal_intersection")
    edgePeriodInternalIntersection("edge.internal_intersection"),

    @Json(name = "edge.drive_on_right")
    edgePeriodDriveOnRight("edge.drive_on_right"),

    @Json(name = "edge.surface")
    edgePeriodSurface("edge.surface"),

    @Json(name = "edge.sign.exit_number")
    edgePeriodSignPeriodExitNumber("edge.sign.exit_number"),

    @Json(name = "edge.sign.exit_branch")
    edgePeriodSignPeriodExitBranch("edge.sign.exit_branch"),

    @Json(name = "edge.sign.exit_toward")
    edgePeriodSignPeriodExitToward("edge.sign.exit_toward"),

    @Json(name = "edge.sign.exit_name")
    edgePeriodSignPeriodExitName("edge.sign.exit_name"),

    @Json(name = "edge.travel_mode")
    edgePeriodTravelMode("edge.travel_mode"),

    @Json(name = "edge.vehicle_type")
    edgePeriodVehicleType("edge.vehicle_type"),

    @Json(name = "edge.pedestrian_type")
    edgePeriodPedestrianType("edge.pedestrian_type"),

    @Json(name = "edge.bicycle_type")
    edgePeriodBicycleType("edge.bicycle_type"),

    @Json(name = "edge.transit_type")
    edgePeriodTransitType("edge.transit_type"),

    @Json(name = "edge.id")
    edgePeriodId("edge.id"),

    @Json(name = "edge.way_id")
    edgePeriodWayId("edge.way_id"),

    @Json(name = "edge.weighted_grade")
    edgePeriodWeightedGrade("edge.weighted_grade"),

    @Json(name = "edge.max_upward_grade")
    edgePeriodMaxUpwardGrade("edge.max_upward_grade"),

    @Json(name = "edge.max_downward_grade")
    edgePeriodMaxDownwardGrade("edge.max_downward_grade"),

    @Json(name = "edge.mean_elevation")
    edgePeriodMeanElevation("edge.mean_elevation"),

    @Json(name = "edge.lane_count")
    edgePeriodLaneCount("edge.lane_count"),

    @Json(name = "edge.cycle_lane")
    edgePeriodCycleLane("edge.cycle_lane"),

    @Json(name = "edge.bicycle_network")
    edgePeriodBicycleNetwork("edge.bicycle_network"),

    @Json(name = "edge.sac_scale")
    edgePeriodSacScale("edge.sac_scale"),

    @Json(name = "edge.sidewalk")
    edgePeriodSidewalk("edge.sidewalk"),

    @Json(name = "edge.density")
    edgePeriodDensity("edge.density"),

    @Json(name = "edge.speed_limit")
    edgePeriodSpeedLimit("edge.speed_limit"),

    @Json(name = "edge.truck_speed")
    edgePeriodTruckSpeed("edge.truck_speed"),

    @Json(name = "edge.truck_route")
    edgePeriodTruckRoute("edge.truck_route"),

    @Json(name = "node.intersecting_edge.begin_heading")
    nodePeriodIntersectingEdgePeriodBeginHeading("node.intersecting_edge.begin_heading"),

    @Json(name = "node.intersecting_edge.from_edge_name_consistency")
    nodePeriodIntersectingEdgePeriodFromEdgeNameConsistency("node.intersecting_edge.from_edge_name_consistency"),

    @Json(name = "node.intersecting_edge.to_edge_name_consistency")
    nodePeriodIntersectingEdgePeriodToEdgeNameConsistency("node.intersecting_edge.to_edge_name_consistency"),

    @Json(name = "node.intersecting_edge.driveability")
    nodePeriodIntersectingEdgePeriodDriveability("node.intersecting_edge.driveability"),

    @Json(name = "node.intersecting_edge.cyclability")
    nodePeriodIntersectingEdgePeriodCyclability("node.intersecting_edge.cyclability"),

    @Json(name = "node.intersecting_edge.walkability")
    nodePeriodIntersectingEdgePeriodWalkability("node.intersecting_edge.walkability"),

    @Json(name = "node.intersecting_edge.use")
    nodePeriodIntersectingEdgePeriodUse("node.intersecting_edge.use"),

    @Json(name = "node.intersecting_edge.road_class")
    nodePeriodIntersectingEdgePeriodRoadClass("node.intersecting_edge.road_class"),

    @Json(name = "node.elapsed_time")
    nodePeriodElapsedTime("node.elapsed_time"),

    @Json(name = "node.admin_index")
    nodePeriodAdminIndex("node.admin_index"),

    @Json(name = "node.type")
    nodePeriodType("node.type"),

    @Json(name = "node.fork")
    nodePeriodFork("node.fork"),

    @Json(name = "node.time_zone")
    nodePeriodTimeZone("node.time_zone"),

    @Json(name = "osm_changeset")
    osmChangeset("osm_changeset"),

    @Json(name = "shape")
    shape("shape"),

    @Json(name = "admin.country_code")
    adminPeriodCountryCode("admin.country_code"),

    @Json(name = "admin.country_text")
    adminPeriodCountryText("admin.country_text"),

    @Json(name = "admin.state_code")
    adminPeriodStateCode("admin.state_code"),

    @Json(name = "admin.state_text")
    adminPeriodStateText("admin.state_text"),

    @Json(name = "matched.point")
    matchedPeriodPoint("matched.point"),

    @Json(name = "matched.type")
    matchedPeriodType("matched.type"),

    @Json(name = "matched.edge_index")
    matchedPeriodEdgeIndex("matched.edge_index"),

    @Json(name = "matched.begin_route_discontinuity")
    matchedPeriodBeginRouteDiscontinuity("matched.begin_route_discontinuity"),

    @Json(name = "matched.end_route_discontinuity")
    matchedPeriodEndRouteDiscontinuity("matched.end_route_discontinuity"),

    @Json(name = "matched.distance_along_edge")
    matchedPeriodDistanceAlongEdge("matched.distance_along_edge"),

    @Json(name = "matched.distance_from_trace_point")
    matchedPeriodDistanceFromTracePoint("matched.distance_from_trace_point");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is TraceAttributeKey) "$data" else null

        /**
         * Returns a valid [TraceAttributeKey] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): TraceAttributeKey? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

