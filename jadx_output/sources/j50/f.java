package j50;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297785d = 0;

    public f(j50.g gVar, j50.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297785d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f297785d;
        this.f297785d = i17 + 1;
        if (i17 == 0) {
            return j50.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
