package mq4;

/* loaded from: classes14.dex */
public class x implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.y f330810d;

    public x(mq4.y yVar) {
        this.f330810d = yVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        mq4.y yVar = this.f330810d;
        vq4.d0.a("MicroMsg.NetSceneVoipSpeedTest", "onSceneEnd type:" + m1Var.getType() + " errType:" + i17 + " errCode:" + i18);
        try {
            r45.r37 r37Var = (r45.r37) yVar.K();
            if (r37Var.f384512d != 0 && r37Var.f384514f != 0) {
                com.tencent.mm.plugin.voip.model.g1 g1Var = yVar.f330796g;
                if (g1Var.f176521m != 1) {
                    vq4.d0.b("MicroMsg.NetSceneVoipSpeedTest", "onVoipSpeedTestResp: no need to do speed test, for mSpeedTestStatus = " + yVar.f330796g.f176521m);
                    return;
                } else {
                    g1Var.f176521m = 2;
                    g1Var.f176523o = r37Var.f384513e;
                    g1Var.f176532x.d(r37Var);
                    return;
                }
            }
            vq4.d0.b("MicroMsg.NetSceneVoipSpeedTest", "onVoipSpeedTestResp: no need to do speed test, svrCount = " + r37Var.f384514f);
        } catch (java.lang.Exception unused) {
            yVar.f330796g.f176521m = 0;
        }
    }
}
