package u50;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424762d = 0;

    public j(u50.k kVar, u50.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424762d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424762d;
        this.f424762d = i17 + 1;
        if (i17 == 0) {
            return s50.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
