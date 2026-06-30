package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes4.dex */
public class f0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f158898d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f158899e;

    /* renamed from: f, reason: collision with root package name */
    public final int f158900f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f158901g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f158902h;

    public f0(int i17, java.lang.String str, int i18, int i19, int i27, r45.im imVar) {
        this.f158901g = "";
        this.f158902h = false;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.em();
        lVar.f70665b = new r45.fm();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/bizscanbarcode";
        lVar.f70667d = 1061;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f158899e = a17;
        r45.em emVar = (r45.em) a17.f70710a.f70684a;
        emVar.f373596d = i17;
        emVar.f373597e = str;
        emVar.f373598f = H(i27);
        emVar.f373599g = i19;
        emVar.f373600h = imVar;
        this.f158900f = i18;
    }

    public final int H(int i17) {
        if (i17 == 1 || i17 == 9) {
            return 3;
        }
        if (i17 != 99) {
            return (i17 == 5 || i17 == 6 || i17 == 13 || i17 == 14 || i17 == 16 || i17 == 17) ? 1 : 0;
        }
        return 2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f158898d = u0Var;
        return dispatch(sVar, this.f158899e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1061;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f158898d.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        java.lang.String str;
        r45.em emVar = (r45.em) ((com.tencent.mm.modelbase.o) v0Var).f70710a.f70684a;
        if (emVar.f373596d >= 0 && (str = emVar.f373597e) != null && str.length() > 0) {
            return com.tencent.mm.modelbase.o1.EOk;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.scanner.NetSceneScanBarcode", "securityVerificationChecked failed, Type = " + emVar.f373596d + ", Barcode = %s" + emVar.f373597e);
        return com.tencent.mm.modelbase.o1.EFailed;
    }

    public f0(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, r45.im imVar) {
        this.f158901g = "";
        this.f158902h = false;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.em();
        lVar.f70665b = new r45.fm();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/bizscanbarcode";
        lVar.f70667d = 1061;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f158899e = a17;
        r45.em emVar = (r45.em) a17.f70710a.f70684a;
        emVar.f373596d = com.tencent.mm.plugin.scanner.j1.a(str);
        emVar.f373597e = str2;
        emVar.f373598f = H(i19);
        emVar.f373599g = i18;
        emVar.f373600h = imVar;
        this.f158900f = i17;
        this.f158901g = str2;
    }
}
