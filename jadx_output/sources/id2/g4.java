package id2;

/* loaded from: classes.dex */
public final class g4 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f290588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f290589e;

    public g4(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        this.f290588d = c0Var;
        this.f290589e = qVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        boolean z17 = this.f290588d.f310112d;
        kotlinx.coroutines.q qVar = this.f290589e;
        if (z17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
    }
}
