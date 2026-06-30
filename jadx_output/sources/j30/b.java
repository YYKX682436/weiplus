package j30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297345d = 0;

    public b(j30.c cVar, j30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297345d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f297345d;
        this.f297345d = i17 + 1;
        if (i17 == 0) {
            return gb0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
