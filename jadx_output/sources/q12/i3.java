package q12;

/* loaded from: classes6.dex */
public class i3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359595d = 0;

    public i3(q12.j3 j3Var, q12.h3 h3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359595d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359595d;
        this.f359595d = i17 + 1;
        if (i17 == 0) {
            return q12.c4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
