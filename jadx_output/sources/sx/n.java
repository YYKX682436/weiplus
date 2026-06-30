package sx;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f413504d = 0;

    public n(sx.o oVar, sx.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f413504d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f413504d;
        this.f413504d = i17 + 1;
        if (i17 == 0) {
            return rx.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
