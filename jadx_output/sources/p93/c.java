package p93;

/* loaded from: classes7.dex */
public class c implements nw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p93.d f352890a;

    public c(p93.d dVar) {
        this.f352890a = dVar;
    }

    @Override // nw4.e
    public void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        p93.d dVar = this.f352890a;
        if (dVar.f352894c.containsKey(java.lang.Integer.valueOf(str))) {
            dVar.getClass();
            int parseInt = java.lang.Integer.parseInt(str);
            jd.c cVar = (jd.c) dVar.f352894c.get(java.lang.Integer.valueOf(parseInt));
            if (cVar != null) {
                java.util.HashMap hashMap = map != null ? new java.util.HashMap(map) : new java.util.HashMap();
                hashMap.put("err_msg", str2);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    if (str2.contains("fail")) {
                        jSONObject.put("result", false);
                        jSONObject.put("errMsg", str2);
                    } else {
                        jSONObject.put("result", true);
                        jSONObject.put("errMsg", "");
                    }
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject(hashMap));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiBridgeLuggageService", e17, "", new java.lang.Object[0]);
                }
                com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(cVar.f299025b, cVar.f299024a, cVar.f299026c, cVar.f299027d, parseInt, jSONObject.toString(), false, true);
            }
            dVar.f352894c.remove(java.lang.Integer.valueOf(str));
        }
    }
}
