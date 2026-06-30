package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class b4 implements com.tencent.mm.ui.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout f187112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.o4 f187113b;

    public b4(com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout, com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var) {
        this.f187112a = webViewKeyboardLinearLayout;
        this.f187113b = o4Var;
    }

    @Override // com.tencent.mm.ui.e8
    public final void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewWithController", "onKeyBoardStateChange, state = " + i17);
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = this.f187113b;
        if (i17 != -3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewWithController", "keyboard kbListener onKeyBoardStateChange");
            o4Var.w2(0, true);
        } else {
            int keyBoardHeight = this.f187112a.getKeyBoardHeight();
            if (keyBoardHeight > 0) {
                o4Var.w2(keyBoardHeight, true);
            }
        }
    }
}
