package jr4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301400d = 0;

    public b(jr4.c cVar, jr4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301400d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301400d;
        this.f301400d = i17 + 1;
        if (i17 == 0) {
            return jr4.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
