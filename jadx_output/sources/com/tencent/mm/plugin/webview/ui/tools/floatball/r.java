package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.floatball.v f184220d;

    public r(com.tencent.mm.plugin.webview.ui.tools.floatball.v vVar) {
        this.f184220d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView = this.f184220d.f184226b;
        if (contentFloatBallEduView != null) {
            contentFloatBallEduView.requestLayout();
        }
    }
}
