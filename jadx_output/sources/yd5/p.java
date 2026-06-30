package yd5;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: q, reason: collision with root package name */
    public static long f461127q = java.lang.System.currentTimeMillis();

    /* renamed from: r, reason: collision with root package name */
    public static int f461128r;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f461129a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f461130b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f461131c;

    /* renamed from: d, reason: collision with root package name */
    public final int f461132d;

    /* renamed from: e, reason: collision with root package name */
    public long f461133e;

    /* renamed from: f, reason: collision with root package name */
    public long f461134f;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f461136h;

    /* renamed from: i, reason: collision with root package name */
    public final int f461137i;

    /* renamed from: j, reason: collision with root package name */
    public final long f461138j;

    /* renamed from: m, reason: collision with root package name */
    public long f461141m;

    /* renamed from: n, reason: collision with root package name */
    public long f461142n;

    /* renamed from: o, reason: collision with root package name */
    public long f461143o;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.VideoPlayReportStruct f461135g = new com.tencent.mm.autogen.mmdata.rpt.VideoPlayReportStruct();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f461139k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.HashMap f461140l = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f461144p = new java.util.HashMap();

    public p(com.tencent.mm.storage.f9 f9Var, java.lang.String str, boolean z17, int i17) {
        this.f461129a = f9Var;
        this.f461130b = str;
        this.f461131c = z17;
        this.f461132d = i17;
        this.f461136h = "";
        if (f9Var != null) {
            this.f461137i = com.tencent.mm.storage.z3.N4(f9Var.Q0()) ? 2 : 1;
            java.lang.String Q0 = f9Var.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            this.f461136h = Q0;
            this.f461138j = f9Var.I0();
        }
    }

    public final void a() {
        java.lang.String str;
        com.tencent.mm.storage.f9 f9Var = this.f461129a;
        if (f9Var == null || (str = this.f461130b) == null) {
            return;
        }
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null) {
            return;
        }
        t21.j3 d17 = t21.j3.f414800h.d(h17.g());
        boolean z17 = f9Var.A0() == 1;
        boolean N4 = com.tencent.mm.storage.z3.N4(f9Var.Q0());
        java.lang.String Q0 = f9Var.Q0();
        com.tencent.mm.autogen.mmdata.rpt.VideoPlayReportStruct videoPlayReportStruct = this.f461135g;
        videoPlayReportStruct.f61598h = videoPlayReportStruct.b("ChatName", Q0, true);
        videoPlayReportStruct.f61597g = N4 ? 1L : 0L;
        videoPlayReportStruct.f61604n = h17.f415015m;
        i95.m c17 = i95.n0.c(tg3.u0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        videoPlayReportStruct.f61596f = com.tencent.mm.vfs.w6.k(tg3.u0.e8((tg3.u0) c17, this.f461129a, bm5.f0.f22571s, this.f461130b, false, 8, null));
        if (d17 != null) {
            videoPlayReportStruct.f61595e = d17.f414804b ? 0L : d17.f414809g;
            videoPlayReportStruct.f61605o = d17.f414803a;
            videoPlayReportStruct.f61594d = videoPlayReportStruct.b("FileId", this.f461131c ? d17.f414806d : d17.f414807e, true);
        }
        int i17 = this.f461132d;
        if (i17 == 1) {
            boolean z18 = !(h17.T == 1);
            videoPlayReportStruct.f61601k = z18 ? 1L : 3L;
            if (z18) {
                h17.T = 1;
                h17.Z = true;
            }
        } else if (i17 == 2) {
            boolean z19 = !(h17.T == 1);
            videoPlayReportStruct.f61601k = z19 ? 2L : 3L;
            if (z19) {
                h17.T = 1;
                h17.Z = true;
            }
        } else if (i17 == 3) {
            videoPlayReportStruct.f61601k = 4L;
        } else if (i17 == 4) {
            videoPlayReportStruct.f61601k = 5L;
        } else if (i17 == 5) {
            videoPlayReportStruct.f61601k = 6L;
        }
        if (N4) {
            videoPlayReportStruct.f61599i = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(f9Var.Q0());
        }
        videoPlayReportStruct.f61600j = videoPlayReportStruct.b("SenderUserName", z17 ? c01.z1.r() : h17.e(), true);
        java.util.HashMap hashMap = this.f461144p;
        if (!hashMap.isEmpty()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            videoPlayReportStruct.f61606p = videoPlayReportStruct.b("ExtraInfo", r26.i0.u(jSONObject2, ',', ';', false, 4, null), true);
        }
        videoPlayReportStruct.k();
        t21.d3.Q(h17);
    }

    public final void b() {
        this.f461133e = java.lang.System.currentTimeMillis();
    }
}
