package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes2.dex */
public class b0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f158817d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f158818e;

    public b0(java.lang.String str, com.tencent.mm.protobuf.g gVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cx();
        lVar.f70665b = new r45.dx();
        lVar.f70667d = 4561;
        lVar.f70666c = "/cgi-bin/mmpay-bin/report_qrcode_scan_identify_scene";
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f158817d = a17;
        r45.cx cxVar = (r45.cx) a17.f70710a.f70684a;
        cxVar.f371878d = str;
        cxVar.f371879e = gVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f158818e = u0Var;
        return dispatch(sVar, this.f158817d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4561;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2fQrcodeScanIdentify", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
        }
        this.f158818e.onSceneEnd(i18, i19, str, this);
    }
}
