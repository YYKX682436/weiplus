package mi1;

/* loaded from: classes7.dex */
public class g extends mi1.t2 implements mi1.f {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f326555e;

    /* renamed from: f, reason: collision with root package name */
    public final mi1.w0 f326556f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f326557g;

    /* renamed from: h, reason: collision with root package name */
    public int f326558h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f326559i = Integer.MIN_VALUE;

    public g(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, mi1.w0 w0Var) {
        this.f326555e = appBrandRuntime;
        this.f326556f = w0Var;
    }

    @Override // mi1.f
    public mi1.w0 a(mi1.d dVar, mi1.e eVar, java.lang.String str) {
        int i17 = dVar.f326532d;
        mi1.w0 n17 = n(eVar, 0);
        final mi1.n2 n2Var = (mi1.n2) n17;
        n2Var.f326637g = str;
        n2Var.f(dVar.ordinal(), false);
        final int i18 = dVar.f326533e;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: mi1.n2$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.content.Context r07;
                int i19 = i18;
                mi1.n2 n2Var2 = mi1.n2.this;
                com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = ((mi1.g) n2Var2.f326642o).f326555e;
                try {
                    r07 = appBrandRuntime.x0().getCurrentPage().getCurrentPageView().r1().getContext();
                } catch (java.lang.NullPointerException unused) {
                    r07 = appBrandRuntime.r0();
                }
                if (r07 == null) {
                    r07 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                }
                try {
                    n2Var2.c(b3.l.getDrawable(r07, i19));
                } catch (android.content.res.Resources.NotFoundException unused2) {
                    n2Var2.c(null);
                }
            }
        };
        mi1.t2 t2Var = n2Var.f326642o;
        t2Var.m(runnable);
        t2Var.m(new mi1.q2(n2Var, i17));
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandCapsuleBarBlinkHelper", "new blinkCapsuleBar");
        return n17;
    }

    @Override // mi1.f
    public int d() {
        return this.f326559i;
    }

    @Override // mi1.f
    public void g(java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (true) {
            java.util.LinkedList linkedList2 = this.f326693d;
            if (linkedList2.peekFirst() == null) {
                linkedList2.addAll(linkedList);
                return;
            } else if (((mi1.n2) linkedList2.peekFirst()).f326637g.equals(str)) {
                linkedList2.remove(linkedList2.peekFirst());
            } else {
                linkedList.addLast((mi1.n2) linkedList2.pollFirst());
            }
        }
    }

    @Override // mi1.f
    public mi1.w0 h(mi1.d dVar) {
        return a(dVar, mi1.e.LOW, "");
    }

    @Override // mi1.f
    public int j() {
        return this.f326558h;
    }

    @Override // mi1.f
    public mi1.w0 k(java.util.Map map, mi1.e eVar, java.lang.String str) {
        mi1.w0 n17 = n(eVar, 1);
        mi1.n2 n2Var = (mi1.n2) n17;
        n2Var.f326637g = str;
        n2Var.f(((mi1.a) map.get("key_type")).ordinal(), true);
        n2Var.e(map);
        return n17;
    }

    @Override // mi1.g0
    public void m(java.lang.Runnable runnable) {
        this.f326555e.m(runnable);
    }

    public final boolean p() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f326555e;
        return appBrandRuntime == null || appBrandRuntime.L0() || this.f326555e.S || this.f326555e.f74821z == null;
    }
}
