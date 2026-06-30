package y80;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f459866d = 0;

    public j(y80.k kVar, y80.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f459866d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f459866d;
        this.f459866d = i17 + 1;
        if (i17 == 0) {
            return y80.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
