package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes5.dex */
public final class w5 implements com.tencent.mm.ui.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187590a;

    public w5(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var) {
        this.f187590a = z5Var;
    }

    @Override // com.tencent.mm.ui.e8
    public final void a(int i17) {
        int i18 = com.tencent.mm.plugin.webview.ui.tools.widget.z5.f187623x1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MPWriteCommentLayout", "onKeyBoardStateChange, state = " + i17);
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.f187590a;
        if (i17 == -3) {
            int keyBoardHeight = z5Var.f187630x.getKeyBoardHeight();
            if (keyBoardHeight > 0) {
                com.tencent.mm.plugin.webview.ui.tools.widget.z5.k(z5Var, keyBoardHeight);
                com.tencent.mm.plugin.webview.ui.tools.widget.z5.k(z5Var, keyBoardHeight);
            }
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.webview.ui.tools.widget.u5(z5Var), 10L);
        } else {
            com.tencent.mm.plugin.webview.ui.tools.widget.z5.k(z5Var, 0);
            com.tencent.mm.plugin.webview.ui.tools.widget.z5.k(z5Var, 0);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.webview.ui.tools.widget.v5(z5Var), 10L);
        }
        z5Var.f187624J = i17;
    }
}
