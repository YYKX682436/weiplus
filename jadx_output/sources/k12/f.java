package k12;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303181d = 0;

    public f(k12.g gVar, k12.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303181d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303181d;
        this.f303181d = i17 + 1;
        if (i17 == 0) {
            return g30.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
