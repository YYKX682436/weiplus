package t6;

/* loaded from: classes13.dex */
public final class l implements t6.h {

    /* renamed from: b, reason: collision with root package name */
    public final x.b f415973b = new q7.d();

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        int i17 = 0;
        while (true) {
            x.b bVar = this.f415973b;
            if (i17 >= bVar.f450846f) {
                return;
            }
            t6.k kVar = (t6.k) bVar.h(i17);
            java.lang.Object l17 = this.f415973b.l(i17);
            t6.j jVar = kVar.f415970b;
            if (kVar.f415972d == null) {
                kVar.f415972d = kVar.f415971c.getBytes(t6.h.f415967a);
            }
            jVar.a(kVar.f415972d, l17, messageDigest);
            i17++;
        }
    }

    public java.lang.Object c(t6.k kVar) {
        x.b bVar = this.f415973b;
        return bVar.containsKey(kVar) ? bVar.getOrDefault(kVar, null) : kVar.f415969a;
    }

    @Override // t6.h
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof t6.l) {
            return this.f415973b.equals(((t6.l) obj).f415973b);
        }
        return false;
    }

    @Override // t6.h
    public int hashCode() {
        return this.f415973b.hashCode();
    }

    public java.lang.String toString() {
        return "Options{values=" + this.f415973b + '}';
    }
}
