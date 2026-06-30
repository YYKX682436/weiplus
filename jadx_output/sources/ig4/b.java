package ig4;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f291447d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f291448e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f291449f;

    /* renamed from: g, reason: collision with root package name */
    public int f291450g = -1;

    /* renamed from: h, reason: collision with root package name */
    public r45.x17 f291451h;

    public b(java.lang.String str) {
        iz5.a.g(null, !com.tencent.mm.sdk.platformtools.t8.K0(str));
        this.f291447d = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gr3();
        lVar.f70665b = new r45.hr3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getvoicetransres";
        lVar.f70667d = 548;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f291448e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f291449f = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f291448e;
        ((r45.gr3) oVar.f70710a.f70684a).f375502d = this.f291447d;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 548;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.hr3 hr3Var = (r45.hr3) this.f291448e.f70711b.f70700a;
            r45.oh5 oh5Var = hr3Var.f376400e;
            if (oh5Var != null) {
                this.f291450g = oh5Var.f382271d;
            }
            this.f291451h = hr3Var.f376399d;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetVoiceTransRes", "error get: errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        this.f291449f.onSceneEnd(i18, i19, str, this);
    }
}
