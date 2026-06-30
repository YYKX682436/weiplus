package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface f211070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.v6 f211071e;

    public u6(com.tencent.mm.ui.v6 v6Var, android.content.DialogInterface dialogInterface) {
        this.f211071e = v6Var;
        this.f211070d = dialogInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean E = c01.d9.b().E();
        com.tencent.mm.ui.v6 v6Var = this.f211071e;
        if (E) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("had_detected_no_sdcard_space", true);
            j45.l.j(v6Var.f211107d.f209450a, "clean", ".ui.CleanUI", intent, null);
        } else {
            db5.t7.k(v6Var.f211107d.f209450a, null);
        }
        this.f211070d.dismiss();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(282L, 1L, 1L, false);
    }
}
