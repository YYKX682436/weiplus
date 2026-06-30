package df0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f229629d = 0;

    public f(df0.g gVar, df0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f229629d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f229629d;
        this.f229629d = i17 + 1;
        if (i17 == 0) {
            return cf0.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
