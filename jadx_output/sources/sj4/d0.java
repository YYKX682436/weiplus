package sj4;

/* loaded from: classes.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f408832d = 0;

    public d0(sj4.e0 e0Var, sj4.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f408832d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f408832d;
        this.f408832d = i17 + 1;
        if (i17 == 0) {
            return sj4.p1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
