package y80;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f459943d = 0;

    public v(y80.w wVar, y80.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f459943d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f459943d;
        this.f459943d = i17 + 1;
        if (i17 == 0) {
            return y80.f1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
