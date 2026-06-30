package os;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f347989d = 0;

    public d(os.e eVar, os.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f347989d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f347989d;
        this.f347989d = i17 + 1;
        if (i17 == 0) {
            return os.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
