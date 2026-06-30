package f5;

/* loaded from: classes13.dex */
public class d implements g5.c {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f259572d = a5.a0.e("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final f5.c f259573a;

    /* renamed from: b, reason: collision with root package name */
    public final g5.d[] f259574b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f259575c;

    public d(android.content.Context context, m5.a aVar, f5.c cVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f259573a = cVar;
        this.f259574b = new g5.d[]{new g5.a(applicationContext, aVar), new g5.b(applicationContext, aVar), new g5.i(applicationContext, aVar), new g5.e(applicationContext, aVar), new g5.h(applicationContext, aVar), new g5.g(applicationContext, aVar), new g5.f(applicationContext, aVar)};
        this.f259575c = new java.lang.Object();
    }

    public boolean a(java.lang.String str) {
        synchronized (this.f259575c) {
            for (g5.d dVar : this.f259574b) {
                java.lang.Object obj = dVar.f268878b;
                if (obj != null && dVar.b(obj) && ((java.util.ArrayList) dVar.f268877a).contains(str)) {
                    a5.a0.c().a(f259572d, java.lang.String.format("Work %s constrained by %s", str, dVar.getClass().getSimpleName()), new java.lang.Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void b(java.lang.Iterable iterable) {
        synchronized (this.f259575c) {
            for (g5.d dVar : this.f259574b) {
                if (dVar.f268880d != null) {
                    dVar.f268880d = null;
                    dVar.d(null, dVar.f268878b);
                }
            }
            for (g5.d dVar2 : this.f259574b) {
                dVar2.c(iterable);
            }
            for (g5.d dVar3 : this.f259574b) {
                if (dVar3.f268880d != this) {
                    dVar3.f268880d = this;
                    dVar3.d(this, dVar3.f268878b);
                }
            }
        }
    }

    public void c() {
        synchronized (this.f259575c) {
            for (g5.d dVar : this.f259574b) {
                java.util.List list = dVar.f268877a;
                if (!((java.util.ArrayList) list).isEmpty()) {
                    ((java.util.ArrayList) list).clear();
                    h5.f fVar = dVar.f268879c;
                    synchronized (fVar.f278989c) {
                        if (fVar.f278990d.remove(dVar) && fVar.f278990d.isEmpty()) {
                            fVar.d();
                        }
                    }
                }
            }
        }
    }
}
