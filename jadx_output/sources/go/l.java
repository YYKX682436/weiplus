package go;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f273713d = 0;

    public l(go.m mVar, go.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f273713d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f273713d;
        this.f273713d = i17 + 1;
        if (i17 == 0) {
            return go.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
