package ge0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270895d = 0;

    public f(ge0.g gVar, ge0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270895d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270895d;
        this.f270895d = i17 + 1;
        if (i17 == 0) {
            return ge0.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
