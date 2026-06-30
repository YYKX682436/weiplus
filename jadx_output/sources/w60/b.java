package w60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f443254d = 0;

    public b(w60.c cVar, w60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f443254d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f443254d;
        this.f443254d = i17 + 1;
        if (i17 == 0) {
            return v60.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
