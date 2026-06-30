package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public final class l3 implements com.tencent.mm.ui.tools.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159586a;

    public l3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159586a = scanTranslationResultUI;
    }

    @Override // com.tencent.mm.ui.tools.p5
    public final void a() {
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = this.f159586a;
        if (scanTranslationResultUI.f159392y == 1) {
            return;
        }
        scanTranslationResultUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) scanTranslationResultUI, 0, false);
        k0Var.f211872n = new com.tencent.mm.plugin.scanner.ui.w3(scanTranslationResultUI);
        k0Var.f211881s = new com.tencent.mm.plugin.scanner.ui.x3(scanTranslationResultUI);
        k0Var.v();
    }
}
