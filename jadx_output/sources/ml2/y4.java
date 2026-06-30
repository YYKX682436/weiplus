package ml2;

/* loaded from: classes3.dex */
public final class y4 {
    public ml2.a4 A;
    public long B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public final java.util.HashMap G;
    public final java.util.HashMap H;
    public ml2.i4 I;

    /* renamed from: J, reason: collision with root package name */
    public ml2.w1 f328285J;
    public long K;
    public final long L;
    public org.json.JSONObject M;
    public int N;
    public java.lang.String O;
    public ml2.x3 P;
    public long Q;
    public long R;
    public long S;
    public final ml2.k5 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final java.util.LinkedList Z;

    /* renamed from: a0, reason: collision with root package name */
    public java.lang.ref.WeakReference f328287a0;

    /* renamed from: b, reason: collision with root package name */
    public long f328288b;

    /* renamed from: b0, reason: collision with root package name */
    public ml2.m3 f328289b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f328290c;

    /* renamed from: c0, reason: collision with root package name */
    public ml2.y3 f328291c0;

    /* renamed from: d0, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f328293d0;

    /* renamed from: e, reason: collision with root package name */
    public long f328294e;

    /* renamed from: e0, reason: collision with root package name */
    public ml2.l1 f328295e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f328296f;

    /* renamed from: f0, reason: collision with root package name */
    public long f328297f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f328298g;

    /* renamed from: g0, reason: collision with root package name */
    public cl0.e f328299g0;

    /* renamed from: i, reason: collision with root package name */
    public double f328301i;

    /* renamed from: j, reason: collision with root package name */
    public int f328302j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f328304l;

    /* renamed from: o, reason: collision with root package name */
    public boolean f328307o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f328309q;

    /* renamed from: s, reason: collision with root package name */
    public long f328311s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f328312t;

    /* renamed from: u, reason: collision with root package name */
    public int f328313u;

    /* renamed from: v, reason: collision with root package name */
    public int f328314v;

    /* renamed from: y, reason: collision with root package name */
    public ml2.y3 f328317y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f328318z;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f328286a = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f328292d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f328300h = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f328303k = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f328305m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f328306n = "";

    /* renamed from: p, reason: collision with root package name */
    public ml2.r2 f328308p = ml2.r2.f327896e;

    /* renamed from: r, reason: collision with root package name */
    public ml2.n2 f328310r = ml2.n2.f327733f;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f328315w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f328316x = "";

    public y4() {
        ml2.y3 y3Var = ml2.y3.f328270e;
        this.f328317y = y3Var;
        this.f328318z = "";
        this.A = ml2.a4.f327204e;
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = "";
        jz5.l lVar = new jz5.l("com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI", "1");
        jz5.l lVar2 = new jz5.l("FinderProfileTimeLineUI", "1");
        jz5.l lVar3 = new jz5.l("com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamListUI", "16");
        jz5.l lVar4 = new jz5.l("FinderLbsStreamListUI", "16");
        jz5.l lVar5 = new jz5.l("com.tencent.mm.plugin.finder.ui.FinderFollowListUI", "12");
        jz5.l lVar6 = new jz5.l("FinderFollowListUI", "12");
        jz5.l lVar7 = new jz5.l("com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI", "27");
        jz5.l lVar8 = new jz5.l("FinderTopicTimelineUI", "27");
        jz5.l lVar9 = new jz5.l("com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI", "25");
        jz5.l lVar10 = new jz5.l("FinderShareFeedRelUI", "25");
        jz5.l lVar11 = new jz5.l("com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI", "2");
        jz5.l lVar12 = new jz5.l("FinderLikedFeedUI", "2");
        jz5.l lVar13 = new jz5.l("com.tencent.mm.plugin.finder.feed.ui.FinderFavTimelineUI", "21");
        jz5.l lVar14 = new jz5.l("FinderFavTimelineUI", "21");
        jz5.l lVar15 = new jz5.l("com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI", "40");
        jz5.l lVar16 = new jz5.l("FinderFeedRelatedTimelineUI", "40");
        jz5.l lVar17 = new jz5.l("com.tencent.mm.plugin.finder.search.FinderMixSearchUI", "23");
        jz5.l lVar18 = new jz5.l("FinderMixSearchUI", "23");
        ml2.q1 q1Var = ml2.q1.f327812e;
        this.G = kz5.c1.i(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, lVar17, lVar18, new jz5.l("com.tencent.mm.plugin.finder.search.FinderContactSearchUI", "temp_3"), new jz5.l("FinderContactSearchUI", "temp_3"), new jz5.l("com.tencent.mm.plugin.finder.search.FinderFeedSearchUI", "6"), new jz5.l("FinderFeedSearchUI", "6"), new jz5.l("com.tencent.mm.plugin.finder.feed.ui.FinderAllTimelineUI", "280"), new jz5.l("com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI", "5"));
        this.H = kz5.c1.i(new jz5.l("com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment", "17"), new jz5.l("FinderFollowTabFragment", "17"), new jz5.l("com.tencent.mm.plugin.finder.ui.fragment.FinderFriendTabFragment", "18"), new jz5.l("FinderFriendTabFragment", "18"), new jz5.l("com.tencent.mm.plugin.finder.ui.fragment.FinderMachineTabFragment", "20"), new jz5.l("FinderMachineTabFragment", "20"), new jz5.l("com.tencent.mm.plugin.finder.ui.fragment.FinderLbsSameCityTabFragment", "353"), new jz5.l("FinderLbsSameCityTabFragment", "353"), new jz5.l("com.tencent.mm.plugin.finder.ui.fragment.FinderNativeDramaTabFragment", "397"), new jz5.l("FinderNativeDramaTabFragment", "397"));
        this.I = ml2.i4.f327561f;
        this.f328285J = ml2.w1.f328178h;
        this.L = 1L;
        this.P = ml2.x3.f328222e;
        this.T = new ml2.k5(null, null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, null, 33554431, null);
        this.Z = new java.util.LinkedList();
        this.f328289b0 = ml2.m3.f327713e;
        this.f328291c0 = y3Var;
        this.f328293d0 = new java.util.concurrent.ConcurrentHashMap();
        this.f328295e0 = ml2.l1.f327681e;
        this.f328299g0 = new cl0.e();
    }

    public static void o(ml2.y4 y4Var, ml2.x1 x1Var, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            ml2.i4 i4Var = ml2.i4.f327560e;
            i17 = 0;
        }
        if ((i18 & 4) != 0) {
            str = "";
        }
        y4Var.n(x1Var, i17, str);
    }

    public final void a(java.lang.String key, java.lang.String str) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f328293d0;
        if (str == null) {
            str = "";
        }
        concurrentHashMap.put(key, str);
    }

    public final java.lang.String b() {
        gk2.e eVar = gk2.e.f272471n;
        long j17 = eVar != null ? ((mm2.e1) eVar.a(mm2.e1.class)).f328983m : 0L;
        if (j17 == 0) {
            return this.T.f327655b;
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String q17 = b52.b.q(j17);
        kotlin.jvm.internal.o.d(q17);
        return q17;
    }

    public final java.lang.String c() {
        r45.nw1 nw1Var;
        gk2.e eVar = gk2.e.f272471n;
        long j17 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? -1L : nw1Var.getLong(0);
        if (j17 == -1) {
            return this.T.f327654a;
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String q17 = b52.b.q(j17);
        kotlin.jvm.internal.o.d(q17);
        return q17;
    }

    public final java.lang.String d() {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc;
        gk2.e eVar = gk2.e.f272471n;
        if (eVar == null || (finderObjectDesc = ((mm2.e1) eVar.a(mm2.e1.class)).f328991u) == null || (str = finderObjectDesc.getDescription()) == null) {
            str = "";
        }
        java.lang.String b17 = fp.s0.b(str, com.tencent.mapsdk.internal.rv.f51270c);
        kotlin.jvm.internal.o.f(b17, "encode(...)");
        return b17;
    }

    public final long e(java.lang.String str, long j17) {
        boolean b17;
        boolean b18;
        boolean b19;
        boolean b27;
        boolean b28;
        ml2.q1 q1Var = ml2.q1.f327812e;
        boolean z17 = true;
        if (kotlin.jvm.internal.o.b(str, "temp_11")) {
            b17 = true;
        } else {
            ml2.q1 q1Var2 = ml2.q1.f327812e;
            b17 = kotlin.jvm.internal.o.b(str, "temp_15");
        }
        if (b17) {
            b18 = true;
        } else {
            ml2.q1 q1Var3 = ml2.q1.f327812e;
            b18 = kotlin.jvm.internal.o.b(str, "temp_16");
        }
        if (b18) {
            b19 = true;
        } else {
            ml2.o2[] o2VarArr = ml2.o2.f327772d;
            b19 = kotlin.jvm.internal.o.b(str, "5");
        }
        if (b19) {
            b27 = true;
        } else {
            ml2.o2[] o2VarArr2 = ml2.o2.f327772d;
            b27 = kotlin.jvm.internal.o.b(str, "6");
        }
        if (b27) {
            b28 = true;
        } else {
            ml2.o2[] o2VarArr3 = ml2.o2.f327772d;
            b28 = kotlin.jvm.internal.o.b(str, "15");
        }
        if (!b28) {
            ml2.o2[] o2VarArr4 = ml2.o2.f327772d;
            z17 = kotlin.jvm.internal.o.b(str, "7");
        }
        if (z17) {
            ml2.i4 i4Var = ml2.i4.f327560e;
            return 5;
        }
        ml2.o2[] o2VarArr5 = ml2.o2.f327772d;
        kotlin.jvm.internal.o.b(str, "9");
        return j17;
    }

    public final java.lang.String f() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return xy2.c.e(context);
    }

    public final ml2.k5 g() {
        return this.T;
    }

    public final java.lang.String h() {
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        return Ri == null ? "" : Ri;
    }

    public final java.lang.String i() {
        gk2.e eVar = gk2.e.f272471n;
        java.lang.String str = eVar != null ? ((mm2.f6) eVar.a(mm2.f6.class)).A : null;
        if (android.text.TextUtils.isEmpty(str)) {
            str = this.f328292d;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.LiveReportConfig", "get shopAppid=" + str);
        return str == null ? "" : str;
    }

    public final boolean j() {
        return this.V;
    }

    public final int k() {
        return hc2.s.f(ya2.h.f460484a.b(f())) ? 1 : 0;
    }

    public final int l(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        return hc2.s.f(ya2.h.f460484a.b(str)) ? 1 : 0;
    }

    public final void m(ml2.y3 value) {
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.LiveReportConfig", "launcherSrc set : " + value);
        this.f328317y = value;
    }

    public final void n(ml2.x1 clickType, int i17, java.lang.String commenScene) {
        kotlin.jvm.internal.o.g(clickType, "clickType");
        kotlin.jvm.internal.o.g(commenScene, "commenScene");
        ml2.i4 i4Var = ml2.i4.f327566n;
        if (i17 == 6) {
            this.I = i4Var;
            return;
        }
        switch (clickType.ordinal()) {
            case 3:
            case 4:
            case 6:
                if (kotlin.jvm.internal.o.b(commenScene, "37") || kotlin.jvm.internal.o.b(commenScene, java.lang.String.valueOf(ml2.q1.f327813f)) || kotlin.jvm.internal.o.b(commenScene, java.lang.String.valueOf(ml2.q1.f327812e))) {
                    this.I = ml2.i4.f327565m;
                    return;
                } else {
                    this.I = ml2.i4.f327561f;
                    return;
                }
            case 5:
            case 7:
            default:
                this.I = ml2.i4.f327560e;
                return;
            case 8:
                this.I = ml2.i4.f327564i;
                return;
            case 9:
                this.I = ml2.i4.f327562g;
                return;
            case 10:
                this.I = ml2.i4.f327563h;
                return;
        }
    }

    public final void p() {
        java.util.HashMap hashMap = this.T.f327675v;
        if (hashMap.isEmpty()) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((java.util.LinkedList) ((java.util.Map.Entry) it.next()).getValue()).iterator();
            while (it6.hasNext()) {
                ml2.u0 u0Var = (ml2.u0) it6.next();
                if (!u0Var.f328030b) {
                    u0Var.f328030b = true;
                    long j17 = currentTimeMillis - u0Var.f328029a;
                    if (j17 <= 0) {
                        j17 = 0;
                    }
                    u0Var.f328029a = j17;
                }
            }
        }
    }
}
