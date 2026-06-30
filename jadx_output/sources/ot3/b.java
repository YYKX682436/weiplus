package ot3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348860d = 0;

    public b(ot3.c cVar, ot3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348860d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348860d;
        this.f348860d = i17 + 1;
        if (i17 == 0) {
            return c61.mc.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
