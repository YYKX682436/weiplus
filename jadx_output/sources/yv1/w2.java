package yv1;

/* loaded from: classes6.dex */
public class w2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f466186d = 0;

    public w2(yv1.x2 x2Var, yv1.v2 v2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f466186d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f466186d;
        this.f466186d = i17 + 1;
        if (i17 == 0) {
            return yv1.m3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
