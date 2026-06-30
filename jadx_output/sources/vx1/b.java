package vx1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441222d = 0;

    public b(vx1.c cVar, vx1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441222d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441222d;
        this.f441222d = i17 + 1;
        if (i17 == 0) {
            return vx1.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
