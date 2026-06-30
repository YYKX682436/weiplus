package qg5;

/* loaded from: classes.dex */
public final class l4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f363063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f363064e;

    public l4(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.r2 r2Var) {
        this.f363063d = c0Var;
        this.f363064e = r2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f363063d.f310112d = true;
        kotlinx.coroutines.p2.a(this.f363064e, null, 1, null);
    }
}
