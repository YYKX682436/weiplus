package er3;

/* loaded from: classes9.dex */
public final class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final er3.b f256022f = new er3.b(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f256023d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f256024e;

    public c() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 12764;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getqqassistantinfo";
        lVar.f70664a = new r45.yl3();
        lVar.f70665b = new r45.zl3();
        this.f256023d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f256024e = u0Var;
        return dispatch(sVar, this.f256023d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 12764;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        byte[] initialProtobufBytes;
        kotlin.jvm.internal.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        r45.zl3 zl3Var = (r45.zl3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGYNetEnd totallen: ");
        sb6.append((zl3Var == null || (initialProtobufBytes = zl3Var.initialProtobufBytes()) == null) ? null : java.lang.Integer.valueOf(initialProtobufBytes.length));
        sb6.append(" appID: ");
        sb6.append(zl3Var != null ? zl3Var.f392193d : null);
        sb6.append(" weapp_param: ");
        sb6.append(zl3Var != null ? zl3Var.f392194e : null);
        sb6.append(" menu_weapp_path: ");
        sb6.append(zl3Var != null ? zl3Var.f392195f : null);
        sb6.append(" bind_qq_weapp_path: ");
        sb6.append(zl3Var != null ? zl3Var.f392196g : null);
        sb6.append(" menu_setting_weapp_path: ");
        sb6.append(zl3Var != null ? zl3Var.f392197h : null);
        com.tencent.mars.xlog.Log.i("NetSceneGetQQAssistantInfo", sb6.toString());
        if (!(zl3Var == null)) {
            if (!(zl3Var.f392194e == null)) {
                if (!(zl3Var.f392193d == null)) {
                    if (!(zl3Var.f392195f == null)) {
                        if (!(zl3Var.f392196g == null)) {
                            long c17 = c01.id.c();
                            com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("com.tencent.mm.qqassistant", gm0.j1.b().h(), 2);
                            J2.H("info", zl3Var.toByteArray());
                            J2.B("time", c17);
                            com.tencent.mars.xlog.Log.i("NetSceneGetQQAssistantInfo", "save info to mmkv");
                            com.tencent.mm.modelbase.u0 u0Var = this.f256024e;
                            if (u0Var != null) {
                                u0Var.onSceneEnd(i18, i19, str, this);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("NetSceneGetQQAssistantInfo", "can't get toeken");
        com.tencent.mm.modelbase.u0 u0Var2 = this.f256024e;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
