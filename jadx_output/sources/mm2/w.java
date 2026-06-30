package mm2;

/* loaded from: classes3.dex */
public final class w extends mm2.e {

    /* renamed from: u, reason: collision with root package name */
    public static final mm2.g f329495u = new mm2.g(null);

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f329496v = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329497f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f329498g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329499h;

    /* renamed from: i, reason: collision with root package name */
    public mm2.i f329500i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329501m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f329502n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329503o;

    /* renamed from: p, reason: collision with root package name */
    public mm2.h f329504p;

    /* renamed from: q, reason: collision with root package name */
    public int f329505q;

    /* renamed from: r, reason: collision with root package name */
    public int f329506r;

    /* renamed from: s, reason: collision with root package name */
    public final mn0.c0 f329507s;

    /* renamed from: t, reason: collision with root package name */
    public final yz5.p f329508t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329497f = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329498g = new java.util.concurrent.CopyOnWriteArrayList();
        this.f329499h = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329500i = mm2.i.f329126d;
        this.f329501m = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329502n = "";
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        liveMutableData.setValue(mm2.f.f329013d);
        this.f329503o = liveMutableData;
        this.f329507s = new mm2.p(this);
        this.f329508t = new mm2.v(this);
    }

    public static final void N6(mm2.w wVar, java.lang.String str) {
        wVar.getClass();
        com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", "handleOnMiniVideoViewStop liveAdId:" + str);
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        tn0.w0 w0Var = dk2.ef.f233378d;
        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
        if (sVar != null) {
            sVar.f1(false);
        }
        wVar.f329503o.setValue(mm2.f.f329016g);
        mm2.h hVar = wVar.f329504p;
        java.lang.Object parent = hVar != null ? hVar.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(wVar.f329504p);
        }
        wVar.R6();
    }

    public final boolean O6() {
        if (P6()) {
            return true;
        }
        return ((mm2.f) this.f329503o.getValue()) == mm2.f.f329016g;
    }

    public final boolean P6() {
        mm2.f fVar = (mm2.f) this.f329503o.getValue();
        return fVar == mm2.f.f329014e || fVar == mm2.f.f329018i;
    }

    public final void Q6(long j17) {
        this.f329497f.postValue(java.lang.Long.valueOf(j17));
        pm0.v.X(new mm2.u(this, j17));
    }

    public final void R6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPlayer state:");
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = this.f329503o;
        sb6.append(liveMutableData.getValue());
        sb6.append(" videoView:");
        sb6.append(this.f329504p);
        com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", sb6.toString());
        if (this.f329504p != null) {
            com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", "stopPlayer videoView release.");
            mm2.h hVar = this.f329504p;
            if (hVar != null) {
                hVar.t();
            }
        }
        liveMutableData.setValue(mm2.f.f329013d);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        mn0.b0 b0Var;
        com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", "stopPolling");
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        dk2.ef.f233392k.f(16);
        R6();
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        tn0.w0 w0Var = dk2.ef.f233378d;
        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
        if (sVar != null && (b0Var = sVar.R1.f282409a) != null) {
            ((mn0.y) b0Var).x(this.f329507s);
        }
        mm2.h hVar = this.f329504p;
        if (hVar != null) {
            hVar.t();
            hVar.getPlayer().release();
        }
        this.f329504p = null;
    }
}
