package i70;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f289399d = 0;

    public b(i70.c cVar, i70.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f289399d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f289399d;
        this.f289399d = i17 + 1;
        if (i17 == 0) {
            return i70.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
