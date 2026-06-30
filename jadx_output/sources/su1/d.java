package su1;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412725d = 0;

    public d(su1.e eVar, su1.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412725d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412725d;
        this.f412725d = i17 + 1;
        if (i17 == 0) {
            return su1.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
