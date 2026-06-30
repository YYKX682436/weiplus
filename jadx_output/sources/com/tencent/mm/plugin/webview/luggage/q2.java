package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class q2 implements db5.j4 {
    public q2(com.tencent.mm.plugin.webview.luggage.v2 v2Var) {
    }

    @Override // db5.j4
    public void a(android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.MenuItem menuItem) {
        db5.h4 h4Var = (db5.h4) menuItem;
        if (com.tencent.mm.sdk.platformtools.t8.K0(h4Var.A)) {
            return;
        }
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(h4Var.A), com.tencent.mm.plugin.webview.luggage.u2.class, new com.tencent.mm.plugin.webview.luggage.p2(this, imageView, imageView2));
    }
}
