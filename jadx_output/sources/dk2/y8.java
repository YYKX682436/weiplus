package dk2;

/* loaded from: classes.dex */
public final class y8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f234376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f234377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f234378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(android.content.Context context, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.f0 f0Var) {
        super(0);
        this.f234376d = context;
        this.f234377e = h0Var;
        this.f234378f = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f234376d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getResources().getString(com.tencent.mm.R.string.dlt));
        u1Var.n((java.lang.String) this.f234377e.f310123d);
        u1Var.l(dk2.x8.f234338a);
        u1Var.q(false);
        this.f234378f.f310116d = 1;
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context.getResources().getString(com.tencent.mm.R.string.dlt)));
        return jz5.f0.f302826a;
    }
}
