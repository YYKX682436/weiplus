package ez;

/* loaded from: classes6.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f257721d = 0;

    public d0(ez.e0 e0Var, ez.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f257721d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f257721d;
        this.f257721d = i17 + 1;
        if (i17 == 0) {
            return ez.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
