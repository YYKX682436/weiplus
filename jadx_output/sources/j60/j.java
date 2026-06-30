package j60;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297852d = 0;

    public j(j60.k kVar, j60.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297852d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f297852d;
        this.f297852d = i17 + 1;
        if (i17 == 0) {
            return j60.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
