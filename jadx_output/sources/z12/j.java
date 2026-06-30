package z12;

/* loaded from: classes12.dex */
public class j extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469311d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469312e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f469313f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f469314g = true;

    /* renamed from: h, reason: collision with root package name */
    public final int f469315h;

    /* renamed from: i, reason: collision with root package name */
    public final long f469316i;

    public j(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.f469315h = 256;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f469316i = currentTimeMillis;
        com.tencent.mars.xlog.Log.w("MicroMsg.emoji.NetSceneEmojiUpload", "start upload at " + currentTimeMillis);
        this.f469313f = emojiInfo;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ej0();
        lVar.f70665b = new r45.fj0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmemojiupload";
        lVar.f70667d = 703;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f469311d = a17;
        r45.ej0 ej0Var = (r45.ej0) a17.f70710a.f70684a;
        r45.vt6 vt6Var = new r45.vt6();
        if (emojiInfo != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(164L, 13L);
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "NetSceneEmojiUpload: %s", emojiInfo.getMd5());
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().Y2(com.tencent.mm.sdk.platformtools.x2.f193071a, emojiInfo);
            vt6Var.f388534d = emojiInfo.getMd5();
            vt6Var.f388536f = emojiInfo.field_size;
            ej0Var.f373564d.add(vt6Var);
            this.f469315h = (emojiInfo.field_size / 8192) * 2;
        }
    }

    public final void H(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, boolean z17) {
        if (emojiInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.getMd5())) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] publicEmojiSyncTaskEvent emoji md5:%s success:%b", emojiInfo.getMd5(), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.autogen.events.EmojiSyncTaskEvent emojiSyncTaskEvent = new com.tencent.mm.autogen.events.EmojiSyncTaskEvent();
        java.lang.String md52 = emojiInfo.getMd5();
        am.p4 p4Var = emojiSyncTaskEvent.f54103g;
        p4Var.f7603b = md52;
        p4Var.f7602a = 0;
        p4Var.f7604c = z17;
        emojiSyncTaskEvent.e();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f469316i;
        com.tencent.mars.xlog.Log.w("MicroMsg.emoji.NetSceneEmojiUpload", "finish cost " + currentTimeMillis + " size " + emojiInfo.field_size + " rate " + (emojiInfo.field_size / currentTimeMillis));
    }

    public void I() {
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f469313f;
        emojiInfo.field_start = 0;
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().G2(emojiInfo);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        int i17;
        int i18;
        byte[] D0;
        byte[] D02;
        this.f469312e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469311d;
        r45.vt6 vt6Var = (r45.vt6) ((r45.ej0) oVar.f70710a.f70684a).f373564d.get(0);
        boolean z17 = this.f469314g;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f469313f;
        if (!z17) {
            if (emojiInfo == null || (i17 = emojiInfo.field_start) == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneEmojiUpload", "emoji info is null. or start position is 0.");
                return -1;
            }
            int i19 = emojiInfo.field_size - i17;
            i18 = i19 <= 8192 ? i19 : 8192;
            if ((emojiInfo.field_reserved4 & 1) == 1) {
                byte[] z18 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).z(emojiInfo);
                if (com.tencent.mm.sdk.platformtools.t8.M0(z18)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.emoji.NetSceneEmojiUpload", "buffer is null.");
                    D0 = new byte[0];
                } else {
                    D0 = new byte[i18];
                    int length = z18.length;
                    java.lang.System.arraycopy(z18, emojiInfo.field_start, D0, 0, i18);
                }
            } else {
                D0 = emojiInfo.D0(i17, i18);
            }
            if (D0 == null || D0.length <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneEmojiUpload", "readFromFile is null.");
                return -1;
            }
            vt6Var.f388535e = emojiInfo.field_start;
            vt6Var.f388537g = new com.tencent.mm.protobuf.g(D0, 0, D0.length);
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "buf len:%d, string len:%d", java.lang.Integer.valueOf(D0.length), java.lang.Integer.valueOf(vt6Var.f388537g.f192156a.length));
            int i27 = emojiInfo.field_start;
            int i28 = emojiInfo.field_size;
            return dispatch(sVar, oVar, this);
        }
        java.lang.String str = vt6Var.f388534d;
        vt6Var.f388535e = 0;
        int i29 = emojiInfo.field_size - 0;
        i18 = i29 <= 8192 ? i29 : 8192;
        if ((emojiInfo.field_reserved4 & 1) == 1) {
            byte[] z19 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).z(emojiInfo);
            if (com.tencent.mm.sdk.platformtools.t8.M0(z19)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.NetSceneEmojiUpload", "buffer is null.");
                D02 = new byte[0];
            } else {
                D02 = new byte[i18];
                int length2 = z19.length;
                java.lang.System.arraycopy(z19, 0, D02, 0, i18);
            }
        } else {
            D02 = emojiInfo.D0(0, i18);
        }
        if (D02 == null || D02.length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneEmojiUpload", "readFromFile is null.");
            return -1;
        }
        vt6Var.f388535e = 0;
        vt6Var.f388537g = new com.tencent.mm.protobuf.g(D02, 0, D02.length);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(D02.length);
        objArr[1] = java.lang.Integer.valueOf(vt6Var.f388537g.f192156a.length);
        objArr[2] = java.lang.Integer.valueOf(emojiInfo == null ? -1 : emojiInfo.field_start);
        objArr[3] = java.lang.Integer.valueOf(emojiInfo != null ? emojiInfo.field_size : -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "buf len:%d, string len:%d dispatcher, first emoji start:%d emoji total:%d", objArr);
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 703;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String str2;
        int i27;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd  errtype:" + i18 + " errcode:" + i19);
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f469313f;
        if (i18 != 0 || i19 != 0) {
            I();
            this.f469312e.onSceneEnd(i18, i19, str, this);
            H(emojiInfo, false);
            return;
        }
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
        r45.ej0 ej0Var = (r45.ej0) oVar.f70710a.f70684a;
        r45.fj0 fj0Var = (r45.fj0) oVar.f70711b.f70700a;
        int size = ej0Var.f373564d.size();
        int size2 = fj0Var.f374393d.size();
        java.util.LinkedList linkedList = fj0Var.f374393d;
        if (size != size2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd failed. RequestSize not equal RespSize. req size:" + ej0Var.f373564d.size() + ", resp size:" + linkedList.size());
            I();
            this.f469312e.onSceneEnd(i18, i19, str, this);
            H(emojiInfo, false);
            return;
        }
        r45.wt6 wt6Var = (linkedList == null || linkedList.size() <= 0) ? null : (r45.wt6) linkedList.get(0);
        if (wt6Var == null || (str2 = wt6Var.f389454g) == null || !str2.equals(emojiInfo.getMd5()) || (i27 = wt6Var.f389452e) < emojiInfo.field_start) {
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = wt6Var.f389454g;
            objArr[1] = java.lang.Integer.valueOf(wt6Var.f389453f);
            objArr[2] = java.lang.Integer.valueOf(wt6Var.f389452e);
            objArr[3] = java.lang.Integer.valueOf(emojiInfo == null ? -1 : emojiInfo.field_start);
            objArr[4] = java.lang.Integer.valueOf(emojiInfo != null ? emojiInfo.field_size : -1);
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneEmojiUpload", "md5:%s invalid server return value. respInfo.TotalLen:%d respInfo.StartPos:%d emoji.getStart():%d emoji total:%d", objArr);
            I();
            this.f469312e.onSceneEnd(4, -2, "", this);
            H(emojiInfo, false);
            return;
        }
        if (emojiInfo != null && wt6Var.f389451d != 0 && i27 == wt6Var.f389453f && i27 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] emoji upload success, but md5 backup faild.try to do batch emoji backup. %s respInfo.Ret:%d respInfo.StartPos:%d respInfo.TotalLen:%d", emojiInfo.getMd5(), java.lang.Integer.valueOf(wt6Var.f389451d), java.lang.Integer.valueOf(wt6Var.f389452e), java.lang.Integer.valueOf(wt6Var.f389453f));
            I();
            this.f469312e.onSceneEnd(i18, i19, "", this);
            return;
        }
        int i28 = fj0Var.BaseResponse.f376959d;
        if (i28 != 0 || wt6Var.f389451d != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd failed. resp.BaseResponse.Ret:%d respInfo.Ret:%d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(wt6Var.f389451d));
            I();
            this.f469312e.onSceneEnd(i18, i19, "", this);
            return;
        }
        if (this.f469314g) {
            this.f469314g = false;
        }
        if (i27 >= wt6Var.f389453f) {
            emojiInfo.field_start = 0;
            emojiInfo.field_state = 3;
            emojiInfo.field_needupload = 0;
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().G2(emojiInfo);
            this.f469312e.onSceneEnd(i18, i19, "", this);
            H(emojiInfo, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] emoji upload success.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneEmojiUpload", "next start pos is :%d", java.lang.Integer.valueOf(i27));
        emojiInfo.field_start = wt6Var.f389452e;
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().G2(emojiInfo);
        if (doScene(dispatcher(), this.f469312e) < 0) {
            this.f469312e.onSceneEnd(3, -1, "", this);
            H(emojiInfo, false);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return this.f469315h;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
