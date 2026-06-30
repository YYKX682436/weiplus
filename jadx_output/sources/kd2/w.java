package kd2;

/* loaded from: classes8.dex */
public final class w extends com.tencent.mm.plugin.ball.service.s4 {

    /* renamed from: v, reason: collision with root package name */
    public final kd2.a0 f306856v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kd2.a0 finderPageAdapter) {
        super(finderPageAdapter);
        kotlin.jvm.internal.o.g(finderPageAdapter, "finderPageAdapter");
        this.f306856v = finderPageAdapter;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        this.f93246u = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderContentFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent");
        this.f93239n.q(false);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String floatBallKey) {
        kotlin.jvm.internal.o.g(floatBallKey, "floatBallKey");
        super.b(i17, floatBallKey);
        Q(1);
    }

    @Override // com.tencent.mm.plugin.ball.service.d, gp1.r
    public void e() {
        t().f93085e = -1;
        t().f93089i = "";
        g();
    }
}
