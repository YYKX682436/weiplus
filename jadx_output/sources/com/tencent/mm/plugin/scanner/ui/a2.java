package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.f2 f159502d;

    public a2(com.tencent.mm.plugin.scanner.ui.f2 f2Var) {
        this.f159502d = f2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159502d.f159548b;
        scanTranslationCaptureUI.N.f59747f = 3L;
        db5.e1.T(scanTranslationCaptureUI, scanTranslationCaptureUI.getString(com.tencent.mm.R.string.iaw));
    }
}
