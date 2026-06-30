package mh0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f326280d = 0;

    public b(mh0.c cVar, mh0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f326280d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f326280d;
        this.f326280d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.wxpay.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
