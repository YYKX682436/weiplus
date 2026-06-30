package pn2;

/* loaded from: classes3.dex */
public final class s implements pn2.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f357012d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f357013e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f357014f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f357015g;

    /* renamed from: h, reason: collision with root package name */
    public pn2.b f357016h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f357017i;

    /* renamed from: m, reason: collision with root package name */
    public int f357018m;

    /* renamed from: n, reason: collision with root package name */
    public final int f357019n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f357020o;

    /* renamed from: p, reason: collision with root package name */
    public final int f357021p;

    /* renamed from: q, reason: collision with root package name */
    public final int f357022q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f357023r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f357024s;

    /* renamed from: t, reason: collision with root package name */
    public int f357025t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f357026u;

    public s(android.content.Context context, gk2.e liveData, qo0.c statusMonitor) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f357012d = context;
        this.f357013e = liveData;
        this.f357014f = statusMonitor;
        this.f357015g = "FinderLiveLotteryBubblePresenter";
        this.f357017i = "";
        this.f357019n = 10;
        ae2.in inVar = ae2.in.f3688a;
        this.f357021p = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3791k2).getValue()).r()).intValue();
        this.f357022q = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3801l2).getValue()).r()).intValue();
        this.f357023r = "LOTTERY_BUBBLE_CLOSE_TAG";
        this.f357024s = new pn2.h(this);
        this.f357026u = new com.tencent.mm.sdk.platformtools.b4("LiveLotteryBubble::Timer", (com.tencent.mm.sdk.platformtools.a4) new pn2.n(this), true);
    }

    public static final pn2.d0 c(pn2.s sVar, km2.z lotteryInfoWrapper) {
        int i17;
        int i18;
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.cz1 cz1Var3;
        r45.cz1 cz1Var4;
        sVar.getClass();
        pn2.d0 d0Var = new pn2.d0(false, false, 0, 0, false, 31, null);
        boolean z17 = false;
        java.lang.String str = null;
        java.lang.String string = (lotteryInfoWrapper == null || (cz1Var4 = lotteryInfoWrapper.f309232d) == null) ? null : cz1Var4.getString(0);
        gk2.e eVar = sVar.f357013e;
        km2.z zVar = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
        if (zVar != null && (cz1Var3 = zVar.f309232d) != null) {
            str = cz1Var3.getString(0);
        }
        boolean z18 = true;
        if (((on2.z2) eVar.a(on2.z2.class)).f347092m != null) {
            if ((string == null || string.length() == 0) || kotlin.jvm.internal.o.b(string, str)) {
                on2.z2 z2Var = (on2.z2) eVar.a(on2.z2.class);
                kotlin.jvm.internal.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
                pm0.v.X(new on2.x2(lotteryInfoWrapper, z2Var));
                km2.z zVar2 = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
                i17 = (zVar2 == null || (cz1Var2 = zVar2.f309232d) == null) ? 0 : cz1Var2.getInteger(8);
                km2.z zVar3 = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
                i18 = zVar3 != null ? zVar3.f309229a : 0;
                if (i17 == i18) {
                    z18 = false;
                } else {
                    if (i18 != 1 && (i18 != 2 || (i17 != 3 && i17 != 4))) {
                        z18 = false;
                    }
                    boolean z19 = z18;
                    z18 = false;
                    z17 = z19;
                }
                d0Var.f356985a = z17;
                d0Var.f356986b = z18;
                d0Var.f356988d = i17;
                d0Var.f356987c = i18;
                return d0Var;
            }
        }
        on2.z2 z2Var2 = (on2.z2) eVar.a(on2.z2.class);
        kotlin.jvm.internal.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
        pm0.v.X(new on2.u2(z2Var2, lotteryInfoWrapper));
        km2.z zVar4 = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
        int integer = (zVar4 == null || (cz1Var = zVar4.f309232d) == null) ? 0 : cz1Var.getInteger(8);
        km2.z zVar5 = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
        int i19 = zVar5 != null ? zVar5.f309229a : 0;
        sVar.f357018m = 0;
        i17 = integer;
        i18 = i19;
        z17 = true;
        d0Var.f356985a = z17;
        d0Var.f356986b = z18;
        d0Var.f356988d = i17;
        d0Var.f356987c = i18;
        return d0Var;
    }

    public final void f() {
        boolean z17;
        dk2.xf finderLiveAssistant;
        java.lang.String str;
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.fz1 fz1Var;
        gk2.e eVar = this.f357013e;
        km2.z zVar = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
        if (zVar == null || (cz1Var2 = zVar.f309232d) == null || (fz1Var = (r45.fz1) cz1Var2.getCustom(12)) == null || !fz1Var.getBoolean(2)) {
            z17 = true;
        } else {
            java.lang.String string = fz1Var.getString(1);
            boolean z18 = string == null || string.length() == 0;
            android.content.Context context = this.f357012d;
            db5.t7.m(context, z18 ? context.getResources().getString(com.tencent.mm.R.string.drx) : fz1Var.getString(1));
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i(this.f357015g, "customerOpenCard checkEnableOpenCard false!");
            return;
        }
        km2.z zVar2 = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
        boolean z19 = zVar2 != null && zVar2.f309229a == 3;
        qo0.c cVar = this.f357014f;
        if (z19) {
            v();
            qo0.b bVar = qo0.b.f365393o3;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_LOTTERY_CARD_SHOW_STATUS", false);
            cVar.statusChange(bVar, bundle);
            return;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
        if (k0Var == null || (finderLiveAssistant = k0Var.getFinderLiveAssistant()) == null) {
            return;
        }
        km2.z zVar3 = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
        if (zVar3 == null || (cz1Var = zVar3.f309232d) == null || (str = cz1Var.getString(0)) == null) {
            str = "";
        }
        ((dk2.r4) finderLiveAssistant).N(str, null, new pn2.i(this));
    }

    public final void g(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f357015g, str + ":endTimer remainTimeSecond:" + this.f357025t + ", timerLotteryId:" + this.f357017i);
        this.f357026u.d();
    }

    public final int h(boolean z17, r45.cz1 cz1Var, int i17) {
        int i18 = i17 * 1000;
        if (z17) {
            return i18;
        }
        int e17 = c01.id.e();
        int integer = e17 - (cz1Var != null ? cz1Var.getInteger(2) : e17);
        if (integer <= 0) {
            return i18;
        }
        if (1 <= integer && integer < i17) {
            return (i17 - integer) * 1000;
        }
        com.tencent.mars.xlog.Log.i(this.f357015g, "getBubbleStayDuration serverTime:" + e17 + ",finishDuration:" + integer);
        return 0;
    }

    public boolean i() {
        r45.gz1 gz1Var;
        km2.z zVar = ((on2.z2) this.f357013e.a(on2.z2.class)).f347092m;
        r45.cz1 cz1Var = zVar != null ? zVar.f309232d : null;
        boolean z17 = (cz1Var == null || (gz1Var = (r45.gz1) cz1Var.getCustom(14)) == null || gz1Var.getInteger(0) != 1) ? false : true;
        ae2.in inVar = ae2.in.f3688a;
        return z17 && (((java.lang.Number) ae2.in.X6.r()).intValue() == 1);
    }

    public void m() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = this.f357012d;
        gk2.e eVar = this.f357013e;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491826ec5);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = this.f357012d.getString(com.tencent.mm.R.string.f491824ec3);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        if (r4Var.B(context, eVar, string, string2, new pn2.j(this))) {
            return;
        }
        p();
    }

    @Override // fs2.a
    public void onAttach(java.lang.Object obj) {
        pn2.b callback = (pn2.b) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(this.f357015g, "onAttach");
        this.f357016h = callback;
        pn2.c0 c0Var = (pn2.c0) callback;
        com.tencent.mars.xlog.Log.i(c0Var.f356977m, "initView!");
        android.view.View t17 = c0Var.t(com.tencent.mm.R.id.f484710f84);
        if (t17 != null) {
            t17.setOnClickListener(new pn2.v(c0Var));
        }
        c0Var.L();
    }

    @Override // fs2.a
    public void onDetach() {
        com.tencent.mars.xlog.Log.i(this.f357015g, "onDetach");
        pn2.b bVar = this.f357016h;
        if (bVar != null) {
            ((pn2.c0) bVar).G();
        }
        this.f357016h = null;
        g("onDetach");
        ((ku5.t0) ku5.t0.f312615d).A(this.f357023r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        java.lang.String str;
        java.lang.String string;
        xu2.u uVar;
        xu2.v vVar;
        f();
        gk2.e eVar = this.f357013e;
        boolean M7 = ((mm2.c1) eVar.a(mm2.c1.class)).M7();
        qo0.c cVar = this.f357014f;
        if (M7) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.getPlugin(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
                vVar.a();
                vVar.c(2019);
            }
        }
        if (cVar.getLiveRole() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327602r, "");
            return;
        }
        if (cVar.getLiveRole() == 0) {
            pn2.b bVar = this.f357016h;
            ie2.a aVar = bVar instanceof ie2.a ? (ie2.a) bVar : null;
            int i17 = (aVar != null && aVar.x()) == true ? 2 : 1;
            km2.z zVar = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
            r45.cz1 cz1Var = zVar != null ? zVar.f309232d : null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (cz1Var == null || (str = cz1Var.getString(0)) == null) {
                str = "";
            }
            jSONObject.put("lotteryid", str);
            jSONObject.put("is_flash_pic", i() ? 1 : 0);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.ek((ml2.r0) c17, ml2.p4.f327795f, (cz1Var == null || (string = cz1Var.getString(4)) == null) ? "" : string, null, i17, jSONObject, 4, null);
        }
    }

    public final void q(int i17) {
        g("onTimerEnd");
        km2.z zVar = ((on2.z2) this.f357013e.a(on2.z2.class)).f347092m;
        if (zVar != null && zVar.f309229a == 1) {
            s(true, false, 2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0513  */
    /* JADX WARN: Type inference failed for: r12v21, types: [int] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(boolean r19, boolean r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.s.s(boolean, boolean, int, boolean):void");
    }

    public final void v() {
        dk2.xf finderLiveAssistant;
        java.lang.String str;
        r45.cz1 cz1Var;
        qo0.c cVar = this.f357014f;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
        if (k0Var == null || (finderLiveAssistant = k0Var.getFinderLiveAssistant()) == null) {
            return;
        }
        km2.z zVar = ((on2.z2) ((mm2.c1) this.f357013e.a(mm2.c1.class)).business(on2.z2.class)).f347092m;
        if (zVar == null || (cz1Var = zVar.f309232d) == null || (str = cz1Var.getString(0)) == null) {
            str = "";
        }
        ((dk2.r4) finderLiveAssistant).N(str, null, new pn2.q(this));
    }
}
