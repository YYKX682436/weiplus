package vb0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434461d = 0;

    public b(vb0.c cVar, vb0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434461d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434461d;
        this.f434461d = i17 + 1;
        if (i17 == 0) {
            return i90.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
