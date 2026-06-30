package mq0;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f330591d = 0;

    public o(mq0.p pVar, mq0.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f330591d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f330591d;
        this.f330591d = i17 + 1;
        if (i17 == 0) {
            return mq0.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
