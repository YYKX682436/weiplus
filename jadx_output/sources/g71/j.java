package g71;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f269206d = 0;

    public j(g71.k kVar, g71.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f269206d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f269206d;
        this.f269206d = i17 + 1;
        if (i17 == 0) {
            return g71.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
