package em3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f255187d = 0;

    public b(em3.c cVar, em3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f255187d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f255187d;
        this.f255187d = i17 + 1;
        if (i17 == 0) {
            return em3.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
