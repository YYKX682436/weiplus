package n62;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335187d = 0;

    public b(n62.c cVar, n62.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335187d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335187d;
        this.f335187d = i17 + 1;
        if (i17 == 0) {
            return n62.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
