package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.q2 f159576d;

    public k2(com.tencent.mm.plugin.scanner.ui.q2 q2Var) {
        this.f159576d = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4) {
            return;
        }
        com.tencent.mm.plugin.scanner.ui.q2 q2Var = this.f159576d;
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = q2Var.f159615d;
        if (scanTranslationCaptureUI.H == 1) {
            db5.e1.s(scanTranslationCaptureUI, scanTranslationCaptureUI.getString(com.tencent.mm.R.string.i_o), "");
            q2Var.f159615d.U6();
        }
    }
}
