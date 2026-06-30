package v70;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f433611d = 0;

    public l(v70.m mVar, v70.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f433611d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f433611d;
        this.f433611d = i17 + 1;
        if (i17 == 0) {
            return v70.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
