package p34;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f351680d = 0;

    public h(p34.i iVar, p34.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351680d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f351680d;
        this.f351680d = i17 + 1;
        if (i17 == 0) {
            return p34.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
