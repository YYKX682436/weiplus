package f01;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f258373d = 0;

    public o(f01.p pVar, f01.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f258373d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f258373d;
        this.f258373d = i17 + 1;
        if (i17 == 0) {
            return f01.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
