package zo3;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f474855d = 0;

    public d(zo3.e eVar, zo3.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f474855d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f474855d;
        this.f474855d = i17 + 1;
        if (i17 == 0) {
            return zo3.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
