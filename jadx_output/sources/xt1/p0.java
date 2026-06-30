package xt1;

/* loaded from: classes8.dex */
public class p0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456547d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456548e;

    public p0(java.lang.String str, byte[] bArr, float f17, float f18, float f19, boolean z17, boolean z18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.bq5();
        lVar.f70665b = new r45.cq5();
        lVar.f70666c = "/cgi-bin/card/reportlotionorbluetoothinfo";
        lVar.f70667d = 2574;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456547d = a17;
        r45.bq5 bq5Var = (r45.bq5) a17.f70710a.f70684a;
        bq5Var.f370995h = str;
        bq5Var.f370994g = com.tencent.mm.protobuf.g.b(bArr);
        bq5Var.f370991d = f17;
        bq5Var.f370992e = f18;
        bq5Var.f370993f = f19;
        bq5Var.f370996i = z17;
        bq5Var.f370997m = z18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456548e = u0Var;
        return dispatch(sVar, this.f456547d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2574;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReportLotionOrBluetoothInfo", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        this.f456548e.onSceneEnd(i18, i19, str, this);
    }
}
