package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.b2 f182760e;

    public a2(com.tencent.mm.plugin.webview.model.b2 b2Var, int i17) {
        this.f182760e = b2Var;
        this.f182759d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        hy4.b bVar = hy4.b.INSTANCE;
        com.tencent.mm.plugin.webview.model.b2 b2Var = this.f182760e;
        if (this.f182759d == 1) {
            ((com.tencent.mm.plugin.webview.core.o2) b2Var.f182787a).d();
            java.lang.String str = b2Var.f182788b;
            bVar.a(str == null ? "" : str, com.tencent.mm.plugin.webview.model.k2.f182980a, 0, 1, 0, 0, b2Var.f182789c);
        } else {
            ((com.tencent.mm.plugin.webview.core.o2) b2Var.f182787a).b(b2Var.f182790d, 9);
            java.lang.String str2 = b2Var.f182788b;
            bVar.a(str2 == null ? "" : str2, com.tencent.mm.plugin.webview.model.k2.f182980a, 1, 1, 0, 0, b2Var.f182789c);
        }
        bVar.b(1, (int) (java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.webview.model.k2.f182980a), b2Var.f182789c);
    }
}
