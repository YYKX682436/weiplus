package yz3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f468531d = 0;

    public j(yz3.k kVar, yz3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f468531d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f468531d;
        this.f468531d = i17 + 1;
        if (i17 == 0) {
            return yz3.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
