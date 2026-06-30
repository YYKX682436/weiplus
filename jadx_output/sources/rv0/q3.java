package rv0;

/* loaded from: classes5.dex */
public final class q3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.f f400201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400202e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(rv0.f fVar, rv0.n1 n1Var) {
        super(1);
        this.f400201d = fVar;
        this.f400202e = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        rv0.f fVar = this.f400201d;
        if (fVar.getUserActed$plugin_mj_template_release()) {
            gx0.kh q76 = this.f400202e.q7();
            java.lang.String string = fVar.getContext().getString(com.tencent.mm.R.string.lm8);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        fVar.D = false;
        return java.lang.Boolean.TRUE;
    }
}
