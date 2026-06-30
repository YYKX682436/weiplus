package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.f2 f159516d;

    public c2(com.tencent.mm.plugin.scanner.ui.f2 f2Var) {
        this.f159516d = f2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.scanner.ui.f2 f2Var = this.f159516d;
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = f2Var.f159548b;
        db5.e1.t(scanTranslationCaptureUI, scanTranslationCaptureUI.getString(com.tencent.mm.R.string.cen), f2Var.f159548b.getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.scanner.ui.b2(this));
    }
}
