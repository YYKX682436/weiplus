package mq4;

/* loaded from: classes14.dex */
public class n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.o f330803d;

    public n(mq4.o oVar) {
        this.f330803d = oVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        mq4.o oVar = this.f330803d;
        com.tencent.mm.plugin.voip.model.l1 l1Var = oVar.f330796g.f176532x.M1;
        l1Var.getClass();
        l1Var.g((int) (java.lang.System.currentTimeMillis() - l1Var.P));
        l1Var.P = 0L;
        if (i17 != 0) {
            if (i18 == 231 || i18 == 212 || i18 == 247) {
                vq4.d0.b(oVar.f330804h, "Voip heartbeat Failed, type:" + m1Var.getType() + " errType:" + i17 + " errCode:" + i18);
                com.tencent.mm.plugin.voip.model.g1 g1Var = oVar.f330796g;
                com.tencent.mm.plugin.voip.model.l1 l1Var2 = g1Var.f176532x.M1;
                l1Var2.f176713a = 111;
                l1Var2.f176715b = i18;
                l1Var2.f176732s = 2;
                g1Var.v(1, -9004, "", -1);
            }
        }
    }
}
