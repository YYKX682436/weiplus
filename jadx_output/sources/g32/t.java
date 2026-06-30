package g32;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f268168d = 0;

    public t(g32.u uVar, g32.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f268168d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f268168d;
        this.f268168d = i17 + 1;
        if (i17 == 0) {
            return g32.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
