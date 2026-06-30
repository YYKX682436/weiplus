package gt;

/* loaded from: classes6.dex */
public class h3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f275232d = 0;

    public h3(gt.i3 i3Var, gt.g3 g3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f275232d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f275232d;
        this.f275232d = i17 + 1;
        if (i17 == 0) {
            return gt.h6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
