package j00;

/* loaded from: classes6.dex */
public class c3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f296738d = 0;

    public c3(j00.d3 d3Var, j00.b3 b3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f296738d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f296738d;
        this.f296738d = i17 + 1;
        if (i17 == 0) {
            return j00.p1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
