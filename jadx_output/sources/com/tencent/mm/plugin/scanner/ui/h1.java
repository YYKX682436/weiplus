package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class h1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanCardUI f159558d;

    public h1(com.tencent.mm.plugin.scanner.ui.ScanCardUI scanCardUI) {
        this.f159558d = scanCardUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.scanner.ui.ScanCardUI scanCardUI = this.f159558d;
        androidx.appcompat.app.AppCompatActivity context = scanCardUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        scanCardUI.f159334g = true;
        scanCardUI.finish();
    }
}
