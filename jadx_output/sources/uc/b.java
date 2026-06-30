package uc;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426255d = 0;

    public b(uc.c cVar, uc.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426255d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426255d;
        this.f426255d = i17 + 1;
        if (i17 == 0) {
            return v40.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
