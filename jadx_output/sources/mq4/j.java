package mq4;

/* loaded from: classes14.dex */
public class j implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.k f330801d;

    public j(mq4.k kVar) {
        this.f330801d = kVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("double link switch response:");
        sb6.append(i17);
        sb6.append(" errCode:");
        sb6.append(i18);
        sb6.append(" status:");
        mq4.k kVar = this.f330801d;
        sb6.append(kVar.f330796g.f176508a);
        vq4.d0.c("MicroMsg.Voip.DoubleLinkSwitch", sb6.toString());
        if (i18 != 0) {
            vq4.d0.b("MicroMsg.Voip.DoubleLinkSwitch", " double link switch  response with error code:" + i18);
            return;
        }
        r45.p27 p27Var = (r45.p27) kVar.K();
        com.tencent.mm.plugin.voip.model.g1 g1Var = kVar.f330796g;
        int i19 = p27Var.f382691g;
        g1Var.f176526r = i19;
        if (i19 == 0) {
            return;
        }
        if (g1Var.f176532x.doubleLinkSwitch(p27Var.f382692h) == 0) {
            int i27 = p27Var.f382692h;
            if (1 == i27) {
                kVar.f330796g.f176532x.f176840d1++;
            } else if (2 == i27) {
                kVar.f330796g.f176532x.f176843e1++;
            }
        }
        vq4.d0.c("MicroMsg.Voip.DoubleLinkSwitch", "zhengxue[DOUBLELINK]room " + p27Var.f382688d + " member " + p27Var.f382690f + " key " + p27Var.f382689e + "report flag " + p27Var.f382691g + "switch to link type " + p27Var.f382692h + "doubleLinkSwitchReportStatus " + kVar.f330796g.f176526r + "mDoubleLinkSwitchSucToDirectCnt" + kVar.f330796g.f176532x.f176840d1 + "mDoubleLinkSwitchSucToRelayCnt" + kVar.f330796g.f176532x.f176843e1);
    }
}
