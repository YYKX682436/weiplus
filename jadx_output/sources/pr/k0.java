package pr;

/* loaded from: classes15.dex */
public final class k0 implements pr.b1 {

    /* renamed from: q, reason: collision with root package name */
    public static final pr.z f357723q = new pr.z(null);

    /* renamed from: r, reason: collision with root package name */
    public static final pr.e0 f357724r = new pr.w();

    /* renamed from: s, reason: collision with root package name */
    public static final pr.e0 f357725s = new pr.v();

    /* renamed from: t, reason: collision with root package name */
    public static final jz5.g f357726t = jz5.h.b(pr.y.f357799d);

    /* renamed from: u, reason: collision with root package name */
    public static final jz5.g f357727u = jz5.h.b(pr.x.f357795d);

    /* renamed from: a, reason: collision with root package name */
    public final pr.d0 f357728a;

    /* renamed from: b, reason: collision with root package name */
    public final pr.c0 f357729b;

    /* renamed from: d, reason: collision with root package name */
    public int f357731d;

    /* renamed from: f, reason: collision with root package name */
    public int f357733f;

    /* renamed from: g, reason: collision with root package name */
    public int f357734g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f357735h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f357736i;

    /* renamed from: m, reason: collision with root package name */
    public int f357740m;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f357730c = "MicroMsg.EmojiSyncLoader";

    /* renamed from: e, reason: collision with root package name */
    public int f357732e = -1;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f357737j = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f357738k = new java.util.LinkedList();

    /* renamed from: l, reason: collision with root package name */
    public final pr.a1 f357739l = new pr.a1(3);

    /* renamed from: n, reason: collision with root package name */
    public final pr.h0 f357741n = new pr.h0(this);

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Boolean[] f357742o = {java.lang.Boolean.FALSE};

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Byte[] f357743p = new java.lang.Byte[0];

    public k0(pr.d0 d0Var, pr.c0 c0Var, kotlin.jvm.internal.i iVar) {
        this.f357728a = d0Var;
        this.f357729b = c0Var;
    }

    @Override // pr.b1
    public int a() {
        if (this.f357736i) {
            return Integer.MAX_VALUE;
        }
        return this.f357732e;
    }

    @Override // pr.b1
    public void b(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (gm0.j1.a()) {
                pm0.v.L("EmojiSyncLoader_checkSyncEmoji", true, new pr.g0(this, z17));
            } else {
                com.tencent.mars.xlog.Log.w(this.f357730c, "checkSyncEmoji(%s): account was not ready, ignore rest logic.", java.lang.Boolean.valueOf(z17));
            }
        }
    }

    @Override // pr.b1
    public boolean c() {
        return !this.f357736i;
    }

    @Override // pr.b1
    public void d(pr.e0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        pm0.v.X(new pr.j0(this, callback));
    }

    @Override // pr.b1
    public void destroy() {
        if (this.f357742o[0].booleanValue()) {
            synchronized (this.f357742o) {
                if (this.f357742o[0].booleanValue()) {
                    synchronized (this.f357743p) {
                        try {
                            pr.a1 a1Var = this.f357739l;
                            a1Var.f357689a.clear();
                            for (java.util.Map.Entry entry : a1Var.f357690b.entrySet()) {
                            }
                            this.f357739l.f357691c = null;
                        } finally {
                        }
                    }
                    this.f357742o[0] = java.lang.Boolean.FALSE;
                }
            }
        }
    }

    @Override // pr.b1
    public void e() {
        synchronized (this.f357743p) {
            com.tencent.mars.xlog.Log.i(this.f357730c, "loadMore: " + this.f357735h + ", " + this.f357736i);
            boolean z17 = false;
            if (this.f357736i) {
                this.f357735h = false;
            } else if (!this.f357735h) {
                z17 = true;
            }
            if (z17) {
                pr.c0 c0Var = this.f357729b;
                int i17 = this.f357733f;
                ((pr.a0) c0Var).getClass();
                this.f357733f = i17 + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_sync_more_count, 120);
                h();
            }
        }
    }

    @Override // pr.b1
    public void f(pr.e0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        pm0.v.X(new pr.i0(this, callback));
    }

    @Override // pr.b1
    public int g() {
        if (this.f357736i) {
            return Integer.MAX_VALUE;
        }
        return this.f357733f;
    }

    public final void h() {
        java.util.List a17 = this.f357728a.a();
        this.f357734g = a17.size();
        int min = java.lang.Math.min(this.f357733f, a17.size());
        this.f357733f = min;
        if (this.f357731d > min) {
            this.f357731d = min;
        }
        int i17 = this.f357731d;
        if (min > i17) {
            this.f357735h = true;
        }
        if (!this.f357735h && min == this.f357734g) {
            this.f357736i = true;
        }
        this.f357732e = i17;
        com.tencent.mars.xlog.Log.i(this.f357730c, "startInternal: " + this.f357731d + ", " + this.f357733f + ", " + this.f357734g + ", " + this.f357732e + ", " + this.f357735h + ", " + this.f357736i);
        java.util.List subList = a17.subList(this.f357731d, this.f357733f);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
        int i18 = 0;
        for (java.lang.Object obj : subList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) obj;
            this.f357737j.add(emojiInfo.getMd5());
            arrayList.add(new pr.u0(emojiInfo, i18 + this.f357731d));
            i18 = i19;
        }
        pr.a1 a1Var = this.f357739l;
        a1Var.getClass();
        pm0.v.X(new pr.z0(a1Var, arrayList));
    }

    @Override // pr.b1
    public void init() {
        if (this.f357742o[0].booleanValue()) {
            return;
        }
        synchronized (this.f357742o) {
            if (!this.f357742o[0].booleanValue()) {
                synchronized (this.f357743p) {
                    this.f357739l.f357691c = this.f357741n;
                    this.f357733f = ((pr.a0) this.f357729b).a();
                }
                b(false);
                this.f357742o[0] = java.lang.Boolean.TRUE;
            }
        }
    }
}
