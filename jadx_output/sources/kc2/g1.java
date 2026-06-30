package kc2;

/* loaded from: classes15.dex */
public final class g1 implements zy2.w7 {
    public kc2.e0 A;
    public boolean B;
    public int C;

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f306377a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f306378b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f306379c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f306380d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f306381e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f306382f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f306383g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f306384h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f306385i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f306386j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f306387k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f306388l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f306389m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f306390n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f306391o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f306392p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f306393q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f306394r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f306395s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f306396t;

    /* renamed from: u, reason: collision with root package name */
    public int f306397u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f306398v;

    /* renamed from: w, reason: collision with root package name */
    public int f306399w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.RedDotFeatureLogStruct f306400x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f306401y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f306402z;

    public g1(zy2.fa redDotManager) {
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        this.f306377a = redDotManager;
        this.f306378b = jz5.h.b(kc2.i0.f306415d);
        this.f306379c = jz5.h.b(kc2.r0.f306482d);
        jz5.g b17 = jz5.h.b(new kc2.p0(this));
        this.f306380d = b17;
        this.f306381e = jz5.h.b(kc2.y0.f306543d);
        this.f306382f = jz5.h.b(kc2.f1.f306362d);
        this.f306383g = jz5.h.b(kc2.d1.f306356d);
        this.f306384h = jz5.h.b(kc2.k0.f306446d);
        this.f306385i = jz5.h.b(kc2.m0.f306455d);
        this.f306386j = jz5.h.b(kc2.f0.f306361d);
        this.f306387k = jz5.h.b(new kc2.b1(this));
        this.f306388l = jz5.h.b(new kc2.o0(this));
        this.f306389m = jz5.h.b(new kc2.n0(this));
        this.f306390n = jz5.h.b(new kc2.t0(this));
        this.f306391o = jz5.h.b(new kc2.u0(this));
        this.f306392p = jz5.h.b(new kc2.a1(this));
        this.f306393q = jz5.h.b(new kc2.q0(this));
        this.f306394r = jz5.h.b(new kc2.j0(this));
        this.f306395s = jz5.h.b(new kc2.g0(this));
        this.f306396t = "";
        this.f306398v = "";
        com.tencent.mm.app.w.INSTANCE.a((kc2.r) ((jz5.n) b17).getValue());
        k().post(new kc2.s0(this));
    }

    public int a() {
        kc2.q f17 = f();
        kc2.g gVar = kc2.g.f306367i;
        f17.getClass();
        java.util.List list = f17.f306477h;
        int i17 = 0;
        if (!list.isEmpty() && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                if ((((kc2.g) it.next()) != gVar) && (i18 = i18 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
            i17 = i18;
        }
        if (i17 > 0) {
            return i17;
        }
        java.util.List e17 = com.tencent.mm.plugin.finder.extension.reddot.l5.H.e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : e17) {
            if (com.tencent.mm.plugin.finder.extension.reddot.y8.f106036a.a("FinderKaraInfoManager", (java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public void b(boolean z17, com.tencent.mm.plugin.finder.extension.reddot.b3 actionType, com.tencent.mm.ui.base.preference.h0 h0Var) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        if (z17) {
            kc2.e0 e0Var = this.A;
            if (e0Var != null) {
                k().removeCallbacks(e0Var);
                java.lang.String str = e0Var.f306359e;
                this.A = null;
                com.tencent.mars.xlog.Log.i("FinderKaraInfoManager", "immediate run watch task,key=" + str);
                q(kc2.w1.f306515f, str);
            }
            kc2.q f17 = f();
            if (f17.f306478i.compareAndSet(true, false)) {
                f17.f306471b.post(new kc2.p(f17));
            }
        }
        boolean z18 = z17 && actionType == com.tencent.mm.plugin.finder.extension.reddot.b3.f105413d;
        if (z18) {
            java.lang.String valueOf = java.lang.String.valueOf(c01.id.c());
            com.tencent.mars.xlog.Log.i("FinderKaraInfoManager", "findPageSessionId from " + this.f306398v + " to " + valueOf);
            this.f306398v = valueOf;
            r(0);
        }
        if (this.f306402z != z17) {
            if (z17) {
                r(this.f306399w + 1);
                k().post(new kc2.l0(this));
            } else {
                int integer = ((com.tencent.mm.plugin.finder.extension.reddot.l5) ((com.tencent.mm.plugin.finder.extension.reddot.x2) this.f306377a).f105977e).v().getInteger(1);
                com.tencent.mars.xlog.Log.i("FinderKaraInfoManager", "exitFindTab lastClickPreferenceKey=" + this.f306396t + ",stayMinSec=" + integer);
                if (kc2.g.f306363e.a(this.f306396t) != kc2.g.f306366h) {
                    c(false, this.f306396t);
                    if (this.A != null) {
                        k().removeCallbacks(this.A);
                    }
                    this.A = new kc2.e0(new java.lang.ref.WeakReference(this), this.f306396t);
                    k().postDelayed(this.A, integer * 1000);
                } else {
                    q(kc2.w1.f306515f, this.f306396t);
                }
            }
        }
        this.f306402z = z17;
        if (z18) {
            k().post(new kc2.h0(this));
        }
    }

    public final void c(boolean z17, java.lang.String str) {
        jz5.f0 f0Var;
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("FinderKaraInfoManager", "findTabExposeAction expose=" + z17 + " clickPreferenceKey=" + str);
        if (str.length() == 0) {
            return;
        }
        if (z17) {
            int e17 = c01.id.e();
            d().a(new kc2.a(kc2.k.f306429g, e17));
            com.tencent.mars.xlog.Log.i("FinderKaraInfoManager", "onFindTabBack(" + java.lang.Thread.currentThread().getName() + ") selectTime=" + e17);
        }
        boolean z18 = !z17;
        java.util.Iterator it = ((java.util.LinkedList) ((jz5.n) this.f306394r).getValue()).iterator();
        while (true) {
            f0Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kc2.c0) ((zy2.v7) obj)).f306336f.contains(str)) {
                    break;
                }
            }
        }
        zy2.v7 v7Var = (zy2.v7) obj;
        if (v7Var != null) {
            if (!z18) {
                kc2.c0 c0Var = (kc2.c0) v7Var;
                c0Var.f306332b.post(new kc2.z(c0Var));
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var != null || kotlin.jvm.internal.o.b(str, "album_dyna_photo_ui_title")) {
            return;
        }
        com.tencent.mars.xlog.Log.e("FinderKaraInfoManager", "findTabExposeAction businessManager is null!");
    }

    public final kc2.c d() {
        return (kc2.c) ((jz5.n) this.f306386j).getValue();
    }

    public final int e() {
        if (ph.t.f354283k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f354283k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f354283k;
        kotlin.jvm.internal.o.d(tVar);
        return tVar.c().b();
    }

    public final kc2.q f() {
        return (kc2.q) ((jz5.n) this.f306395s).getValue();
    }

    public final boolean g() {
        return ((java.lang.Boolean) ((jz5.n) this.f306378b).getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03d8  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r3v18, types: [kc2.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.feature.api.discover.DiscoveryReddotFeatures h() {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kc2.g1.h():com.tencent.mm.feature.api.discover.DiscoveryReddotFeatures");
    }

    public final kc2.a2 i() {
        return (kc2.a2) ((jz5.n) this.f306384h).getValue();
    }

    public final kc2.a2 j() {
        return (kc2.a2) ((jz5.n) this.f306385i).getValue();
    }

    public final com.tencent.mm.sdk.platformtools.n3 k() {
        return (com.tencent.mm.sdk.platformtools.n3) this.f306379c.getValue();
    }

    public final boolean l() {
        if (ph.t.f354283k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f354283k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f354283k;
        kotlin.jvm.internal.o.d(tVar);
        tVar.c().f();
        return false;
    }

    public final kc2.a2 m() {
        return (kc2.a2) ((jz5.n) this.f306381e).getValue();
    }

    public final kc2.v1 n() {
        return (kc2.v1) ((jz5.n) this.f306387k).getValue();
    }

    public final kc2.a2 o() {
        return (kc2.a2) ((jz5.n) this.f306383g).getValue();
    }

    public final kc2.a2 p() {
        return (kc2.a2) ((jz5.n) this.f306382f).getValue();
    }

    public void q(kc2.w1 source, java.lang.String clickPreferenceKey) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(clickPreferenceKey, "clickPreferenceKey");
        if (!gm0.j1.a() || this.f306400x == null) {
            return;
        }
        k().post(new kc2.z0(this, clickPreferenceKey, source));
    }

    public final void r(int i17) {
        com.tencent.mars.xlog.Log.i("FinderKaraInfoManager", "findPageClickCnt from " + this.f306399w + " to " + i17);
        this.f306399w = i17;
    }

    public int s() {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().O(false, c01.e2.f37132p, c01.z1.r(), "weixin", "helper_entry", "filehelper");
    }
}
