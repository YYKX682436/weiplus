package z12;

/* loaded from: classes12.dex */
public class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, z12.b {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469299d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469300e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f469301f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f469302g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public int f469303h;

    /* renamed from: i, reason: collision with root package name */
    public final int f469304i;

    /* renamed from: m, reason: collision with root package name */
    public final int f469305m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.storage.u3 f469306n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.storage.u3 f469307o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f469308p;

    public h(java.util.LinkedList linkedList, int i17) {
        this.f469303h = 0;
        this.f469304i = 0;
        this.f469308p = new java.util.LinkedList();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.xe();
        lVar.f70665b = new r45.ye();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
        lVar.f70667d = 697;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f469300e = lVar.a();
        this.f469303h = 0;
        this.f469304i = 1;
        this.f469308p = linkedList;
        this.f469305m = i17;
        if (i17 == 1) {
            this.f469306n = com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
            this.f469307o = com.tencent.mm.storage.u3.USERINFO_EMOJI_NEXT_CAPTURE_BATCH_DOWNLOAD_TIME_LONG;
        } else {
            this.f469306n = com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
            this.f469307o = com.tencent.mm.storage.u3.USERINFO_EMOJI_NEXT_CUSTOM_BATCH_DOWNLOAD_TIME_LONG;
        }
    }

    public final void H(r45.ye yeVar) {
        int i17 = this.f469305m;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList mCustomType: %d", java.lang.Integer.valueOf(i17));
        if (yeVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList response is null.");
            return;
        }
        java.util.LinkedList linkedList = yeVar.f391008g;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addemojiInfoList EmojiList is null or size is empty.");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.ri0 ri0Var = (r45.ri0) it.next();
            if (com.tencent.mm.sdk.platformtools.t8.K0(ri0Var.f384886d)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList: empty md5 %s", ri0Var);
            } else {
                this.f469301f.add(ri0Var.f384886d.toLowerCase());
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
                n22.m.a(ri0Var, emojiInfo);
                if (i17 == 1) {
                    emojiInfo.field_groupId = "capture";
                } else {
                    emojiInfo.field_catalog = 81;
                }
                this.f469302g.add(emojiInfo);
            }
        }
    }

    public r45.ye I() {
        com.tencent.mm.modelbase.o oVar = this.f469300e;
        if (oVar == null) {
            return null;
        }
        return (r45.ye) oVar.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469299d = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469300e;
        r45.xe xeVar = (r45.xe) oVar.f70710a.f70684a;
        xeVar.f390001d = this.f469303h;
        xeVar.f390002e = this.f469304i;
        xeVar.f390003f = this.f469308p;
        xeVar.f390004g = this.f469305m;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 697;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0175 A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:62:0x0140, B:71:0x0175, B:73:0x017b, B:74:0x017f, B:75:0x018c, B:77:0x0192, B:78:0x01a9, B:83:0x01ec, B:84:0x01f3, B:86:0x01a6, B:87:0x0186, B:88:0x0161, B:96:0x021b, B:97:0x0222), top: B:61:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0192 A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:62:0x0140, B:71:0x0175, B:73:0x017b, B:74:0x017f, B:75:0x018c, B:77:0x0192, B:78:0x01a9, B:83:0x01ec, B:84:0x01f3, B:86:0x01a6, B:87:0x0186, B:88:0x0161, B:96:0x021b, B:97:0x0222), top: B:61:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020b A[LOOP:0: B:59:0x013a->B:80:0x020b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6 A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:62:0x0140, B:71:0x0175, B:73:0x017b, B:74:0x017f, B:75:0x018c, B:77:0x0192, B:78:0x01a9, B:83:0x01ec, B:84:0x01f3, B:86:0x01a6, B:87:0x0186, B:88:0x0161, B:96:0x021b, B:97:0x0222), top: B:61:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0186 A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:62:0x0140, B:71:0x0175, B:73:0x017b, B:74:0x017f, B:75:0x018c, B:77:0x0192, B:78:0x01a9, B:83:0x01ec, B:84:0x01f3, B:86:0x01a6, B:87:0x0186, B:88:0x0161, B:96:0x021b, B:97:0x0222), top: B:61:0x0140 }] */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r18, int r19, int r20, java.lang.String r21, com.tencent.mm.network.v0 r22, byte[] r23) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z12.h.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 150;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
