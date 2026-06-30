package sd;

/* loaded from: classes8.dex */
public class o0 extends sd.l0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.MutableContextWrapper f406630f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f406631g;

    /* renamed from: h, reason: collision with root package name */
    public sd.p0 f406632h;

    /* renamed from: i, reason: collision with root package name */
    public pf.b f406633i;

    /* renamed from: m, reason: collision with root package name */
    public od.l f406634m;

    /* renamed from: o, reason: collision with root package name */
    public qf.b f406636o;

    /* renamed from: p, reason: collision with root package name */
    public qf.d f406637p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f406638q;

    /* renamed from: r, reason: collision with root package name */
    public final int f406639r;

    /* renamed from: n, reason: collision with root package name */
    public boolean f406635n = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f406640s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f406641t = true;

    public o0(android.content.Context context, java.lang.Class cls) {
        sd.n0 n0Var = new sd.n0(this);
        android.content.MutableContextWrapper mutableContextWrapper = new android.content.MutableContextWrapper(context);
        this.f406630f = mutableContextWrapper;
        cls = cls == null ? com.tencent.luggage.webview.default_impl.f.class : cls;
        this.f406631g = cls;
        new android.os.Handler(android.os.Looper.getMainLooper());
        this.f406639r = hashCode();
        this.f406636o = new qf.b();
        this.f406637p = new qf.d();
        this.f406636o.a(new qf.a(mutableContextWrapper));
        pf.b bVar = (pf.b) new d56.b(cls, cls).d(mutableContextWrapper).f226632b;
        this.f406633i = bVar;
        bVar.setWebCore(this);
        this.f406633i.a0(n0Var);
        this.f406634m = new od.l(this.f406633i);
    }

    @Override // sd.l0
    public void a() {
        com.tencent.mars.xlog.Log.i("Luggage.LuggageWebCore", "destroy");
        if (this.f406635n) {
            return;
        }
        this.f406633i.destroy();
    }

    @Override // sd.l0
    public od.l d() {
        return this.f406634m;
    }

    @Override // sd.l0
    public java.lang.String e() {
        return this.f406633i.getUserAgent();
    }

    public java.lang.Object h() {
        try {
            return this.f406633i.getView();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(sd.o0.class.getSimpleName(), "CoreImpl cast failed", e17);
            return null;
        }
    }

    public synchronized void i() {
        if (!this.f406640s) {
            com.tencent.mm.sdk.platformtools.Log.c("Luggage.LuggageWebCore", "try inject jsbridge", new java.lang.Object[0]);
            this.f406634m.a();
            sd.p0 p0Var = this.f406632h;
            if (p0Var != null) {
                od.l lVar = this.f406634m;
                lVar.f344516a.evaluateJavascript(p0Var.a(), null);
            }
            this.f406640s = true;
        }
    }

    public void j(java.lang.String str) {
        this.f406633i.loadUrl(str);
    }

    public void k() {
        if (this.f406635n) {
            this.f406635n = false;
            this.f406636o = new qf.b();
            this.f406637p = new qf.d();
            this.f406636o.a(new qf.a(this.f406630f));
        }
    }

    public void l(android.content.Context context) {
        this.f406630f.setBaseContext(context);
        pf.b bVar = this.f406633i;
        if (bVar != null) {
            bVar.setContext(context);
        }
    }
}
