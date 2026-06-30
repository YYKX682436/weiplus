package iq;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f293631d = 0;

    public h(iq.i iVar, iq.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f293631d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f293631d;
        this.f293631d = i17 + 1;
        if (i17 == 0) {
            return iq.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
