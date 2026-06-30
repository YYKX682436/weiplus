package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f213042a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f213043b = kz5.c0.i("${data}", "${extData}");

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f213044c = {"${data}/.vfs", "${data}/lib", "${data}/code_cache", "${extData}", "${dataCache}", "${extCache}", "${data}/MicroMsg/${account}", "${extData}/MicroMsg/${accountSd}", "${dataCache}/${account}", "${extCache}/${accountSd}", "${data}/MicroMsg/${accountAllOther}", "${extData}/MicroMsg/${accountAllOther}", "${dataCache}/${accountAllOther}", "${extCache}/${accountAllOther}", "${storage}/tencent/MicroMsg", "${storage}/tencent/MicroMsg/${accountSd}", "${storage}/tencent/MicroMsg/${accountAllOther}", "${data}/shared_prefs", "${data}/.auth_cache", "${data}/cert", "${data}/MicroMsg/last_avatar_dir", "${data}/app_lib", "${data}/app_dex", "${data}/app_recover_lib", "${data}/MicroMsg/recovery", "${data}/${xwebKeepOld}", "${storage}/tencent/MicroMsg/WeiXin", "${storage}/tencent/MicroMsg/WeChat"};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f213045d = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 131072, 4096, 4096, 8192, 8192, 8192, 8192, 16384, 16384, 16384, 16384, 32768, 8192, 16384, 12, 12, 12, 12, 65536, 65536, 65536, 65536, 65546, 65536, 65536};

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f213046e = kz5.c1.k(new jz5.l("SnsMicroMsg", 4), new jz5.l("UnEncryptNewBiz", 5), new jz5.l("AppBrandComm", 6), new jz5.l("enFavorite", 7));

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f213047f = kz5.p1.d("PreDownloadCheck", "SnsMicroMsg");

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f213048g;

    /* renamed from: h, reason: collision with root package name */
    public static final yz5.p[] f213049h;

    /* renamed from: i, reason: collision with root package name */
    public static final r26.t f213050i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String[] f213051j;

    /* renamed from: k, reason: collision with root package name */
    public static final yz5.p[] f213052k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.mm.vfs.k6 f213053l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.List f213054m;

    /* renamed from: n, reason: collision with root package name */
    public static volatile java.util.List f213055n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile java.util.List f213056o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile java.util.List f213057p;

    /* renamed from: q, reason: collision with root package name */
    public static volatile java.util.List f213058q;

    /* renamed from: r, reason: collision with root package name */
    public static volatile java.util.List f213059r;

    /* renamed from: s, reason: collision with root package name */
    public static volatile java.lang.String f213060s;

    /* renamed from: t, reason: collision with root package name */
    public static volatile java.util.List f213061t;

    /* renamed from: u, reason: collision with root package name */
    public static volatile java.util.List f213062u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile java.util.List f213063v;

    /* renamed from: w, reason: collision with root package name */
    public static volatile boolean f213064w;

    static {
        com.tencent.mm.vfs.c2 c2Var = com.tencent.mm.vfs.c2.f212867d;
        com.tencent.mm.vfs.d2 d2Var = com.tencent.mm.vfs.d2.f212893d;
        f213048g = new java.lang.String[]{"${data}/files/mmkv", "${data}/shared_prefs", "${data}", "${data}/MicroMsg", "${data}/files", "${extData}", "${extData}/MicroMsg", "${data}/MicroMsg/${account}", "${data}/MicroMsg/${accountAllOther}", "${data}/MicroMsg/${account}/corrupted", "${data}/MicroMsg/${accountAllOther}/corrupted"};
        f213049h = new yz5.p[]{com.tencent.mm.vfs.h2.f212971d, com.tencent.mm.vfs.i2.f212991d, com.tencent.mm.vfs.j2.f213011d, d2Var, d2Var, d2Var, d2Var, c2Var, c2Var, c2Var, c2Var};
        f213050i = new r26.t("^[0-9a-zA-Z_:]+_([0-9]{8})\\.xlog$");
        f213051j = new java.lang.String[]{"WxaCodePkgsCacheGlobal", "xlogPrivate", "XWebEngine"};
        f213052k = new yz5.p[]{com.tencent.mm.vfs.e2.f212905d, com.tencent.mm.vfs.f2.f212923d, com.tencent.mm.vfs.g2.f212948d};
        f213053l = new com.tencent.mm.vfs.k6(0, null, new com.tencent.mm.vfs.x1(com.tencent.mm.vfs.NullFileSystem.f(), "", "", 0L, 0L, 0L, false));
        f213054m = kz5.c0.i(new jz5.l("CheckResUpdate", ""), new jz5.l("PublicResource", "live"), new jz5.l("XNetLib", ""));
        kz5.p0 p0Var = kz5.p0.f313996d;
        f213055n = p0Var;
        f213056o = p0Var;
        f213057p = p0Var;
        f213058q = p0Var;
        f213059r = p0Var;
        f213061t = p0Var;
        f213062u = p0Var;
        f213063v = p0Var;
    }
}
