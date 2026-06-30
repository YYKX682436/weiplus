package kj;

/* loaded from: classes12.dex */
public class u extends kj.g0 implements jj.d {

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f308267e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f308268f;

    /* renamed from: g, reason: collision with root package name */
    public final ej.c f308269g;

    /* renamed from: h, reason: collision with root package name */
    public final kj.s f308270h = new kj.s(this);

    /* renamed from: i, reason: collision with root package name */
    public final kj.t f308271i = new kj.t(this);

    /* renamed from: m, reason: collision with root package name */
    public final boolean f308272m;

    public u(ej.c cVar) {
        this.f308269g = cVar;
        this.f308272m = cVar.f253257d;
    }

    @Override // jj.d
    public void b(java.lang.String str, long j17, long j18) {
        if (this.f308269g.f253261h) {
            oj.j.e("Matrix.AnrTracer", "[dispatchEnd] beginNs:%s endNs:%s cost:%sms", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf((j18 - j17) / 1000000));
        }
        kj.s sVar = this.f308270h;
        sVar.f308264d.a();
        this.f308267e.removeCallbacks(sVar);
        this.f308268f.removeCallbacks(this.f308271i);
    }

    @Override // jj.d
    public void c(java.lang.String str) {
        gj.e maskIndex = com.tencent.matrix.trace.core.AppMethodBeat.getInstance().maskIndex("AnrTracer#dispatchBegin");
        kj.s sVar = this.f308270h;
        sVar.f308264d = maskIndex;
        if (this.f308269g.f253261h) {
            oj.j.e("Matrix.AnrTracer", "* [dispatchBegin] index:%s", java.lang.Integer.valueOf(sVar.f308264d.f272340a));
        }
        this.f308267e.postDelayed(sVar, 5000L);
        this.f308268f.postDelayed(this.f308271i, 2000L);
    }

    @Override // kj.g0
    public void d() {
        super.d();
        if (this.f308272m) {
            gj.k kVar = gj.k.f272354q;
            synchronized (kVar.f272361i) {
                ((java.util.HashMap) kVar.f272361i).put(this, new gj.g(this));
            }
            this.f308267e = new android.os.Handler(oj.g.a().getLooper());
            this.f308268f = new android.os.Handler(oj.g.a().getLooper());
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
        if (this.f308272m) {
            gj.k.d(this);
            this.f308270h.f308264d.a();
            this.f308267e.removeCallbacksAndMessages(null);
            this.f308268f.removeCallbacksAndMessages(null);
        }
    }

    @Override // jj.d
    public boolean isValid() {
        return true;
    }
}
