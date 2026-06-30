package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.scanner.model.u f159094a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long f159095b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f159096c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f159097d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f159098e;

    public x0(com.tencent.mm.plugin.scanner.model.u scanUIModel) {
        kotlin.jvm.internal.o.g(scanUIModel, "scanUIModel");
        this.f159094a = scanUIModel;
    }

    public final void a(long j17, boolean z17) {
        java.lang.Long l17 = this.f159095b;
        if (l17 != null && l17.longValue() == j17) {
            if (z17) {
                this.f159098e = false;
                com.tencent.mm.plugin.scanner.ui.BaseScanUI baseScanUI = (com.tencent.mm.plugin.scanner.ui.BaseScanUI) this.f159094a;
                baseScanUI.getClass();
                this.f159096c = com.tencent.mm.ui.widget.dialog.u3.f(baseScanUI, baseScanUI.getString(com.tencent.mm.R.string.f490468vx), true, 0, new com.tencent.mm.plugin.scanner.model.w0(this));
                return;
            }
            this.f159098e = false;
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f159096c;
            if (u3Var != null) {
                u3Var.dismiss();
            }
        }
    }
}
