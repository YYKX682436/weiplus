package lu1;

/* loaded from: classes4.dex */
public abstract class j0 {
    public static r45.nu a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        r45.nu nuVar = new r45.nu();
        nuVar.f381672d = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        nuVar.f381673e = jSONObject.optString("descriptor");
        nuVar.f381674f = jSONObject.optString("phone");
        nuVar.f381675g = jSONObject.optString("country");
        nuVar.f381676h = jSONObject.optString("province");
        nuVar.f381677i = jSONObject.optString("city");
        nuVar.f381678m = jSONObject.optString("address");
        nuVar.f381679n = (float) jSONObject.optDouble("distance");
        nuVar.f381680o = (float) jSONObject.optDouble("longitude");
        nuVar.f381681p = (float) jSONObject.optDouble("latitude");
        nuVar.f381682q = jSONObject.optString("jump_url");
        nuVar.f381683r = jSONObject.optString("app_brand_user_name");
        nuVar.f381684s = jSONObject.optString("app_brand_pass");
        return nuVar;
    }
}
