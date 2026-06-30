package wv0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv0.q f449913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f449914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(wv0.q qVar, rv0.n1 n1Var) {
        super(1);
        this.f449913d = qVar;
        this.f449914e = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        wv0.q qVar = this.f449913d;
        if (qVar.getUserActed$plugin_mj_template_release()) {
            rv0.n1 n1Var = this.f449914e;
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = n1Var.getContext().getString(com.tencent.mm.R.string.lmg);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        qVar.D = false;
        return java.lang.Boolean.TRUE;
    }
}
