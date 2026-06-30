package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class v3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f189106d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f189107e;

    /* renamed from: f, reason: collision with root package name */
    public final int f189108f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.app.u3 f189109g;

    public v3(int i17, com.tencent.mm.pluginsdk.model.app.u3 u3Var) {
        this.f189108f = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.p8();
        lVar.f70665b = new r45.q8();
        lVar.f70666c = "/cgi-bin/micromsg-bin/appcenter";
        lVar.f70667d = 452;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f189107e = a17;
        r45.p8 p8Var = (r45.p8) a17.f70710a.f70684a;
        byte[] c17 = u3Var.c();
        if (c17 != null) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(c17);
            p8Var.f382818e = cu5Var;
        }
        p8Var.f382817d = i17;
        this.f189109g = u3Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f189106d = u0Var;
        return dispatch(sVar, this.f189107e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 452;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            this.f189109g.a(x51.j1.d(((r45.q8) this.f189107e.f70711b.f70700a).f383753d));
            this.f189109g.onGYNetEnd(i17, i18, i19, str, this.f189107e, bArr);
            this.f189106d.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneAppCenter", "errType = " + i18 + ", errCode = " + i19);
        this.f189106d.onSceneEnd(i18, i19, str, this);
    }
}
