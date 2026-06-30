package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.d f154385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154386e;

    public l(com.tencent.mm.plugin.profile.ui.tab.d dVar, java.lang.String str) {
        this.f154385d = dVar;
        this.f154386e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String url = this.f154386e;
        kotlin.jvm.internal.o.f(url, "$url");
        yr3.q qVar = (yr3.q) this.f154385d;
        qVar.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra("geta8key_scene", 3);
        intent.putExtra("geta8key_username", qVar.f464985a);
        r45.o5 o5Var = qVar.f464986b;
        intent.putExtra("webpageTitle", o5Var.f381913d);
        java.lang.String str = o5Var.f381921n;
        intent.putExtra("thumbUrl", str == null || r26.n0.N(str) ? o5Var.f381920m : o5Var.f381921n);
        intent.putExtra("prePublishId", "brand_profile");
        intent.putExtra("KPublisherId", "brand_profile");
        intent.putExtra("preChatTYPE", intent.getIntExtra("preChatTYPE", 0));
        intent.putExtra("key_enable_fts_quick", true);
        j45.l.j(qVar.f464987c, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
