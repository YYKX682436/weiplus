package n90;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335799d = 0;

    public j(n90.k kVar, n90.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335799d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335799d;
        this.f335799d = i17 + 1;
        if (i17 == 0) {
            return n90.a1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
