package z12;

/* loaded from: classes2.dex */
public class z extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469388d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469389e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f469390f;

    /* renamed from: g, reason: collision with root package name */
    public final int f469391g;

    public z(java.util.List list, int i17) {
        this.f469390f = new java.util.ArrayList();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nu6();
        lVar.f70665b = new r45.ou6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmuploadmypanellist";
        lVar.f70667d = 717;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f469389e = lVar.a();
        this.f469390f = list;
        this.f469391g = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469388d = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469389e;
        r45.nu6 nu6Var = (r45.nu6) oVar.f70710a.f70684a;
        int i17 = this.f469391g;
        nu6Var.f381688d = i17;
        java.util.List<java.lang.String> list = this.f469390f;
        if (list != null) {
            for (java.lang.String str : list) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals(java.lang.String.valueOf(17))) {
                    str = "com.tencent.xin.emoticon.tusiji";
                }
                nu6Var.f381689e.add(str);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneUploadMyPanelList", "opcode is:%d mProductIdList size:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(list.size()));
        }
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 717;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneUploadMyPanelList", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_FINISH_BOOLEAN, java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(165L, 0L, 1L, false);
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_UPLODD_LONG, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - 86400000) + 3600000));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(165L, 1L, 1L, false);
        }
        this.f469388d.onSceneEnd(i18, i19, str, this);
    }
}
