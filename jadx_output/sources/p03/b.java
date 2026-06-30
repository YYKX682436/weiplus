package p03;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350424d = 0;

    public b(p03.c cVar, p03.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350424d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350424d;
        this.f350424d = i17 + 1;
        if (i17 == 0) {
            return p03.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
