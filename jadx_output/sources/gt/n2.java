package gt;

/* loaded from: classes6.dex */
public class n2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f275275d = 0;

    public n2(gt.o2 o2Var, gt.m2 m2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f275275d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f275275d;
        this.f275275d = i17 + 1;
        if (i17 == 0) {
            return gt.s5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
