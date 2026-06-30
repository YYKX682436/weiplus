package p41;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f351752d = 0;

    public b(p41.c cVar, p41.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351752d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f351752d;
        this.f351752d = i17 + 1;
        if (i17 == 0) {
            return p41.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
