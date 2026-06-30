package rv0;

/* loaded from: classes5.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f399982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f399983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(rv0.o7 o7Var, rv0.n1 n1Var) {
        super(1);
        this.f399982d = o7Var;
        this.f399983e = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        rv0.o7 o7Var = this.f399982d;
        if (o7Var.getUserActed$plugin_mj_template_release()) {
            gx0.kh q76 = this.f399983e.q7();
            java.lang.String string = o7Var.getContext().getString(com.tencent.mm.R.string.lmk);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        o7Var.D = false;
        return java.lang.Boolean.TRUE;
    }
}
