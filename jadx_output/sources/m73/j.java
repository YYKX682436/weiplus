package m73;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324500d = 0;

    public j(m73.k kVar, m73.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324500d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324500d;
        this.f324500d = i17 + 1;
        if (i17 == 0) {
            return m73.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
