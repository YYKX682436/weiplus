package g35;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f268180d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f268181e;

    /* renamed from: f, reason: collision with root package name */
    public final g35.b f268182f;

    public c(java.lang.String str, r45.z45 z45Var, int i17, byte[] bArr, g35.b bVar, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.x45();
        lVar.f70665b = new r45.y45();
        lVar.f70666c = "/cgi-bin/micromsg-bin/parallelupload";
        lVar.f70667d = 3784;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        if (i18 > 0) {
            lVar.f70672i = i18;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCGIParallelUpload", "set timeout %s", java.lang.Integer.valueOf(i18));
        }
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f268181e = a17;
        r45.x45 x45Var = (r45.x45) a17.f70710a.f70684a;
        x45Var.f389772d = str;
        x45Var.f389773e = z45Var;
        x45Var.f389774f = i17;
        x45Var.f389775g = new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
        this.f268182f = bVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f268180d = u0Var;
        return dispatch(sVar, this.f268181e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3784;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f268180d.onSceneEnd(i18, i19, str, this);
        g35.b bVar = this.f268182f;
        if (4 != i18 && (i18 != 0 || i19 != 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCGIParallelUpload", "onSceneEnd errType = " + i18 + ", errCode = " + i19 + ", errMsg:" + str);
            ((z25.h) bVar).a(false, i19, null);
            return;
        }
        r45.y45 y45Var = (r45.y45) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        r45.ie baseResponse = y45Var.getBaseResponse();
        if (baseResponse != null && baseResponse.f376959d == 0) {
            ((z25.h) bVar).a(true, 0, y45Var);
            return;
        }
        if (baseResponse != null) {
            i19 = baseResponse.f376959d;
        }
        ((z25.h) bVar).a(false, i19, null);
    }
}
