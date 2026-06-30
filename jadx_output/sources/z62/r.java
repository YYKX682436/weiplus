package z62;

/* loaded from: classes.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f470351d = 0;

    public r(z62.s sVar, z62.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f470351d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f470351d;
        this.f470351d = i17 + 1;
        if (i17 == 0) {
            return z62.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
