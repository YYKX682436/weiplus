package ob0;

/* loaded from: classes6.dex */
public class a1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343891d = 0;

    public a1(ob0.b1 b1Var, ob0.z0 z0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343891d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343891d;
        this.f343891d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
