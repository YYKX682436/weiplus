package w11;

/* loaded from: classes9.dex */
public class i0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442056d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f442057e;

    public i0(java.util.List list, long j17, r45.wx3 wx3Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.sa3();
        lVar.f70665b = new r45.ta3();
        lVar.f70666c = "/cgi-bin/mmo2o-bin/getbeaconspushmessage";
        lVar.f70667d = 1708;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f442057e = a17;
        r45.sa3 sa3Var = (r45.sa3) a17.f70710a.f70684a;
        sa3Var.f385597d.addAll(list);
        sa3Var.f385599f = j17;
        sa3Var.f385598e = wx3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma]getBeaconsPushMessageReq.beacons.size:%d", java.lang.Integer.valueOf(sa3Var.f385597d.size()));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f442056d = u0Var;
        return dispatch(sVar, this.f442057e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1708;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:netId:%s,errType:%s,errCode:%s,errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f442056d.onSceneEnd(i18, i19, str, this);
        r45.sa3 sa3Var = (r45.sa3) this.f442057e.f70710a.f70684a;
        java.util.LinkedList linkedList = sa3Var.f385597d;
        r45.vx3 vx3Var = (r45.vx3) linkedList.get(0);
        r45.wx3 wx3Var = sa3Var.f385598e;
        r45.ta3 ta3Var = (r45.ta3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12659, 1, java.lang.Integer.valueOf(linkedList.size()), vx3Var.f388642d, java.lang.Integer.valueOf(vx3Var.f388643e), java.lang.Integer.valueOf(vx3Var.f388644f), java.lang.String.valueOf(wx3Var.f389553d), java.lang.String.valueOf(wx3Var.f389554e), 1, java.lang.Integer.valueOf(ta3Var.f386235g));
        } else if (ta3Var.f386235g != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12659, 1, java.lang.Integer.valueOf(linkedList.size()), vx3Var.f388642d, java.lang.Integer.valueOf(vx3Var.f388643e), java.lang.Integer.valueOf(vx3Var.f388644f), java.lang.String.valueOf(wx3Var.f389553d), java.lang.String.valueOf(wx3Var.f389554e), 2, java.lang.Integer.valueOf(ta3Var.f386235g));
        }
    }
}
