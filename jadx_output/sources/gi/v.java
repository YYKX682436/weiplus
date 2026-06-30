package gi;

/* loaded from: classes12.dex */
public class v extends com.tencent.matrix.lifecycle.g {

    /* renamed from: d, reason: collision with root package name */
    public gi.q0 f272186d;

    /* renamed from: e, reason: collision with root package name */
    public gi.q0 f272187e;

    /* renamed from: f, reason: collision with root package name */
    public gi.q0 f272188f;

    /* renamed from: g, reason: collision with root package name */
    public gi.q0 f272189g;

    /* renamed from: h, reason: collision with root package name */
    public gi.q0 f272190h;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ph.u f272197o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f272198p;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f272184b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public boolean f272185c = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f272191i = new gi.w(this);

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f272192j = new gi.x(this);

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f272193k = new gi.y(this);

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Runnable f272194l = new gi.z(this);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f272195m = new gi.a0(this);

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f272196n = new gi.b0(this);

    public v(ph.u uVar, boolean z17) {
        this.f272197o = uVar;
        this.f272198p = z17;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        this.f272185c = true;
        com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "AppExplicitBg = true");
        java.util.Map map = ri.a.f395836e;
        synchronized (map) {
            ph.u e17 = gi.d.e();
            if (e17 != null) {
                e17.f354296h.f363337f.removeCallbacks(ri.a.f395833b);
            }
            ((java.util.HashMap) map).clear();
        }
        if (this.f272198p) {
            synchronized (this.f272184b) {
                this.f272197o.f354296h.f363337f.removeCallbacks(this.f272192j);
                this.f272188f = null;
                this.f272197o.f354296h.f363337f.removeCallbacks(this.f272191i);
                this.f272197o.f354296h.f363337f.postDelayed(this.f272193k, 600000L);
                this.f272197o.f354296h.f363337f.postDelayed(this.f272194l, 600000L);
                this.f272197o.f354296h.f363337f.postDelayed(this.f272195m, 30000L);
                gi.q0 q0Var = this.f272186d;
                if (q0Var != null) {
                    q0Var.a();
                    this.f272186d = null;
                }
                ((lh.t) ((jz5.n) lh.t.f318631f).getValue()).c(0);
            }
        }
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        this.f272185c = false;
        com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "AppExplicitBg = false");
        synchronized (ri.a.f395836e) {
            ph.u e17 = gi.d.e();
            if (e17 != null) {
                e17.f354296h.f363337f.postDelayed(ri.a.f395833b, 5000L);
            }
        }
        if (this.f272198p) {
            synchronized (this.f272184b) {
                lh.t.f318630e = true;
                this.f272197o.f354296h.f363337f.removeCallbacks(this.f272195m);
                this.f272197o.f354296h.f363337f.removeCallbacks(this.f272196n);
                this.f272197o.f354296h.f363337f.removeCallbacks(this.f272194l);
                this.f272189g = null;
                this.f272197o.f354296h.f363337f.removeCallbacks(this.f272193k);
                this.f272197o.f354296h.f363337f.postDelayed(this.f272191i, 30000L);
                this.f272197o.f354296h.f363337f.postDelayed(this.f272192j, 30000L);
                gi.q0 q0Var = this.f272187e;
                if (q0Var != null) {
                    q0Var.a();
                    this.f272187e = null;
                }
                ((lh.t) ((jz5.n) lh.t.f318631f).getValue()).a();
            }
        }
        ((ku5.t0) ku5.t0.f312615d).g(new gi.v$$a());
    }
}
