package el4;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f254022d = 0;

    public m(el4.n nVar, el4.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f254022d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f254022d;
        this.f254022d = i17 + 1;
        if (i17 == 0) {
            return el4.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
