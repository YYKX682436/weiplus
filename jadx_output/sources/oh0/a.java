package oh0;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f345182d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f345183e;

    public a(int i17, java.lang.String str, int i18, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jq5();
        lVar.f70665b = new r45.kq5();
        lVar.f70667d = 5193;
        lVar.f70666c = "/cgi-bin/mmpay-bin/report_qrcode_img_classify";
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f345182d = a17;
        r45.jq5 jq5Var = (r45.jq5) a17.f70710a.f70684a;
        jq5Var.f378056e = str;
        jq5Var.f378055d = i17;
        jq5Var.f378059h = i19;
        jq5Var.f378060i = str3;
        jq5Var.f378057f = i18;
        jq5Var.f378058g = str2;
        jq5Var.f378061m = str4;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f345183e = u0Var;
        return dispatch(sVar, this.f345182d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5193;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQRCodeOCRScanReport", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
        }
        this.f345183e.onSceneEnd(i18, i19, str, this);
    }
}
