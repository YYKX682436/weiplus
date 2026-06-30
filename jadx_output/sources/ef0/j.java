package ef0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f252236d = 0;

    public j(ef0.k kVar, ef0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f252236d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f252236d;
        this.f252236d = i17 + 1;
        if (i17 == 0) {
            return ef0.g2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
