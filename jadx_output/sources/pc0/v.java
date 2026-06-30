package pc0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353321d = 0;

    public v(pc0.w wVar, pc0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353321d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353321d;
        this.f353321d = i17 + 1;
        if (i17 == 0) {
            return pc0.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
