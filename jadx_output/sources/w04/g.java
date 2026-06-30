package w04;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441927d = 0;

    public g(w04.h hVar, w04.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441927d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441927d;
        this.f441927d = i17 + 1;
        if (i17 == 0) {
            return od0.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
