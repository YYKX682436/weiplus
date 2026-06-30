package ne0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336493d = 0;

    public j(ne0.k kVar, ne0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336493d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336493d;
        this.f336493d = i17 + 1;
        if (i17 == 0) {
            return ne0.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
