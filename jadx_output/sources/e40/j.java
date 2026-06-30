package e40;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f247619d = 0;

    public j(e40.k kVar, e40.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f247619d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f247619d;
        this.f247619d = i17 + 1;
        if (i17 == 0) {
            return d40.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
