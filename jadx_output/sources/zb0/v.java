package zb0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f471252d = 0;

    public v(zb0.w wVar, zb0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f471252d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f471252d;
        this.f471252d = i17 + 1;
        if (i17 == 0) {
            return yb0.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
