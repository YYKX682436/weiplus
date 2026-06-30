package g61;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f269062d = 0;

    public m(g61.n nVar, g61.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f269062d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f269062d;
        this.f269062d = i17 + 1;
        if (i17 == 0) {
            return g61.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
