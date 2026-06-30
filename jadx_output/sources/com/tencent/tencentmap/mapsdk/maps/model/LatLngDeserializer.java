package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class LatLngDeserializer implements com.tencent.map.tools.json.JsonParser.Deserializer<com.tencent.tencentmap.mapsdk.maps.model.LatLng> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.map.tools.json.JsonParser.Deserializer
    public com.tencent.tencentmap.mapsdk.maps.model.LatLng deserialize(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof org.json.JSONObject) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(jSONObject.optDouble("lat"), jSONObject.optDouble("lng"));
        }
        if (obj2 instanceof org.json.JSONArray) {
            org.json.JSONArray jSONArray = (org.json.JSONArray) obj2;
            if (jSONArray.length() < 2) {
                return null;
            }
            if (jSONArray.length() > 2) {
                return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(jSONArray.getDouble(0), jSONArray.getDouble(1), jSONArray.getDouble(2));
            }
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(jSONArray.getDouble(0), jSONArray.getDouble(1));
        }
        if (!(obj2 instanceof org.json.JSONStringer) && !(obj2 instanceof java.lang.String)) {
            return null;
        }
        java.lang.String[] split = obj2.toString().split(",");
        if (split.length < 2) {
            return null;
        }
        if (split.length > 2) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(java.lang.Double.parseDouble(split[0]), java.lang.Double.parseDouble(split[1]), java.lang.Double.parseDouble(split[2]));
        }
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(java.lang.Double.parseDouble(split[0]), java.lang.Double.parseDouble(split[1]));
    }
}
