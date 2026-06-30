package pg0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353985d = 0;

    public f(pg0.g gVar, pg0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353985d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353985d;
        this.f353985d = i17 + 1;
        if (i17 == 0) {
            return pg0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
