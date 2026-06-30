package zy1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477322d = 0;

    public b(zy1.c cVar, zy1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477322d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477322d;
        this.f477322d = i17 + 1;
        if (i17 == 0) {
            return zy1.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
