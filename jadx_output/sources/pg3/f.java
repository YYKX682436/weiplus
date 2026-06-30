package pg3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f354203d = 0;

    public f(pg3.g gVar, pg3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f354203d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f354203d;
        this.f354203d = i17 + 1;
        if (i17 == 0) {
            return pg3.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
