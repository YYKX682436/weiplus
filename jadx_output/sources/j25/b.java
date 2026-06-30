package j25;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297308d = 0;

    public b(j25.c cVar, j25.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297308d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f297308d;
        this.f297308d = i17 + 1;
        if (i17 == 0) {
            return j25.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
