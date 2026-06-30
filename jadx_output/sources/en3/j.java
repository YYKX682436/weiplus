package en3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f255304d = 0;

    public j(en3.k kVar, en3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f255304d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f255304d;
        this.f255304d = i17 + 1;
        if (i17 == 0) {
            return en3.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
