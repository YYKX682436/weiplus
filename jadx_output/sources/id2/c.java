package id2;

/* loaded from: classes2.dex */
public final class c implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f290501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f290502b;

    public c(kotlinx.coroutines.q qVar, kotlin.jvm.internal.c0 c0Var) {
        this.f290501a = qVar;
        this.f290502b = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        id2.m.f290662a.d("153");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f290501a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(this.f290502b.f310112d)));
    }
}
