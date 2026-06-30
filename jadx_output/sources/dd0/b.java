package dd0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f228903d = 0;

    public b(dd0.c cVar, dd0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f228903d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f228903d;
        this.f228903d = i17 + 1;
        if (i17 == 0) {
            return dd0.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
