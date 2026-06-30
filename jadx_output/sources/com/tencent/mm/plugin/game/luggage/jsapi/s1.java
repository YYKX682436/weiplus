package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class s1 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "launchGameVideoEditor";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        java.lang.String optString = bVar.f406597b.f344506c.optString("videoUrl");
        java.lang.String optString2 = bVar.f406597b.f344506c.optString("thumbUrl");
        java.lang.String optString3 = bVar.f406597b.f344506c.optString("appId");
        int optInt = bVar.f406597b.f344506c.optInt("sourceSceneId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            bVar.c("invalid_videoUrl", null);
            return;
        }
        m33.v1 v1Var = (m33.v1) i95.n0.c(m33.v1.class);
        android.content.Context context = ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).f406610d;
        ((i53.x3) v1Var).getClass();
        i53.x3.wi(context, 5, null, optString3, null, optString, optString2, true, null, ac1.g.CTRL_INDEX, null, optInt);
        ((com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).f406610d).mmSetOnActivityResultCallback(new com.tencent.mm.plugin.game.luggage.jsapi.r1(this, bVar));
    }
}
