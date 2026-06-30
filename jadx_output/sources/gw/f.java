package gw;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f276125d = 0;

    public f(gw.g gVar, gw.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f276125d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f276125d;
        this.f276125d = i17 + 1;
        if (i17 == 0) {
            return hw.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
