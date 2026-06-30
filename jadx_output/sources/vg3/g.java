package vg3;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436700d = 0;

    public g(vg3.h hVar, vg3.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436700d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436700d;
        this.f436700d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.messenger.foundation.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
