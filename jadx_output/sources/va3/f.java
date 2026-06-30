package va3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434277d = 0;

    public f(va3.g gVar, va3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434277d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434277d;
        this.f434277d = i17 + 1;
        if (i17 == 0) {
            return va3.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
