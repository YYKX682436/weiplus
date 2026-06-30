package gz2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final gz2.i f277740a = new gz2.i();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f277741b = kz5.z.D0(new java.lang.String[]{"/cgi-bin/micromsg-bin/findernavlivestream", "/cgi-bin/micromsg-bin/finderlbslivestream", "/cgi-bin/micromsg-bin/finderlivestreamgetasyncloadinfo", "/cgi-bin/micromsg-bin/findergetliverelatedlist", "/cgi-bin/micromsg-bin/findercreateliveprepare", "/cgi-bin/micromsg-bin/findercreatelive", "/cgi-bin/micromsg-bin/finderjoinlive", "/cgi-bin/micromsg-bin/findergetlivemsg", "/cgi-bin/micromsg-bin/finderlivesyncextrainfo", "/cgi-bin/micromsg-bin/finderlivegetshopshelf", "/cgi-bin/micromsg-bin/findergetliverewardgiftlist", "/cgi-bin/micromsg-bin/finderlivereward", "/cgi-bin/micromsg-bin/finderpostlivemsg", "/cgi-bin/micromsg-bin/finderlikelive", "/cgi-bin/micromsg-bin/finderliveapplymicwithaudience", "/cgi-bin/micromsg-bin/finderliveacceptmicwithaudience", "/cgi-bin/micromsg-bin/finderliveclosemicwithaudience", "/cgi-bin/micromsg-bin/finderlivenewapplypk", "/cgi-bin/micromsg-bin/finderlivenewacceptpk", "/cgi-bin/micromsg-bin/finderlivenewclosepk", "/cgi-bin/micromsg-bin/finderlivenewapplybattle", "/cgi-bin/micromsg-bin/finderlivenewacceptbattle", "/cgi-bin/micromsg-bin/finderlivenewclosebattle", "/cgi-bin/micromsg-bin/getliveonlinememberbyid", "/cgi-bin/micromsg-bin/findergetlivesonglist", "/cgi-bin/micromsg-bin/finderlivektvgetsonglist", "/cgi-bin/micromsg-bin/finderlivektvgetsongplayinfo", "/cgi-bin/micromsg-bin/finderlivektvgetresource", "/cgi-bin/micromsg-bin/finderliveaudienceopfanclub"});

    /* renamed from: c, reason: collision with root package name */
    public static final long f277742c = 300000;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f277743d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f277744e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static kotlinx.coroutines.r2 f277745f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f277746g;

    static {
        f277746g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_disable_cgi_count_monitor, 0) == 1;
    }

    public static final void a(gz2.i iVar, java.lang.String str, java.lang.String str2) {
        iVar.getClass();
        java.util.HashMap hashMap = f277743d;
        java.lang.Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new java.util.HashMap();
            hashMap.put(str, obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.lang.Object obj2 = map.get(str2);
        if (obj2 == null) {
            obj2 = 0;
            map.put(str2, obj2);
        }
        int intValue = ((java.lang.Number) obj2).intValue();
        java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(str);
        if (hashMap2 != null) {
        }
    }
}
