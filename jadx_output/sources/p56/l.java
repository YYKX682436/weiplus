package p56;

/* loaded from: classes16.dex */
public class l {

    /* renamed from: d, reason: collision with root package name */
    public final p56.i f352094d;

    public l(p56.i iVar) {
        this.f352094d = iVar;
    }

    public static p56.l b(p56.i iVar) {
        r56.e eVar = x56.m.f452129b;
        if (eVar != null) {
            iVar = (p56.i) ((x56.d) eVar).call(iVar);
        }
        return new p56.l(iVar);
    }

    public final p56.l c(p56.q qVar) {
        return b(new s56.k(this.f352094d, new s56.v(qVar, false, u56.l.f424833e)));
    }

    public final p56.s d() {
        r56.c cVar = r56.d.f392742a;
        return e(new u56.a(cVar, u56.e.f424822d, cVar));
    }

    public final p56.s e(p56.r rVar) {
        if (rVar == null) {
            throw new java.lang.IllegalArgumentException("subscriber can not be null");
        }
        if (this.f352094d == null) {
            throw new java.lang.IllegalStateException("onSubscribe function can not be null.");
        }
        rVar.e();
        if (!(rVar instanceof w56.a)) {
            rVar = new w56.a(rVar);
        }
        try {
            p56.i iVar = this.f352094d;
            if (x56.m.f452131d != null) {
                x56.r.f452140e.c().getClass();
            }
            iVar.call(rVar);
            r56.e eVar = x56.m.f452135h;
            return eVar != null ? (p56.s) ((x56.h) eVar).call(rVar) : rVar;
        } catch (java.lang.Throwable th6) {
            q56.f.b(th6);
            if (rVar.f352103d.f424839e) {
                x56.m.a(x56.m.b(th6));
            } else {
                try {
                    rVar.onError(x56.m.b(th6));
                } catch (java.lang.Throwable th7) {
                    q56.f.b(th7);
                    q56.i iVar2 = new q56.i("Error occurred attempting to subscribe [" + th6.getMessage() + "] and then again while trying to pass to onError.", th7);
                    x56.m.b(iVar2);
                    throw iVar2;
                }
            }
            return a66.g.f1801a;
        }
    }

    public final p56.s f(r56.b bVar) {
        if (bVar != null) {
            return e(new u56.a(bVar, u56.e.f424822d, r56.d.f392742a));
        }
        throw new java.lang.IllegalArgumentException("onNext can not be null");
    }

    public final p56.s g(r56.b bVar, r56.b bVar2) {
        if (bVar == null) {
            throw new java.lang.IllegalArgumentException("onNext can not be null");
        }
        if (bVar2 != null) {
            return e(new u56.a(bVar, bVar2, r56.d.f392742a));
        }
        throw new java.lang.IllegalArgumentException("onError can not be null");
    }

    public final p56.s h(p56.r rVar) {
        try {
            rVar.e();
            p56.i iVar = this.f352094d;
            if (x56.m.f452131d != null) {
                x56.r.f452140e.c().getClass();
            }
            iVar.call(rVar);
            r56.e eVar = x56.m.f452135h;
            return eVar != null ? (p56.s) ((x56.h) eVar).call(rVar) : rVar;
        } catch (java.lang.Throwable th6) {
            q56.f.b(th6);
            try {
                rVar.onError(x56.m.b(th6));
                return a66.g.f1801a;
            } catch (java.lang.Throwable th7) {
                q56.f.b(th7);
                q56.i iVar2 = new q56.i("Error occurred attempting to subscribe [" + th6.getMessage() + "] and then again while trying to pass to onError.", th7);
                x56.m.b(iVar2);
                throw iVar2;
            }
        }
    }
}
