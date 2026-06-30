package k41;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304048d = 0;

    public v(k41.w wVar, k41.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304048d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304048d;
        this.f304048d = i17 + 1;
        if (i17 == 0) {
            return k41.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
