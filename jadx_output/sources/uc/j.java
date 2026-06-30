package uc;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426261d = 0;

    public j(uc.k kVar, uc.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426261d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426261d;
        this.f426261d = i17 + 1;
        if (i17 == 0) {
            return v40.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
