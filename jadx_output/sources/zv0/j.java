package zv0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f476190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f476191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(zv0.f0 f0Var, rv0.n1 n1Var) {
        super(1);
        this.f476190d = f0Var;
        this.f476191e = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        zv0.f0 f0Var = this.f476190d;
        if (f0Var.getUserActed$plugin_mj_template_release()) {
            gx0.kh q76 = this.f476191e.q7();
            java.lang.String string = f0Var.getContext().getString(com.tencent.mm.R.string.m1s);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        f0Var.D = false;
        return java.lang.Boolean.TRUE;
    }
}
