package lm1;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f319351d = 0;

    public l(lm1.m mVar, lm1.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f319351d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f319351d;
        this.f319351d = i17 + 1;
        if (i17 == 0) {
            return lm1.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
