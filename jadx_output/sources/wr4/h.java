package wr4;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f448938d = 0;

    public h(wr4.i iVar, wr4.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f448938d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f448938d;
        this.f448938d = i17 + 1;
        if (i17 == 0) {
            return wr4.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
