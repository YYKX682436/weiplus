package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public final class v3 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159660a;

    public v3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159660a = scanTranslationResultUI;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = this.f159660a;
        androidx.appcompat.app.AppCompatActivity context = scanTranslationResultUI.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.tencent.mm.ui.widget.snackbar.j.c(scanTranslationResultUI.getResources().getString(com.tencent.mm.R.string.iaz), null, context, null, null);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = this.f159660a;
        androidx.appcompat.app.AppCompatActivity context = scanTranslationResultUI.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.tencent.mm.ui.widget.snackbar.j.c(scanTranslationResultUI.getResources().getString(com.tencent.mm.R.string.i87), null, context, null, null);
    }
}
