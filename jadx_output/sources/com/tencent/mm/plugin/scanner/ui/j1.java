package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class j1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanCardUI f159568d;

    public j1(com.tencent.mm.plugin.scanner.ui.ScanCardUI scanCardUI) {
        this.f159568d = scanCardUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.scanner.ui.ScanCardUI scanCardUI = this.f159568d;
        androidx.appcompat.app.AppCompatActivity context = scanCardUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        scanCardUI.f159334g = true;
        scanCardUI.finish();
    }
}
