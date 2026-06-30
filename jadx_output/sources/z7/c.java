package z7;

/* loaded from: classes16.dex */
public class c extends z7.l implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f470467d = new java.util.ArrayList();

    @Override // z7.l
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z7.c.class != obj.getClass()) {
            return false;
        }
        return ((java.util.ArrayList) this.f470467d).equals(((z7.c) obj).f470467d);
    }

    @Override // z7.l
    public void g(z7.m mVar) {
        mVar.b();
        java.util.Iterator it = iterator();
        boolean z17 = true;
        while (true) {
            z7.b bVar = (z7.b) it;
            if (!bVar.hasNext()) {
                mVar.a();
                return;
            }
            if (!z17) {
                mVar.c();
            }
            ((z7.l) bVar.next()).g(mVar);
            z17 = false;
        }
    }

    public z7.c h(z7.l lVar) {
        if (lVar == null) {
            throw new java.lang.NullPointerException("value is null");
        }
        ((java.util.ArrayList) this.f470467d).add(lVar);
        return this;
    }

    @Override // z7.l
    public int hashCode() {
        return ((java.util.ArrayList) this.f470467d).hashCode();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new z7.b(this, ((java.util.ArrayList) this.f470467d).iterator());
    }
}
