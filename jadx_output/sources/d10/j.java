package d10;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f225651d = 0;

    public j(d10.k kVar, d10.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f225651d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f225651d;
        this.f225651d = i17 + 1;
        if (i17 == 0) {
            return hw.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
