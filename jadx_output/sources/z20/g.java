package z20;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f469547d = 0;

    public g(z20.h hVar, z20.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f469547d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f469547d;
        this.f469547d = i17 + 1;
        if (i17 == 0) {
            return z20.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
