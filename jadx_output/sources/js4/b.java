package js4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301535d = 0;

    public b(js4.c cVar, js4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301535d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301535d;
        this.f301535d = i17 + 1;
        if (i17 == 0) {
            return ls4.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
