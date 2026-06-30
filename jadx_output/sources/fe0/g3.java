package fe0;

/* loaded from: classes6.dex */
public class g3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261395d = 0;

    public g3(fe0.h3 h3Var, fe0.f3 f3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261395d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261395d;
        this.f261395d = i17 + 1;
        if (i17 == 0) {
            return ee0.a5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
