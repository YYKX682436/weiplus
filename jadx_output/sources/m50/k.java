package m50;

/* loaded from: classes.dex */
public final class k implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f323485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f323486e;

    public k(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.r2 r2Var) {
        this.f323485d = c0Var;
        this.f323486e = r2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f323485d.f310112d = true;
        kotlinx.coroutines.p2.a(this.f323486e, null, 1, null);
    }
}
