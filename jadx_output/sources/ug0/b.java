package ug0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f427453d = 0;

    public b(ug0.c cVar, ug0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f427453d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f427453d;
        this.f427453d = i17 + 1;
        if (i17 == 0) {
            return ug0.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
