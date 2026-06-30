package od;

/* loaded from: classes8.dex */
public class c extends od.e {
    public c(long j17, int i17, java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        super(od.b.CALLBACK);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("callbackId", java.lang.Integer.valueOf(i17));
        hashMap.put("liteCallbackId", java.lang.Long.valueOf(j17));
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("error", str);
        }
        if (jSONObject != null) {
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject);
        }
        hashMap.put("keepCallback", java.lang.Boolean.valueOf(z17));
        this.f344497b = new org.json.JSONObject(hashMap);
    }
}
