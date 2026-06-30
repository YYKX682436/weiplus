package mv;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331524d = 0;

    public s(mv.t tVar, mv.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331524d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331524d;
        this.f331524d = i17 + 1;
        if (i17 == 0) {
            return nv.x1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
