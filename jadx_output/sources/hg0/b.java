package hg0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f281311d = 0;

    public b(hg0.c cVar, hg0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f281311d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f281311d;
        this.f281311d = i17 + 1;
        if (i17 == 0) {
            return hg0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
