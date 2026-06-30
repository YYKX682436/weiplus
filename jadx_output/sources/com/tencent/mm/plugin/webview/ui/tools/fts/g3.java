package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes15.dex */
public final class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.x2 f184420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.j3 f184421e;

    public g3(com.tencent.mm.plugin.webview.ui.tools.fts.x2 x2Var, com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var) {
        this.f184420d = x2Var;
        this.f184421e = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var;
        db5.d5 d5Var;
        db5.d5 d5Var2;
        int ordinal = this.f184420d.ordinal();
        if ((ordinal != 0 && ordinal != 5 && ordinal != 2 && ordinal != 3) || (d5Var = (j3Var = this.f184421e).f184462l) == null || d5Var == null) {
            return;
        }
        if (!(d5Var.isShowing()) || (d5Var2 = j3Var.f184462l) == null) {
            return;
        }
        d5Var2.dismiss();
    }
}
