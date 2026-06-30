package v41;

/* loaded from: classes15.dex */
public final class b extends v41.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.app.Activity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void h(v41.b bVar) {
        bVar.g(0, "");
    }

    @Override // v41.c, v41.s
    public void a() {
        super.a();
    }

    @Override // v41.s
    public void b() {
        ku5.u0 u0Var = ku5.t0.f312615d;
        v41.a aVar = new v41.a(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(aVar, 400L, false);
    }

    @Override // v41.c, v41.s
    public void c(int i17, int i18, j41.i0 confirmData) {
        kotlin.jvm.internal.o.g(confirmData, "confirmData");
        super.c(i17, i18, confirmData);
        l41.m mVar = this.f433205e;
        if (mVar != null) {
            ((l41.j1) mVar).d(i17);
        }
    }

    @Override // v41.c, v41.s
    public void d(l41.m confirmController) {
        kotlin.jvm.internal.o.g(confirmController, "confirmController");
        super.d(confirmController);
        android.app.Activity activity = this.f433204d;
        if (activity instanceof com.tencent.mm.ui.MMActivity) {
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.ga controller = ((com.tencent.mm.ui.MMActivity) activity).getController();
            android.app.Activity activity2 = this.f433204d;
            kotlin.jvm.internal.o.d(activity2);
            controller.G0(com.tencent.mm.ui.uk.a(activity2.getResources().getColor(com.tencent.mm.R.color.aaw), 0));
        }
    }
}
