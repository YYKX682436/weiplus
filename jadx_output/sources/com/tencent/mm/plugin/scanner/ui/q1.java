package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes11.dex */
public final class q1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanPassportUI f159614d;

    public q1(com.tencent.mm.plugin.scanner.ui.ScanPassportUI scanPassportUI) {
        this.f159614d = scanPassportUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.scanner.ui.ScanPassportUI scanPassportUI = this.f159614d;
        androidx.appcompat.app.AppCompatActivity context = scanPassportUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        scanPassportUI.f159346f = true;
        scanPassportUI.finish();
    }
}
