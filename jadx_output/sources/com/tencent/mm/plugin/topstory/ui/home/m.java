package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175038e;

    public m(com.tencent.mm.plugin.topstory.ui.home.j jVar, java.lang.String str) {
        this.f175038e = jVar;
        this.f175037d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175038e;
        java.lang.String str = this.f175037d;
        jVar.Q = com.tencent.mm.plugin.topstory.ui.home.j.a(jVar, str);
        androidx.appcompat.app.AppCompatActivity context = jVar.f174986d.getContext();
        jVar.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "enterFinderUI() called with: context = [" + context + "], json = [" + str + "]");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str).getJSONObject("open_finder_feed_ext_info");
            jSONObject2.put("requestCode", 16);
            java.lang.String optString = jSONObject2.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            java.lang.String str2 = jVar.f174988f.f377183e;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, optString);
            jSONObject3.put("topStorySessionId", str2);
            jSONObject2.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, jSONObject3);
            jSONObject.put("extInfo", jSONObject2);
            if (((zy2.b6) i95.n0.c(zy2.b6.class)) != null) {
                ya2.e1.f460472a.F(context, jSONObject.toString(), null, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", e17, "enterFinderUI error", new java.lang.Object[0]);
        }
    }
}
