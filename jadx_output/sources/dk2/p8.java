package dk2;

/* loaded from: classes5.dex */
public final class p8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f233915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(android.content.Context context, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f233914d = context;
        this.f233915e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f233914d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getResources().getString(com.tencent.mm.R.string.e5a));
        u1Var.n((java.lang.String) this.f233915e.f310123d);
        u1Var.l(dk2.o8.f233844a);
        u1Var.q(false);
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", "pad can't create live!");
        return jz5.f0.f302826a;
    }
}
