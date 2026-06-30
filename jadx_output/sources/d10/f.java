package d10;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f225648d = 0;

    public f(d10.g gVar, d10.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f225648d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f225648d;
        this.f225648d = i17 + 1;
        if (i17 == 0) {
            return hw.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
