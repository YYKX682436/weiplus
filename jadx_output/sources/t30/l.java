package t30;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f415379d = 0;

    public l(t30.m mVar, t30.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f415379d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f415379d;
        this.f415379d = i17 + 1;
        if (i17 == 0) {
            return t30.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
