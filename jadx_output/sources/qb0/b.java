package qb0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361143d = 0;

    public b(qb0.c cVar, qb0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361143d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361143d;
        this.f361143d = i17 + 1;
        if (i17 == 0) {
            return qb0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
