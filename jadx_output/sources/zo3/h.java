package zo3;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f474858d = 0;

    public h(zo3.i iVar, zo3.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f474858d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f474858d;
        this.f474858d = i17 + 1;
        if (i17 == 0) {
            return zo3.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
