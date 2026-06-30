package kg0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f307677d = 0;

    public j(kg0.k kVar, kg0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f307677d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f307677d;
        this.f307677d = i17 + 1;
        if (i17 == 0) {
            return kg0.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
