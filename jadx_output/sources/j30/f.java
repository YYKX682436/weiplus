package j30;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297348d = 0;

    public f(j30.g gVar, j30.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297348d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f297348d;
        this.f297348d = i17 + 1;
        if (i17 == 0) {
            return i30.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
