package hr0;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f283298d = 0;

    public h(hr0.i iVar, hr0.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f283298d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f283298d;
        this.f283298d = i17 + 1;
        if (i17 == 0) {
            return hr0.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
