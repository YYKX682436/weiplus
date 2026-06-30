package fu1;

/* loaded from: classes2.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f266821d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f266822e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f266823f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f266824g;

    public c(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zn3();
        lVar.f70665b = new r45.ao3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/card/getsharecardconsumedinfo";
        lVar.f70667d = oc1.e.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f266821d = a17;
        r45.zn3 zn3Var = (r45.zn3) a17.f70710a.f70684a;
        zn3Var.f392238d = str;
        zn3Var.f392239e = i17;
        zn3Var.f392240f = str2;
        zn3Var.f392241g = str3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f266822e = u0Var;
        return dispatch(sVar, this.f266821d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return oc1.e.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetShareCardConsumedInfo", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", java.lang.Integer.valueOf(oc1.e.CTRL_INDEX), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.ao3 ao3Var = (r45.ao3) this.f266821d.f70711b.f70700a;
            this.f266823f = ao3Var.f370166d;
            this.f266824g = ao3Var.f370168f;
        }
        this.f266822e.onSceneEnd(i18, i19, str, this);
    }
}
