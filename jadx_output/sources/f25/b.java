package f25;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259089d = 0;

    public b(f25.c cVar, f25.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259089d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259089d;
        this.f259089d = i17 + 1;
        if (i17 == 0) {
            return h25.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
