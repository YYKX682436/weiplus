package jm4;

/* loaded from: classes11.dex */
public final class h6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f300392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(yz5.l lVar) {
        super(0);
        this.f300392d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinServiceStatic", "consume cancel");
        bw5.jr0 jr0Var = new bw5.jr0();
        jr0Var.f29120d = bw5.fp0.ConsumeCancel;
        jr0Var.f29123g[1] = true;
        yz5.l lVar = this.f300392d;
        if (lVar != null) {
            lVar.invoke(jr0Var);
        }
        return jz5.f0.f302826a;
    }
}
