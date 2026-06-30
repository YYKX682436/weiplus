package ks3;

/* loaded from: classes13.dex */
public class c0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f311644d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f311645e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f311646f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f311647g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f311648h;

    public c0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 586;
        this.f311646f = str;
        this.f311647g = str2;
        this.f311648h = str3;
        ks3.e eVar = new ks3.e();
        eVar.f311656d = i17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            try {
                byte[] hexStr2Bytes = com.qq.taf.jce.HexUtil.hexStr2Bytes(str3);
                javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(hexStr2Bytes, "AES");
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, new javax.crypto.spec.IvParameterSpec(hexStr2Bytes));
                char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                byte[] bytes = com.tencent.mm.sdk.platformtools.w2.b(str4.getBytes()).getBytes(com.tencent.mapsdk.internal.rv.f51270c);
                byte[] doFinal = cipher.doFinal(bytes);
                com.qq.taf.jce.HexUtil.bytes2HexStr(hexStr2Bytes);
                com.qq.taf.jce.HexUtil.bytes2HexStr(bytes);
                com.qq.taf.jce.HexUtil.bytes2HexStr(doFinal);
                str5 = android.util.Base64.encodeToString(doFinal, 2);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneBindXmail", e17, "bind xmail encrypt second pwd error", new java.lang.Object[0]);
                str5 = "";
            }
            eVar.f311660h = str5;
        }
        eVar.f311658f = str;
        eVar.f311659g = str2;
        lVar.f70664a = eVar;
        lVar.f70665b = new ks3.f();
        lVar.f70666c = "/cgi-bin/micromsg-bin/commitbindxmail";
        this.f311644d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f311645e = u0Var;
        return dispatch(sVar, this.f311644d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 586;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f311645e.onSceneEnd(i18, i19, str, this);
    }
}
