package yg0;

/* loaded from: classes6.dex */
public class n2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f462224d = 0;

    public n2(yg0.o2 o2Var, yg0.m2 m2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f462224d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f462224d;
        this.f462224d = i17 + 1;
        if (i17 == 0) {
            return yg0.v4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
