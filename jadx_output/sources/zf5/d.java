package zf5;

/* loaded from: classes.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f472711d = 0;

    public d(zf5.e eVar, zf5.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f472711d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f472711d;
        this.f472711d = i17 + 1;
        if (i17 == 0) {
            return zf5.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
