package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public final class w3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159665d;

    public w3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159665d = scanTranslationResultUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = this.f159665d;
        g4Var.g(32769, scanTranslationResultUI.getString(com.tencent.mm.R.string.lwe), com.tencent.mm.R.raw.translate_off_regular);
        g4Var.g(32770, scanTranslationResultUI.getString(com.tencent.mm.R.string.lwf), com.tencent.mm.R.raw.language_transfer_regular);
        g4Var.g(32771, scanTranslationResultUI.getString(com.tencent.mm.R.string.lwh), com.tencent.mm.R.raw.icons_outlined_feedback_error);
        g4Var.g(32772, scanTranslationResultUI.getString(com.tencent.mm.R.string.lwi), com.tencent.mm.R.raw.icons_outlined_download);
    }
}
