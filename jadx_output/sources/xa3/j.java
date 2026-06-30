package xa3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f452793d = 0;

    public j(xa3.k kVar, xa3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f452793d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f452793d;
        this.f452793d = i17 + 1;
        if (i17 == 0) {
            return xa3.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
