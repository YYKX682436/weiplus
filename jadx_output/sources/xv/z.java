package xv;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f457369d = 0;

    public z(xv.a0 a0Var, xv.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f457369d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f457369d;
        this.f457369d = i17 + 1;
        if (i17 == 0) {
            return wv.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
