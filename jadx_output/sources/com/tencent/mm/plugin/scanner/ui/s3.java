package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public final class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159631d;

    public s3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159631d = scanTranslationResultUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = this.f159631d;
        scanTranslationResultUI.f159384q = com.tencent.mm.sdk.platformtools.x.J(scanTranslationResultUI.f159386s, null);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.scanner.ui.r3(this.f159631d));
    }
}
