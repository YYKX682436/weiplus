package n40;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f334885d = 0;

    public j(n40.k kVar, n40.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334885d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334885d;
        this.f334885d = i17 + 1;
        if (i17 == 0) {
            return a03.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
