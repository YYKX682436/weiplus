package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class s5 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static int f189068s;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f189069d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f189070e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Queue f189071f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f189072g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f189073h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f189074i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f189075m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f189076n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f189077o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f189078p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final fp.j f189079q = new fp.j();

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f189080r = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.pluginsdk.model.app.r5(this), false);

    public s5() {
        c01.d9.e().a(220, this);
        c01.d9.e().a(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, this);
        c01.d9.e().a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.tencent.mm.pluginsdk.model.app.s5 r18) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.s5.a(com.tencent.mm.pluginsdk.model.app.s5):void");
    }

    public pt.n0 b(java.lang.String str, long j17) {
        com.tencent.mm.pluginsdk.model.app.c4 c4Var = new com.tencent.mm.pluginsdk.model.app.c4(str, j17, null, null);
        c01.d9.e().g(c4Var);
        return c4Var;
    }

    public final void c() {
        ((java.util.HashMap) this.f189073h).clear();
        ((java.util.LinkedList) this.f189071f).clear();
        ((java.util.LinkedList) this.f189072g).clear();
        this.f189075m = false;
        this.f189074i = false;
        this.f189076n = false;
        this.f189079q.a();
    }

    public void d() {
        gm0.j1.e().j(new com.tencent.mm.pluginsdk.model.app.q5(this));
    }

    public final void e(com.tencent.mm.pluginsdk.model.app.d dVar, com.tencent.mm.storage.f9 f9Var, long j17, java.lang.String str, java.lang.String str2) {
        if (dVar.field_totalLen <= 26214400 || !((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
            c01.d9.e().g(new com.tencent.mm.pluginsdk.model.app.w4(j17, str2, str));
        } else {
            java.lang.String j18 = f9Var.j();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            c01.d9.e().g(new g35.e(ot0.q.v(j18), dVar.field_fileFullPath, f9Var.Q0(), new com.tencent.mm.pluginsdk.model.app.o5(this, f9Var, dVar, j17, str)));
        }
    }

    public void finalize() {
        c01.d9.e().q(220, this);
        c01.d9.e().q(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, this);
        c01.d9.e().q(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, this);
        this.f189069d.clear();
        super.finalize();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 222) {
            if (!((java.util.concurrent.ConcurrentHashMap) this.f189070e).containsKey(java.lang.Integer.valueOf(m1Var.hashCode()))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneAppMsg", "onSceneEnd skip %s", java.lang.Integer.valueOf(m1Var.hashCode()));
                return;
            }
        }
        m1Var.getType();
        gm0.j1.e().j(new com.tencent.mm.pluginsdk.model.app.p5(this, m1Var, i17, i18));
    }
}
