package pt0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f358212d = 0;

    public j(pt0.k kVar, pt0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f358212d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f358212d;
        this.f358212d = i17 + 1;
        if (i17 == 0) {
            return ez.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
