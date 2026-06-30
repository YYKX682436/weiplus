package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv.e0 f182883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.h0 f182884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182885f;

    public g0(kv.e0 e0Var, com.tencent.mm.plugin.webview.model.h0 h0Var, java.lang.String str) {
        this.f182883d = e0Var;
        this.f182884e = h0Var;
        this.f182885f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewShrotcutManager", "expired");
        java.util.List list = com.tencent.mm.plugin.webview.model.j0.f182949a;
        kv.e0 e0Var = this.f182883d;
        if (((java.util.LinkedList) list).contains(e0Var)) {
            ((java.util.LinkedList) list).remove(e0Var);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ai().q(e0Var);
            com.tencent.mm.plugin.webview.model.h0 h0Var = this.f182884e;
            if (h0Var != null) {
                h0Var.a(this.f182885f, false);
            }
        }
    }
}
