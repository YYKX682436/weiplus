package wx2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f450576d = 0;

    public b(wx2.c cVar, wx2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450576d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f450576d;
        this.f450576d = i17 + 1;
        if (i17 == 0) {
            return wx2.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
