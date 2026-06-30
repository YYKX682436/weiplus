package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.TranslationResultUI f159540d;

    public e4(com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI) {
        this.f159540d = translationResultUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI = this.f159540d;
        translationResultUI.f159475n = com.tencent.mm.sdk.platformtools.x.J(translationResultUI.f159474m.field_resultFile, null);
        if (translationResultUI.f159475n != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.d4(this));
        }
    }
}
