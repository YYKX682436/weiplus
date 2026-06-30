package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159539d;

    public e3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159539d = scanTranslationResultUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI.G;
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = this.f159539d;
        scanTranslationResultUI.a7();
        db5.e1.t(scanTranslationResultUI.getContext(), scanTranslationResultUI.getResources().getString(com.tencent.mm.R.string.iaw), scanTranslationResultUI.getResources().getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.scanner.ui.d3(scanTranslationResultUI));
    }
}
