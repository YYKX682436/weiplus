package di3;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f232699d = 0;

    public f(di3.g gVar, di3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f232699d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f232699d;
        this.f232699d = i17 + 1;
        if (i17 == 0) {
            return di3.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
