package rz;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f401777d = 0;

    public b(rz.c cVar, rz.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f401777d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f401777d;
        this.f401777d = i17 + 1;
        if (i17 == 0) {
            return qz.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
