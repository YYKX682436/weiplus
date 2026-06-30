package kq3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f311267d = 0;

    public b(kq3.c cVar, kq3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f311267d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f311267d;
        this.f311267d = i17 + 1;
        if (i17 == 0) {
            return kq3.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
