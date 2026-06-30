package zj3;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static long f473303b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static long f473304c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static long f473305d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static long f473306e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f473307f = false;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f473308g = "";

    /* renamed from: h, reason: collision with root package name */
    public static boolean f473309h = false;

    /* renamed from: i, reason: collision with root package name */
    public static int f473310i = -1;

    /* renamed from: j, reason: collision with root package name */
    public static int f473311j;

    /* renamed from: k, reason: collision with root package name */
    public static int f473312k;

    /* renamed from: m, reason: collision with root package name */
    public static int f473314m;

    /* renamed from: n, reason: collision with root package name */
    public static int f473315n;

    /* renamed from: o, reason: collision with root package name */
    public static int f473316o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f473317p;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f473318q;

    /* renamed from: r, reason: collision with root package name */
    public static int f473319r;

    /* renamed from: a, reason: collision with root package name */
    public static final zj3.g f473302a = new zj3.g();

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashSet f473313l = new java.util.HashSet();

    /* renamed from: s, reason: collision with root package name */
    public static final zj3.f f473320s = new zj3.f();

    /* renamed from: t, reason: collision with root package name */
    public static final zj3.f f473321t = new zj3.f();

    /* renamed from: u, reason: collision with root package name */
    public static final zj3.f f473322u = new zj3.f();

    /* renamed from: v, reason: collision with root package name */
    public static final zj3.f f473323v = new zj3.f();

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.ArrayList f473324w = new java.util.ArrayList();

    public final void a(boolean z17) {
        if (f473309h) {
            com.tencent.mars.xlog.Log.e("MultitalkFeatureReportH", "now is talking");
        }
        f473317p = false;
        f473307f = false;
        f473318q = false;
        f473315n = 0;
        f473314m = 0;
        f473319r = 0;
        f473311j = 0;
        f473312k = 0;
        f473313l.clear();
        f473324w.clear();
        ((java.util.ArrayList) f473320s.f473301a).clear();
        ((java.util.ArrayList) f473321t.f473301a).clear();
        ((java.util.ArrayList) f473322u.f473301a).clear();
        ((java.util.ArrayList) f473323v.f473301a).clear();
        f473309h = true;
        f473305d = java.lang.System.currentTimeMillis();
        f473307f = z17;
    }

    public final void b(int i17, int i18) {
        if (i17 != 1) {
            zj3.f fVar = f473321t;
            if (i17 == 2) {
                fVar.b();
            } else if (i17 == 8) {
                fVar.a();
            }
        } else {
            f473318q = true;
            f473324w.add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        com.tencent.mm.autogen.mmdata.rpt.MultitalkScreenFunctionStruct multitalkScreenFunctionStruct = new com.tencent.mm.autogen.mmdata.rpt.MultitalkScreenFunctionStruct();
        if (f473307f) {
            multitalkScreenFunctionStruct.f59425i = f473303b;
        } else {
            multitalkScreenFunctionStruct.f59426j = 0L;
        }
        multitalkScreenFunctionStruct.f59421e = 1;
        multitalkScreenFunctionStruct.f59423g = i18;
        multitalkScreenFunctionStruct.f59424h = f473304c;
        multitalkScreenFunctionStruct.f59420d = multitalkScreenFunctionStruct.b("MultitalkGroupId", f473308g, true);
        multitalkScreenFunctionStruct.f59422f = i17;
        multitalkScreenFunctionStruct.k();
    }

    public final void c(java.util.List memberList) {
        kotlin.jvm.internal.o.g(memberList, "memberList");
        java.util.Iterator it = memberList.iterator();
        while (it.hasNext()) {
            f473313l.add(((com.tencent.mm.modeltalkroom.MultiTalkGroupMember) it.next()).f71612d);
        }
        f473315n = java.lang.Math.max(f473315n, memberList.size());
    }
}
