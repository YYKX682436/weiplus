package z12;

/* loaded from: classes12.dex */
public class y extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469381d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469382e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f469383f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f469384g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f469385h = false;

    /* renamed from: i, reason: collision with root package name */
    public final long f469386i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f469387m;

    public y(java.lang.String str, java.lang.String str2, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, long j17, int i17, int i18) {
        boolean z17 = false;
        this.f469386i = 0L;
        this.f469387m = "";
        if (str2 != null && str2.length() > 0 && emojiInfo != null) {
            z17 = true;
        }
        iz5.a.g(null, z17);
        this.f469386i = j17;
        this.f469387m = str2;
        this.f469383f = emojiInfo;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zt6();
        lVar.f70665b = new r45.au6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendemoji";
        lVar.f70667d = 175;
        lVar.f70668e = 68;
        lVar.f70669f = 1000000068;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f469381d = a17;
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().Y2(com.tencent.mm.sdk.platformtools.x2.f193071a, emojiInfo);
        r45.zt6 zt6Var = (r45.zt6) a17.f70710a.f70684a;
        r45.cj0 cj0Var = new r45.cj0();
        cj0Var.f371580d = emojiInfo.getMd5();
        cj0Var.f371588o = str;
        cj0Var.f371585i = str2;
        cj0Var.f371582f = emojiInfo.field_size;
        cj0Var.f371586m = emojiInfo.j();
        if (emojiInfo.field_storeUnique == 1) {
            cj0Var.f371586m += "<storeunique>1</storeunique>";
            com.tencent.mars.xlog.Log.i("storeunique", "md5 " + cj0Var.f371580d);
        }
        cj0Var.f371584h = emojiInfo.field_type;
        cj0Var.f371589p = c01.ia.n();
        cj0Var.f371590q = i17;
        cj0Var.f371592s = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneUploadEmoji", "NetSceneUploadEmoji: md5 %s, size %s fromScene %d", emojiInfo.getMd5(), java.lang.Integer.valueOf(emojiInfo.field_size), java.lang.Integer.valueOf(cj0Var.f371592s));
        if (((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(str2)) {
            cj0Var.f371591r = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(str2);
        }
        int i19 = com.tencent.mm.storage.z3.R4(str2) ? 2 : 1;
        int i27 = emojiInfo.field_catalog;
        l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
        if (i27 == 50) {
            cj0Var.f371587n = "56,2," + i19;
        } else if (i27 == 49) {
            cj0Var.f371587n = "56,1," + i19;
        }
        try {
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(str2, j17);
            r15.b bVar = new r15.b();
            bVar.fromXml(Li.j(), "msg");
            if (bVar.n() != null) {
                cj0Var.f371593t = bVar.toXml();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.emoji.NetSceneUploadEmoji", "", e17);
        }
        zt6Var.f392369e.add(cj0Var);
        zt6Var.f392368d = zt6Var.f392369e.size();
        com.tencent.mm.feature.emoji.api.r6 r6Var = (com.tencent.mm.feature.emoji.api.r6) i95.n0.c(com.tencent.mm.feature.emoji.api.r6.class);
        java.lang.String md52 = emojiInfo.getMd5();
        com.tencent.mm.feature.emoji.l4 l4Var = (com.tencent.mm.feature.emoji.l4) r6Var;
        l4Var.getClass();
        kotlin.jvm.internal.o.g(md52, "md5");
        synchronized (l4Var.Ai()) {
            l4Var.Ai().remove(md52);
            l4Var.Ai().addFirst(md52);
            while (l4Var.Ai().size() >= 12) {
                l4Var.Ai().removeLast();
            }
            l4Var.Bi(l4Var.Ai());
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        byte[] D0;
        this.f469382e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469381d;
        r45.cj0 cj0Var = (r45.cj0) ((r45.zt6) oVar.f70710a.f70684a).f392369e.get(0);
        if (this.f469384g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneUploadEmoji", "dispatcher, firstSend. md5=" + cj0Var.f371580d);
            cj0Var.f371583g = new r45.cu5();
            cj0Var.f371581e = 0;
            return dispatch(sVar, oVar, this);
        }
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f469383f;
        int i17 = emojiInfo.field_size;
        int i18 = emojiInfo.field_start;
        int i19 = i17 - i18;
        if (i19 > 8192) {
            i19 = 8192;
        }
        if ((emojiInfo.field_reserved4 & 1) == 1) {
            byte[] z17 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).z(emojiInfo);
            if (com.tencent.mm.sdk.platformtools.t8.M0(z17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.NetSceneUploadEmoji", "buffer is null.");
                D0 = new byte[0];
            } else {
                D0 = new byte[i19];
                int length = z17.length;
                java.lang.System.arraycopy(z17, emojiInfo.field_start, D0, 0, i19);
            }
        } else {
            D0 = emojiInfo.D0(i18, i19);
        }
        if (n22.m.h(D0) == -1 && this.f469384g) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneUploadEmoji", "Bitmap type error. delete emoji file.");
            emojiInfo.w();
            return -1;
        }
        if (D0 == null || D0.length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneUploadEmoji", "readFromFile is null.");
            return -1;
        }
        int length2 = D0.length;
        cj0Var.f371581e = emojiInfo.field_start;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.c(com.tencent.mm.protobuf.g.b(D0));
        cj0Var.f371583g = cu5Var;
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String str = cj0Var.f371585i;
        ((qv.o) u2Var).getClass();
        if (r01.z.g(str)) {
            cj0Var.f371589p = ((aq1.d1) po.a.f357279a).a(pt0.f0.Li(this.f469387m, this.f469386i));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneUploadEmoji", "dispatcher, start:" + emojiInfo.field_start + ", total:" + emojiInfo.field_size + ", len:" + length2);
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getDispatchInterceptRet(com.tencent.mm.network.s sVar, com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        return w11.c1.a(new com.tencent.mm.plugin.msg.MsgIdTalker(this.f469386i, this.f469387m), this) ? org.chromium.net.NetError.ERR_SSL_BAD_RECORD_MAC_ALERT : super.getDispatchInterceptRet(sVar, v0Var, l0Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 175;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27;
        int i28;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd errtype:" + i18 + " errcode:" + i19);
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
        r45.zt6 zt6Var = (r45.zt6) oVar.f70710a.f70684a;
        r45.au6 au6Var = (r45.au6) oVar.f70711b.f70700a;
        if (au6Var != null && (i18 == 4 || (i18 == 0 && i19 == 0))) {
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Di(au6Var.f370270f);
        }
        if (i18 != 0 || i19 != 0) {
            this.f469382e.onSceneEnd(i18, i19, str, this);
            return;
        }
        int size = zt6Var.f392369e.size();
        int size2 = au6Var.f370269e.size();
        java.util.LinkedList linkedList = zt6Var.f392369e;
        java.util.LinkedList linkedList2 = au6Var.f370269e;
        if (size != size2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed. RequestSize not equal RespSize. req size:" + linkedList2.size() + ", resp size:" + linkedList.size());
            this.f469382e.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.dj0 dj0Var = (r45.dj0) linkedList2.get(0);
        java.lang.String str2 = dj0Var.f372526g;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f469383f;
        if (str2 == null || !str2.equals(emojiInfo.getMd5()) || (i27 = dj0Var.f372524e) < emojiInfo.field_start) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneUploadEmoji", "invalid server return value; start=" + dj0Var.f372524e + ", size=" + emojiInfo.field_size);
            this.f469382e.onSceneEnd(4, -2, "", this);
            emojiInfo.field_start = 0;
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().V2(emojiInfo);
            return;
        }
        int i29 = au6Var.BaseResponse.f376959d;
        if (i29 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed. resp.BaseResponse.Ret:%d", java.lang.Integer.valueOf(i29));
            this.f469382e.onSceneEnd(4, -2, "", this);
            return;
        }
        int i37 = dj0Var.f372523d;
        if (i37 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd: respInfo Ret %s", java.lang.Integer.valueOf(i37));
            this.f469382e.onSceneEnd(4, -2, "", this);
            return;
        }
        if (i27 < dj0Var.f372525f) {
            if (this.f469385h) {
                this.f469382e.onSceneEnd(4, -2, "", this);
                return;
            } else {
                new qr.r(emojiInfo, false, new z12.x(this));
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneUploadEmoji", "respInfo.getMsgID() " + dj0Var.f372527h);
        java.lang.String str3 = this.f469387m;
        long j17 = this.f469386i;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str3, j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneUploadEmoji", "dkmsgid  set svrmsgid %d -> %d", java.lang.Long.valueOf(dj0Var.f372528i), java.lang.Integer.valueOf(x51.o1.f452065r));
        if (10007 == x51.o1.f452064q && (i28 = x51.o1.f452065r) != 0) {
            dj0Var.f372527h = i28;
            x51.o1.f452065r = 0;
        }
        Li.o1(dj0Var.f372528i);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, Li, true);
        com.tencent.mm.storage.emotion.EmojiInfo u17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().u1(emojiInfo.field_md5);
        if (u17 != null) {
            emojiInfo = u17;
        }
        emojiInfo.field_start = 0;
        emojiInfo.field_lastUseTime = java.lang.System.currentTimeMillis();
        emojiInfo.field_state = 3;
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().V2(emojiInfo);
        if (Li.k2()) {
            v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
            int a17 = ot0.u.a(Li);
            ((u90.a) vVar).getClass();
            com.tencent.mm.modelstat.e.f71505a.a(Li, a17);
        } else {
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
            com.tencent.mm.modelstat.e.f71505a.b(Li);
        }
        if (!linkedList.isEmpty() && !com.tencent.mm.sdk.platformtools.t8.K0(((r45.cj0) linkedList.get(0)).f371593t)) {
            r15.b bVar = new r15.b();
            bVar.fromXml(((r45.cj0) linkedList.get(0)).f371593t);
            ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Vi(bVar, Li);
        }
        this.f469382e.onSceneEnd(i18, i19, "", this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 256;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
