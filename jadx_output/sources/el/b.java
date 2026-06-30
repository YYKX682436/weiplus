package el;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f253691d = 0;

    public b(el.c cVar, el.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f253691d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f253691d;
        this.f253691d = i17 + 1;
        if (i17 == 0) {
            return el.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
