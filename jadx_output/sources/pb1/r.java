package pb1;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353161d = 0;

    public r(pb1.s sVar, pb1.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353161d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353161d;
        this.f353161d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.luggage.sdk.customize.impl.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
