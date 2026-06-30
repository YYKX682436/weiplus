package vq;

/* loaded from: classes9.dex */
public final class q implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f439211d;

    public q(kotlin.jvm.internal.c0 c0Var) {
        this.f439211d = c0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f439211d.f310112d = true;
    }
}
