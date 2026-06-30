package xj;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f454748d = 0;

    public f(xj.g gVar, xj.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f454748d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f454748d;
        this.f454748d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.advertise.impl.jsapi.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
