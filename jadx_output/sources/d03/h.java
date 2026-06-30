package d03;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f225365d = 0;

    public h(d03.i iVar, d03.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f225365d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f225365d;
        this.f225365d = i17 + 1;
        if (i17 == 0) {
            return d03.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
