package m11;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f322776d = 0;

    public t(m11.u uVar, m11.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f322776d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f322776d;
        this.f322776d = i17 + 1;
        if (i17 == 0) {
            return m11.y0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
