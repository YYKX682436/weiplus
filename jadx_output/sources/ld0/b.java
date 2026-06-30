package ld0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318049d = 0;

    public b(ld0.c cVar, ld0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318049d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318049d;
        this.f318049d = i17 + 1;
        if (i17 == 0) {
            return ld0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
