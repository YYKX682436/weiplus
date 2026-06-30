package r30;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368943d = 0;

    public j(r30.k kVar, r30.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368943d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368943d;
        this.f368943d = i17 + 1;
        if (i17 == 0) {
            return q30.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
