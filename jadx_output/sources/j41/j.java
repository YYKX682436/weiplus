package j41;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297646d = 0;

    public j(j41.k kVar, j41.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297646d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f297646d;
        this.f297646d = i17 + 1;
        if (i17 == 0) {
            return l41.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
