package ls4;

/* loaded from: classes8.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls4.e0 f321038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ic5 f321039e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ls4.e0 e0Var, r45.ic5 ic5Var) {
        super(1);
        this.f321038d = e0Var;
        this.f321039e = ic5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ns4.j4 it = (ns4.j4) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ls4.e0 e0Var = this.f321038d;
        e0Var.getClass();
        com.tencent.mars.xlog.Log.i("WeCoinSubscribeLogic", "subscribe");
        ms4.j0.f331046e.b(e0Var.f321047a.f358036a, new ls4.d0(e0Var, this.f321039e));
        return jz5.f0.f302826a;
    }
}
