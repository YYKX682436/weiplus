package e42;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f249346d = 0;

    public r(e42.s sVar, e42.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f249346d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f249346d;
        this.f249346d = i17 + 1;
        if (i17 == 0) {
            return w52.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
