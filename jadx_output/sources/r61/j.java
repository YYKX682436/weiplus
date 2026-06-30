package r61;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f392887d = 0;

    public j(r61.k kVar, r61.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f392887d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f392887d;
        this.f392887d = i17 + 1;
        if (i17 == 0) {
            return r61.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
