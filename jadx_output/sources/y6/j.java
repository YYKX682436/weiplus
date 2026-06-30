package y6;

/* loaded from: classes13.dex */
public class j implements y6.c {

    /* renamed from: b, reason: collision with root package name */
    public final java.io.File f459595b;

    /* renamed from: c, reason: collision with root package name */
    public final long f459596c;

    /* renamed from: e, reason: collision with root package name */
    public r6.f f459598e;

    /* renamed from: d, reason: collision with root package name */
    public final y6.g f459597d = new y6.g();

    /* renamed from: a, reason: collision with root package name */
    public final y6.v f459594a = new y6.v();

    public j(java.io.File file, long j17) {
        this.f459595b = file;
        this.f459596c = j17;
    }

    @Override // y6.c
    public java.io.File a(t6.h hVar) {
        r6.f fVar;
        java.lang.String a17 = this.f459594a.a(hVar);
        if (android.util.Log.isLoggable("DiskLruCacheWrapper", 2)) {
            java.util.Objects.toString(hVar);
        }
        try {
            synchronized (this) {
                if (this.f459598e == null) {
                    this.f459598e = r6.f.l(this.f459595b, 1, 1, this.f459596c);
                }
                fVar = this.f459598e;
            }
            r6.e j17 = fVar.j(a17);
            if (j17 != null) {
                return j17.f392756a[0];
            }
        } catch (java.io.IOException unused) {
            android.util.Log.isLoggable("DiskLruCacheWrapper", 5);
        }
        return null;
    }

    @Override // y6.c
    public void b(t6.h hVar, y6.b bVar) {
        y6.e eVar;
        r6.f fVar;
        boolean z17;
        java.lang.String a17 = this.f459594a.a(hVar);
        y6.g gVar = this.f459597d;
        synchronized (gVar) {
            eVar = (y6.e) ((java.util.HashMap) gVar.f459590a).get(a17);
            if (eVar == null) {
                y6.f fVar2 = gVar.f459591b;
                synchronized (fVar2.f459589a) {
                    eVar = (y6.e) ((java.util.ArrayDeque) fVar2.f459589a).poll();
                }
                if (eVar == null) {
                    eVar = new y6.e();
                }
                ((java.util.HashMap) gVar.f459590a).put(a17, eVar);
            }
            eVar.f459588b++;
        }
        ((java.util.concurrent.locks.ReentrantLock) eVar.f459587a).lock();
        try {
            if (android.util.Log.isLoggable("DiskLruCacheWrapper", 2)) {
                java.util.Objects.toString(hVar);
            }
            try {
                synchronized (this) {
                    if (this.f459598e == null) {
                        this.f459598e = r6.f.l(this.f459595b, 1, 1, this.f459596c);
                    }
                    fVar = this.f459598e;
                }
                if (fVar.j(a17) == null) {
                    r6.c f17 = fVar.f(a17);
                    if (f17 == null) {
                        throw new java.lang.IllegalStateException("Had two simultaneous puts for: ".concat(a17));
                    }
                    try {
                        w6.i iVar = (w6.i) bVar;
                        if (iVar.f443126a.b(iVar.f443127b, f17.b(0), iVar.f443128c)) {
                            r6.f.a(f17.f392747d, f17, true);
                            f17.f392746c = true;
                        }
                        if (!z17) {
                            try {
                                f17.a();
                            } catch (java.io.IOException unused) {
                            }
                        }
                    } finally {
                        if (!f17.f392746c) {
                            try {
                                f17.a();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                    }
                }
            } catch (java.io.IOException unused3) {
                android.util.Log.isLoggable("DiskLruCacheWrapper", 5);
            }
        } finally {
            this.f459597d.a(a17);
        }
    }
}
