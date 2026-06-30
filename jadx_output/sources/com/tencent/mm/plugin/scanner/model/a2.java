package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.u f158807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.w0 f158808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.c2 f158809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.y1 f158810g;

    public a2(com.tencent.mm.plugin.scanner.model.u uVar, sz3.w0 w0Var, com.tencent.mm.plugin.scanner.model.c2 c2Var, com.tencent.mm.plugin.scanner.model.y1 y1Var) {
        this.f158807d = uVar;
        this.f158808e = w0Var;
        this.f158809f = c2Var;
        this.f158810g = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = (com.tencent.mm.plugin.scanner.ui.BaseScanUI) this.f158807d;
        if (baseScanUI.isFinishing() || baseScanUI.isDestroyed()) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("template_type", 1);
        sz3.w0 w0Var = this.f158808e;
        bundle.putString("req_key", w0Var.f414139j);
        bundle.putString("enter_session", com.tencent.mm.plugin.scanner.model.h2.f158921b);
        bundle.putString("tab_session", com.tencent.mm.plugin.scanner.model.h2.d(1));
        bundle.putString("scan_session", com.tencent.mm.plugin.scanner.model.h2.c(1));
        bundle.putString("detect_session", java.lang.String.valueOf(w0Var.f414132c));
        bundle.putString("scanTabMerge", "1");
        if (w0Var.f414131b == 3) {
            bundle.putFloat("fixed_dialog_height_rate", 0.75f);
            gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.z(kz5.c0.d(w0Var.f414139j), true, null, 4, null));
        }
        baseScanUI.getClass();
        uy3.j0 b17 = uy3.n0.b(baseScanUI, bundle, this.f158809f.f158837a);
        com.tencent.mm.plugin.scanner.model.y1 y1Var = this.f158810g;
        if (y1Var != null) {
            y1Var.a(b17);
        }
    }
}
