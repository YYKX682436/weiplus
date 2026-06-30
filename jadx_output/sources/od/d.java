package od;

/* loaded from: classes8.dex */
public class d extends od.e {
    public d(java.lang.String str, org.json.JSONObject jSONObject) {
        super(od.b.EVENT);
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("event name can not be null or empty");
        }
        jSONObject = jSONObject == null ? new org.json.JSONObject() : jSONObject;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", str);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject);
        this.f344497b = new org.json.JSONObject(hashMap);
    }
}
