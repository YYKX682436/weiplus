package k70;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304671d = 0;

    public r(k70.s sVar, k70.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304671d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304671d;
        this.f304671d = i17 + 1;
        if (i17 == 0) {
            return j70.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
