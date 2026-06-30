package qb2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361165d = 0;

    public b(qb2.c cVar, qb2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361165d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361165d;
        this.f361165d = i17 + 1;
        if (i17 == 0) {
            return qb2.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
