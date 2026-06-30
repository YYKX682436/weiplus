package wd0;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f444758d = 0;

    public p(wd0.q qVar, wd0.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f444758d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f444758d;
        this.f444758d = i17 + 1;
        if (i17 == 0) {
            return vd0.y1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
