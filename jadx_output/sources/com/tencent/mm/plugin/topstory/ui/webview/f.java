package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class f implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.j f175189d;

    public f(com.tencent.mm.plugin.topstory.ui.webview.j jVar) {
        this.f175189d = jVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.topstory.ui.webview.j jVar = this.f175189d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("retCode", i18);
            jSONObject.put("errMsg", str);
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryWebData", "NetSceneSearchWebComm response, errType:%s, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                jSONObject.put("requestId", ((sm4.a) m1Var).f409925g);
            } else if (((com.tencent.mm.plugin.topstory.ui.home.a) jVar.f14844d) != null) {
                jSONObject.put("commResp", ((r45.e97) ((sm4.a) m1Var).f409923e.f70711b.f70700a).f373181d);
                jSONObject.put("requestId", ((r45.e97) ((sm4.a) m1Var).f409923e.f70711b.f70700a).f373182e);
            }
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.topstory.ui.home.a aVar = (com.tencent.mm.plugin.topstory.ui.home.a) jVar.f14844d;
        if (aVar != null) {
            java.lang.String jSONObject2 = jSONObject.toString();
            com.tencent.mm.plugin.topstory.ui.webview.l lVar = ((com.tencent.mm.plugin.topstory.ui.home.j) aVar).f174993m;
            lVar.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.k0(lVar, jSONObject2));
        }
    }
}
