package zs3;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475268d = 0;

    public j(zs3.k kVar, zs3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475268d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475268d;
        this.f475268d = i17 + 1;
        if (i17 == 0) {
            return bt3.m1.INSTANCE;
        }
        if (i17 == 1) {
            return bz4.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
