package jg4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f299655d = 0;

    public b(jg4.c cVar, jg4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f299655d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f299655d;
        this.f299655d = i17 + 1;
        if (i17 == 0) {
            return jg4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
