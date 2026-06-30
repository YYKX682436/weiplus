package vd2;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436036d = 0;

    public z(vd2.a0 a0Var, vd2.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436036d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436036d;
        this.f436036d = i17 + 1;
        if (i17 == 0) {
            return vd2.c3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
