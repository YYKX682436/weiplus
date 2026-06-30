package h34;

/* loaded from: classes9.dex */
public class m extends h34.j {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f278550f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f278551g;

    public m(byte[] bArr, int i17, long j17, int i18, boolean z17, int i19) {
        super(bArr, i17, j17, i18, z17, i19);
        float f17;
        float f18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.w36();
        lVar.f70665b = new r45.x36();
        lVar.f70666c = "/cgi-bin/micromsg-bin/shaketv";
        lVar.f70667d = 408;
        int i27 = 0;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f278551g = a17;
        r45.w36 w36Var = (r45.w36) a17.f70710a.f70684a;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        w36Var.f388853d = cu5Var;
        w36Var.f388854e = i18;
        w36Var.f388855f = z17 ? 1 : 0;
        w36Var.f388856g = i17;
        w36Var.f388857h = com.tencent.mm.network.y2.a(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 1 : 2;
        w36Var.f388858i = i19;
        float f19 = 0.0f;
        try {
            f18 = com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_TV_LATITUDE_STRING, null), 0.0f);
            try {
                f19 = com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_TV_LONGTITUDE_STRING, null), 0.0f);
                i27 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_TV_ACCURACY_STRING, null), 0);
            } catch (java.lang.Exception unused) {
                f17 = f19;
                f19 = f18;
                float f27 = f17;
                f18 = f19;
                f19 = f27;
                w36Var.f388860n = f18;
                w36Var.f388859m = f19;
                ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION, w36Var.f388859m, w36Var.f388860n, i27);
            }
        } catch (java.lang.Exception unused2) {
            f17 = 0.0f;
        }
        w36Var.f388860n = f18;
        w36Var.f388859m = f19;
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION, w36Var.f388859m, w36Var.f388860n, i27);
    }

    @Override // h34.j
    public r45.js5 H() {
        return (r45.x36) this.f278551g.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.modelbase.o oVar = this.f278551g;
        r45.w36 w36Var = (r45.w36) oVar.f70710a.f70684a;
        int i17 = w36Var.f388854e;
        int i18 = w36Var.f388853d.f371839d;
        this.f278550f = u0Var;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 408;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.o oVar = this.f278551g;
        r45.w36 w36Var = (r45.w36) oVar.f70710a.f70684a;
        r45.x36 x36Var = (r45.x36) oVar.f70711b.f70700a;
        int i27 = w36Var.f388854e;
        int i28 = x36Var.f389755d;
        if (i18 == 0 && i19 == 0 && x36Var.f389755d == 1) {
            this.f278544d = true;
        }
        this.f278550f.onSceneEnd(i18, i19, str, this);
    }
}
