package od;

/* loaded from: classes8.dex */
public class i extends od.a {
    public i(org.json.JSONObject jSONObject) {
        this.f344496a = od.b.valueOf(jSONObject.getString("type"));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        this.f344497b = optJSONObject;
        if (optJSONObject == null) {
            this.f344497b = new org.json.JSONObject();
        }
    }
}
