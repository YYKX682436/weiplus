package mh0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f326283d = 0;

    public f(mh0.g gVar, mh0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f326283d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f326283d;
        this.f326283d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.wxpay.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
