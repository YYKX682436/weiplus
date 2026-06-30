package ng4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f337053d = 0;

    public b(ng4.c cVar, ng4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f337053d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f337053d;
        this.f337053d = i17 + 1;
        if (i17 == 0) {
            return ng4.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
