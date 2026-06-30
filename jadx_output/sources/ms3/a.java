package ms3;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f330974d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f330975e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f330976f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f330977g;

    public a(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 11665;
        lVar.f70666c = "/cgi-bin/xmmailbroker/mb_createuploadurl";
        this.f330976f = str;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        ks3.a1 a1Var = new ks3.a1();
        a1Var.f311618d = gm0.j1.b().h();
        java.lang.String str5 = a17.f213279f;
        int lastIndexOf = str5.lastIndexOf("/");
        a1Var.f311619e = lastIndexOf >= 0 ? str5.substring(lastIndexOf + 1) : str5;
        a1Var.f311620f = i17;
        a1Var.f311621g = str2;
        a1Var.f311622h = str3;
        this.f330977g = str2;
        lVar.f70664a = a1Var;
        lVar.f70665b = new ks3.b1();
        this.f330974d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f330975e = u0Var;
        return dispatch(sVar, this.f330974d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 11665;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mail.NetSceneCreateUploadUrl", "errType:%s errCode%s errMsg:%s", objArr);
        this.f330975e.onSceneEnd(i18, i19, str, this);
    }
}
