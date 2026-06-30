package dk2;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final r45.qt2 f233412a;

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.coroutines.y0 f233413b;

    /* renamed from: c, reason: collision with root package name */
    public long f233414c;

    /* renamed from: d, reason: collision with root package name */
    public long f233415d;

    public f(r45.qt2 qt2Var) {
        this.f233412a = qt2Var;
    }

    public final void a(long j17) {
        com.tencent.mars.xlog.Log.i("Finder.ShoppingBubbleReport", "product " + j17 + " start report");
        this.f233414c = java.lang.System.currentTimeMillis();
        this.f233415d = j17;
        kotlinx.coroutines.y0 y0Var = this.f233413b;
        if (y0Var != null) {
            if (y0Var == null) {
                kotlin.jvm.internal.o.o("coroutineScope");
                throw null;
            }
            kotlinx.coroutines.z0.e(y0Var, null, 1, null);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a);
        this.f233413b = a17;
        kotlinx.coroutines.l.d(a17, null, null, new dk2.e(this, null), 3, null);
    }

    public final void b() {
        r45.qt2 qt2Var;
        gk2.e eVar = gk2.e.f272471n;
        if (eVar == null || (qt2Var = this.f233412a) == null) {
            return;
        }
        int currentTimeMillis = (int) ((java.lang.System.currentTimeMillis() - this.f233414c) / 1000);
        r45.jn0 k07 = zl2.r4.k0(zl2.r4.f473950a, eVar, 33, java.lang.String.valueOf(this.f233415d), currentTimeMillis, null, 16, null);
        com.tencent.mars.xlog.Log.i("Finder.ShoppingBubbleReport", "report product " + this.f233415d + " exposed for " + currentTimeMillis);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Kj(qt2Var, 18054, k07);
    }
}
