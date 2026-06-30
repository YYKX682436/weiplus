package u81;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final long f425430e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f425431f;

    /* renamed from: a, reason: collision with root package name */
    public final u81.f0 f425432a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f425433b;

    /* renamed from: c, reason: collision with root package name */
    public final x.b f425434c = new x.b();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.media.music.b f425435d = new u81.c(this);

    static {
        long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(10L);
        f425430e = millis;
        f425431f = millis;
    }

    public h(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f425433b = appBrandRuntime;
        this.f425432a = new u81.e(this, appBrandRuntime, appBrandRuntime);
    }

    public void a(u81.f fVar) {
        if (fVar == null || this.f425432a.f425427y.get()) {
            return;
        }
        synchronized (this.f425434c) {
            this.f425434c.put(fVar, this);
        }
    }

    public u81.b b() {
        return this.f425432a.t();
    }

    public void c(u81.f fVar) {
        if (fVar == null || u81.b.DESTROYED == b()) {
            return;
        }
        synchronized (this.f425434c) {
            this.f425434c.remove(fVar);
        }
    }

    public boolean d() {
        u81.f0 f0Var = this.f425432a;
        k75.j jVar = f0Var.f304847e;
        if (jVar == null) {
            return false;
        }
        return ((java.lang.Boolean) new u81.q(f0Var, 1000L, java.lang.Boolean.FALSE).a(new com.tencent.mm.sdk.platformtools.n3(jVar.getLooper()))).booleanValue();
    }
}
