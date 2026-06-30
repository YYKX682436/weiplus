package ej4;

/* loaded from: classes.dex */
public final class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f253363d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f253364e;

    public i() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6868;
        lVar.f70666c = "/cgi-bin/micromsg-bin/textstatusgetuserpermission";
        lVar.f70664a = new pj4.l1();
        lVar.f70665b = new pj4.m1();
        this.f253364e = lVar.a();
        jx3.f.INSTANCE.idkeyStat(1629L, 6L, 1L, false);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253363d = callback;
        return dispatch(dispatcher, this.f253364e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6868;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetUserPermission", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f253364e.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetUserPermissionResp");
            pj4.m1 m1Var = (pj4.m1) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetUserPermission", "value: " + m1Var.f355182d);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_LAST_INPUT_LEVEL_LONG_SYNC, java.lang.Long.valueOf(m1Var.f355182d));
            if (m1Var.f355182d == 1) {
                jx3.f.INSTANCE.idkeyStat(1629L, 3L, 1L, false);
            } else {
                jx3.f.INSTANCE.idkeyStat(1629L, 4L, 1L, false);
            }
        } else {
            jx3.f.INSTANCE.idkeyStat(1629L, 5L, 1L, false);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f253363d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
