package j05;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297033d = 0;

    public b(j05.c cVar, j05.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297033d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f297033d;
        this.f297033d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.wxpay.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
