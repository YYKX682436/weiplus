package z12;

/* loaded from: classes11.dex */
public class p extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469344d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469345e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469346f;

    /* renamed from: g, reason: collision with root package name */
    public final a22.d f469347g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f469348h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.autogen.events.RePullEmojiInfoDescEvent f469349i;

    public p(java.lang.String str) {
        this.f469346f = "";
        this.f469348h = false;
        this.f469349i = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pe3();
        lVar.f70665b = new r45.qe3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getemotiondesc";
        lVar.f70667d = 521;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f469344d = lVar.a();
        this.f469346f = str;
        this.f469349i = new com.tencent.mm.autogen.events.RePullEmojiInfoDescEvent();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        java.lang.String str = this.f469346f;
        this.f469345e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469344d;
        ((r45.pe3) oVar.f70710a.f70684a).f382981d = str;
        if (!android.text.TextUtils.isEmpty(str)) {
            return dispatch(sVar, oVar, this);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.emoji.NetSceneGetEmotionDesc", "get emoji desc faild. product id is null.");
        return -1;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 521;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        boolean z17 = this.f469348h;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.modelbase.o oVar = this.f469344d;
            if (!z17) {
                java.util.LinkedList linkedList = ((r45.qe3) oVar.f70711b.f70700a).f383886e;
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                z85.k a17 = com.tencent.mm.storage.n5.f().a();
                java.lang.String str2 = this.f469346f;
                int i27 = ((r45.qe3) oVar.f70711b.f70700a).f383887f;
                int i28 = ((r45.qe3) oVar.f70711b.f70700a).f383889h;
                android.content.SharedPreferences sharedPreferences = a17.f470806e;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong("274544" + str2, java.lang.System.currentTimeMillis()).commit();
                }
                if (linkedList != null && linkedList.size() > 0) {
                    l75.k0 k0Var = a17.f470805d;
                    long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : -1L;
                    k0Var.delete("EmojiInfoDesc", "groupId=?", new java.lang.String[]{str2});
                    z85.j jVar = new z85.j();
                    jVar.field_groupId = str2;
                    jVar.field_click_flag = i27;
                    jVar.field_download_flag = i28;
                    java.util.Iterator it = linkedList.iterator();
                    loop0: while (true) {
                        if (!it.hasNext()) {
                            k0Var.m("EmojiInfoDesc", "md5_lang", jVar.convertTo());
                            k0Var.w(java.lang.Long.valueOf(F));
                            break;
                        }
                        r45.oj0 oj0Var = (r45.oj0) it.next();
                        jVar.field_md5 = oj0Var.f382298d;
                        java.util.Iterator it6 = oj0Var.f382300f.iterator();
                        while (it6.hasNext()) {
                            r45.j54 j54Var = (r45.j54) it6.next();
                            jVar.field_desc = j54Var.f377595e;
                            jVar.field_lang = j54Var.f377594d;
                            jVar.field_md5_lang = jVar.field_md5 + jVar.field_lang;
                            if (k0Var.m("EmojiInfoDesc", "md5_lang", jVar.convertTo()) < 0) {
                                k0Var.w(java.lang.Long.valueOf(F));
                                break loop0;
                            }
                        }
                    }
                }
                if (linkedList != null && linkedList.size() > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "end getEmojiDesc, productId: %s ", this.f469346f);
                    com.tencent.mm.autogen.events.RePullEmojiInfoDescEvent rePullEmojiInfoDescEvent = this.f469349i;
                    rePullEmojiInfoDescEvent.f54645g.f7357a = this.f469346f;
                    rePullEmojiInfoDescEvent.e();
                }
            } else if ((((r45.qe3) oVar.f70711b.f70700a).f383889h & 1) == 1) {
                a22.e.b(this.f469347g);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "new emotion is can't download. ignore");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "end getEmojiDesc, & errType:%d, errCode:%d, productId: %s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), this.f469346f);
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "new emotion get des failed. ignore");
            }
        }
        this.f469345e.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 50;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    public p(java.lang.String str, a22.d dVar) {
        this.f469346f = "";
        this.f469348h = false;
        this.f469349i = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pe3();
        lVar.f70665b = new r45.qe3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getemotiondesc";
        lVar.f70667d = 521;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f469344d = lVar.a();
        this.f469346f = str;
        this.f469347g = dVar;
        this.f469348h = true;
        this.f469349i = new com.tencent.mm.autogen.events.RePullEmojiInfoDescEvent();
    }
}
