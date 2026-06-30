package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public final class e0 extends gp1.a0 {
    @Override // gp1.a0, gp1.z
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.String string;
        if (ballInfo == null || (string = ballInfo.G.getString("rawUrl")) == null) {
            return;
        }
        java.lang.String string2 = ballInfo.G.getString("webviewCurrentProcess");
        java.lang.String string3 = ballInfo.G.getString("float_ball_key");
        if (string3 == null) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0 h0Var = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a;
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.webview.ui.tools.floatball.d0(new com.tencent.mm.plugin.webview.ui.tools.floatball.y(string, string2, string3, ballInfo.B)), "WebViewFloatBallThread");
    }

    @Override // gp1.a0, gp1.z
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.String string;
        if (ballInfo == null || (string = ballInfo.G.getString("rawUrl")) == null) {
            return;
        }
        java.lang.String string2 = ballInfo.G.getString("webviewCurrentProcess");
        java.lang.String string3 = ballInfo.G.getString("float_ball_key");
        if (string3 == null) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a.b(new com.tencent.mm.plugin.webview.ui.tools.floatball.y(string, string2, string3, ballInfo.B));
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }
}
