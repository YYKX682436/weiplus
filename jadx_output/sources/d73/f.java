package d73;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f226886d = 0;

    public f(d73.g gVar, d73.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f226886d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f226886d;
        this.f226886d = i17 + 1;
        if (i17 == 0) {
            return c73.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
