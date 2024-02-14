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

import Models.GeoAttributes
import Models.HighwayClassification
import Models.NodeId
import Models.Restrictions
import Models.Speeds

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param sidewalkLeft Is there a sidewalk to the left of the edge?
 * @param sidewalkRight Is there a sidewalk to the right of the edge?
 * @param laneCount 
 * @param stopSign Is there a stop sign at end of the directed edge?
 * @param sacScale 
 * @param yieldSign Is there a yield sign at end of the directed edge?
 * @param notThru Does the edge lead to a \"no-through\" region?
 * @param forward Is the edge info forward? If false, then reverse is implied.
 * @param endNode 
 * @param truckRoute Is the edge part of a truck route/network?
 * @param speeds 
 * @param bikeNetwork Is the edge part of a bicycle network?
 * @param roundAbout Is the edge part of a roundabout?
 * @param trafficSignal Is there a traffic signal at the end of the directed edge?
 * @param accessRestriction Is there a general restriction or access condition?
 * @param destinationOnly Is the edge destination only? If so, it will not be routed through.
 * @param geoAttributes 
 * @param startRestriction 
 * @param cycleLane Indication of the type of cycle lane (if any) present along an edge.
 * @param endRestriction 
 * @param seasonal Is access seasonal (ex. no access in winter)?
 * @param countryCrossing Does the edge cross into a new country?
 * @param partOfComplexRestriction Is the edge part of a complex restriction?
 * @param hasSign Do exit signs exist for the edge?
 * @param access 
 * @param bridge Is the edge part of a bridge?
 * @param classification 
 * @param toll Is the edge part of a toll road?
 * @param tunnel Is the edge part of a tunnel?
 */


data class LocateDetailedEdge (

    /* Is there a sidewalk to the left of the edge? */
    @Json(name = "sidewalk_left")
    val sidewalkLeft: kotlin.Boolean? = null,

    /* Is there a sidewalk to the right of the edge? */
    @Json(name = "sidewalk_right")
    val sidewalkRight: kotlin.Boolean? = null,

    @Json(name = "lane_count")
    val laneCount: kotlin.Int? = null,

    /* Is there a stop sign at end of the directed edge? */
    @Json(name = "stop_sign")
    val stopSign: kotlin.Boolean? = null,

    @Json(name = "sac_scale")
    val sacScale: LocateDetailedEdge.SacScale? = null,

    /* Is there a yield sign at end of the directed edge? */
    @Json(name = "yield_sign")
    val yieldSign: kotlin.Boolean? = null,

    /* Does the edge lead to a \"no-through\" region? */
    @Json(name = "not_thru")
    val notThru: kotlin.Boolean? = null,

    /* Is the edge info forward? If false, then reverse is implied. */
    @Json(name = "forward")
    val forward: kotlin.Boolean? = null,

    @Json(name = "end_node")
    val endNode: NodeId? = null,

    /* Is the edge part of a truck route/network? */
    @Json(name = "truck_route")
    val truckRoute: kotlin.Boolean? = null,

    @Json(name = "speeds")
    val speeds: Speeds? = null,

    /* Is the edge part of a bicycle network? */
    @Json(name = "bike_network")
    val bikeNetwork: kotlin.Boolean? = null,

    /* Is the edge part of a roundabout? */
    @Json(name = "round_about")
    val roundAbout: kotlin.Boolean? = null,

    /* Is there a traffic signal at the end of the directed edge? */
    @Json(name = "traffic_signal")
    val trafficSignal: kotlin.Boolean? = null,

    /* Is there a general restriction or access condition? */
    @Json(name = "access_restriction")
    val accessRestriction: kotlin.Boolean? = null,

    /* Is the edge destination only? If so, it will not be routed through. */
    @Json(name = "destination_only")
    val destinationOnly: kotlin.Boolean? = null,

    @Json(name = "geo_attributes")
    val geoAttributes: GeoAttributes? = null,

    @Json(name = "start_restriction")
    val startRestriction: Restrictions? = null,

    /* Indication of the type of cycle lane (if any) present along an edge. */
    @Json(name = "cycle_lane")
    val cycleLane: LocateDetailedEdge.CycleLane? = null,

    @Json(name = "end_restriction")
    val endRestriction: Restrictions? = null,

    /* Is access seasonal (ex. no access in winter)? */
    @Json(name = "seasonal")
    val seasonal: kotlin.Boolean? = null,

    /* Does the edge cross into a new country? */
    @Json(name = "country_crossing")
    val countryCrossing: kotlin.Boolean? = null,

    /* Is the edge part of a complex restriction? */
    @Json(name = "part_of_complex_restriction")
    val partOfComplexRestriction: kotlin.Boolean? = null,

    /* Do exit signs exist for the edge? */
    @Json(name = "has_sign")
    val hasSign: kotlin.Boolean? = null,

    @Json(name = "access")
    val access: Restrictions? = null,

    /* Is the edge part of a bridge? */
    @Json(name = "bridge")
    val bridge: kotlin.Boolean? = null,

    @Json(name = "classification")
    val classification: HighwayClassification? = null,

    /* Is the edge part of a toll road? */
    @Json(name = "toll")
    val toll: kotlin.Boolean? = null,

    /* Is the edge part of a tunnel? */
    @Json(name = "tunnel")
    val tunnel: kotlin.Boolean? = null

) {

    /**
     * 
     *
     * Values: none,hiking,mountainHiking,demandingMountainHiking,alpineHiking,demandingAlpineHiking,difficultAlpineHiking
     */
    @JsonClass(generateAdapter = false)
    enum class SacScale(val value: kotlin.String) {
        @Json(name = "none") none("none"),
        @Json(name = "hiking") hiking("hiking"),
        @Json(name = "mountain hiking") mountainHiking("mountain hiking"),
        @Json(name = "demanding mountain hiking") demandingMountainHiking("demanding mountain hiking"),
        @Json(name = "alpine hiking") alpineHiking("alpine hiking"),
        @Json(name = "demanding alpine hiking") demandingAlpineHiking("demanding alpine hiking"),
        @Json(name = "difficult alpine hiking") difficultAlpineHiking("difficult alpine hiking");
    }
    /**
     * Indication of the type of cycle lane (if any) present along an edge.
     *
     * Values: none,shared,dedicated,separated
     */
    @JsonClass(generateAdapter = false)
    enum class CycleLane(val value: kotlin.String) {
        @Json(name = "none") none("none"),
        @Json(name = "shared") shared("shared"),
        @Json(name = "dedicated") dedicated("dedicated"),
        @Json(name = "separated") separated("separated");
    }
}

