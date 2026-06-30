package ls4;

/* loaded from: classes8.dex */
public final class y implements ms4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.e0 f321112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ic5 f321113b;

    public y(ls4.e0 e0Var, r45.ic5 ic5Var) {
        this.f321112a = e0Var;
        this.f321113b = ic5Var;
    }

    @Override // ms4.b
    public void a(r45.ma5 ma5Var) {
        ls4.e0 e0Var = this.f321112a;
        if (ma5Var != null && ma5Var.f380307e == 3) {
            e0Var.c(this.f321113b);
        } else {
            com.tencent.mars.xlog.Log.i("WeCoinSubscribeLogic", "click intercept");
            e0Var.f321047a.f358038c.invoke(new pr4.n(pr4.p.f358041d));
        }
    }
}
