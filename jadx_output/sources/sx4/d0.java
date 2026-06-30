package sx4;

/* loaded from: classes8.dex */
public class d0 {

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.HashMap f413581t = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public long f413582a;

    /* renamed from: b, reason: collision with root package name */
    public long f413583b;

    /* renamed from: c, reason: collision with root package name */
    public long f413584c;

    /* renamed from: d, reason: collision with root package name */
    public long f413585d;

    /* renamed from: e, reason: collision with root package name */
    public long f413586e;

    /* renamed from: f, reason: collision with root package name */
    public long f413587f;

    /* renamed from: g, reason: collision with root package name */
    public long f413588g;

    /* renamed from: h, reason: collision with root package name */
    public long f413589h;

    /* renamed from: i, reason: collision with root package name */
    public long f413590i;

    /* renamed from: j, reason: collision with root package name */
    public long f413591j;

    /* renamed from: k, reason: collision with root package name */
    public long f413592k;

    /* renamed from: l, reason: collision with root package name */
    public long f413593l;

    /* renamed from: m, reason: collision with root package name */
    public long f413594m;

    /* renamed from: n, reason: collision with root package name */
    public long f413595n;

    /* renamed from: o, reason: collision with root package name */
    public long f413596o;

    /* renamed from: p, reason: collision with root package name */
    public long f413597p;

    /* renamed from: q, reason: collision with root package name */
    public long f413598q;

    /* renamed from: r, reason: collision with root package name */
    public long f413599r;

    /* renamed from: s, reason: collision with root package name */
    public long f413600s;

    public static sx4.d0 a(java.lang.String str) {
        java.util.HashMap hashMap = f413581t;
        if (hashMap.containsKey(str)) {
            hashMap.remove(str);
        }
        sx4.d0 d0Var = new sx4.d0();
        hashMap.put(str, d0Var);
        return d0Var;
    }

    public static sx4.d0 b(java.lang.String str) {
        java.util.HashMap hashMap = f413581t;
        if (hashMap.containsKey(str)) {
            return (sx4.d0) hashMap.get(str);
        }
        sx4.d0 d0Var = new sx4.d0();
        hashMap.put(str, d0Var);
        return d0Var;
    }

    public static sx4.d0 c(java.lang.String str) {
        return (sx4.d0) f413581t.get(str);
    }

    public static boolean d() {
        return com.tencent.mm.pluginsdk.model.g4.a() || com.tencent.mm.sdk.platformtools.x2.s();
    }

    public static void e(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(10, str, j17);
        } else if (c(str) != null) {
            c(str).f413591j = j17;
        }
    }

    public static void f(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(11, str, j17);
            return;
        }
        sx4.d0 c17 = c(str);
        if (c17 != null) {
            c17.f413592k = j17;
            c17.f413597p = j17;
        }
    }

    public static void g(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(6, str, j17);
        } else if (c(str) != null) {
            c(str).f413588g = j17;
        }
    }

    public static void h(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(5, str, j17);
        } else if (c(str) != null) {
            c(str).f413587f = j17;
        }
    }

    public static void i(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(1, str, j17);
        } else if (c(str) != null) {
            c(str).f413583b = j17;
        }
    }

    public static void j(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(9, str, j17);
        } else if (c(str) != null) {
            c(str).f413582a = j17;
            try {
                jj0.a.a().b(6, java.net.URLEncoder.encode(str), "", 0L);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void k(int i17, java.lang.String str, long j17) {
        com.tencent.mm.ipcinvoker.wx_extension.j0 j0Var = (com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", i17);
        bundle.putString("url", str);
        bundle.putLong("time", j17);
        ((h80.k) j0Var).getClass();
        com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle, sx4.c0.class, null);
    }

    public static void l(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(8, str, j17);
        } else if (c(str) != null) {
            c(str).f413590i = j17;
        }
    }

    public static void m(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(7, str, j17);
        } else if (c(str) != null) {
            c(str).f413589h = j17;
        }
    }
}
