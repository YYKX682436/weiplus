package d21;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f225811d = 0;

    public h(d21.i iVar, d21.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f225811d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f225811d;
        this.f225811d = i17 + 1;
        if (i17 == 0) {
            return d21.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
