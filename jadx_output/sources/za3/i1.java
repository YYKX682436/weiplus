package za3;

/* loaded from: classes15.dex */
public class i1 {

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.Object f470942x = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f470943a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f470944b;

    /* renamed from: c, reason: collision with root package name */
    public r45.mw6 f470945c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.impl.TrackPoint f470946d;

    /* renamed from: k, reason: collision with root package name */
    public r45.io6 f470953k;

    /* renamed from: l, reason: collision with root package name */
    public final ab3.h f470954l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f470955m;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnTouchListener f470961s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f470962t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnClickListener f470963u;

    /* renamed from: v, reason: collision with root package name */
    public final i11.c f470964v;

    /* renamed from: w, reason: collision with root package name */
    public final va3.d0 f470965w;

    /* renamed from: e, reason: collision with root package name */
    public boolean f470947e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f470948f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f470949g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f470950h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f470951i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f470952j = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f470956n = true;

    /* renamed from: o, reason: collision with root package name */
    public float f470957o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f470958p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    public boolean f470959q = false;

    /* renamed from: r, reason: collision with root package name */
    public long f470960r = 0;

    public i1(android.content.Context context, ab3.h hVar, boolean z17) {
        this.f470955m = false;
        za3.c1 c1Var = new za3.c1(this);
        this.f470961s = c1Var;
        this.f470962t = new za3.d1(this);
        this.f470963u = new za3.e1(this);
        this.f470964v = new za3.f1(this);
        this.f470965w = new za3.g1(this);
        this.f470943a = context;
        this.f470955m = z17;
        this.f470954l = hVar;
        this.f470944b = new java.util.ArrayList();
        hVar.setMapViewOnTouchListener(c1Var);
    }

    public void a(ab3.h hVar) {
        if (this.f470945c == null) {
            return;
        }
        if (hVar.getZoomLevel() < 15) {
            ab3.f iController = hVar.getIController();
            r45.wa5 wa5Var = this.f470945c.f380873e;
            iController.animateTo(wa5Var.f389011d, wa5Var.f389012e, 15);
        } else {
            ab3.f iController2 = hVar.getIController();
            r45.wa5 wa5Var2 = this.f470945c.f380873e;
            iController2.animateTo(wa5Var2.f389011d, wa5Var2.f389012e);
        }
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackPointViewMgrImpl", "onPause() called");
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this.f470964v);
        va3.j0.Bi().c(this.f470965w);
    }

    public void c() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.LOCAION, new za3.h1(this))) {
            return;
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().j(this.f470964v, true);
        va3.j0.Bi().a(this.f470965w);
    }

    public void d(boolean z17) {
        if (!z17) {
            this.f470951i = z17;
            return;
        }
        if (this.f470946d != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "20", 0, 0, 0);
            this.f470951i = z17;
        }
    }

    public void e(boolean z17) {
        ab3.h hVar;
        if (z17 && !this.f470950h && (hVar = this.f470954l) != null) {
            for (java.lang.Object obj : hVar.getChilds()) {
                if (obj instanceof com.tencent.mm.plugin.location.ui.impl.TrackPoint) {
                    com.tencent.mm.plugin.location.ui.impl.TrackPoint trackPoint = (com.tencent.mm.plugin.location.ui.impl.TrackPoint) obj;
                    trackPoint.f144713e.setVisibility(0);
                    com.tencent.mm.plugin.location_soso.ViewManager viewManager = trackPoint.f144721p;
                    if (viewManager != null) {
                        viewManager.toggleViewVisible(trackPoint.f144713e);
                    }
                }
            }
        }
        this.f470950h = z17;
    }

    public final void f() {
        r45.mw6 mw6Var;
        double d17;
        double d18;
        if (this.f470948f || (mw6Var = this.f470945c) == null) {
            return;
        }
        if (mw6Var != null) {
            com.tencent.mm.plugin.location.model.LocationInfo locationInfo = va3.j0.Ri().f434359q;
            if (this.f470945c == null || !va3.w.d(locationInfo.f144586e, locationInfo.f144587f)) {
                d17 = 0.0d;
                d18 = 0.0d;
            } else {
                d17 = java.lang.Math.abs(this.f470945c.f380873e.f389011d - locationInfo.f144586e) * 2.0d;
                d18 = java.lang.Math.abs(this.f470945c.f380873e.f389012e - locationInfo.f144587f) * 2.0d;
            }
            int i17 = 0;
            double d19 = d17;
            double d27 = d18;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f470944b;
                if (i17 >= arrayList.size()) {
                    break;
                }
                r45.mw6 mw6Var2 = (r45.mw6) arrayList.get(i17);
                if (mw6Var2 != null) {
                    r45.wa5 wa5Var = mw6Var2.f380873e;
                    if (va3.w.d(wa5Var.f389011d, wa5Var.f389012e)) {
                        double abs = java.lang.Math.abs(mw6Var2.f380873e.f389011d - this.f470945c.f380873e.f389011d) * 2.0d;
                        double abs2 = java.lang.Math.abs(mw6Var2.f380873e.f389012e - this.f470945c.f380873e.f389012e) * 2.0d;
                        if (abs > d19) {
                            d19 = abs;
                        }
                        if (abs2 > d27) {
                            d27 = abs2;
                        }
                        r45.wa5 wa5Var2 = mw6Var2.f380873e;
                        double d28 = wa5Var2.f389011d;
                        double d29 = wa5Var2.f389012e;
                    }
                }
                i17++;
            }
            if (java.lang.Math.abs(d19 - (-1000.0d)) >= 0.5d && java.lang.Math.abs(d27 - (-1000.0d)) >= 0.5d) {
                double d37 = locationInfo.f144586e;
                double d38 = locationInfo.f144587f;
                r45.mw6 mw6Var3 = this.f470945c;
                if (mw6Var3 != null) {
                    r45.wa5 wa5Var3 = mw6Var3.f380873e;
                    this.f470954l.zoomToSpan(wa5Var3.f389011d, wa5Var3.f389012e, d19, d27);
                } else if (va3.w.d(d37, d38)) {
                    this.f470954l.zoomToSpan(locationInfo.f144586e, locationInfo.f144587f, d19, d27);
                }
            }
        }
        this.f470948f = true;
    }
}
