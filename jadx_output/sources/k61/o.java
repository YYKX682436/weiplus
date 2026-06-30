package k61;

/* loaded from: classes4.dex */
public class o implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f304509a;

    public o(k61.p pVar, km5.b bVar) {
        this.f304509a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.PaylistAAInteractor", "on urgeAAPay finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        km5.b bVar = this.f304509a;
        if (i17 != 0 || fVar.f70616b != 0) {
            bVar.a(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 25L, 1L, false);
            return null;
        }
        r45.z zVar = (r45.z) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.PaylistAAInteractor", "on urgeAAPay finish, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(zVar.f391559d), zVar.f391560e);
        int i18 = zVar.f391559d;
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PaylistAAInteractor", "on urgeAAPay success");
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
            bVar.c(java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 24L, 1L, false);
            return null;
        }
        if (i18 <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(zVar.f391560e)) {
            bVar.a(java.lang.Boolean.FALSE);
        } else {
            bVar.a(zVar.f391560e);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 26L, 1L, false);
        return null;
    }
}
