package g90;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f269766d = 0;

    public x(g90.y yVar, g90.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f269766d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f269766d;
        this.f269766d = i17 + 1;
        if (i17 == 0) {
            return g90.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
