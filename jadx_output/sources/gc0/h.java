package gc0;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270175d = 0;

    public h(gc0.i iVar, gc0.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270175d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270175d;
        this.f270175d = i17 + 1;
        if (i17 == 0) {
            return gc0.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
