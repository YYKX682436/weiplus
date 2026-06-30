package z62;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f470345d = 0;

    public j(z62.k kVar, z62.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f470345d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f470345d;
        this.f470345d = i17 + 1;
        if (i17 == 0) {
            return z62.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
