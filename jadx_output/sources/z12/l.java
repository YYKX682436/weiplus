package z12;

/* loaded from: classes12.dex */
public class l extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469318d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469319e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f469320f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f469321g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f469322h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f469323i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f469324m;

    /* renamed from: n, reason: collision with root package name */
    public final int f469325n;

    /* renamed from: o, reason: collision with root package name */
    public final int f469326o;

    /* renamed from: p, reason: collision with root package name */
    public final int f469327p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f469328q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f469329r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f469330s;

    /* renamed from: t, reason: collision with root package name */
    public final dn.k f469331t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiGroupInfo f469332u;

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo, int i17, int i18, int i19, java.lang.String str6) {
        this.f469329r = "";
        this.f469331t = new z12.k(this);
        this.f469320f = str;
        this.f469321g = str3;
        this.f469322h = str2;
        this.f469323i = str4;
        this.f469324m = str5;
        this.f469332u = emojiGroupInfo;
        this.f469325n = i17;
        this.f469326o = i18;
        this.f469327p = i19;
        this.f469328q = str6;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pl0();
        lVar.f70665b = new r45.ql0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/exchangeemotionpack";
        lVar.f70667d = com.tencent.wxmm.v2helper.EMethodSetNgStrength;
        lVar.f70668e = 213;
        lVar.f70669f = 1000000213;
        this.f469318d = lVar.a();
    }

    public static void H(z12.l lVar, java.lang.String str, boolean z17) {
        lVar.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneExchangeEmotionPack", "[cpan] publicStoreEmojiDownLoadTaskEvent productId:%s success:%b", str, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.autogen.events.EmojiSyncTaskEvent emojiSyncTaskEvent = new com.tencent.mm.autogen.events.EmojiSyncTaskEvent();
        am.p4 p4Var = emojiSyncTaskEvent.f54103g;
        p4Var.f7603b = str;
        p4Var.f7602a = 2;
        p4Var.f7604c = z17;
        emojiSyncTaskEvent.e();
    }

    public final void I(java.lang.String str, int i17, int i18, java.lang.String str2) {
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ri().a(str, i17, i18, str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        super.cancel();
        this.f469330s = true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469319e = u0Var;
        java.lang.String str = this.f469320f;
        int i17 = this.f469326o;
        if (i17 == 0) {
            I(str, 6, 0, this.f469329r);
        }
        com.tencent.mm.modelbase.o oVar = this.f469318d;
        r45.pl0 pl0Var = (r45.pl0) oVar.f70710a.f70684a;
        pl0Var.f383148d = str;
        pl0Var.f383149e = this.f469322h;
        pl0Var.f383150f = this.f469325n;
        pl0Var.f383151g = i17;
        pl0Var.f383152h = this.f469327p;
        pl0Var.f383153i = x51.j1.h(this.f469328q, false);
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.wxmm.v2helper.EMethodSetNgStrength;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String str2 = this.f469320f;
        if (i18 != 0 || i19 != 0) {
            this.f469319e.onSceneEnd(i18, i19, str, this);
            if (i19 == 4) {
                return;
            }
            I(str2, -1, 0, this.f469329r);
            return;
        }
        rr.u.a(str2);
        if (this.f469326o == 0) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(lp0.b.t());
            java.lang.String str3 = a17.f213279f;
            if (str3 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            java.lang.String b17 = com.tencent.mm.modelcdntran.i2.b("downzip", java.lang.System.currentTimeMillis(), gm0.j1.b().h() + "", "emoji");
            this.f469329r = b17;
            r45.mj0 mj0Var = ((r45.ql0) this.f469318d.f70711b.f70700a).f384082d;
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_NetSceneExchangeEmotionPack";
            mVar.field_mediaId = b17;
            mVar.field_fullpath = lp0.b.t() + str2;
            mVar.field_fileType = 5;
            mVar.field_totalLen = (long) mj0Var.f380557f;
            mVar.field_aesKey = mj0Var.f380556e;
            mVar.field_fileId = mj0Var.f380555d;
            mVar.field_priority = 2;
            mVar.f241787f = this.f469331t;
            mVar.field_needStorage = true;
            this.f469330s = false;
            if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "add task failed:");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneExchangeEmotionPack", "add custom emoji.need no download pack");
        }
        this.f469319e.onSceneEnd(i18, i19, str, this);
        gm0.j1.n().f273288b.g(new z12.p(str2));
    }

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this(str, str2, str3, null, null, null, 0, 0, !com.tencent.mm.sdk.platformtools.t8.K0(str4) ? 1 : 0, str4);
    }

    public l(java.lang.String str) {
        this(str, null, "", null, null, null, 1, 0, 0, null);
    }

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this(str, str2, str3, str4, str5, null, 0, 0, 0, null);
    }
}
