package fe0;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261368d = 0;

    public a0(fe0.b0 b0Var, fe0.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261368d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261368d;
        this.f261368d = i17 + 1;
        if (i17 == 0) {
            return ee0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
