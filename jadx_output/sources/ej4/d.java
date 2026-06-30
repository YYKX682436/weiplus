package ej4;

/* loaded from: classes8.dex */
public final class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f253337d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f253338e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.c1 f253339f;

    public d(java.lang.String str, java.lang.String str2, pj4.m2 m2Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6889;
        lVar.f70666c = "/cgi-bin/micromsg-bin/textstatusgetbrandinfo";
        lVar.f70664a = new pj4.b1();
        lVar.f70665b = new pj4.c1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f253338e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetBrandInfoReq");
        pj4.b1 b1Var = (pj4.b1) fVar;
        b1Var.f354992d = str;
        b1Var.f354993e = str2;
        b1Var.f354994f = m2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("url:");
        sb6.append(str);
        sb6.append(" signature:");
        sb6.append(str2);
        sb6.append(", extInfo:");
        java.lang.String str3 = null;
        if (m2Var != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("pay_sign:[");
            pj4.q qVar = m2Var.f355183d;
            if (qVar != null) {
                str3 = "transaction_id:" + qVar.f355255d + " pay_signature:" + qVar.f355256e;
            }
            sb7.append(str3);
            sb7.append("] source_id:");
            sb7.append(m2Var.f355184e);
            sb7.append(" mp_signature:");
            sb7.append(m2Var.f355185f);
            str3 = sb7.toString();
        }
        sb6.append(str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetBrandInfo", sb6.toString());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253337d = callback;
        return dispatch(dispatcher, this.f253338e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6889;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetBrandInfo", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f253338e.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetBrandInfoResp");
            this.f253339f = (pj4.c1) fVar;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f253337d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
