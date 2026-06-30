package n54;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a f335139a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f335140b;

    public static boolean a() {
        try {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landingpage_halfscreen_anim_notify, 1) > 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdHalfScreenLandingPageState", "isNotifyHalfScreenHeightChange, exp=" + th6.toString());
            return true;
        }
    }

    public static void b(boolean z17, boolean z18) {
        boolean a17 = a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onHalfScreenAnimationChange, isOpen=");
        sb6.append(z17);
        sb6.append(", isAnimBegin=");
        sb6.append(z18);
        sb6.append(", notify=");
        sb6.append(a17);
        sb6.append(", listener=");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = f335139a;
        sb6.append(aVar == null ? "null" : java.lang.Integer.valueOf(aVar.hashCode()));
        com.tencent.mars.xlog.Log.i("AdHalfScreenLandingPageState", sb6.toString());
        if (!a17 || f335139a == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new n54.h(z17, z18));
    }

    public static void c(float f17) {
        boolean a17 = a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onHalfScreenHeightChange, percent=");
        sb6.append(f17);
        sb6.append(", notify=");
        sb6.append(a17);
        sb6.append(", listener=");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = f335139a;
        sb6.append(aVar == null ? "null" : java.lang.Integer.valueOf(aVar.hashCode()));
        com.tencent.mars.xlog.Log.i("AdHalfScreenLandingPageState", sb6.toString());
        ((ku5.t0) ku5.t0.f312615d).B(new n54.g(a17, f17));
    }

    public static void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("AdHalfScreenLandingPageState", "setHalfScreenLandingPageShowState:" + z17);
        f335140b = z17;
        if (z17) {
            return;
        }
        e(null);
    }

    public static void e(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setHalfStateChangeListener:");
        sb6.append(aVar == null ? "null" : java.lang.Integer.valueOf(aVar.hashCode()));
        com.tencent.mars.xlog.Log.i("AdHalfScreenLandingPageState", sb6.toString());
        f335139a = aVar;
    }
}
