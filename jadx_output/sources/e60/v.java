package e60;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f249744d = 0;

    public v(e60.w wVar, e60.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f249744d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f249744d;
        this.f249744d = i17 + 1;
        if (i17 == 0) {
            return d60.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
