package x80;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f452479d = 0;

    public b(x80.c cVar, x80.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f452479d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f452479d;
        this.f452479d = i17 + 1;
        if (i17 == 0) {
            return x80.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
