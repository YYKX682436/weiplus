package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes4.dex */
public final class f0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f185772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ee f185773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f185774f;

    public f0(com.tencent.mm.ui.MMActivity mMActivity, r45.ee eeVar, int i17) {
        this.f185772d = mMActivity;
        this.f185773e = eeVar;
        this.f185774f = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        nw4.n nVar;
        nw4.n nVar2;
        r45.ee eeVar = this.f185773e;
        com.tencent.mm.ui.MMActivity mMActivity = this.f185772d;
        if (i18 != -1) {
            db5.e1.T(mMActivity, mMActivity.getString(com.tencent.mm.R.string.j3u));
            if (!(mMActivity instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) || (nVar = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) mMActivity).f183844p0) == null) {
                return;
            }
            kotlin.jvm.internal.o.d(eeVar);
            nVar.E(eeVar.f373341f, "canceled");
            return;
        }
        db5.e1.T(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490560yi));
        if ((mMActivity instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) && (nVar2 = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) mMActivity).f183844p0) != null) {
            kotlin.jvm.internal.o.d(eeVar);
            nVar2.E(eeVar.f373341f, ya.b.SUCCESS);
        }
        com.tencent.mm.plugin.webview.ui.tools.media.x0 x0Var = com.tencent.mm.plugin.webview.ui.tools.media.y0.f185834k;
        kotlin.jvm.internal.o.d(eeVar);
        java.lang.String videoVid = eeVar.f373341f;
        kotlin.jvm.internal.o.f(videoVid, "videoVid");
        kotlin.jvm.internal.o.d(eeVar);
        java.lang.String mpUrl = eeVar.f373339d;
        kotlin.jvm.internal.o.f(mpUrl, "mpUrl");
        x0Var.d(2, 101, videoVid, mpUrl, 0, this.f185774f);
    }
}
