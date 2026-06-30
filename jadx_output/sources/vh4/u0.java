package vh4;

/* loaded from: classes.dex */
public class u0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f437149d = 0;

    public u0(vh4.v0 v0Var, vh4.t0 t0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f437149d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f437149d;
        this.f437149d = i17 + 1;
        if (i17 == 0) {
            return vh4.x2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
