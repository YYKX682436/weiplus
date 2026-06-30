package tg3;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f419183d = 0;

    public d(tg3.e eVar, tg3.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f419183d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f419183d;
        this.f419183d = i17 + 1;
        if (i17 == 0) {
            return k90.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
