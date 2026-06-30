package e42;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f249329d = 0;

    public j(e42.k kVar, e42.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f249329d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f249329d;
        this.f249329d = i17 + 1;
        if (i17 == 0) {
            return g62.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
