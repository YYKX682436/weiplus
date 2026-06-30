package r82;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f393303d = 0;

    public b(r82.c cVar, r82.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f393303d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f393303d;
        this.f393303d = i17 + 1;
        if (i17 == 0) {
            return r82.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
