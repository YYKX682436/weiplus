package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class v1 implements sz3.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.w1 f159080a;

    public v1(com.tencent.mm.plugin.scanner.model.w1 w1Var) {
        this.f159080a = w1Var;
    }

    @Override // sz3.q
    public void a(sz3.x0 result, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.plugin.scanner.model.w1 w1Var = this.f159080a;
        long j17 = w1Var.f159087c;
        long j18 = result.f414148b;
        if (j17 == j18) {
            com.tencent.mm.plugin.scanner.model.t1 t1Var = w1Var.f159086b;
            if (t1Var != null) {
                t1Var.b(result, result.f414147a, j18, i17, str);
            }
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView scanUIRectView = ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) w1Var.f159085a).f159144e;
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView scanMaskView = scanUIRectView != null ? scanUIRectView.getScanMaskView() : null;
            if (scanMaskView != null) {
                scanMaskView.t(false, null);
            }
        }
    }

    @Override // sz3.q
    public void b(sz3.x0 result, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(result, "result");
    }

    @Override // sz3.q
    public void c(sz3.x0 result) {
        kotlin.jvm.internal.o.g(result, "result");
    }

    @Override // sz3.q
    public boolean d(sz3.c1 scanProductResult) {
        kotlin.jvm.internal.o.g(scanProductResult, "scanProductResult");
        return false;
    }

    @Override // sz3.q
    public boolean e(sz3.c1 scanProductResult, sz3.x0 x0Var) {
        kotlin.jvm.internal.o.g(scanProductResult, "scanProductResult");
        return false;
    }

    @Override // sz3.q
    public void f(sz3.x0 result) {
        com.tencent.mm.plugin.scanner.model.t1 t1Var;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.plugin.scanner.model.w1 w1Var = this.f159080a;
        if (w1Var.f159087c != result.f414148b || (t1Var = w1Var.f159086b) == null) {
            return;
        }
        t1Var.a(result);
    }
}
