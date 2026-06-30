package tx2;

/* loaded from: classes.dex */
public final class e1 implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f422549a;

    public e1(kotlin.jvm.internal.h0 h0Var) {
        this.f422549a = h0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        kotlin.jvm.internal.h0 h0Var = this.f422549a;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) h0Var.f310123d;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
        h0Var.f310123d = null;
    }
}
