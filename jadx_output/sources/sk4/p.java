package sk4;

/* loaded from: classes15.dex */
public final class p extends com.tencent.unit_rc.BaseObject implements jm4.t0 {

    /* renamed from: g, reason: collision with root package name */
    public boolean f408992g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f408993h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f408994i;

    /* renamed from: m, reason: collision with root package name */
    public long f408995m;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f408997o;

    /* renamed from: q, reason: collision with root package name */
    public tl.w f408999q;

    /* renamed from: r, reason: collision with root package name */
    public int f409000r;

    /* renamed from: d, reason: collision with root package name */
    public final int f408989d = 16000;

    /* renamed from: e, reason: collision with root package name */
    public final int f408990e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final int f408991f = -1;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f408996n = new java.util.LinkedHashSet();

    /* renamed from: p, reason: collision with root package name */
    public final sk4.l f408998p = new sk4.l(this);

    @Override // jm4.t0
    public jm4.u0[] H9(long j17) {
        return new jm4.u0[0];
    }

    @Override // jm4.t0
    public void L0(jm4.y0 y0Var) {
        ((ku5.t0) ku5.t0.f312615d).h(new sk4.d(y0Var, this), "MicroMsg.AudioRecorderImpl");
    }

    @Override // jm4.t0
    public void Sh(yz5.l lVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRecorderImpl", "start");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.app.w.INSTANCE.f53886h;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (!(activity instanceof com.tencent.mm.ui.MMFragmentActivity)) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (b3.l.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0) {
                pm0.v.X(new sk4.g(lVar, this));
                return;
            }
            kotlin.jvm.internal.o.d(context);
            pm0.v.X(new sk4.j(context));
            if (lVar != null) {
                lVar.invoke("permission_denied");
                return;
            }
            return;
        }
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) activity;
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRecorderImpl", "startWithActivity");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.a(mMFragmentActivity, "android.permission.RECORD_AUDIO", 80, "", "")) {
            pm0.v.X(new sk4.g(lVar, this));
            return;
        }
        mMFragmentActivity.registerMMOnRequestPermissionsResult(new sk4.n(mMFragmentActivity, this));
        if (lVar != null) {
            lVar.invoke("permission_denied");
        }
    }

    @Override // jm4.t0
    public void Vb(yz5.l lVar) {
        this.f408997o = lVar;
    }

    @Override // jm4.t0
    public void Xe(jm4.y0 y0Var) {
        ((ku5.t0) ku5.t0.f312615d).h(new sk4.m(y0Var, this), "MicroMsg.AudioRecorderImpl");
    }

    @Override // jm4.t0
    public void prepare() {
    }

    @Override // jm4.t0
    public double s9() {
        return 0.0d;
    }

    @Override // jm4.t0
    public void stop() {
        ((ku5.t0) ku5.t0.f312615d).h(new sk4.o(this), "MicroMsg.AudioRecorderImpl");
    }
}
