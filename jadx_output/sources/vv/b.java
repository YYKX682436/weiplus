package vv;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f440366d = 0;

    public b(vv.c cVar, vv.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440366d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f440366d;
        this.f440366d = i17 + 1;
        if (i17 == 0) {
            return uv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
