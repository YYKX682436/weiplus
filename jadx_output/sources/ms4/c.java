package ms4;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f331003d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f331004e = null;

    public c() {
        this.f331003d = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zx6();
        lVar.f70665b = new r45.ay6();
        lVar.f70667d = 5249;
        lVar.f70666c = "/cgi-bin/micromsg-bin/verifysignaturetest";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f331003d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f331004e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f331003d;
        r45.zx6 zx6Var = (r45.zx6) oVar.f70710a.f70684a;
        com.tencent.mm.network.j jVar = com.tencent.mm.network.j.f72026e;
        java.lang.String c17 = jVar.c("TestSignData");
        byte[] bytes = c17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
        if (android.text.TextUtils.isEmpty(c17)) {
            com.tencent.mars.xlog.Log.e("MMVerifyCgiSignatureTest", "sign failed");
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MMVerifyCgiSignatureTest", "after sign data length " + c17.length() + " byte length " + bytes.length);
        zx6Var.f392462e = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
        zx6Var.f392461d = new com.tencent.mm.protobuf.g("TestSignData".getBytes());
        jVar.getClass();
        try {
            com.tencent.mm.jni.utils.UtilsJni.ecdsaVerifyWithOctKey(jVar.f72029c.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1), "TestSignData".getBytes(java.nio.charset.StandardCharsets.ISO_8859_1), c17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("CgiSignerPublicAndPrivateKey", "verify failed " + e17.getLocalizedMessage());
        }
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5249;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.ie ieVar;
        com.tencent.mars.xlog.Log.i("MMVerifyCgiSignatureTest", "receive response " + i18 + " code " + i19 + " message " + str + " code " + v0Var.getRespObj().getRetCode());
        r45.ay6 ay6Var = (r45.ay6) this.f331003d.f70711b.f70700a;
        v0Var.getRespObj().getProfile();
        if (ay6Var == null || (ieVar = ay6Var.BaseResponse) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("response or BaseResponse is null ");
            sb6.append(ay6Var == null);
            com.tencent.mars.xlog.Log.e("MMVerifyCgiSignatureTest", sb6.toString());
        } else {
            int i27 = ieVar.f376959d;
        }
        this.f331004e.onSceneEnd(i18, i19, str, this);
    }
}
