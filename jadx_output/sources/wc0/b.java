package wc0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f444459d = 0;

    public b(wc0.c cVar, wc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f444459d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f444459d;
        this.f444459d = i17 + 1;
        if (i17 == 0) {
            return ly4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
