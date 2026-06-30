package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes11.dex */
public class m2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159590d;

    public m2(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f159590d = scanTranslationCaptureUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159590d;
        androidx.appcompat.app.AppCompatActivity context = scanTranslationCaptureUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        scanTranslationCaptureUI.B = true;
        scanTranslationCaptureUI.finish();
    }
}
