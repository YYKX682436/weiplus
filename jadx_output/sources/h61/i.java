package h61;

/* loaded from: classes9.dex */
public class i implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.tw4 f279150d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f279151e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f279152f = "";

    /* renamed from: g, reason: collision with root package name */
    public km5.b f279153g;

    public i() {
    }

    public int a() {
        gm0.j1.i();
        return ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_AA_MAX_PAYER_NUM_INT, 20)).intValue();
    }

    public long b() {
        gm0.j1.i();
        return ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_AA_MAX_PER_AMOUNT_LONG, 200000L)).longValue();
    }

    public int c() {
        gm0.j1.i();
        return ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_AA_MAX_TOTAL_USER_NUM_INT, 20)).intValue();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AAOperationData", "get AAOperation, onSceneEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 0 || i18 != 0) {
            km5.u.b().a(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 34L, 1L, false);
            return;
        }
        r45.s sVar = ((i61.i) m1Var).f288924e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AAOperationData", "get AAOperation data, retCode: %s, retMsg: %s, max_payer_num: %s, max_receiver_num: %s, max_total_num: %s, max_total_amount: %s, max_per_amount: %s, notice: %s, notice_url: %s,response.default_mod:%s", java.lang.Integer.valueOf(sVar.f385338d), sVar.f385339e, java.lang.Integer.valueOf(sVar.f385340f), java.lang.Integer.valueOf(sVar.f385341g), java.lang.Integer.valueOf(sVar.f385342h), java.lang.Long.valueOf(sVar.f385343i), java.lang.Long.valueOf(sVar.f385344m), sVar.f385345n, sVar.f385346o, java.lang.Integer.valueOf(sVar.f385347p));
        if (sVar.f385338d != 0) {
            km5.u.b().a(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 35L, 1L, false);
            return;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AA_MAX_PAYER_NUM_INT, java.lang.Integer.valueOf(sVar.f385340f));
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AA_MAX_RECEIVER_NUM_INT, java.lang.Integer.valueOf(sVar.f385341g));
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AA_MAX_TOTAL_USER_NUM_INT, java.lang.Integer.valueOf(sVar.f385342h));
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AA_MAX_TOTAL_AMOUNT_LONG, java.lang.Long.valueOf(sVar.f385343i));
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AA_MAX_PER_AMOUNT_LONG, java.lang.Long.valueOf(sVar.f385344m));
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AA_DEFAULT_INT, java.lang.Integer.valueOf(sVar.f385347p));
        h61.i iVar = new h61.i(sVar.f385346o, sVar.f385345n);
        iVar.f279150d = sVar.f385348q;
        iVar.f279151e = sVar.f385349r;
        iVar.f279152f = sVar.f385350s;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(407L, 33L, 1L, false);
        km5.u.h(this.f279153g, iVar);
    }

    public i(java.lang.String str, java.lang.String str2) {
    }
}
