package n91;

/* loaded from: classes7.dex */
public class m implements ni1.j, ni1.c {

    /* renamed from: a, reason: collision with root package name */
    public final ee.d f335887a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f335888b = false;

    public m(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f335887a = new ee.d(v5Var);
        n91.g gVar = ((com.tencent.mm.plugin.appbrand.o6) v5Var.getRuntime()).K2;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: n91.m$$a
            @Override // java.lang.Runnable
            public final void run() {
                n91.m mVar = n91.m.this;
                mVar.f335888b = true;
                mVar.b();
            }
        };
        if (gVar.f335873c.ordinal() >= 3) {
            runnable.run();
        } else {
            gVar.f335874d.add(runnable);
        }
    }

    @Override // ni1.j
    public void a() {
        if (this.f335888b) {
            this.f335887a.a();
        }
    }

    @Override // ni1.c
    public void b() {
        if (this.f335888b) {
            this.f335887a.b();
        }
    }

    @Override // ni1.c
    public void c() {
        if (this.f335888b) {
            this.f335887a.c();
        }
    }

    @Override // ni1.j
    public void d() {
        if (this.f335888b) {
            this.f335887a.d();
        }
    }

    @Override // ni1.j
    public boolean e() {
        if (this.f335888b) {
            return this.f335887a.e();
        }
        return false;
    }

    @Override // ni1.c
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (this.f335888b) {
            this.f335887a.getClass();
        }
    }

    @Override // ni1.c
    public void onDestroy() {
        if (this.f335888b) {
            this.f335887a.getClass();
        }
    }
}
