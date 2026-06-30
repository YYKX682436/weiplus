package r21;

/* loaded from: classes.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368794d = 0;

    public o(r21.p pVar, r21.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368794d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368794d;
        this.f368794d = i17 + 1;
        if (i17 == 0) {
            return r21.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
