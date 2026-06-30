package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class j4 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.TranslationResultUI f159572a;

    public j4(com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI) {
        this.f159572a = translationResultUI;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI = this.f159572a;
        dp.a.makeText(translationResultUI, translationResultUI.getString(com.tencent.mm.R.string.f492304g00, str2), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI = this.f159572a;
        dp.a.makeText(translationResultUI, translationResultUI.getString(com.tencent.mm.R.string.i87), 1).show();
    }
}
