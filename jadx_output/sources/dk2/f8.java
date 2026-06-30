package dk2;

/* loaded from: classes3.dex */
public final class f8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f233458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233459f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(android.content.Context context, kotlin.jvm.internal.h0 h0Var, yz5.p pVar) {
        super(0);
        this.f233457d = context;
        this.f233458e = h0Var;
        this.f233459f = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f233457d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getResources().getString(com.tencent.mm.R.string.e5a));
        u1Var.n((java.lang.String) this.f233458e.f310123d);
        u1Var.l(dk2.e8.f233361a);
        u1Var.q(false);
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", "pad can't create live!");
        this.f233459f.invoke(java.lang.Boolean.FALSE, "forbidden_device");
        return jz5.f0.f302826a;
    }
}
