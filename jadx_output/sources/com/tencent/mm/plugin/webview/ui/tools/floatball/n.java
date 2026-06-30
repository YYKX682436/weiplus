package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public final class n extends com.tencent.mm.plugin.ball.service.s4 {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.ref.WeakReference f184214v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f184215w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(dp1.x floatBallPageAdapter, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        super(floatBallPageAdapter);
        kotlin.jvm.internal.o.g(floatBallPageAdapter, "floatBallPageAdapter");
        this.f184214v = new java.lang.ref.WeakReference(mMWebView);
        b(56, "AudioPanelFloatBall");
        t().f93086f = 30;
        com.tencent.mars.xlog.Log.i("WebViewAudioFloatBallHelper", "WebViewAudioFloatBallHelper %s", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void A(boolean z17, int i17) {
        this.f184215w = true;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean k0() {
        android.content.Intent intent = this.f93239n.getIntent();
        return intent != null && intent.getIntExtra("key_enter_float_ball_type", -1) == 56;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void x() {
        d();
        super.x();
    }
}
