package ob0;

/* loaded from: classes6.dex */
public class y1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343982d = 0;

    public y1(ob0.z1 z1Var, ob0.x1 x1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343982d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343982d;
        this.f343982d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.v4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
