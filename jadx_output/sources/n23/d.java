package n23;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f334309d = 0;

    public d(n23.e eVar, n23.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334309d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334309d;
        this.f334309d = i17 + 1;
        if (i17 == 0) {
            return kr2.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
