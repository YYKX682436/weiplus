package j72;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f298035d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f298036e;

    /* renamed from: f, reason: collision with root package name */
    public r45.if3 f298037f;

    public a(int i17, java.lang.String str, java.lang.String str2) {
        this(i17, str, str2, 1, new byte[1]);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f298035d = u0Var;
        return dispatch(sVar, this.f298036e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2696;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetFaceCheckAction", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f298037f = (r45.if3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f298035d.onSceneEnd(i18, i19, str, this);
    }

    public a(int i17, java.lang.String str, java.lang.String str2, int i18, byte[] bArr) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hf3();
        lVar.f70665b = new r45.if3();
        lVar.f70667d = 2696;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getfacecheckaction";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f298036e = a17;
        r45.hf3 hf3Var = (r45.hf3) a17.f70710a.f70684a;
        r45.ae aeVar = new r45.ae();
        hf3Var.f376116i = aeVar;
        aeVar.f369960n = wo.w0.n();
        hf3Var.f376116i.f369961o = wo.w0.a() ? 1 : 0;
        hf3Var.f376116i.f369962p = wo.w0.b() ? 1 : 0;
        hf3Var.f376111d = i17;
        hf3Var.f376112e = str;
        hf3Var.f376113f = str2;
        hf3Var.f376114g = i18;
        hf3Var.f376115h = com.tencent.mm.protobuf.g.b(bArr);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_spam_report, false)) {
            new r45.ju3();
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f378396f = cu5Var;
            hf3Var.f376117m = com.tencent.mm.protobuf.g.b(k57Var.toByteArray());
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_vpn_report, false)) {
            hf3Var.f376118n = ((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Ai();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetFaceCheckAction", "create GetFaceCheckAction, scene: %s, packageName: %s, packageSign: %s", java.lang.Integer.valueOf(i17), str, str2);
    }
}
