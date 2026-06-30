package fi4;

/* loaded from: classes4.dex */
public final class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f263061d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f263062e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.e2 f263063f;

    public b(java.util.LinkedList cmds) {
        kotlin.jvm.internal.o.g(cmds, "cmds");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5907;
        lVar.f70666c = "/cgi-bin/micromsg-bin/textstatusoplog";
        lVar.f70664a = new pj4.d2();
        lVar.f70665b = new pj4.e2();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f263062e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusOplogReq");
        ((pj4.d2) fVar).f355024d = cmds;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("req cmds:");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("items:");
        java.util.Iterator it = cmds.iterator();
        while (it.hasNext()) {
            pj4.v0 v0Var = (pj4.v0) it.next();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(v0Var);
            sb8.append('-');
            sb8.append(v0Var.f355308d);
            sb8.append(',');
            sb7.append(sb8.toString());
        }
        java.lang.String sb9 = sb7.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        sb6.append(sb9);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusOplog", sb6.toString());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f263061d = callback;
        return dispatch(dispatcher, this.f263062e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5907;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusOplog", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f263062e.f70711b.f70700a;
            java.lang.String str2 = null;
            this.f263063f = fVar instanceof pj4.e2 ? (pj4.e2) fVar : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rsp:");
            pj4.e2 e2Var = this.f263063f;
            if (e2Var != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("items:");
                java.util.LinkedList<pj4.w0> linkedList = e2Var.f355035d;
                if (linkedList != null) {
                    for (pj4.w0 w0Var : linkedList) {
                        sb7.append(w0Var + '-' + w0Var.f355317d + '-' + w0Var.f355318e + '-' + w0Var.f355319f);
                    }
                }
                str2 = sb7.toString();
                kotlin.jvm.internal.o.f(str2, "toString(...)");
            }
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusOplog", sb6.toString());
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f263061d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
