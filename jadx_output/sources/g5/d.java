package g5;

/* loaded from: classes13.dex */
public abstract class d implements f5.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f268877a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f268878b;

    /* renamed from: c, reason: collision with root package name */
    public final h5.f f268879c;

    /* renamed from: d, reason: collision with root package name */
    public g5.c f268880d;

    public d(h5.f fVar) {
        this.f268879c = fVar;
    }

    public abstract boolean a(j5.w wVar);

    public abstract boolean b(java.lang.Object obj);

    public void c(java.lang.Iterable iterable) {
        ((java.util.ArrayList) this.f268877a).clear();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            j5.w wVar = (j5.w) it.next();
            if (a(wVar)) {
                ((java.util.ArrayList) this.f268877a).add(wVar.f297764a);
            }
        }
        if (((java.util.ArrayList) this.f268877a).isEmpty()) {
            h5.f fVar = this.f268879c;
            synchronized (fVar.f278989c) {
                if (fVar.f278990d.remove(this) && fVar.f278990d.isEmpty()) {
                    fVar.d();
                }
            }
        } else {
            h5.f fVar2 = this.f268879c;
            synchronized (fVar2.f278989c) {
                try {
                    if (fVar2.f278990d.add(this)) {
                        if (fVar2.f278990d.size() == 1) {
                            fVar2.f278991e = fVar2.a();
                            a5.a0.c().a(h5.f.f278986f, java.lang.String.format("%s: initial state = %s", fVar2.getClass().getSimpleName(), fVar2.f278991e), new java.lang.Throwable[0]);
                            fVar2.c();
                        }
                        java.lang.Object obj = fVar2.f278991e;
                        this.f268878b = obj;
                        d(this.f268880d, obj);
                    }
                } finally {
                }
            }
        }
        d(this.f268880d, this.f268878b);
    }

    public final void d(g5.c cVar, java.lang.Object obj) {
        if (((java.util.ArrayList) this.f268877a).isEmpty() || cVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            java.util.List list = this.f268877a;
            f5.d dVar = (f5.d) cVar;
            synchronized (dVar.f259575c) {
                f5.c cVar2 = dVar.f259573a;
                if (cVar2 != null) {
                    cVar2.a(list);
                }
            }
            return;
        }
        java.util.List list2 = this.f268877a;
        f5.d dVar2 = (f5.d) cVar;
        synchronized (dVar2.f259575c) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (dVar2.a(str)) {
                    a5.a0.c().a(f5.d.f259572d, java.lang.String.format("Constraints met for %s", str), new java.lang.Throwable[0]);
                    arrayList.add(str);
                }
            }
            f5.c cVar3 = dVar2.f259573a;
            if (cVar3 != null) {
                cVar3.f(arrayList);
            }
        }
    }
}
