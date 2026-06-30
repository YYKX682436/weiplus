package com.tencent.mm.pluginsdk.model;

/* loaded from: classes.dex */
public final class l3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f189364d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f189365e;

    public l3(java.lang.String postId) {
        kotlin.jvm.internal.o.g(postId, "postId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 11878;
        lVar.f70666c = "/cgi-bin/micromsg-bin/qqbrowserreport";
        lVar.f70664a = new r45.tf5();
        lVar.f70665b = new r45.uf5();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f189365e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.QQBrowserReportReq");
        java.lang.String str = "stat?urlid=45&oaid=" + wo.w0.n() + "&posid=" + postId;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQQBrowserReport", "reportString:" + str + ' ');
        ((r45.tf5) fVar).f386378d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f189364d = callback;
        return dispatch(dispatcher, this.f189365e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 11878;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQQBrowserReport", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f189365e.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.QQBrowserReportResp");
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f189364d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
