package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public final class s implements al5.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.floatball.v f184221a;

    public s(com.tencent.mm.plugin.webview.ui.tools.floatball.v vVar) {
        this.f184221a = vVar;
    }

    @Override // al5.e3
    public void a(int i17) {
    }

    @Override // al5.e3
    public void b(int i17, int i18, int i19, int i27, float f17) {
        com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView = this.f184221a.f184226b;
        if (contentFloatBallEduView == null) {
            return;
        }
        contentFloatBallEduView.setTranslationX(i17);
    }

    @Override // al5.e3
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallEduHelper", "onSettleReset");
    }
}
