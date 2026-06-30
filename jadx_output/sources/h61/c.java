package h61;

/* loaded from: classes9.dex */
public class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public km5.b f279140d;

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AAGetPaylistDetailLogic", "onSceneEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 0 || i18 != 0) {
            km5.b bVar = this.f279140d;
            if (bVar != null) {
                bVar.a(java.lang.Boolean.FALSE);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 7L, 1L, false);
            return;
        }
        r45.d0 d0Var = ((i61.k) m1Var).f288930e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AAGetPaylistDetailLogic", "AAQueryDetailRes, onSceneEnd, retCode: %s", java.lang.Integer.valueOf(d0Var.f371955d));
        int i19 = d0Var.f371955d;
        if (i19 == 0) {
            km5.u.h(this.f279140d, d0Var);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 6L, 1L, false);
            j61.c z07 = e61.e.wi().z0(d0Var.f371957f);
            if (z07 != null) {
                z07.field_status = d0Var.f371965q;
                e61.e.wi().replace(z07);
                return;
            }
            return;
        }
        r45.a aVar = d0Var.G;
        if (aVar != null && aVar.f369567d == 1) {
            this.f279140d.a(aVar);
        } else if (i19 <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f371956e)) {
            this.f279140d.a(java.lang.Boolean.FALSE);
        } else {
            this.f279140d.a(d0Var.f371956e);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 8L, 1L, false);
    }
}
