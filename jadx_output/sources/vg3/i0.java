package vg3;

/* loaded from: classes6.dex */
public class i0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436708d = 0;

    public i0(vg3.j0 j0Var, vg3.h0 h0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436708d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436708d;
        this.f436708d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.messenger.foundation.d2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
