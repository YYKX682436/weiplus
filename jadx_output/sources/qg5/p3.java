package qg5;

/* loaded from: classes.dex */
public final class p3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f363131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f363132e;

    public p3(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.r2 r2Var) {
        this.f363131d = c0Var;
        this.f363132e = r2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f363131d.f310112d = true;
        kotlinx.coroutines.p2.a(this.f363132e, null, 1, null);
    }
}
