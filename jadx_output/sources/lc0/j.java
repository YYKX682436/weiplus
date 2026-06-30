package lc0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f317851d = 0;

    public j(lc0.k kVar, lc0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f317851d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f317851d;
        this.f317851d = i17 + 1;
        if (i17 == 0) {
            return lc0.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
