package zw;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f476547d = 0;

    public x(zw.y yVar, zw.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f476547d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f476547d;
        this.f476547d = i17 + 1;
        if (i17 == 0) {
            return zw.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
