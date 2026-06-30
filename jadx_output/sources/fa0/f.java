package fa0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f260655d = 0;

    public f(fa0.g gVar, fa0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f260655d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f260655d;
        this.f260655d = i17 + 1;
        if (i17 == 0) {
            return dh4.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
