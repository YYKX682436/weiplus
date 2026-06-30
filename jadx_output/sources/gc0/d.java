package gc0;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270121d = 0;

    public d(gc0.e eVar, gc0.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270121d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270121d;
        this.f270121d = i17 + 1;
        if (i17 == 0) {
            return gc0.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
