package um;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428683d = 0;

    public i(um.j jVar, um.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428683d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428683d;
        this.f428683d = i17 + 1;
        if (i17 == 0) {
            return m11.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
