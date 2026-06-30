package z60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f470312d = 0;

    public b(z60.c cVar, z60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f470312d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f470312d;
        this.f470312d = i17 + 1;
        if (i17 == 0) {
            return z60.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
