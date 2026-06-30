package q93;

/* loaded from: classes7.dex */
public class f implements nw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q93.g f360917a;

    public f(q93.g gVar) {
        this.f360917a = gVar;
    }

    @Override // nw4.e
    public void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        q93.g gVar = this.f360917a;
        if (gVar.f360921c.containsKey(java.lang.Integer.valueOf(str))) {
            gVar.getClass();
            int intValue = java.lang.Integer.valueOf(str).intValue();
            jd.c cVar = (jd.c) gVar.f360921c.get(java.lang.Integer.valueOf(intValue));
            java.util.HashMap hashMap = map != null ? new java.util.HashMap(map) : new java.util.HashMap();
            hashMap.put("err_msg", str2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiWebViewService", e17, "", new java.lang.Object[0]);
            }
            if (!str2.contains("fail") && !str2.contains("error")) {
                jSONObject.put("result", true);
                jSONObject.put("errMsg", "");
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject(hashMap));
                com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(cVar.f299025b, cVar.f299024a, cVar.f299026c, cVar.f299027d, intValue, jSONObject.toString(), false, cVar.f299029f);
                gVar.f360921c.remove(java.lang.Integer.valueOf(str));
            }
            jSONObject.put("result", false);
            jSONObject.put("errMsg", str2);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject(hashMap));
            com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(cVar.f299025b, cVar.f299024a, cVar.f299026c, cVar.f299027d, intValue, jSONObject.toString(), false, cVar.f299029f);
            gVar.f360921c.remove(java.lang.Integer.valueOf(str));
        }
    }
}
