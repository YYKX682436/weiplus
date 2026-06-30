package zq1;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475021d = 0;

    public r(zq1.s sVar, zq1.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475021d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475021d;
        this.f475021d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.booter.notification.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
