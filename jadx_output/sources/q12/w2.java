package q12;

/* loaded from: classes6.dex */
public class w2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359663d = 0;

    public w2(q12.x2 x2Var, q12.v2 v2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359663d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359663d;
        this.f359663d = i17 + 1;
        if (i17 == 0) {
            return q12.u3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
