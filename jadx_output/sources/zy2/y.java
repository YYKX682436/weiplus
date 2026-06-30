package zy2;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477605d = 0;

    public y(zy2.z zVar, zy2.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477605d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477605d;
        this.f477605d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.a1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
