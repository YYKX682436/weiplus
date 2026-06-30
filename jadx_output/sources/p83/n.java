package p83;

/* loaded from: classes8.dex */
public class n extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352768d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.te5 f352769e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352770f = null;

    public n(int i17, long j17, long j18, int i18) {
        this.f352768d = null;
        this.f352769e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.te5();
        lVar.f70665b = new r45.ue5();
        lVar.f70667d = 723;
        lVar.f70666c = "/cgi-bin/micromsg-bin/pstnshutdown";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352768d = a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.te5 te5Var = (r45.te5) a17.f70710a.f70684a;
        this.f352769e = te5Var;
        te5Var.f386353d = c01.z1.r();
        te5Var.f386354e = i17;
        te5Var.f386355f = j17;
        te5Var.f386357h = j18;
        te5Var.f386358i = i18;
        te5Var.f386356g = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallShutDown", "roomId: %d, roomKey: %d, callSeq: %d, status: %d, timestamp: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(currentTimeMillis));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352770f = u0Var;
        return dispatch(sVar, this.f352768d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 723;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallShutDown", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.u0 u0Var = this.f352770f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
