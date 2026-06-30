package zy2;

/* loaded from: classes6.dex */
public class w2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477600d = 0;

    public w2(zy2.x2 x2Var, zy2.v2 v2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477600d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477600d;
        this.f477600d = i17 + 1;
        if (i17 == 0) {
            return c61.u8.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
