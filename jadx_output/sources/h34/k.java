package h34;

/* loaded from: classes9.dex */
public class k extends h34.j {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f278546f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f278547g;

    public k(byte[] bArr, int i17, long j17, int i18, boolean z17, int i19) {
        super(bArr, i17, j17, i18, z17, i19);
        float f17;
        float f18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.s36();
        lVar.f70665b = new r45.t36();
        lVar.f70666c = "/cgi-bin/micromsg-bin/shakemusic";
        lVar.f70667d = 367;
        lVar.f70668e = 177;
        lVar.f70669f = 1000000177;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f278547g = a17;
        r45.s36 s36Var = (r45.s36) a17.f70710a.f70684a;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        s36Var.f385475d = cu5Var;
        s36Var.f385476e = i18;
        s36Var.f385477f = z17 ? 1 : 0;
        s36Var.f385478g = i17;
        s36Var.f385479h = com.tencent.mm.network.y2.a(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 1 : 2;
        s36Var.f385480i = i19;
        int i27 = 0;
        float f19 = 0.0f;
        try {
            f18 = com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_TV_LATITUDE_STRING, null), 0.0f);
        } catch (java.lang.Exception unused) {
            f17 = 0.0f;
        }
        try {
            f19 = com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_TV_LONGTITUDE_STRING, null), 0.0f);
            i27 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_TV_ACCURACY_STRING, null), 0);
        } catch (java.lang.Exception unused2) {
            f17 = f19;
            f19 = f18;
            float f27 = f17;
            f18 = f19;
            f19 = f27;
            s36Var.f385482n = f18;
            s36Var.f385481m = f19;
            s36Var.f385483o = 1 ^ (b21.q.a() ? 1 : 0);
            s36Var.f385484p = b21.q.b() ? 1 : 0;
            ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_LOADING_END, s36Var.f385481m, s36Var.f385482n, i27);
        }
        s36Var.f385482n = f18;
        s36Var.f385481m = f19;
        s36Var.f385483o = 1 ^ (b21.q.a() ? 1 : 0);
        s36Var.f385484p = b21.q.b() ? 1 : 0;
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_LOADING_END, s36Var.f385481m, s36Var.f385482n, i27);
    }

    @Override // h34.j
    public r45.js5 H() {
        return (r45.t36) this.f278547g.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.modelbase.o oVar = this.f278547g;
        r45.s36 s36Var = (r45.s36) oVar.f70710a.f70684a;
        int i17 = s36Var.f385476e;
        int i18 = s36Var.f385475d.f371839d;
        this.f278546f = u0Var;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 367;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.o oVar = this.f278547g;
        r45.s36 s36Var = (r45.s36) oVar.f70710a.f70684a;
        r45.t36 t36Var = (r45.t36) oVar.f70711b.f70700a;
        int i27 = s36Var.f385476e;
        int i28 = t36Var.f386098d;
        if (i18 == 0 && i19 == 0 && t36Var.f386098d == 1) {
            this.f278544d = true;
        }
        this.f278546f.onSceneEnd(i18, i19, str, this);
    }
}
