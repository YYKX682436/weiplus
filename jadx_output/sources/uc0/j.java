package uc0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426272d = 0;

    public j(uc0.k kVar, uc0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426272d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426272d;
        this.f426272d = i17 + 1;
        if (i17 == 0) {
            return tc0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
