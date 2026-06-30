package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public final class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159555d;

    public g3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159555d = scanTranslationResultUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI.G;
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = this.f159555d;
        scanTranslationResultUI.a7();
        db5.e1.t(scanTranslationResultUI.getContext(), scanTranslationResultUI.getResources().getString(com.tencent.mm.R.string.cen), scanTranslationResultUI.getResources().getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.scanner.ui.f3(scanTranslationResultUI));
    }
}
