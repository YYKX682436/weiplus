package cz2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final cz2.e f224991a = new cz2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f224992b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f224993c;

    /* renamed from: d, reason: collision with root package name */
    public static int f224994d;

    /* renamed from: e, reason: collision with root package name */
    public static cz2.a f224995e;

    /* renamed from: f, reason: collision with root package name */
    public static cz2.a f224996f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f224997g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f224998h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f224999i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f225000j;

    /* renamed from: k, reason: collision with root package name */
    public static long f225001k;

    static {
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = new java.util.concurrent.ConcurrentSkipListSet();
        f224992b = concurrentSkipListSet;
        f224993c = new java.util.concurrent.ConcurrentSkipListSet();
        f224995e = new cz2.a(200, 60L);
        f224996f = new cz2.a(1000, 60L);
        f224997g = new java.util.concurrent.ConcurrentHashMap();
        f224998h = new java.util.concurrent.ConcurrentHashMap();
        f224999i = new java.util.concurrent.ConcurrentSkipListSet();
        f225000j = new java.util.concurrent.ConcurrentSkipListSet();
        concurrentSkipListSet.add("finderstatsreport");
        concurrentSkipListSet.add("findergetlivemsg");
        concurrentSkipListSet.add("findermarkread");
    }

    public final jz5.l a(java.util.concurrent.ConcurrentHashMap concurrentHashMap, cz2.a aVar, java.lang.String str) {
        java.lang.Object putIfAbsent;
        if (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return new jz5.l(java.lang.Boolean.TRUE, null);
        }
        java.lang.String p07 = r26.n0.p0(str, "/", str);
        java.lang.Object obj = concurrentHashMap.get(p07);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(p07, (obj = new cz2.b(0, android.os.SystemClock.elapsedRealtime())))) != null) {
            obj = putIfAbsent;
        }
        cz2.b bVar = (cz2.b) obj;
        if (bVar.f224983a >= aVar.f224981a) {
            if (android.os.SystemClock.elapsedRealtime() - bVar.f224984b <= aVar.f224982b * 60 * 1000) {
                return new jz5.l(java.lang.Boolean.TRUE, bVar);
            }
            bVar.f224983a = 0;
            bVar.f224984b = android.os.SystemClock.elapsedRealtime();
        }
        bVar.f224983a++;
        return new jz5.l(java.lang.Boolean.FALSE, null);
    }

    public final void b() {
        fp.j jVar = new fp.j();
        lb2.j jVar2 = kb2.d.f306230a;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_cgi_block_limit, "200, 60, 1000, 60", true);
        kotlin.jvm.internal.o.f(Zi, "getExpt(...)");
        java.util.List O1 = com.tencent.mm.sdk.platformtools.t8.O1(Zi, ",");
        kotlin.jvm.internal.o.d(O1);
        java.lang.String str = (java.lang.String) kz5.n0.a0(O1, 0);
        f224995e = new cz2.a(com.tencent.mm.sdk.platformtools.t8.D1(str != null ? r26.n0.u0(str).toString() : null, 0), com.tencent.mm.sdk.platformtools.t8.D1(((java.lang.String) kz5.n0.a0(O1, 1)) != null ? r26.n0.u0(r11).toString() : null, 0));
        java.lang.String str2 = (java.lang.String) kz5.n0.a0(O1, 2);
        f224996f = new cz2.a(com.tencent.mm.sdk.platformtools.t8.D1(str2 != null ? r26.n0.u0(str2).toString() : null, 0), com.tencent.mm.sdk.platformtools.t8.D1(((java.lang.String) kz5.n0.a0(O1, 3)) != null ? r26.n0.u0(r6).toString() : null, 0));
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.d0 d0Var = e42.d0.clicfg_finder_cgi_blocklist;
        java.lang.String Zi2 = ((h62.d) e0Var).Zi(d0Var, "", true);
        kotlin.jvm.internal.o.f(Zi2, "getExpt(...)");
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(r26.n0.u0(Zi2).toString(), 0);
        f224994d = D1;
        if (D1 > 0) {
            com.tencent.mars.xlog.Log.e("Finder.CgiStrategy", "blockAll cgi " + f224994d);
            return;
        }
        java.lang.String Zi3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(d0Var, "", true);
        kotlin.jvm.internal.o.f(Zi3, "getExpt(...)");
        java.util.List O12 = com.tencent.mm.sdk.platformtools.t8.O1(Zi3, ",");
        com.tencent.mars.xlog.Log.i("Finder.CgiStrategy", "init blockString " + Zi2 + " limitString " + Zi + " size " + O12.size() + " autoLimitErrorBlock:" + f224995e.f224981a + ' ' + f224995e.f224982b + " autoLimitBlock:" + f224996f.f224981a + ' ' + f224996f.f224982b + " errorReport " + f224999i.size() + ' ' + f225000j.size() + " cost:" + jVar.a());
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = f224993c;
        concurrentSkipListSet.clear();
        concurrentSkipListSet.addAll(O12);
    }
}
