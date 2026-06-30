package e50;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f249496d = 0;

    public h(e50.i iVar, e50.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f249496d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f249496d;
        this.f249496d = i17 + 1;
        if (i17 == 0) {
            return e50.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
