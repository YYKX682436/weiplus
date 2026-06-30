package kt;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f311873d = 0;

    public j(kt.k kVar, kt.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f311873d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f311873d;
        this.f311873d = i17 + 1;
        if (i17 == 0) {
            return kt.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
