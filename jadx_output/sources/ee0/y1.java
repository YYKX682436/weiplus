package ee0;

/* loaded from: classes6.dex */
public class y1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f251560d = 0;

    public y1(ee0.z1 z1Var, ee0.x1 x1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f251560d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f251560d;
        this.f251560d = i17 + 1;
        if (i17 == 0) {
            return ee0.g4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
