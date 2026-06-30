package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class c0 implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.n4 f185750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f185751c;

    public c0(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView, com.tencent.mm.ui.tools.n4 n4Var, android.view.ViewGroup.LayoutParams layoutParams) {
        this.f185749a = mPVideoPlayFullScreenView;
        this.f185750b = n4Var;
        this.f185751c = layoutParams;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mm.ui.tools.n4 n4Var = this.f185750b;
        if (n4Var != null) {
            n4Var.onAnimationEnd();
        }
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185749a;
        mPVideoPlayFullScreenView.f185708e.post(new com.tencent.mm.plugin.webview.ui.tools.media.b0(mPVideoPlayFullScreenView, this.f185751c));
        mPVideoPlayFullScreenView.T = false;
        mPVideoPlayFullScreenView.n();
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        this.f185749a.T = true;
        com.tencent.mm.ui.tools.n4 n4Var = this.f185750b;
        if (n4Var != null) {
            n4Var.onAnimationStart();
        }
    }
}
