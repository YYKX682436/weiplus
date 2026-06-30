package m33;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323300d = 0;

    public j(m33.k kVar, m33.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323300d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323300d;
        this.f323300d = i17 + 1;
        if (i17 == 0) {
            return i53.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
