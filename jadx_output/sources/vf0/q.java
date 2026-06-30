package vf0;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436251d = 0;

    public q(vf0.r rVar, vf0.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436251d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436251d;
        this.f436251d = i17 + 1;
        if (i17 == 0) {
            return vf0.i1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
