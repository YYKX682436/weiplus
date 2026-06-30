package q;

/* loaded from: classes13.dex */
public class a extends q.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f359201h = new java.util.HashMap();

    @Override // q.h
    public q.d d(java.lang.Object obj) {
        return (q.d) this.f359201h.get(obj);
    }

    @Override // q.h
    public java.lang.Object e(java.lang.Object obj, java.lang.Object obj2) {
        q.d d17 = d(obj);
        if (d17 != null) {
            return d17.f359203e;
        }
        java.util.HashMap hashMap = this.f359201h;
        q.d dVar = new q.d(obj, obj2);
        this.f359214g++;
        q.d dVar2 = this.f359212e;
        if (dVar2 == null) {
            this.f359211d = dVar;
            this.f359212e = dVar;
        } else {
            dVar2.f359204f = dVar;
            dVar.f359205g = dVar2;
            this.f359212e = dVar;
        }
        hashMap.put(obj, dVar);
        return null;
    }

    @Override // q.h
    public java.lang.Object g(java.lang.Object obj) {
        java.lang.Object g17 = super.g(obj);
        this.f359201h.remove(obj);
        return g17;
    }
}
