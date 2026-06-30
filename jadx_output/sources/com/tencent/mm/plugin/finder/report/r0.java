package com.tencent.mm.plugin.finder.report;

/* loaded from: classes15.dex */
public abstract class r0 extends fc2.d {

    /* renamed from: q, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.o0 f125279q = new com.tencent.mm.plugin.finder.report.o0(null);

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f125280r = "";

    /* renamed from: s, reason: collision with root package name */
    public static int f125281s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f125282t = "";

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.MMFragmentActivity f125283g;

    /* renamed from: h, reason: collision with root package name */
    public r45.qt2 f125284h;

    /* renamed from: i, reason: collision with root package name */
    public vg3.t3 f125285i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.report.p0 f125286m;

    /* renamed from: n, reason: collision with root package name */
    public final long f125287n;

    /* renamed from: o, reason: collision with root package name */
    public final kw2.m0 f125288o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f125289p;

    public r0(com.tencent.mm.ui.MMFragmentActivity activity, r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f125283g = activity;
        this.f125284h = contextObj;
        this.f125287n = 1277L;
        this.f125288o = new kw2.m0(contextObj);
        ((ag0.o) ((bg0.w) i95.n0.c(bg0.w.class))).getClass();
        if (!com.tencent.mm.plugin.vlog.model.e0.f175585a) {
            com.tencent.mm.plugin.vlog.model.e0.f175585a = true;
            pm0.v.K(null, new com.tencent.mm.plugin.vlog.model.d0(activity));
        }
        this.f125286m = new com.tencent.mm.plugin.finder.report.p0();
        this.f125285i = new com.tencent.mm.plugin.finder.report.n0(this);
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        Di.f195119f.v(this.f125285i);
        this.f125289p = true;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return event instanceof ec2.f;
    }

    @Override // fc2.d
    public void G0(fc2.a event) {
        nk4.a aVar;
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        java.lang.String description;
        com.tencent.mm.plugin.finder.storage.FeedData feedData2;
        java.lang.String nickName;
        r45.mb4 e17;
        r45.mb4 e18;
        r45.vf2 f17;
        java.lang.String string;
        r45.vf2 f18;
        r45.vf2 f19;
        java.lang.String path;
        java.lang.String n17;
        java.lang.String n18;
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject;
        com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject2;
        kotlin.jvm.internal.o.g(event, "event");
        if (this.f125284h.getInteger(5) == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowReporter", "[onEventHappen] invalid scene");
            return;
        }
        if (event instanceof ec2.f) {
            ec2.f fVar = (ec2.f) event;
            kw2.m0 m0Var = this.f125288o;
            int i17 = fVar.f250959d;
            if (i17 == 33) {
                long j17 = fVar.f250965j;
                java.lang.Object obj = event.f260936c;
                boolean z17 = obj instanceof nk4.c;
                nk4.c cVar = z17 ? (nk4.c) obj : null;
                r9 = cVar != null ? cVar.f338067d : 0;
                nk4.c cVar2 = z17 ? (nk4.c) obj : null;
                java.lang.Object obj2 = cVar2 != null ? cVar2.f338068e : null;
                m0Var.getClass();
                kw2.d0 d0Var = (kw2.d0) m0Var.f313059d.get(java.lang.Long.valueOf(j17));
                if (d0Var != null) {
                    long j18 = event.f260934a;
                    if (r9 == 3) {
                        if (d0Var.T0 == 0) {
                            d0Var.T0 = j18 - d0Var.f312924l;
                            return;
                        }
                        return;
                    } else if (r9 == 4) {
                        if (d0Var.S0 == 0) {
                            d0Var.S0 = j18 - d0Var.f312924l;
                            return;
                        }
                        return;
                    } else if (r9 == 6) {
                        d0Var.U0 = 1;
                        return;
                    } else {
                        if (r9 == 7 && (aVar = d0Var.I0) != null) {
                            aVar.F = obj2 instanceof org.json.JSONObject ? (org.json.JSONObject) obj2 : null;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            switch (i17) {
                case 1:
                    jx3.f.INSTANCE.idkeyStat(this.f125287n, 1L, 1L, false);
                    m0Var.A(new nk4.b(fVar.f250965j, event.f260934a, fVar.f250966k));
                    return;
                case 2:
                    jx3.f.INSTANCE.idkeyStat(this.f125287n, 2L, 1L, false);
                    m0Var.z(new nk4.b(fVar.f250965j, event.f260934a, fVar.f250966k));
                    return;
                case 3:
                    long j19 = fVar.f250965j;
                    long j27 = fVar.f250963h;
                    long j28 = fVar.f250964i;
                    java.lang.Object obj3 = event.f260936c;
                    nk4.r rVar = obj3 instanceof nk4.r ? (nk4.r) obj3 : null;
                    m0Var.v(new nk4.r(j19, j27, j28, rVar != null ? rVar.f338102f : 0L, event.f260934a, fVar.f250966k));
                    return;
                case 4:
                    jx3.f.INSTANCE.idkeyStat(this.f125287n, 0L, 1L, false);
                    long j29 = fVar.f250965j;
                    mn2.j4 j4Var = fVar.f250962g;
                    java.lang.String str2 = (j4Var == null || (n17 = j4Var.n()) == null) ? "" : n17;
                    mn2.j4 j4Var2 = fVar.f250962g;
                    java.lang.String str3 = (j4Var2 == null || (path = j4Var2.getPath()) == null) ? "" : path;
                    mn2.j4 j4Var3 = fVar.f250962g;
                    float integer = (j4Var3 == null || (f19 = j4Var3.f()) == null) ? 0.0f : f19.getInteger(6);
                    mn2.j4 j4Var4 = fVar.f250962g;
                    float integer2 = (j4Var4 == null || (f18 = j4Var4.f()) == null) ? 0.0f : f18.getInteger(7);
                    mn2.j4 j4Var5 = fVar.f250962g;
                    java.lang.String str4 = (j4Var5 == null || (f17 = j4Var5.f()) == null || (string = f17.getString(3)) == null) ? "" : string;
                    mn2.j4 j4Var6 = fVar.f250962g;
                    long integer3 = (j4Var6 == null || (e18 = j4Var6.e()) == null) ? 0L : e18.getInteger(3);
                    mn2.j4 j4Var7 = fVar.f250962g;
                    if (j4Var7 != null && (e17 = j4Var7.e()) != null) {
                        r10 = e17.getInteger(7);
                    }
                    long j37 = r10;
                    int i18 = fVar.f250969n;
                    int i19 = fVar.C;
                    cw2.wa waVar = fVar.f250960e;
                    java.lang.String str5 = (waVar == null || (feedData2 = waVar.f224099f) == null || (nickName = feedData2.getNickName()) == null) ? "-1" : nickName;
                    cw2.wa waVar2 = fVar.f250960e;
                    java.lang.String str6 = (waVar2 == null || (feedData = waVar2.f224099f) == null || (description = feedData.getDescription()) == null) ? "-1" : description;
                    int i27 = fVar.f250975t;
                    java.lang.Object obj4 = event.f260936c;
                    boolean z18 = obj4 instanceof nk4.e;
                    nk4.e eVar = z18 ? (nk4.e) obj4 : null;
                    int i28 = eVar != null ? eVar.f338082p : 0;
                    nk4.e eVar2 = z18 ? (nk4.e) obj4 : null;
                    m0Var.B(new nk4.e(j29, str2, str3, integer, integer2, str4, integer3, j37, i18, i19, str5, str6, i27, i28, (eVar2 == null || (str = eVar2.f338083q) == null) ? "" : str, event.f260934a, fVar.f250966k));
                    return;
                case 5:
                    m0Var.E(new nk4.b(fVar.f250965j, event.f260934a, fVar.f250966k));
                    return;
                case 6:
                    jx3.f.INSTANCE.idkeyStat(this.f125287n, 3L, 1L, false);
                    long j38 = fVar.f250965j;
                    mn2.j4 j4Var8 = fVar.f250962g;
                    m0Var.C(new nk4.o(j38, (j4Var8 == null || (n18 = j4Var8.n()) == null) ? "" : n18, fVar.f250978w, event.f260934a, fVar.f250966k));
                    return;
                case 7:
                    m0Var.s(new nk4.l(fVar.f250965j, event.f260934a, fVar.f250963h, fVar.f250964i, fVar.f250966k));
                    return;
                case 8:
                    m0Var.o(new nk4.h(fVar.f250965j, fVar.f250963h, fVar.f250964i, event.f260934a, fVar.f250966k));
                    return;
                case 9:
                    m0Var.D(new nk4.f(fVar.f250965j, event.f260934a, fVar.B, fVar.f250966k));
                    return;
                case 10:
                    long j39 = fVar.f250965j;
                    m0Var.getClass();
                    kw2.d0 d0Var2 = (kw2.d0) m0Var.f313059d.get(java.lang.Long.valueOf(j39));
                    if (d0Var2 != null) {
                        d0Var2.f312933p0 = 1;
                        return;
                    }
                    return;
                case 11:
                    m0Var.t(new nk4.m(fVar.f250965j, event.f260934a, fVar.f250978w, fVar.f250966k));
                    return;
                case 12:
                    long j47 = fVar.f250965j;
                    long j48 = event.f260934a;
                    r45.mb4 mb4Var = fVar.f250961f;
                    if (mb4Var != null && (finderMediaReportObject = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var.getCustom(69)) != null) {
                        r9 = finderMediaReportObject.getPlayDecoderType();
                    }
                    m0Var.q(new nk4.k(j47, j48, r9, fVar.f250976u, fVar.f250966k));
                    return;
                case 13:
                    long j49 = fVar.f250965j;
                    long j57 = fVar.f250963h;
                    long j58 = fVar.f250964i;
                    m0Var.getClass();
                    kw2.d0 d0Var3 = (kw2.d0) m0Var.f313059d.get(java.lang.Long.valueOf(j49));
                    if (d0Var3 == null || d0Var3.V != 0) {
                        return;
                    }
                    d0Var3.V = j57 + j58;
                    return;
                case 14:
                    m0Var.n(new nk4.g(fVar.f250965j, fVar.f250973r, event.f260934a, fVar.f250966k));
                    return;
                case 15:
                    nk4.s.c(m0Var, new nk4.i(fVar.f250965j, fVar.f250972q, fVar.f250973r, event.f260934a, fVar.f250966k), null, 2, null);
                    return;
                case 16:
                    nk4.s.d(m0Var, new nk4.b(fVar.f250965j, event.f260934a, fVar.f250966k), null, 2, null);
                    return;
                case 17:
                    long j59 = fVar.f250965j;
                    m0Var.getClass();
                    kw2.d0 d0Var4 = (kw2.d0) m0Var.f313059d.get(java.lang.Long.valueOf(j59));
                    if (d0Var4 != null) {
                        d0Var4.f312937r0 = 1;
                        return;
                    }
                    return;
                case 18:
                    m0Var.u(new nk4.n(fVar.f250965j, fVar.f250974s, event.f260934a, fVar.f250966k));
                    return;
                case 19:
                    long j66 = fVar.f250965j;
                    long j67 = event.f260934a;
                    r45.mb4 mb4Var2 = fVar.f250961f;
                    if (mb4Var2 != null && (finderMediaReportObject2 = (com.tencent.mm.protocal.protobuf.FinderMediaReportObject) mb4Var2.getCustom(69)) != null) {
                        r9 = finderMediaReportObject2.getPlayDecoderType();
                    }
                    m0Var.r(new nk4.k(j66, j67, r9, fVar.f250976u, fVar.f250966k));
                    return;
                case 20:
                    m0Var.w(new nk4.p(fVar.f250965j, fVar.f250977v, event.f260934a, fVar.f250966k));
                    return;
                case 21:
                    long j68 = fVar.f250965j;
                    int i29 = fVar.f250980y;
                    int i37 = fVar.A;
                    int i38 = fVar.f250981z;
                    m0Var.getClass();
                    kw2.d0 d0Var5 = (kw2.d0) m0Var.f313059d.get(java.lang.Long.valueOf(j68));
                    if (d0Var5 != null) {
                        long j69 = d0Var5.f312905b0 + 1;
                        d0Var5.f312905b0 = j69;
                        d0Var5.f312907c0 += i38;
                        d0Var5.f312909d0 += i37;
                        float f27 = (float) (j69 - 1);
                        float f28 = (float) j69;
                        d0Var5.f312911e0 = ((d0Var5.f312911e0 * f27) + i38) / f28;
                        d0Var5.f312913f0 = ((d0Var5.f312913f0 * f27) + i37) / f28;
                        if (i29 - i38 > 2) {
                            d0Var5.f312915g0++;
                        }
                        if (i29 - i37 > 2) {
                            d0Var5.f312917h0++;
                        }
                        d0Var5.f312919i0 = d0Var5.f312915g0 / f28;
                        d0Var5.f312921j0 = d0Var5.f312917h0 / f28;
                        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "videoFPS: " + i29 + " staticSeconds: " + d0Var5.f312905b0 + " decodeFps: " + d0Var5.f312911e0 + " renderFps: " + d0Var5.f312913f0 + " playDecodeStuckCount: " + d0Var5.f312915g0 + " playRenderStuckCount: " + d0Var5.f312917h0);
                        return;
                    }
                    return;
                default:
                    switch (i17) {
                        case 29:
                            m0Var.x(new nk4.q(fVar.f250965j, fVar.f250976u, event.f260934a, fVar.f250966k));
                            return;
                        case 30:
                            m0Var.p(new nk4.j(fVar.f250965j, event.f260934a, fVar.f250966k));
                            return;
                        case 31:
                            long j76 = fVar.f250965j;
                            java.lang.Object obj5 = event.f260936c;
                            nk4.d dVar = obj5 instanceof nk4.d ? (nk4.d) obj5 : null;
                            r9 = dVar != null ? dVar.f338069d : 0;
                            m0Var.getClass();
                            kw2.d0 d0Var6 = (kw2.d0) m0Var.f313059d.get(java.lang.Long.valueOf(j76));
                            if (d0Var6 != null) {
                                if (r9 == 1) {
                                    d0Var6.O0 = 1;
                                } else if (r9 == 2) {
                                    d0Var6.P0 = 1;
                                }
                                com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", m0Var.f("onActionMiniView", d0Var6) + " action:" + r9);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    @Override // fc2.d
    public void H0() {
        kw2.m0 m0Var = this.f125288o;
        for (java.util.Map.Entry entry : m0Var.f313059d.entrySet()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", m0Var.f("syncNotifyNotReportItem", (kw2.d0) entry.getValue()));
            m0Var.k((kw2.d0) entry.getValue());
            ni3.a1 a1Var = m0Var.f313065j;
            if (a1Var != null) {
                a1Var.g((kw2.d0) entry.getValue());
            }
        }
        pm0.v.O("FinderReporterThread", new com.tencent.mm.plugin.finder.report.q0(this));
    }

    public void I0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var, boolean z17, xg3.l0 l0Var) {
    }

    public final com.tencent.mm.ui.MMFragmentActivity J0() {
        return this.f125283g;
    }

    public final r45.qt2 L0() {
        return this.f125284h;
    }

    public final kw2.m0 M0() {
        return this.f125288o;
    }

    public final boolean N0() {
        return this.f125289p;
    }

    public void O0() {
        this.f125289p = false;
    }

    public final void P0(r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f125284h = contextObj;
        kw2.m0 m0Var = this.f125288o;
        m0Var.getClass();
        m0Var.f313056a = contextObj;
    }

    public void Q0() {
        this.f125289p = true;
    }

    public java.util.LinkedList R0() {
        return new java.util.LinkedList();
    }
}
