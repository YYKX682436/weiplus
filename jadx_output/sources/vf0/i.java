package vf0;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436189d = 0;

    public i(vf0.j jVar, vf0.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436189d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436189d;
        this.f436189d = i17 + 1;
        if (i17 == 0) {
            return vf0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
