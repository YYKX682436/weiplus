package g0;

/* loaded from: classes16.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f267379d = 0;

    public x(g0.y yVar, g0.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f267379d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f267379d;
        this.f267379d = i17 + 1;
        if (i17 == 0) {
            return g0.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
