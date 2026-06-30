package jm4;

/* loaded from: classes11.dex */
public final class g6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f300386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(yz5.l lVar) {
        super(1);
        this.f300386d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.fp0 fp0Var;
        pr4.a error = (pr4.a) obj;
        kotlin.jvm.internal.o.g(error, "error");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("consume fail, errorType: ");
        pr4.j jVar = error.f357985a;
        sb6.append(jVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinServiceStatic", sb6.toString());
        bw5.jr0 jr0Var = new bw5.jr0();
        int ordinal = jVar.ordinal();
        if (ordinal == 0) {
            fp0Var = bw5.fp0.ConsumeDefaultError;
        } else if (ordinal == 1) {
            fp0Var = bw5.fp0.ConsumeNoMoney;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            fp0Var = bw5.fp0.ConsumeIntercept;
        }
        jr0Var.f29120d = fp0Var;
        jr0Var.f29123g[1] = true;
        yz5.l lVar = this.f300386d;
        if (lVar != null) {
            lVar.invoke(jr0Var);
        }
        return jz5.f0.f302826a;
    }
}
