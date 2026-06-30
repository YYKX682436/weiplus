package cx;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f224418d = 0;

    public j(cx.k kVar, cx.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f224418d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f224418d;
        this.f224418d = i17 + 1;
        if (i17 == 0) {
            return cx.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
