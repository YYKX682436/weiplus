package jq;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301040d = 0;

    public b(jq.c cVar, jq.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301040d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301040d;
        this.f301040d = i17 + 1;
        if (i17 == 0) {
            return jq.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
