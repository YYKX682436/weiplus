package pq;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f357563d = 0;

    public m(pq.n nVar, pq.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f357563d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f357563d;
        this.f357563d = i17 + 1;
        if (i17 == 0) {
            return t20.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
