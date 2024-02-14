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
 * The use for the edge.
 *
 * Values: road,ramp,turnChannel,track,driveway,alley,parkingAisle,emergencyAccess,driveThrough,culdesac,livingStreet,serviceRoad,cycleway,mountainBike,sidewalk,footway,steps,path,pedestrian,pedestrianCrossing,bridleway,restArea,serviceArea,other,ferry,railMinusFerry,rail,bus,egressConnection,platformConnection,transitConnection
 */

@JsonClass(generateAdapter = false)
enum class EdgeUse(val value: kotlin.String) {

    @Json(name = "road")
    road("road"),

    @Json(name = "ramp")
    ramp("ramp"),

    @Json(name = "turn_channel")
    turnChannel("turn_channel"),

    @Json(name = "track")
    track("track"),

    @Json(name = "driveway")
    driveway("driveway"),

    @Json(name = "alley")
    alley("alley"),

    @Json(name = "parking_aisle")
    parkingAisle("parking_aisle"),

    @Json(name = "emergency_access")
    emergencyAccess("emergency_access"),

    @Json(name = "drive_through")
    driveThrough("drive_through"),

    @Json(name = "culdesac")
    culdesac("culdesac"),

    @Json(name = "living_street")
    livingStreet("living_street"),

    @Json(name = "service_road")
    serviceRoad("service_road"),

    @Json(name = "cycleway")
    cycleway("cycleway"),

    @Json(name = "mountain_bike")
    mountainBike("mountain_bike"),

    @Json(name = "sidewalk")
    sidewalk("sidewalk"),

    @Json(name = "footway")
    footway("footway"),

    @Json(name = "steps")
    steps("steps"),

    @Json(name = "path")
    path("path"),

    @Json(name = "pedestrian")
    pedestrian("pedestrian"),

    @Json(name = "pedestrian_crossing")
    pedestrianCrossing("pedestrian_crossing"),

    @Json(name = "bridleway")
    bridleway("bridleway"),

    @Json(name = "rest_area")
    restArea("rest_area"),

    @Json(name = "service_area")
    serviceArea("service_area"),

    @Json(name = "other")
    other("other"),

    @Json(name = "ferry")
    ferry("ferry"),

    @Json(name = "rail-ferry")
    railMinusFerry("rail-ferry"),

    @Json(name = "rail")
    rail("rail"),

    @Json(name = "bus")
    bus("bus"),

    @Json(name = "egress_connection")
    egressConnection("egress_connection"),

    @Json(name = "platform_connection")
    platformConnection("platform_connection"),

    @Json(name = "transit_connection")
    transitConnection("transit_connection");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is EdgeUse) "$data" else null

        /**
         * Returns a valid [EdgeUse] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): EdgeUse? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

