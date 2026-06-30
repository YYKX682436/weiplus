package to3;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f420950d = 0;

    public c(to3.d dVar, to3.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f420950d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f420950d;
        this.f420950d = i17 + 1;
        if (i17 == 0) {
            return to3.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
