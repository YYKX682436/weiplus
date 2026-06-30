package jf3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f299415d = 0;

    public f(jf3.g gVar, jf3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f299415d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f299415d;
        this.f299415d = i17 + 1;
        if (i17 == 0) {
            return jf3.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
