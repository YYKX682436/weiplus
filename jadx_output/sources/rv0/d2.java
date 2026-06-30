package rv0;

/* loaded from: classes5.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.d f399968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f399969e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(rv0.d dVar, rv0.n1 n1Var) {
        super(1);
        this.f399968d = dVar;
        this.f399969e = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        rv0.d dVar = this.f399968d;
        if (dVar.getUserActed$plugin_mj_template_release()) {
            gx0.kh q76 = this.f399969e.q7();
            java.lang.String string = dVar.getContext().getString(com.tencent.mm.R.string.lm_);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        dVar.D = false;
        return java.lang.Boolean.TRUE;
    }
}
