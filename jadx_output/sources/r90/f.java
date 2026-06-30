package r90;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f393445d = 0;

    public f(r90.g gVar, r90.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f393445d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f393445d;
        this.f393445d = i17 + 1;
        if (i17 == 0) {
            return q90.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
