package i63;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f288970d = 0;

    public b(i63.c cVar, i63.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f288970d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f288970d;
        this.f288970d = i17 + 1;
        if (i17 == 0) {
            return i63.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
