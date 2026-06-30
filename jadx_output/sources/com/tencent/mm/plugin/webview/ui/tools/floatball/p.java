package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public final class p extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.floatball.p f184216a = new com.tencent.mm.plugin.webview.ui.tools.floatball.p();

    @Override // gp1.a0, gp1.z
    public void F0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, com.tencent.mm.plugin.ball.model.BallInfo ballInfo2) {
        com.tencent.mm.ui.widget.MMWebView a17;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = ballInfo != null ? java.lang.Integer.valueOf(ballInfo.f93046d) : null;
        com.tencent.mars.xlog.Log.i("WebViewAudioFloatBallListener", "onFloatBallInfoReplaced type: %s", objArr);
        if (!(ballInfo != null && ballInfo.f93046d == 56) || ballInfo == null || (a17 = com.tencent.mm.plugin.webview.ui.tools.floatball.o.a(ballInfo)) == null) {
            return;
        }
        a17.evaluateJavascript(" javascript: (    function () {        try { _WXJS?.mediaTracker?.pauseLastPlayback?.(); } catch(e) { console.warn('JS暂停异常:', e); }       })() ", null);
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.ui.widget.MMWebView a17;
        com.tencent.mars.xlog.Log.i("WebViewAudioFloatBallListener", "onFloatBallDeleteButtonClick %s", ballInfo);
        if (ballInfo == null || (a17 = com.tencent.mm.plugin.webview.ui.tools.floatball.o.a(ballInfo)) == null) {
            return;
        }
        a17.evaluateJavascript(" javascript: (    function () {        try { _WXJS?.mediaTracker?.pauseLastPlayback?.(); } catch(e) { console.warn('JS暂停异常:', e); }       })() ", null);
    }

    @Override // gp1.a0, gp1.z
    public void S(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17, int i18, int i19, int i27) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallCollapseStateChanged ballInfo.type: ");
        sb6.append(ballInfo != null ? java.lang.Integer.valueOf(ballInfo.f93046d) : null);
        sb6.append(", oldCollapseState: ");
        sb6.append(i17);
        sb6.append(", newCollapseState: ");
        sb6.append(i18);
        sb6.append(", collapseReason: ");
        sb6.append(i19);
        sb6.append(", expandReason: ");
        sb6.append(i27);
        com.tencent.mars.xlog.Log.i("WebViewAudioFloatBallListener", sb6.toString());
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo != null) {
            com.tencent.mars.xlog.Log.i("WebViewAudioFloatBallListener", "onFloatBallPlayButtonClick %s", ballInfo);
            com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo.f93054o;
            ballButtonInfo.f93069d = !ballButtonInfo.f93069d;
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().b(ballInfo);
            if (ballButtonInfo.f93069d) {
                com.tencent.mm.ui.widget.MMWebView a17 = com.tencent.mm.plugin.webview.ui.tools.floatball.o.a(ballInfo);
                if (a17 != null) {
                    a17.evaluateJavascript(" javascript: (    function () {        try { _WXJS?.mediaTracker?.recoverLastPlayback?.(); } catch(e) { console.warn('JS恢复异常:', e); }          })() ", null);
                    return;
                }
                return;
            }
            com.tencent.mm.ui.widget.MMWebView a18 = com.tencent.mm.plugin.webview.ui.tools.floatball.o.a(ballInfo);
            if (a18 != null) {
                a18.evaluateJavascript(" javascript: (    function () {        try { _WXJS?.mediaTracker?.pauseLastPlayback?.(); } catch(e) { console.warn('JS暂停异常:', e); }       })() ", null);
            }
        }
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("WebViewAudioFloatBallListener", "onFloatBallInfoClicked %s", ballInfo);
    }
}
