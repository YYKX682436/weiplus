package g73;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f269266d = 0;

    public f(g73.g gVar, g73.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f269266d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f269266d;
        this.f269266d = i17 + 1;
        if (i17 == 0) {
            return g73.k2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
