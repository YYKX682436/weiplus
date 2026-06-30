package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface f209543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.r6 f209544e;

    public q6(com.tencent.mm.ui.r6 r6Var, android.content.DialogInterface dialogInterface) {
        this.f209544e = r6Var;
        this.f209543d = dialogInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean E = c01.d9.b().E();
        com.tencent.mm.ui.r6 r6Var = this.f209544e;
        if (E) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("had_detected_no_sdcard_space", true);
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
            j45.l.j(r6Var.f209599d.f209450a, "clean", ".ui.CleanUI", intent, null);
        } else {
            db5.t7.k(r6Var.f209599d.f209450a, null);
        }
        this.f209543d.dismiss();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(282L, 1L, 1L, false);
    }
}
