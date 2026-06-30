package j55;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297830d = 0;

    public b(j55.c cVar, j55.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297830d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f297830d;
        this.f297830d = i17 + 1;
        if (i17 == 0) {
            return j55.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
