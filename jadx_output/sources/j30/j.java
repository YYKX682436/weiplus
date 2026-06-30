package j30;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297351d = 0;

    public j(j30.k kVar, j30.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297351d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f297351d;
        this.f297351d = i17 + 1;
        if (i17 == 0) {
            return hs.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
