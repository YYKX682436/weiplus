package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.wallet_core.model.d1 implements com.tencent.mm.wallet_core.model.t {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156957d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cp f156958e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156959f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f156960g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.autogen.events.F2fDynamicStartPayEvent f156961h = null;

    /* renamed from: i, reason: collision with root package name */
    public final int f156962i;

    public q(com.tencent.mm.plugin.remittance.model.p pVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.bp();
        lVar.f70665b = new r45.cp();
        lVar.f70667d = 1633;
        lVar.f70666c = "/cgi-bin/mmpay-bin/busif2fplaceorder";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        re4.v a17 = re4.u.a();
        java.lang.String str = pVar.f156941p;
        this.f156960g = str;
        this.f156962i = pVar.f156931f;
        com.tencent.mm.modelbase.o a18 = lVar.a();
        this.f156957d = a18;
        r45.bp bpVar = (r45.bp) a18.f70710a.f70684a;
        bpVar.f370921d = pVar.f156926a;
        bpVar.f370922e = java.net.URLDecoder.decode(pVar.f156927b);
        bpVar.f370923f = pVar.f156928c;
        bpVar.f370924g = pVar.f156929d;
        bpVar.f370925h = pVar.f156930e;
        bpVar.f370926i = pVar.f156931f;
        bpVar.M = pVar.f156951z;
        bpVar.f370927m = pVar.f156932g;
        bpVar.f370929o = pVar.f156933h;
        bpVar.f370928n = pVar.f156934i;
        bpVar.f370932r = pVar.f156935j;
        bpVar.F = pVar.f156945t;
        bpVar.H = pVar.f156947v;
        bpVar.f370933s = pVar.f156937l;
        bpVar.I = pVar.f156948w;
        r45.uq0 uq0Var = pVar.f156938m;
        if (uq0Var != null) {
            bpVar.f370934t = uq0Var;
        }
        bpVar.f370935u = pVar.f156939n;
        bpVar.f370936v = pVar.f156940o;
        if (pVar.f156936k == 1) {
            bpVar.f370930p = com.tencent.mm.sdk.platformtools.v0.f193027a.f(false);
            bpVar.f370931q = 0;
        }
        bpVar.f370939y = a17.f394553a;
        bpVar.f370940z = a17.f394554b;
        bpVar.f370938x = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v();
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        bpVar.f370937w = aVar != null ? aVar.isRoot() : false;
        bpVar.A = str;
        bpVar.B = pVar.f156942q;
        bpVar.C = pVar.f156943r;
        bpVar.G = pVar.f156946u;
        bpVar.D = pVar.f156944s;
        java.util.LinkedList linkedList = pVar.B;
        if (linkedList != null) {
            bpVar.L = linkedList;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "extra_buy_detail_infos count: %d", java.lang.Integer.valueOf(linkedList.size()));
        }
        java.lang.String str2 = pVar.f156949x;
        if (str2 != null) {
            bpVar.f370920J = str2;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "inputRecvName:%s", str2);
        }
        java.lang.String str3 = pVar.f156950y;
        if (str3 != null) {
            bpVar.K = str3;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "checkRecvNameSign:%s", str3);
        }
        bpVar.N = pVar.A;
        bpVar.P = pVar.C.booleanValue();
        bpVar.R = pVar.E;
        if (pVar.C.booleanValue()) {
            bpVar.Q = pVar.D.booleanValue();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "NetSceneBusiF2fPlaceOrder dycodeurl: %s", pVar.f156941p);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "NetSceneBusiF2fPlaceOrder, scene: %s, channel: %s, total: %s, origin: %s, qrcode: %s, getPayWifi: %s favor_compose_info %s dynamicCodeUrl %s cancel_f2fid:%s cancel_reason:%s unpayType:%s amount_remind_sign:%s,qrcodeSenderName：%s", java.lang.Integer.valueOf(pVar.f156928c), java.lang.Integer.valueOf(pVar.f156932g), java.lang.Integer.valueOf(pVar.f156931f), java.lang.Integer.valueOf(pVar.f156951z), pVar.f156927b, java.lang.Integer.valueOf(pVar.f156936k), com.tencent.mm.plugin.remittance.model.a.c(pVar.f156938m), str, pVar.f156945t, java.lang.Integer.valueOf(pVar.f156947v), java.lang.Integer.valueOf(pVar.f156946u), pVar.f156948w, pVar.E);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156959f = u0Var;
        return dispatch(sVar, this.f156957d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1633;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f156958e = (r45.cp) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(java.lang.String.format("trans_id: %s,", this.f156958e.f371749q));
        stringBuffer.append(java.lang.String.format("zero_pay_flag: %s,", java.lang.Integer.valueOf(this.f156958e.f371751s)));
        stringBuffer.append(java.lang.String.format("can_use_fingerprint: %s,", java.lang.Integer.valueOf(this.f156958e.f371757y)));
        stringBuffer.append(java.lang.String.format("payer_need_auth_flag: %s,", java.lang.Integer.valueOf(this.f156958e.f371752t)));
        com.tencent.mm.wallet_core.model.o oVar = new com.tencent.mm.wallet_core.model.o(i18, i19, str);
        com.tencent.mm.wallet_core.model.z0.getRetModel(i18, i19, str, oVar);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f156958e.f371739d);
        r45.cp cpVar = this.f156958e;
        java.lang.String str2 = cpVar.f371740e;
        java.lang.String str3 = cpVar.f371749q;
        java.lang.String str4 = cpVar.f371744i;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cpVar.f371748p);
        r45.cp cpVar2 = this.f156958e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "ret_code: %s, ret_msg: %s trans_id: %s f2f_id: %s re_getfavor: %s payok_checksign: %s reqKey %s ret:%s", valueOf, str2, str3, str4, valueOf2, cpVar2.f371745m, cpVar2.f371741f, stringBuffer.toString());
        com.tencent.mm.modelbase.u0 u0Var = this.f156959f;
        if (u0Var != null) {
            u0Var.onSceneEnd(oVar.f213952a, oVar.f213953b, oVar.f213954c, this);
        }
    }
}
