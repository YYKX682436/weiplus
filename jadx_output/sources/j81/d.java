package j81;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f298144d = 0;

    public d(j81.e eVar, j81.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f298144d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f298144d;
        this.f298144d = i17 + 1;
        if (i17 == 0) {
            return j81.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
