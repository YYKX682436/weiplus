package em3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f255190d = 0;

    public f(em3.g gVar, em3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f255190d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f255190d;
        this.f255190d = i17 + 1;
        if (i17 == 0) {
            return em3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
