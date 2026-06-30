package gs4;

/* loaded from: classes9.dex */
public class h extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public r45.zg3 f275096d;

    /* renamed from: e, reason: collision with root package name */
    public gs4.f f275097e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f275098f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f275099g;

    public h() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yg3();
        lVar.f70665b = new r45.zg3();
        lVar.f70666c = "/cgi-bin/mmpay-bin/ftfhb/gethbrefundconfig";
        lVar.f70667d = 1477;
        this.f275098f = lVar.a();
    }

    public gs4.f H() {
        if (this.f275097e == null) {
            gs4.f fVar = new gs4.f();
            this.f275097e = fVar;
            r45.zg3 zg3Var = this.f275096d;
            fVar.f275081a = zg3Var.f391995d;
            fVar.f275082b = zg3Var.f391997f;
            fVar.f275083c = zg3Var.f391998g;
            fVar.f275084d = zg3Var.f391999h;
            fVar.f275085e = zg3Var.f392000i;
            fVar.f275086f = zg3Var.f392001m;
            fVar.f275087g = zg3Var.f392002n;
            fVar.f275088h = zg3Var.f392003o;
            fVar.f275089i = zg3Var.f392004p;
            fVar.f275091k = zg3Var.f392006r;
            fVar.f275090j = new java.util.ArrayList();
            java.util.Iterator it = this.f275096d.f392005q.iterator();
            while (it.hasNext()) {
                r45.zv3 zv3Var = (r45.zv3) it.next();
                this.f275097e.f275090j.add(new gs4.g(zv3Var.f392385d, zv3Var.f392386e, zv3Var.f392387f, zv3Var.f392388g));
            }
        }
        return this.f275097e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f275099g = u0Var;
        return dispatch(sVar, this.f275098f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1477;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetHbRefundConfig", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f275096d = (r45.zg3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        this.f275099g.onSceneEnd(i18, i19, str, this);
    }
}
