package lt;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f321155d = 0;

    public r(lt.s sVar, lt.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f321155d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f321155d;
        this.f321155d = i17 + 1;
        if (i17 == 0) {
            return kt.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
