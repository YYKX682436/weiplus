package h61;

/* loaded from: classes9.dex */
public class l implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public km5.b f279157d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f279158e = false;

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AAPayLogic", "AAPayLogic, onSceneEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f279158e = false;
        if (i17 != 0 || i18 != 0) {
            km5.b bVar = this.f279157d;
            if (bVar != null) {
                bVar.a(java.lang.Boolean.FALSE);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 10L, 1L, false);
            return;
        }
        r45.v vVar = ((i61.j) m1Var).f288927e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AAPayLogic", "AAPayLogic, onSceneEnd, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(vVar.f387771d), vVar.f387772e);
        if (vVar.f387771d == 0) {
            km5.u.h(this.f279157d, vVar);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 9L, 1L, false);
            return;
        }
        if (this.f279157d != null) {
            r45.a aVar = vVar.f387777m;
            if (aVar != null && aVar.f369567d == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.f369571h) && !com.tencent.mm.sdk.platformtools.t8.K0(vVar.f387777m.f369569f) && !com.tencent.mm.sdk.platformtools.t8.K0(vVar.f387777m.f369570g) && !com.tencent.mm.sdk.platformtools.t8.K0(vVar.f387777m.f369568e)) {
                this.f279157d.a(vVar.f387777m);
            } else if (vVar.f387771d <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(vVar.f387772e)) {
                this.f279157d.a(java.lang.Boolean.FALSE);
            } else {
                this.f279157d.a(vVar.f387772e);
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 11L, 1L, false);
    }
}
