package ee;

/* loaded from: classes7.dex */
public class d implements ni1.j, ni1.c {

    /* renamed from: a, reason: collision with root package name */
    public final ee.a f251409a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f251410b;

    public d(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f251409a = new ee.a(v5Var);
        this.f251410b = v5Var;
    }

    @Override // ni1.j
    public void a() {
        this.f251410b.T0(new ee.c(this));
    }

    @Override // ni1.c
    public void b() {
        this.f251409a.c();
    }

    @Override // ni1.c
    public void c() {
        this.f251409a.getClass();
    }

    @Override // ni1.j
    public void d() {
        this.f251410b.T0(new ee.b(this));
    }

    @Override // ni1.j
    public boolean e() {
        return this.f251409a.f251406b == pi1.d.HIDDEN;
    }

    @Override // ni1.c
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // ni1.c
    public void onDestroy() {
    }
}
