package t56;

/* loaded from: classes16.dex */
public class l0 extends p56.q implements p56.s {

    /* renamed from: h, reason: collision with root package name */
    public static final p56.s f415898h = new t56.h0();

    /* renamed from: e, reason: collision with root package name */
    public final p56.q f415899e;

    /* renamed from: f, reason: collision with root package name */
    public final p56.m f415900f;

    /* renamed from: g, reason: collision with root package name */
    public final p56.s f415901g;

    public l0(r56.e eVar, p56.q qVar) {
        this.f415899e = qVar;
        z56.g gVar = new z56.g();
        gVar.f470301h = new z56.a(gVar);
        this.f415900f = new w56.c(new z56.b(gVar, gVar));
        p56.h hVar = (p56.h) eVar.call(p56.l.b(new s56.k(gVar, s56.x.f403263a)));
        hVar.getClass();
        a66.e eVar2 = new a66.e();
        p56.d dVar = new p56.d(hVar, eVar2);
        try {
            p56.f fVar = hVar.f352093a;
            if (x56.m.f452132e != null) {
                x56.r.f452140e.a().getClass();
            }
            fVar.call(dVar);
            this.f415901g = eVar2;
        } catch (java.lang.NullPointerException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            th = th6;
            q56.f.b(th);
            r56.e eVar3 = x56.m.f452137j;
            th = eVar3 != null ? (java.lang.Throwable) ((x56.c) eVar3).call(th) : th;
            x56.m.a(th);
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @Override // p56.s
    public boolean b() {
        return this.f415901g.b();
    }

    @Override // p56.s
    public void c() {
        this.f415901g.c();
    }

    @Override // p56.q
    public p56.p createWorker() {
        p56.p createWorker = this.f415899e.createWorker();
        s56.e eVar = new s56.e(new s56.d());
        w56.c cVar = new w56.c(eVar);
        p56.l b17 = p56.l.b(new s56.m(eVar, new t56.f0(this, createWorker)));
        t56.g0 g0Var = new t56.g0(this, createWorker, cVar);
        this.f415900f.a(b17);
        return g0Var;
    }
}
