package dk2;

/* loaded from: classes3.dex */
public final class r8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f234023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f234024e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(android.content.Context context, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f234023d = context;
        this.f234024e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f234023d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getResources().getString(com.tencent.mm.R.string.dls));
        u1Var.n((java.lang.String) this.f234024e.f310123d);
        u1Var.l(dk2.q8.f233951a);
        u1Var.q(false);
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context.getResources().getString(com.tencent.mm.R.string.dls)));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        ml2.z3[] z3VarArr = ml2.z3.f328342d;
        zy2.zb.j5(zbVar, 4L, java.lang.String.valueOf(1), null, 4, null);
        return jz5.f0.f302826a;
    }
}
