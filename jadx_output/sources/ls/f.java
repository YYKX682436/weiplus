package ls;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f320774d = 0;

    public f(ls.g gVar, ls.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f320774d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f320774d;
        this.f320774d = i17 + 1;
        if (i17 == 0) {
            return ls.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
