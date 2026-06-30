package vi1;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f437265d = 0;

    public a0(vi1.b0 b0Var, vi1.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f437265d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f437265d;
        this.f437265d = i17 + 1;
        if (i17 == 0) {
            return cb1.d1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
