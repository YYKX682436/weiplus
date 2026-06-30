package k90;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f305515d = 0;

    public i(k90.j jVar, k90.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f305515d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f305515d;
        this.f305515d = i17 + 1;
        if (i17 == 0) {
            return k90.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
