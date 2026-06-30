package ey2;

/* loaded from: classes8.dex */
public final class k0 extends pf5.o0 implements ya2.o1 {

    /* renamed from: e, reason: collision with root package name */
    public r45.ae3 f257411e;

    /* renamed from: f, reason: collision with root package name */
    public final ey2.d0 f257412f;

    /* renamed from: g, reason: collision with root package name */
    public final ey2.g0 f257413g;

    /* renamed from: h, reason: collision with root package name */
    public float f257414h;

    /* renamed from: i, reason: collision with root package name */
    public float f257415i;

    /* renamed from: m, reason: collision with root package name */
    public final i11.c f257416m;

    public k0() {
        com.tencent.mars.xlog.Log.i("Finder.GlobalLocationVM", "isGetGps=" + com.tencent.mm.plugin.finder.storage.t70.f127590a.V2());
        this.f257412f = new ey2.d0(-107.0f, 43.0f, 0L, 4, null);
        this.f257413g = new ey2.g0(this);
        this.f257416m = new ey2.e0(this);
    }

    public boolean N6() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        return j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false);
    }

    public final ey2.d0 O6() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128046yg).getValue()).r()).booleanValue()) {
            ey2.d0 d0Var = this.f257412f;
            return new ey2.d0(d0Var.f257338a, d0Var.f257339b, java.lang.System.currentTimeMillis());
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().f(this.f257416m);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        return new ey2.d0(this.f257414h, this.f257415i, i11.h.e().f287099h);
    }

    public jz5.l P6() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128046yg).getValue()).r()).booleanValue()) {
            ey2.d0 d0Var = this.f257412f;
            return new jz5.l(java.lang.Float.valueOf(d0Var.f257338a), java.lang.Float.valueOf(d0Var.f257339b));
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LOCATION_STRING, ";");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.util.List e07 = r26.n0.e0((java.lang.String) m17, new char[]{';'}, false, 0, 6, null);
        java.lang.Float f17 = r26.g0.f((java.lang.String) e07.get(0));
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        java.lang.Float f18 = r26.g0.f((java.lang.String) e07.get(1));
        return new jz5.l(java.lang.Float.valueOf(floatValue), java.lang.Float.valueOf(f18 != null ? f18.floatValue() : 0.0f));
    }

    public long Q6() {
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LOCATION_TIME_LONG, 0L);
        com.tencent.mars.xlog.Log.i("Finder.GlobalLocationVM", "[lastLocationTime] time=" + t17);
        return t17;
    }

    public boolean R6(boolean z17, i11.c cVar) {
        if (!z17 && !com.tencent.mm.plugin.finder.storage.t70.f127590a.V2()) {
            com.tencent.mars.xlog.Log.w("Finder.GlobalLocationVM", "[requestLocation] is not enabel");
            return false;
        }
        if (!N6()) {
            com.tencent.mars.xlog.Log.w("Finder.GlobalLocationVM", "[requestLocation] without perssion.");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[requestLocation]... ");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("Finder.GlobalLocationVM", sb6.toString());
        pm0.v.O("Finder.GlobalLocationVM#RequestLocation", new ey2.h0(cVar, this));
        return true;
    }

    public void S6(com.tencent.mm.ui.MMActivity activity, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            db5.e1.C(activity, activity.getString(com.tencent.mm.R.string.hhm), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.f490347sg), false, new ey2.i0(activity), new ey2.j0(activity));
            com.tencent.mars.xlog.Log.i("Finder.GlobalLocationVM", "requestLocationPermissionWithAlert");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.GlobalLocationVM", "requestLocationPermissionWithAlert checkLocationPermissionWithRequest needReasonTitle=" + z17);
        if (z17) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.a(activity, "android.permission.ACCESS_FINE_LOCATION", 79, null, null);
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.l(activity, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"}, 79);
        }
    }

    public void T6(float f17, float f18) {
        long c17 = c01.id.c();
        com.tencent.mars.xlog.Log.i("Finder.GlobalLocationVM", "[storeLocation] longitude=" + f17 + " latitude=" + f18 + " time=" + c17);
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LOCATION_STRING;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f17);
        sb6.append(';');
        sb6.append(f18);
        c18.x(u3Var, sb6.toString());
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LOCATION_TIME_LONG, java.lang.Long.valueOf(c17));
    }
}
