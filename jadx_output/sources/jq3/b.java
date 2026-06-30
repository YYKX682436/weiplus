package jq3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301104d = 0;

    public b(jq3.c cVar, jq3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301104d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301104d;
        this.f301104d = i17 + 1;
        if (i17 == 0) {
            return jq3.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
