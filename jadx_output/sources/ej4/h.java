package ej4;

/* loaded from: classes11.dex */
public final class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f253360d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f253361e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f253362f;

    public h(java.lang.String str) {
        this.f253360d = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5215;
        lVar.f70666c = "/cgi-bin/micromsg-bin/textstatusgetselfinfo";
        lVar.f70664a = new pj4.h1();
        lVar.f70665b = new pj4.i1();
        this.f253362f = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253361e = callback;
        return dispatch(dispatcher, this.f253362f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5215;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfinfo", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f253362f.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfInfoResp");
            pj4.i1 i1Var = (pj4.i1) fVar;
            ai4.m0 m0Var = ai4.m0.f5173a;
            mj4.h b17 = m0Var.G().b(en1.a.a());
            java.lang.Object[] objArr = new java.lang.Object[4];
            java.lang.String str2 = this.f253360d;
            objArr[0] = str2;
            objArr[1] = b17 != null ? ((mj4.k) b17).l() : null;
            objArr[2] = java.lang.Integer.valueOf(i1Var.f355113d);
            objArr[3] = java.lang.Integer.valueOf(i1Var.f355115f);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfinfo", "GetSelfinfo back reqStatusId:%s, curStatusId:%s like:%s ref:%s", objArr);
            if (b17 != null) {
                mj4.k kVar = (mj4.k) b17;
                if (kotlin.jvm.internal.o.b(kVar.l(), str2)) {
                    mj4.j jVar = new mj4.j(kVar);
                    jVar.b(i1Var.f355113d);
                    jVar.f327066b.put("field_referenceCount", java.lang.Integer.valueOf(i1Var.f355115f));
                    si4.a.r(m0Var.G(), jVar.a(), false, 2, null);
                }
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f253361e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
