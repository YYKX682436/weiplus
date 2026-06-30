package uz;

/* loaded from: classes6.dex */
public class m1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f432069d = 0;

    public m1(uz.n1 n1Var, uz.l1 l1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432069d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f432069d;
        this.f432069d = i17 + 1;
        if (i17 == 0) {
            return uz.f2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
