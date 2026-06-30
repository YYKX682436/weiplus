package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class a6 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView f187104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView mailMMWebView, android.content.Context context) {
        super(context);
        this.f187104d = mailMMWebView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView mailMMWebView = this.f187104d;
        if (!mailMMWebView.L && !mailMMWebView.M) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            mailMMWebView.L = false;
            mailMMWebView.M = false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView mailMMWebView = this.f187104d;
        if (this == mailMMWebView.f187052J && mailMMWebView.getTitleHeight() > 0) {
            mailMMWebView.K0();
        } else {
            if (this != mailMMWebView.K || mailMMWebView.getBottomHeight() <= 0) {
                return;
            }
            mailMMWebView.J0();
        }
    }
}
