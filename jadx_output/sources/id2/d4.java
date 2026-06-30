package id2;

/* loaded from: classes.dex */
public final class d4 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f290537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f290538e;

    public d4(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        this.f290537d = c0Var;
        this.f290538e = qVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.f290537d.f310112d) {
            return;
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f290538e.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }
}
