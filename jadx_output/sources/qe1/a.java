package qe1;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: r, reason: collision with root package name */
    public static volatile qe1.a f362015r;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f362016a;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f362023h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f362024i;

    /* renamed from: m, reason: collision with root package name */
    public ve1.i f362028m;

    /* renamed from: n, reason: collision with root package name */
    public ue1.a f362029n;

    /* renamed from: o, reason: collision with root package name */
    public te1.i f362030o;

    /* renamed from: p, reason: collision with root package name */
    public re1.h f362031p;

    /* renamed from: q, reason: collision with root package name */
    public te1.d f362032q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f362017b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f362018c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f362019d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f362020e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f362021f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f362022g = false;

    /* renamed from: j, reason: collision with root package name */
    public long f362025j = 536870912;

    /* renamed from: k, reason: collision with root package name */
    public long f362026k = 1048576;

    /* renamed from: l, reason: collision with root package name */
    public int f362027l = 5;

    public a(android.content.Context context) {
        this.f362016a = context;
    }

    public static qe1.a a() {
        if (f362015r != null) {
            return f362015r;
        }
        throw new java.lang.RuntimeException("PlayerConfig not initialized!");
    }

    public java.lang.String b() {
        com.tencent.mm.vfs.r6 r6Var;
        if (!android.text.TextUtils.isEmpty(this.f362024i)) {
            return this.f362024i;
        }
        try {
            r6Var = com.tencent.mm.vfs.r6.j(this.f362016a.getExternalCacheDir());
        } catch (java.lang.Exception e17) {
            ve1.g.p(5, "PlayerConfig", "getCacheDir fail", e17);
            r6Var = null;
        }
        if (r6Var == null) {
            ve1.g.p(5, "PlayerConfig", "getCacheDir fail, extCacheDir not exist", null);
            return null;
        }
        java.lang.String str = r6Var + "/wxvideocache";
        c(str);
        return str;
    }

    public final java.lang.String c(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (r6Var.A()) {
                ve1.g.p(4, "PlayerConfig", "fileDir:" + str + " is file, delete result:" + r6Var.l(), null);
            }
            if (!r6Var.m()) {
                ve1.g.p(4, "PlayerConfig", "fileDir:" + str + " not exist, make dir result:" + r6Var.J(), null);
            }
        }
        return str;
    }

    public java.lang.String d() {
        com.tencent.mm.vfs.r6 r6Var;
        if (!android.text.TextUtils.isEmpty(this.f362023h)) {
            return this.f362023h;
        }
        try {
            r6Var = com.tencent.mm.vfs.r6.j(this.f362016a.getFilesDir());
        } catch (java.lang.Exception e17) {
            ve1.g.p(5, "PlayerConfig", "getTempDir fail", e17);
            r6Var = null;
        }
        if (r6Var == null) {
            return null;
        }
        java.lang.String str = r6Var + "/wxvideotmp";
        c(str);
        return str;
    }

    public ue1.a e() {
        return this.f362029n;
    }

    public boolean f() {
        return this.f362020e;
    }

    public boolean g() {
        return this.f362018c;
    }
}
