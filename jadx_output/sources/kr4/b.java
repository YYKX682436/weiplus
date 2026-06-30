package kr4;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f311501d = 0;

    public b(kr4.c cVar, kr4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f311501d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f311501d;
        this.f311501d = i17 + 1;
        if (i17 == 0) {
            return kr4.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
