package h34;

/* loaded from: classes2.dex */
public class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f278535d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f278536e;

    public h(int i17, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hz4();
        lVar.f70665b = new r45.iz4();
        lVar.f70666c = "/cgi-bin/mmoctv/optvhist";
        lVar.f70667d = 1740;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f278536e = a17;
        r45.hz4 hz4Var = (r45.hz4) a17.f70710a.f70684a;
        hz4Var.f376570d = i17;
        hz4Var.f376571e = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f278535d = u0Var;
        return dispatch(sVar, this.f278536e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1740;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpTvHist", "onGYNetEnd [%d,%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f278535d.onSceneEnd(i18, i19, str, this);
    }
}
