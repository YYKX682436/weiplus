package r31;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368953d = 0;

    public f(r31.g gVar, r31.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368953d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368953d;
        this.f368953d = i17 + 1;
        if (i17 == 0) {
            return bf5.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
