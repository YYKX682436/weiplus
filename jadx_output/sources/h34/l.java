package h34;

/* loaded from: classes8.dex */
public class l extends h34.j {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f278548f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f278549g;

    public l(byte[] bArr, int i17, int i18, int i19, long j17, int i27, boolean z17, int i28) {
        super(bArr, i19, j17, i27, z17, i28);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fh4();
        lVar.f70665b = new r45.gh4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmqqshakemusic";
        lVar.f70667d = 5245;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f278549g = a17;
        r45.fh4 fh4Var = (r45.fh4) a17.f70710a.f70684a;
        fh4Var.f374352f = new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
        fh4Var.f374350d = 0;
        fh4Var.f374355i = z17 ? 1 : 0;
        fh4Var.f374353g = i18;
        fh4Var.f374354h = i17;
        fh4Var.f374351e = i27 + "";
    }

    @Override // h34.j
    public r45.js5 H() {
        return (r45.gh4) this.f278549g.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.modelbase.o oVar = this.f278549g;
        r45.fh4 fh4Var = (r45.fh4) oVar.f70710a.f70684a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneShakeMusicAndSing", "doScene id: %s, offset: %d, endFlag: %d， seq: %d， data length: %d", fh4Var.f374351e, java.lang.Integer.valueOf(fh4Var.f374354h), java.lang.Integer.valueOf(fh4Var.f374355i), java.lang.Integer.valueOf(fh4Var.f374353g), java.lang.Integer.valueOf(fh4Var.f374352f.g().length));
        this.f278548f = u0Var;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5245;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.gh4 gh4Var = (r45.gh4) this.f278549g.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneShakeMusicAndSing", "errType: %d, errCode: %d, errMsg: %s, rep: appId: %s， endFlag: %d, maxPacketSize: %d, interval: %d, music size: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, gh4Var.f375250h, java.lang.Integer.valueOf(gh4Var.f375249g), java.lang.Integer.valueOf(gh4Var.f375248f), java.lang.Integer.valueOf(gh4Var.f375247e), java.lang.Integer.valueOf(gh4Var.f375251i.size()));
        if (i18 == 0 && i19 == 0 && gh4Var.f375249g == 1) {
            this.f278544d = true;
        }
        this.f278548f.onSceneEnd(i18, i19, str, this);
    }
}
