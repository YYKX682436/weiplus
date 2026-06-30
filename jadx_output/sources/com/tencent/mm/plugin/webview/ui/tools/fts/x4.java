package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes5.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.z4 f184726d;

    public x4(com.tencent.mm.plugin.webview.ui.tools.fts.z4 z4Var) {
        this.f184726d = z4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.z4 z4Var = this.f184726d;
        z4Var.f184679e.setY(z4Var.f184689o[0][1]);
        z4Var.f184679e.setX(z4Var.f184689o[1][1]);
    }
}
