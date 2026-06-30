package h62;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f279193d = 0;

    public h(h62.i iVar, h62.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f279193d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f279193d;
        this.f279193d = i17 + 1;
        if (i17 == 0) {
            return h62.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
