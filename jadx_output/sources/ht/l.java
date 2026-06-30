package ht;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f284645d = 0;

    public l(ht.m mVar, ht.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f284645d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f284645d;
        this.f284645d = i17 + 1;
        if (i17 == 0) {
            return ht.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
