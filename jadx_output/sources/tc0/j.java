package tc0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f417117d = 0;

    public j(tc0.k kVar, tc0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f417117d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f417117d;
        this.f417117d = i17 + 1;
        if (i17 == 0) {
            return tc0.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
