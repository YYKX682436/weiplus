package pu3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f358426d = 0;

    public b(pu3.c cVar, pu3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f358426d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f358426d;
        this.f358426d = i17 + 1;
        if (i17 == 0) {
            return pu3.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
