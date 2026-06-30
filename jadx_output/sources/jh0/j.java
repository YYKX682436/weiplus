package jh0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f299775d = 0;

    public j(jh0.k kVar, jh0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f299775d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f299775d;
        this.f299775d = i17 + 1;
        if (i17 == 0) {
            return jh0.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
