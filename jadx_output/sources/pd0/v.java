package pd0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353515d = 0;

    public v(pd0.w wVar, pd0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353515d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353515d;
        this.f353515d = i17 + 1;
        if (i17 == 0) {
            return pd0.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
