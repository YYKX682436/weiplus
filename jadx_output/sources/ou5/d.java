package ou5;

/* loaded from: classes12.dex */
public class d implements ou5.g {

    /* renamed from: c, reason: collision with root package name */
    public final ou5.h f349060c;

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.ConcurrentHashMap f349058a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f349059b = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public volatile long f349061d = 0;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0132 A[LOOP:0: B:16:0x012c->B:18:0x0132, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(android.content.Context r23, ku5.c r24) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ou5.d.<init>(android.content.Context, ku5.c):void");
    }

    @Override // su5.a
    public void a(wu5.l lVar, long j17, long j18) {
        boolean z17;
        lVar.getClass();
        wu5.l.f449844w.c(lVar.i());
        long[] jArr = lVar.f449850h == ku5.q.COMPLETE ? new long[]{lVar.f449849g, lVar.f449847e} : new long[2];
        java.lang.String key = lVar.getKey();
        long j19 = jArr[0];
        long j27 = jArr[1];
        ou5.c cVar = new ou5.c(key, j19, j27, lVar.f449857r.getName());
        ou5.b bVar = (ou5.b) i().get(key);
        if (bVar == null) {
            bVar = new ou5.b(key);
            i().put(key, bVar);
        }
        bVar.f349051j.add(cVar);
        bVar.f349047f += (float) j19;
        bVar.f349048g += (float) j27;
        int size = bVar.f349051j.size();
        float f17 = bVar.f349049h;
        float f18 = cVar.f349057f;
        if (f17 > f18) {
            z17 = size <= 5000;
            if (!z17) {
                bVar.f349043b += f17;
            }
            bVar.f349049h = f18;
        } else {
            z17 = true;
        }
        float f19 = bVar.f349050i;
        if (f19 < f18) {
            z17 = size <= 5000;
            if (!z17) {
                bVar.f349043b += f19;
            }
            bVar.f349050i = f18;
        }
        if (z17) {
            bVar.f349043b += f18;
        }
        bVar.f349044c = bVar.f349043b / (size - (size <= 5000 ? 0 : 2));
        float f27 = size;
        bVar.f349045d = (bVar.f349047f * 1.0f) / f27;
        bVar.f349046e = (bVar.f349048g * 1.0f) / f27;
        if (this.f349059b.incrementAndGet() < 5000 || java.lang.System.currentTimeMillis() - this.f349061d < 600000) {
            return;
        }
        this.f349059b.set(0L);
        this.f349061d = java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f312615d).q(new ou5.a(this));
    }

    @Override // su5.a
    public void b(wu5.l lVar) {
        lVar.getClass();
        wu5.l.f449844w.c(lVar.i());
    }

    @Override // su5.a
    public void c(wu5.l lVar) {
        int i17;
        tu5.h i18 = lVar.i();
        ((uu5.a) wu5.l.f449844w).getClass();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = i18.f422173b.f422171c;
        do {
            i17 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i17, i17 + 1));
    }

    @Override // su5.a
    public void d(wu5.l lVar) {
    }

    @Override // su5.a
    public void e(wu5.l lVar) {
        lVar.getClass();
        wu5.l.f449844w.b(lVar.i());
    }

    @Override // su5.a
    public void f(wu5.l lVar) {
        lVar.getClass();
        wu5.l.f449844w.c(lVar.i());
    }

    @Override // su5.a
    public void g(wu5.l lVar) {
        lVar.getClass();
        wu5.l.f449844w.c(lVar.i());
    }

    @Override // wu5.a
    public boolean h(java.lang.String str) {
        ou5.b bVar;
        if (str == null || (bVar = (ou5.b) i().get(str)) == null) {
            return true;
        }
        return !bVar.a();
    }

    public final java.util.concurrent.ConcurrentHashMap i() {
        if (this.f349058a == null) {
            synchronized (this) {
                if (this.f349058a == null) {
                    this.f349058a = new java.util.concurrent.ConcurrentHashMap();
                }
            }
        }
        return this.f349058a;
    }

    @Override // ou5.g
    public void j() {
        k(i());
    }

    public final synchronized void k(java.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        if (concurrentHashMap.size() <= 0) {
            return;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        try {
            ((ou5.f) this.f349060c).b(concurrentHashMap.values());
            ku5.o.f312599c.i("Experience", "[persistCache] successfully! size=" + concurrentHashMap.size() + " cost:" + (android.os.SystemClock.uptimeMillis() - uptimeMillis), new java.lang.Object[0]);
            concurrentHashMap.clear();
        } catch (java.lang.Exception e17) {
            ku5.o.f312599c.e("Experience", "%s", e17.toString());
        }
    }
}
