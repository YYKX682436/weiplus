package z12;

/* loaded from: classes12.dex */
public class t extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469360d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469361e;

    /* renamed from: f, reason: collision with root package name */
    public final int f469362f;

    /* renamed from: g, reason: collision with root package name */
    public final int f469363g;

    /* renamed from: h, reason: collision with root package name */
    public int f469364h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f469365i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469366m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f469367n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f469368o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f469369p;

    public t(int i17, int i18) {
        this(i17, null, i18, false);
    }

    public static com.tencent.mm.plugin.emoji.model.s I(r45.we3 we3Var) {
        java.lang.Object[] array;
        if (we3Var == null) {
            return null;
        }
        com.tencent.mm.plugin.emoji.model.s sVar = new com.tencent.mm.plugin.emoji.model.s();
        sVar.f97599a = we3Var.f389085e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = we3Var.f389086f;
        if (linkedList != null && !linkedList.isEmpty() && (array = linkedList.toArray()) != null && array.length > 0) {
            for (java.lang.Object obj : array) {
                if (obj != null && (obj instanceof r45.zj0)) {
                    r45.zj0 zj0Var = (r45.zj0) obj;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(zj0Var.f392128d)) {
                        j12.i iVar = new j12.i(zj0Var);
                        iVar.f297176k = java.lang.Long.toString(we3Var.f389102y);
                        arrayList.add(iVar);
                    }
                }
            }
        }
        sVar.f97600b = arrayList;
        sVar.f97601c = we3Var.f389087g;
        sVar.f97602d = we3Var.f389089i;
        java.util.LinkedList linkedList2 = we3Var.f389097t;
        if (sVar.f97604f == null) {
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            sVar.f97604f = linkedList3;
            linkedList3.addAll(linkedList2);
        }
        sVar.f97603e = we3Var.f389093p;
        return sVar;
    }

    public final void H() {
        java.util.LinkedList linkedList;
        r45.we3 J2 = J();
        if (J2 == null || (linkedList = J2.f389086f) == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.NetSceneGetEmotionList", "addSummaryList faild. response is null or emotion list is empty.");
        } else {
            this.f469368o.addAll(linkedList);
        }
    }

    public r45.we3 J() {
        com.tencent.mm.modelbase.o oVar = this.f469360d;
        if (oVar == null) {
            return null;
        }
        return (r45.we3) oVar.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469361e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469360d;
        r45.ve3 ve3Var = (r45.ve3) oVar.f70710a.f70684a;
        byte[] bArr = this.f469369p;
        if (bArr != null) {
            ve3Var.f388154d = x51.j1.a(bArr);
        } else {
            ve3Var.f388154d = new r45.cu5();
        }
        byte[] bArr2 = this.f469365i;
        if (bArr2 != null) {
            ve3Var.f388158h = x51.j1.a(bArr2);
        } else {
            ve3Var.f388158h = new r45.cu5();
        }
        r45.cu5 cu5Var = ve3Var.f388154d;
        if (cu5Var != null) {
            cu5Var.toString();
        }
        int i17 = this.f469362f;
        ve3Var.f388155e = i17;
        ve3Var.f388156f = this.f469363g;
        ve3Var.f388159i = this.f469366m;
        if (i17 == 7) {
            ve3Var.f388157g = this.f469364h;
        }
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 411;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (this.f469362f == 8) {
            if (i18 == 0 && i19 == 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_DOWNLOAD_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_DOWNLOAD_LONG, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - 86400000) + 3600000));
            }
        }
        if (this.f469362f == 11) {
            if (i18 == 0 && i19 == 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_RECOMMEND_LAST_UPDATE_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_RECOMMEND_LAST_UPDATE_TIME_LONG, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - 28800000) + 600000));
            }
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().e().J0(this.f469362f, J());
        }
        if (i18 != 0 && i18 != 4) {
            this.f469361e.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
        r45.cu5 cu5Var = ((r45.we3) oVar.f70711b.f70700a).f389084d;
        if (cu5Var != null) {
            this.f469369p = x51.j1.d(cu5Var);
        }
        if (this.f469362f == 8) {
            if (i19 == 0) {
                H();
                ((ku5.t0) ku5.t0.f312615d).g(new z12.s(this));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_STORE_EMOJI_DOWNLOAD_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else if (i19 == 2) {
                H();
                ((r45.ve3) oVar.f70710a.f70684a).f388154d = ((r45.we3) oVar.f70711b.f70700a).f389084d;
                doScene(dispatcher(), this.f469361e);
            } else if (i19 == 3) {
                java.util.ArrayList arrayList = this.f469368o;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ((r45.ve3) oVar.f70710a.f70684a).f388154d = new r45.cu5();
                doScene(dispatcher(), this.f469361e);
            }
        }
        int i27 = this.f469362f;
        if (i27 == 1 || i27 == 9) {
            com.tencent.mm.plugin.emoji.model.o a17 = com.tencent.mm.plugin.emoji.model.o.a();
            java.lang.String str2 = J().f389098u;
            if (!com.tencent.mm.sdk.platformtools.t8.D0(a17.f97586b, str2)) {
                a17.f97586b = str2;
                a17.b();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_EXPT_CONFIG_STRING, str2);
                new com.tencent.mm.autogen.events.EmojiStoreExptChangeEvent().e();
            }
        } else if (i27 == 5) {
            com.tencent.mm.plugin.emoji.model.o a18 = com.tencent.mm.plugin.emoji.model.o.a();
            java.lang.String str3 = J().f389098u;
            if (!com.tencent.mm.sdk.platformtools.t8.D0(a18.f97585a, str3)) {
                a18.f97585a = str3;
                a18.b();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_EXPT_MAIN_TAB_CONFIG_STRING, str3);
                new com.tencent.mm.autogen.events.EmojiStoreExptChangeEvent().e();
            }
        }
        this.f469361e.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 100;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    public t(int i17, byte[] bArr, int i18, boolean z17) {
        this.f469365i = null;
        this.f469366m = null;
        this.f469367n = false;
        this.f469368o = new java.util.ArrayList();
        this.f469369p = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ve3();
        lVar.f70665b = new r45.we3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getemotionlist";
        lVar.f70667d = 411;
        lVar.f70668e = 210;
        lVar.f70669f = 1000000210;
        this.f469360d = lVar.a();
        this.f469369p = bArr;
        this.f469365i = null;
        this.f469362f = i17;
        this.f469363g = i18;
        this.f469367n = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneGetEmotionList", "NetSceneGetEmotionList: %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
    }
}
