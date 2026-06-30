package i04;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f286534d = 0;

    public b(i04.c cVar, i04.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f286534d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f286534d;
        this.f286534d = i17 + 1;
        if (i17 == 0) {
            return i04.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
