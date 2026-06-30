package rv;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399869d = 0;

    public k(rv.l lVar, rv.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399869d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399869d;
        this.f399869d = i17 + 1;
        if (i17 == 0) {
            return bv.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
