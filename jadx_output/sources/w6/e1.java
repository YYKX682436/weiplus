package w6;

/* loaded from: classes13.dex */
public class e1 implements w6.k, u6.d, w6.j {

    /* renamed from: d, reason: collision with root package name */
    public final w6.l f443095d;

    /* renamed from: e, reason: collision with root package name */
    public final w6.j f443096e;

    /* renamed from: f, reason: collision with root package name */
    public int f443097f;

    /* renamed from: g, reason: collision with root package name */
    public w6.g f443098g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f443099h;

    /* renamed from: i, reason: collision with root package name */
    public volatile a7.o0 f443100i;

    /* renamed from: m, reason: collision with root package name */
    public w6.h f443101m;

    public e1(w6.l lVar, w6.j jVar) {
        this.f443095d = lVar;
        this.f443096e = jVar;
    }

    @Override // w6.k
    public boolean a() {
        java.lang.Object obj = this.f443099h;
        if (obj != null) {
            this.f443099h = null;
            int i17 = q7.j.f360301b;
            long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            try {
                t6.d d17 = this.f443095d.d(obj);
                w6.i iVar = new w6.i(d17, obj, this.f443095d.f443141i);
                t6.h hVar = this.f443100i.f1846a;
                w6.l lVar = this.f443095d;
                this.f443101m = new w6.h(hVar, lVar.f443146n);
                ((w6.e0) lVar.f443140h).a().b(this.f443101m, iVar);
                if (android.util.Log.isLoggable("SourceGenerator", 2)) {
                    java.util.Objects.toString(this.f443101m);
                    obj.toString();
                    d17.toString();
                    q7.j.a(elapsedRealtimeNanos);
                }
                this.f443100i.f1848c.h();
                this.f443098g = new w6.g(java.util.Collections.singletonList(this.f443100i.f1846a), this.f443095d, this);
            } catch (java.lang.Throwable th6) {
                this.f443100i.f1848c.h();
                throw th6;
            }
        }
        w6.g gVar = this.f443098g;
        if (gVar != null && gVar.a()) {
            return true;
        }
        this.f443098g = null;
        this.f443100i = null;
        boolean z17 = false;
        while (!z17) {
            if (!(this.f443097f < ((java.util.ArrayList) this.f443095d.b()).size())) {
                break;
            }
            java.util.List b17 = this.f443095d.b();
            int i18 = this.f443097f;
            this.f443097f = i18 + 1;
            this.f443100i = (a7.o0) ((java.util.ArrayList) b17).get(i18);
            if (this.f443100i != null) {
                if (!this.f443095d.f443148p.c(this.f443100i.f1848c.b())) {
                    if (this.f443095d.c(this.f443100i.f1848c.a()) != null) {
                    }
                }
                this.f443100i.f1848c.e(this.f443095d.f443147o, this);
                z17 = true;
            }
        }
        return z17;
    }

    @Override // w6.j
    public void b(t6.h hVar, java.lang.Object obj, u6.e eVar, t6.a aVar, t6.h hVar2) {
        this.f443096e.b(hVar, obj, eVar, this.f443100i.f1848c.b(), hVar);
    }

    @Override // u6.d
    public void c(java.lang.Object obj) {
        w6.z zVar = this.f443095d.f443148p;
        if (obj == null || !zVar.c(this.f443100i.f1848c.b())) {
            this.f443096e.b(this.f443100i.f1846a, obj, this.f443100i.f1848c, this.f443100i.f1848c.b(), this.f443101m);
        } else {
            this.f443099h = obj;
            this.f443096e.i();
        }
    }

    @Override // w6.k
    public void cancel() {
        a7.o0 o0Var = this.f443100i;
        if (o0Var != null) {
            o0Var.f1848c.cancel();
        }
    }

    @Override // u6.d
    public void d(java.lang.Exception exc) {
        this.f443096e.j(this.f443101m, exc, this.f443100i.f1848c, this.f443100i.f1848c.b());
    }

    @Override // w6.j
    public void i() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // w6.j
    public void j(t6.h hVar, java.lang.Exception exc, u6.e eVar, t6.a aVar) {
        this.f443096e.j(hVar, exc, eVar, this.f443100i.f1848c.b());
    }
}
