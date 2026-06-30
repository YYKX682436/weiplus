package z12;

/* loaded from: classes11.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469292d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469293e;

    /* renamed from: f, reason: collision with root package name */
    public final int f469294f;

    /* renamed from: g, reason: collision with root package name */
    public final int f469295g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f469296h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f469297i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f469298m;

    public g(int i17, int i18, java.util.List list, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ad();
        lVar.f70665b = new r45.bd();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmbackupemojioperate";
        lVar.f70667d = 698;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f469293e = lVar.a();
        this.f469294f = i17;
        this.f469295g = i18;
        this.f469296h = list;
        this.f469297i = str;
        this.f469298m = java.util.UUID.randomUUID().toString() + "_" + java.lang.System.currentTimeMillis();
    }

    public static com.tencent.mm.storage.u3 H(int i17) {
        return i17 == 0 ? com.tencent.mm.storage.u3.USERINFO_EMOJI_DOWNLOAD_VERSION_KEY_NORMAL_STRING : i17 == 1 ? com.tencent.mm.storage.u3.USERINFO_EMOJI_DOWNLOAD_VERSION_KEY_CAPTURE_STRING : com.tencent.mm.storage.u3.USERINFO_EMOJI_DOWNLOAD_VERSION_KEY_DEFAULT_STRING;
    }

    public static void I() {
        if (android.text.TextUtils.isEmpty(gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_EMOJI_DOWNLOAD_VERSION_KEY_NORMAL_STRING, null))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "no version key for custom emojis, sync now");
            new pr.t(0, null, false).a();
        }
        if (android.text.TextUtils.isEmpty(gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_EMOJI_DOWNLOAD_VERSION_KEY_CAPTURE_STRING, null))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "no version key for capture emojis, sync now");
            new pr.t(1, null, false).a();
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469292d = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469293e;
        r45.ad adVar = (r45.ad) oVar.f70710a.f70684a;
        adVar.f369933e = this.f469295g;
        adVar.f369932d = new java.util.LinkedList(this.f469296h);
        int i17 = this.f469294f;
        adVar.f369934f = i17;
        adVar.f369935g = this.f469297i;
        java.lang.String v17 = gm0.j1.u().c().v(H(i17), null);
        adVar.f369936h = v17;
        java.lang.String str = this.f469298m;
        adVar.f369937i = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "VersionKey: %s, UpdateVersionKey: %s", v17, str);
        java.util.LinkedList linkedList = adVar.f369932d;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "empty md5 list.");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "do scene delte md5 list size:%s, versionKey: %s, updateVersionKey: %s", java.lang.Integer.valueOf(adVar.f369932d.size()), adVar.f369936h, str);
            for (int i18 = 0; i18 < adVar.f369932d.size(); i18++) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "do scene delte md5:%s", adVar.f369932d.get(i18));
            }
        }
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 698;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i19 == -434) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.NetSceneBackupEmojiOperate", "[cpan] batch backup emoji failed. over size.");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_BACKUP_OVERSIZE_BOOLEAN, java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(164L, 7L, 1L, false);
        }
        int i27 = this.f469294f;
        int i28 = this.f469295g;
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_BACKUP_OVERSIZE_BOOLEAN, java.lang.Boolean.FALSE);
            if (i28 == 1 || i28 == 4) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(164L, 5L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(164L, 8L, 1L, false);
            }
            gm0.j1.u().c().x(H(i27), this.f469298m);
        } else {
            if (i28 == 1 || i28 == 4) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(164L, 6L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(164L, 9L, 1L, false);
            }
            if (i19 == -2048) {
                new pr.t(i27, null, false).a();
            }
        }
        this.f469292d.onSceneEnd(i18, i19, str, this);
    }
}
