package vr2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439612d = 0;

    public b(vr2.c cVar, vr2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439612d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439612d;
        this.f439612d = i17 + 1;
        if (i17 == 0) {
            return vr2.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
