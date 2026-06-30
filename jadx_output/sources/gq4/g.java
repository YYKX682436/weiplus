package gq4;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f274584d = 0;

    public g(gq4.h hVar, gq4.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f274584d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f274584d;
        this.f274584d = i17 + 1;
        if (i17 == 0) {
            return gq4.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
