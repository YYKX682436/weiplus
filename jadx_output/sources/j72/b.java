package j72;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f298038d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f298039e;

    /* renamed from: f, reason: collision with root package name */
    public r45.kf3 f298040f;

    public b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jf3();
        lVar.f70665b = new r45.kf3();
        lVar.f70667d = 5965;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getfacechecklivetype";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f298039e = a17;
        r45.jf3 jf3Var = (r45.jf3) a17.f70710a.f70684a;
        r45.ae aeVar = new r45.ae();
        jf3Var.f377784h = aeVar;
        aeVar.f369960n = wo.w0.n();
        jf3Var.f377784h.f369961o = wo.w0.a() ? 1 : 0;
        jf3Var.f377784h.f369962p = wo.w0.b() ? 1 : 0;
        jf3Var.f377780d = i17;
        jf3Var.f377781e = str;
        jf3Var.f377782f = str2;
        jf3Var.f377783g = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetFaceCheckLiveType", "NetSceneGetFaceCheckLiveType: %s, packageName: %s, packageSign: %s", java.lang.Integer.valueOf(i17), str, str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f298038d = u0Var;
        return dispatch(sVar, this.f298039e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5965;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetFaceCheckLiveType", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f298040f = (r45.kf3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f298038d.onSceneEnd(i18, i19, str, this);
    }
}
