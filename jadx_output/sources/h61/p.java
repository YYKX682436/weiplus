package h61;

/* loaded from: classes4.dex */
public class p implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public km5.b f279162d;

    /* renamed from: e, reason: collision with root package name */
    public long f279163e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f279164f = "";

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CloseAALogic", "onSceneEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 0 || i18 != 0) {
            this.f279162d.a(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 22L, 1L, false);
            return;
        }
        i61.e eVar = (i61.e) m1Var;
        r45.g gVar = eVar.f288905e;
        com.tencent.mars.xlog.Log.i("MicroMsg.CloseAALogic", "closeAA, response.retcode: %s", java.lang.Integer.valueOf(gVar.f374756d));
        int i19 = gVar.f374756d;
        if (i19 == 0) {
            km5.u.h(this.f279162d, java.lang.Boolean.TRUE);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(gVar.f374758f)) {
                long j17 = this.f279163e;
                if (j17 > 0 && eVar.f288907g == 3) {
                    h61.o.t(this.f279164f, j17, gVar.f374758f);
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 21L, 1L, false);
            return;
        }
        if (i19 <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(gVar.f374757e)) {
            this.f279162d.a(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 23L, 1L, false);
        } else {
            this.f279162d.a(gVar.f374757e);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 11L, 1L, false);
        }
    }
}
