package rv0;

/* loaded from: classes5.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f400324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(rv0.j7 j7Var, rv0.n1 n1Var) {
        super(1);
        this.f400324d = j7Var;
        this.f400325e = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        rv0.j7 j7Var = this.f400324d;
        if (j7Var.getUserActed$plugin_mj_template_release()) {
            gx0.kh q76 = this.f400325e.q7();
            java.lang.String string = j7Var.getContext().getString(com.tencent.mm.R.string.lmh);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        j7Var.D = false;
        return java.lang.Boolean.TRUE;
    }
}
