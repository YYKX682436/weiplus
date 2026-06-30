package mq1;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f330703d = 0;

    public z(mq1.a0 a0Var, mq1.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f330703d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f330703d;
        this.f330703d = i17 + 1;
        if (i17 == 0) {
            return mq1.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
