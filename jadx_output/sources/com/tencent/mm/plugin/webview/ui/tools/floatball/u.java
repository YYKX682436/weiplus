package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes7.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f184223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.floatball.v f184224e;

    public u(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.webview.ui.tools.floatball.v vVar) {
        this.f184223d = mMActivity;
        this.f184224e = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f184223d;
        if (mMActivity.isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.floatball.v vVar = this.f184224e;
        if (vVar.f184225a) {
            if (vVar.f184227c) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFloatBallEduHelper", "updateEduViewWhenConfigurationChanged disableEduView");
                return;
            }
            com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView = vVar.f184226b;
            if (contentFloatBallEduView != null && contentFloatBallEduView.getVisibility() == 0) {
                vVar.b(mMActivity, false, null);
            }
        }
    }
}
