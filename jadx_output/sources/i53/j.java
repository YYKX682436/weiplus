package i53;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f288604d = 0;

    public j(i53.k kVar, i53.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f288604d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f288604d;
        this.f288604d = i17 + 1;
        if (i17 == 0) {
            return i53.z3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
