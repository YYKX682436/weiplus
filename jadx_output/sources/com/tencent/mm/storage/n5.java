package com.tencent.mm.storage;

/* loaded from: classes12.dex */
public class n5 implements z85.e {

    /* renamed from: u, reason: collision with root package name */
    public static final bm5.p1 f195162u;

    /* renamed from: c, reason: collision with root package name */
    public z85.l f195165c;

    /* renamed from: d, reason: collision with root package name */
    public z85.d f195166d;

    /* renamed from: e, reason: collision with root package name */
    public z85.k f195167e;

    /* renamed from: f, reason: collision with root package name */
    public z85.x f195168f;

    /* renamed from: g, reason: collision with root package name */
    public z85.z f195169g;

    /* renamed from: h, reason: collision with root package name */
    public z85.t f195170h;

    /* renamed from: i, reason: collision with root package name */
    public z85.v f195171i;

    /* renamed from: j, reason: collision with root package name */
    public z85.r f195172j;

    /* renamed from: k, reason: collision with root package name */
    public z85.b0 f195173k;

    /* renamed from: l, reason: collision with root package name */
    public z85.d0 f195174l;

    /* renamed from: m, reason: collision with root package name */
    public z85.p f195175m;

    /* renamed from: n, reason: collision with root package name */
    public z85.f0 f195176n;

    /* renamed from: o, reason: collision with root package name */
    public z85.b f195177o;

    /* renamed from: p, reason: collision with root package name */
    public z85.n f195178p;

    /* renamed from: q, reason: collision with root package name */
    public z85.h f195179q;

    /* renamed from: r, reason: collision with root package name */
    public gr.t f195180r;

    /* renamed from: a, reason: collision with root package name */
    public final boolean[] f195163a = {false};

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f195164b = {false};

    /* renamed from: s, reason: collision with root package name */
    public final l75.q0 f195181s = new com.tencent.mm.storage.k5(this);

    /* renamed from: t, reason: collision with root package name */
    public final l75.q0 f195182t = new com.tencent.mm.storage.l5(this);

    static {
        new java.util.ArrayList();
        new java.util.HashMap();
        f195162u = new com.tencent.mm.storage.m5();
    }

    public n5(com.tencent.mm.storage.k5 k5Var) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStorageMgr", "EmojiStorageMgr: %s", new com.tencent.mm.sdk.platformtools.z3());
    }

    public static com.tencent.mm.storage.n5 f() {
        com.tencent.mm.storage.n5 n5Var = (com.tencent.mm.storage.n5) f195162u.b();
        boolean[] zArr = n5Var.f195163a;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!n5Var.f195163a[0]) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStorageMgr", "initStorage: ");
                    boolean z17 = gm0.j1.u().f273153f != null && gm0.j1.u().f273153f.isOpen();
                    if (!z17) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStorageMgr", "initStorage: db close %s", gm0.j1.u().f273153f);
                    }
                    n5Var.f195165c = new z85.l(gm0.j1.u().f273153f);
                    z85.d dVar = new z85.d(gm0.j1.u().f273153f);
                    n5Var.f195166d = dVar;
                    dVar.f470789e = n5Var;
                    n5Var.f195167e = new z85.k(gm0.j1.u().f273153f);
                    n5Var.f195170h = new z85.t(gm0.j1.u().f273153f);
                    n5Var.f195171i = new z85.v(gm0.j1.u().f273153f);
                    n5Var.f195172j = new z85.r(gm0.j1.u().f273153f);
                    n5Var.f195168f = new z85.x(gm0.j1.u().f273153f);
                    n5Var.f195169g = new z85.z(gm0.j1.u().f273153f);
                    n5Var.f195173k = new z85.b0(gm0.j1.u().f273153f);
                    n5Var.f195174l = new z85.d0(gm0.j1.u().f273153f);
                    n5Var.f195175m = new z85.p(gm0.j1.u().f273153f);
                    n5Var.f195176n = new z85.f0();
                    n5Var.f195177o = new z85.b(gm0.j1.u().f273153f);
                    n5Var.f195178p = new z85.n(gm0.j1.u().f273153f);
                    n5Var.f195179q = new z85.h(gm0.j1.u().f273153f);
                    n5Var.f195180r = gr.t.g();
                    if (z17) {
                        n5Var.f195163a[0] = true;
                    }
                }
            }
        }
        boolean[] zArr2 = n5Var.f195164b;
        if (!zArr2[0]) {
            synchronized (zArr2) {
                if (!n5Var.f195164b[0]) {
                    if (gm0.j1.a()) {
                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        if (context != null) {
                            boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().l(274480, java.lang.Boolean.TRUE)).booleanValue();
                            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStorageMgr", "[oneliang]initCore,need init emoji:%s", java.lang.String.valueOf(booleanValue));
                            if (booleanValue) {
                                n5Var.c().X1(context);
                                n5Var.b().n1(context);
                            }
                            gm0.j1.u().c().w(274480, java.lang.Boolean.FALSE);
                        }
                        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_EMOJI_CUREENT_VERSION_INT;
                        if (((java.lang.Integer) c17.m(u3Var, 0)).intValue() != o45.wf.f343029g) {
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            n5Var.b().u1();
                            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(o45.wf.f343029g));
                            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStorageMgr", "recoverCustomEmojiGroup use time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                        }
                        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_EMOJI_UPDATE_EMOJI_GROUP_COUNT_BOOLEAN;
                        if (((java.lang.Boolean) c18.m(u3Var2, java.lang.Boolean.TRUE)).booleanValue()) {
                            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                            gm0.j1.u().c().x(u3Var2, java.lang.Boolean.valueOf(!n5Var.b().K1()));
                            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStorageMgr", "updateEmojiGroupCount use time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
                        }
                        n5Var.f195164b[0] = true;
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiStorageMgr", "Not login, skip rest logic this time.");
                    }
                }
            }
        }
        return n5Var;
    }

    public z85.k a() {
        z85.k kVar;
        synchronized (this.f195163a) {
            kVar = this.f195167e;
        }
        return kVar;
    }

    public z85.d b() {
        z85.d dVar;
        synchronized (this.f195163a) {
            dVar = this.f195166d;
        }
        return dVar;
    }

    public z85.l c() {
        z85.l lVar;
        synchronized (this.f195163a) {
            lVar = this.f195165c;
        }
        return lVar;
    }

    public z85.t d() {
        z85.t tVar;
        synchronized (this.f195163a) {
            tVar = this.f195170h;
        }
        return tVar;
    }

    public z85.x e() {
        z85.x xVar;
        synchronized (this.f195163a) {
            xVar = this.f195168f;
        }
        return xVar;
    }

    public void g(java.lang.String str) {
        boolean z17 = false;
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals("event_update_group");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equalsIgnoreCase("productID")) {
            z17 = true;
        }
        if (z18) {
            if (!gm0.j1.b().m()) {
                return;
            }
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).getClass();
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Bi().g();
        }
        if (z18 || z17) {
            this.f195180r.o(true);
        }
    }
}
