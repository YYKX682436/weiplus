package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class h2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI f184786d;

    public h2(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI) {
        this.f184786d = sDKOAuthUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI = this.f184786d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "doDelAvatar appid: %s", sDKOAuthUI.f183718d);
        sDKOAuthUI.W6();
        sDKOAuthUI.f183723i = db5.e1.Q(sDKOAuthUI, null, sDKOAuthUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.webview.ui.tools.g2(sDKOAuthUI));
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        int i18 = sDKOAuthUI.f183724m.getItem(sDKOAuthUI.f183720f).f380893d;
        ((ce0.e) jVar).getClass();
        gm0.j1.d().g(new com.tencent.mm.modelsimple.d0(i18));
    }
}
