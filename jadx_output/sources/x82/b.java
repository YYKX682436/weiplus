package x82;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f452494d = 0;

    public b(x82.c cVar, x82.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f452494d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f452494d;
        this.f452494d = i17 + 1;
        if (i17 == 0) {
            return x82.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
