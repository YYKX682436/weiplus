package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.e4 f159533d;

    public d4(com.tencent.mm.plugin.scanner.ui.e4 e4Var) {
        this.f159533d = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI = this.f159533d.f159540d;
        com.tencent.mm.plugin.scanner.ui.k4 k4Var = translationResultUI.f159476o;
        k4Var.f159580d = translationResultUI.f159475n;
        k4Var.notifyDataSetChanged();
    }
}
