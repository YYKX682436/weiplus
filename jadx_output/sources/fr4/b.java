package fr4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f265802d = 0;

    public b(fr4.c cVar, fr4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f265802d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f265802d;
        this.f265802d = i17 + 1;
        if (i17 == 0) {
            return fr4.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
