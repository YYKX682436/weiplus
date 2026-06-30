package ye0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f461156d = 0;

    public b(ye0.c cVar, ye0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f461156d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f461156d;
        this.f461156d = i17 + 1;
        if (i17 == 0) {
            return ye0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
