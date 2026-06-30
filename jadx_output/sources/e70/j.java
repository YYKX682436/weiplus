package e70;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f249849d = 0;

    public j(e70.k kVar, e70.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f249849d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f249849d;
        this.f249849d = i17 + 1;
        if (i17 == 0) {
            return d83.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
