package yv1;

/* loaded from: classes6.dex */
public class y1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f466192d = 0;

    public y1(yv1.z1 z1Var, yv1.x1 x1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f466192d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f466192d;
        this.f466192d = i17 + 1;
        if (i17 == 0) {
            return yv1.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
