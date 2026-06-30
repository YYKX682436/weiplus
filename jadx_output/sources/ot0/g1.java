package ot0;

/* loaded from: classes6.dex */
public class g1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348479d = 0;

    public g1(ot0.h1 h1Var, ot0.f1 f1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348479d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348479d;
        this.f348479d = i17 + 1;
        if (i17 == 0) {
            return ot0.s3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
