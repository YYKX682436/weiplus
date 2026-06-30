package hz4;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f286400d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f286401e = null;

    /* renamed from: f, reason: collision with root package name */
    public final int f286402f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f286403g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.xp0 f286404h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f286405i;

    /* renamed from: m, reason: collision with root package name */
    public final int f286406m;

    public e(int i17, int i18, java.lang.String str, java.util.LinkedList linkedList, r45.xp0 xp0Var) {
        this.f286402f = 1;
        this.f286403g = "";
        this.f286404h = null;
        this.f286405i = new java.util.LinkedList();
        this.f286406m = 0;
        this.f286405i = linkedList;
        this.f286404h = xp0Var;
        this.f286403g = str;
        this.f286402f = i18;
        this.f286406m = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gq0();
        lVar.f70665b = new r45.hq0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/favsecurity ";
        lVar.f70667d = 921;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f286400d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.modelbase.o oVar = this.f286400d;
        r45.gq0 gq0Var = (r45.gq0) oVar.f70710a.f70684a;
        gq0Var.f375475d = this.f286402f;
        gq0Var.f375478g = this.f286404h;
        gq0Var.f375477f = this.f286405i;
        gq0Var.f375476e = this.f286403g;
        this.f286401e = u0Var;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 921;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckNoteSecurity", "netId %d errType %d errCode %d errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.hq0 hq0Var = (r45.hq0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,errType:%d,fail", java.lang.Integer.valueOf(i18));
            this.f286401e.onSceneEnd(i18, -1, str, this);
            return;
        }
        if (hq0Var == null || hq0Var.getBaseResponse() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,response == null,ok");
            this.f286401e.onSceneEnd(i18, 0, str, this);
        } else if (hq0Var.getBaseResponse().f376959d != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,baseresponse.ret != 0,ok");
            this.f286401e.onSceneEnd(i18, 0, str, this);
        } else if (hq0Var.f376385d > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,SecurityResult > 0,fail");
            this.f286401e.onSceneEnd(i18, -1, str, this);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,SecurityResult = 0,fail");
            this.f286401e.onSceneEnd(i18, 0, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
