package n83;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335633d = 0;

    public b(n83.c cVar, n83.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335633d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335633d;
        this.f335633d = i17 + 1;
        if (i17 == 0) {
            return n83.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
