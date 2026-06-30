package dj3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f232907d = 0;

    public b(dj3.c cVar, dj3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f232907d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f232907d;
        this.f232907d = i17 + 1;
        if (i17 == 0) {
            return dj3.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
