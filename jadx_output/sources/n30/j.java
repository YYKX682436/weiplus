package n30;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f334464d = 0;

    public j(n30.k kVar, n30.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334464d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334464d;
        this.f334464d = i17 + 1;
        if (i17 == 0) {
            return m30.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
