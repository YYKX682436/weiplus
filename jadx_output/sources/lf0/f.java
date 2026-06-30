package lf0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318207d = 0;

    public f(lf0.g gVar, lf0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318207d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318207d;
        this.f318207d = i17 + 1;
        if (i17 == 0) {
            return lf0.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
