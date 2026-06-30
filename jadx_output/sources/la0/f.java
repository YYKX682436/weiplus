package la0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f317469d = 0;

    public f(la0.g gVar, la0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f317469d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f317469d;
        this.f317469d = i17 + 1;
        if (i17 == 0) {
            return la0.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
