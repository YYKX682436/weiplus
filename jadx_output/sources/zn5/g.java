package zn5;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f474513d = 0;

    public g(zn5.h hVar, zn5.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f474513d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f474513d;
        this.f474513d = i17 + 1;
        if (i17 == 0) {
            return zn5.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
