package qx2;

/* loaded from: classes.dex */
public final class e implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f367330a;

    public e(kotlin.jvm.internal.h0 h0Var) {
        this.f367330a = h0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        com.tencent.mars.xlog.Log.i("FinderLawLicensePopupView", "#dialog on dismiss");
        kotlin.jvm.internal.h0 h0Var = this.f367330a;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) h0Var.f310123d;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
        h0Var.f310123d = null;
    }
}
