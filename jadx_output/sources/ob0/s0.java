package ob0;

/* loaded from: classes6.dex */
public class s0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343940d = 0;

    public s0(ob0.t0 t0Var, ob0.r0 r0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343940d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343940d;
        this.f343940d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
