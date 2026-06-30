package px;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f358754d = 0;

    public m(px.n nVar, px.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f358754d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f358754d;
        this.f358754d = i17 + 1;
        if (i17 == 0) {
            return px.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
