package lc5;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318014d = 0;

    public j(lc5.k kVar, lc5.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318014d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318014d;
        this.f318014d = i17 + 1;
        if (i17 == 0) {
            return lc5.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
