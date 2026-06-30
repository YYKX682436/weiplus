package lc2;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f317868d = 0;

    public f(lc2.g gVar, lc2.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f317868d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f317868d;
        this.f317868d = i17 + 1;
        if (i17 == 0) {
            return lc2.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
