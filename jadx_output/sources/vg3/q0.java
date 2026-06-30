package vg3;

/* loaded from: classes6.dex */
public class q0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436745d = 0;

    public q0(vg3.r0 r0Var, vg3.p0 p0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436745d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436745d;
        this.f436745d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.messenger.foundation.m2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
