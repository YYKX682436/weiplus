package st2;

/* loaded from: classes3.dex */
public final class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f412313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f412314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f412315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412316g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412317h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412318i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f412319m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412320n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f412321o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f412322p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo f412323q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ st2.h2 f412324r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412325s;

    public g2(int i17, com.tencent.mm.plugin.finder.live.view.k0 k0Var, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, boolean z17, boolean z18, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo, st2.h2 h2Var, java.lang.String str5) {
        this.f412313d = i17;
        this.f412314e = k0Var;
        this.f412315f = j17;
        this.f412316g = str;
        this.f412317h = str2;
        this.f412318i = str3;
        this.f412319m = i18;
        this.f412320n = str4;
        this.f412321o = z17;
        this.f412322p = z18;
        this.f412323q = customSubjectInfo;
        this.f412324r = h2Var;
        this.f412325s = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        st2.h2 h2Var;
        int i17;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig shareActionConfig;
        l81.b1 b1Var = new l81.b1();
        int i18 = this.f412313d;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f412314e;
        long j17 = this.f412315f;
        java.lang.String str3 = this.f412316g;
        java.lang.String str4 = this.f412317h;
        java.lang.String str5 = this.f412318i;
        int i19 = this.f412319m;
        java.lang.String str6 = this.f412320n;
        boolean z17 = this.f412321o;
        boolean z18 = this.f412322p;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo = this.f412323q;
        st2.h2 h2Var2 = this.f412324r;
        java.lang.String str7 = this.f412325s;
        cm2.m0 m0Var = null;
        if (i18 == 1) {
            java.util.List a17 = ((mm2.f6) k0Var.getBuContext().a(mm2.f6.class)).f329039o.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
            while (it.hasNext()) {
                java.lang.String str8 = str7;
                java.lang.Object next = it.next();
                java.util.Iterator it6 = it;
                if (next instanceof cm2.m0) {
                    arrayList.add(next);
                }
                str7 = str8;
                it = it6;
            }
            str = str7;
            java.util.Iterator it7 = arrayList.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    h2Var = h2Var2;
                    break;
                }
                java.lang.Object next2 = it7.next();
                h2Var = h2Var2;
                if (((cm2.m0) next2).f43369w == j17) {
                    m0Var = next2;
                    break;
                }
                h2Var2 = h2Var;
            }
            m0Var = m0Var;
        } else {
            str = str7;
            h2Var = h2Var2;
        }
        cm2.m0 m0Var2 = m0Var;
        b1Var.f317014b = str3;
        b1Var.f317022f = str4;
        b1Var.f317032k = zl2.r4.f473950a.w1() ? 1176 : 1177;
        b1Var.f317034l = str5;
        k91.s2 s2Var = i19 == 0 ? k91.s2.f305760d : k91.s2.f305761e;
        if (kotlin.jvm.internal.o.b(str6, "halfPage")) {
            float f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
            if (com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation == 2) {
                f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
            }
            i17 = (int) ((ae2.in.f3688a.h0() / 100.0f) * f17);
        } else {
            i17 = -1;
        }
        java.lang.String str9 = str;
        st2.h2 h2Var3 = h2Var;
        b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, i17, s2Var, false, null, false, null, z17 ? k91.t2.f305767e : k91.t2.f305768f, false, z17, null, null, false, false, null, false, 0, null, 0, 0, 0, z18, false, false, null, false, customSubjectInfo, 0, false, null, true, 0, false, z18, false, false, null, null, null, false, null, null, false, -1142948488, 2045, null);
        if (i18 == 1) {
            com.tencent.mars.xlog.Log.i(h2Var3.f412356a, "share item:" + m0Var2);
            if (m0Var2 != null) {
                com.tencent.mm.plugin.appbrand.config.l e17 = b1Var.G.e();
                e17.f77541u = st2.c2.f412249a.b(k0Var.getBuContext(), m0Var2.f43368v, m0Var2.E);
                b1Var.G = e17.a();
            }
        }
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Dj(str9, b1Var);
        dk2.q4 q4Var = dk2.q4.f233938a;
        if (i17 != -1) {
            android.content.Context context = k0Var.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            q4Var.n(context, k0Var.getBuContext(), b1Var, k0Var);
            return;
        }
        zl2.b0 b0Var = zl2.b0.f473663a;
        java.lang.String str10 = ((mm2.c1) k0Var.getBuContext().a(mm2.c1.class)).f328852o;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = b1Var.G;
        if (halfScreenConfig == null || (shareActionConfig = halfScreenConfig.f77373w) == null || (str2 = shareActionConfig.f77391e) == null) {
            str2 = "";
        }
        b0Var.a(str10, str2, b1Var);
        android.content.Context context2 = k0Var.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        dk2.q4.m(q4Var, context2, k0Var.getBuContext(), b1Var, true, null, 16, null);
    }
}
