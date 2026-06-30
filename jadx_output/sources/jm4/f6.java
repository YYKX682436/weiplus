package jm4;

/* loaded from: classes11.dex */
public final class f6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f300384d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(yz5.l lVar) {
        super(1);
        this.f300384d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.b successResult = (pr4.b) obj;
        kotlin.jvm.internal.o.g(successResult, "successResult");
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinServiceStatic", "consume success, balance: " + successResult.f357986a);
        bw5.jr0 jr0Var = new bw5.jr0();
        jr0Var.f29120d = bw5.fp0.ConsumeSuccess;
        jr0Var.f29123g[1] = true;
        yz5.l lVar = this.f300384d;
        if (lVar != null) {
            lVar.invoke(jr0Var);
        }
        return jz5.f0.f302826a;
    }
}
