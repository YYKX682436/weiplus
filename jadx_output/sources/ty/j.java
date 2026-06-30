package ty;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f422724d = 0;

    public j(ty.k kVar, ty.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f422724d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f422724d;
        this.f422724d = i17 + 1;
        if (i17 == 0) {
            return sy.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
