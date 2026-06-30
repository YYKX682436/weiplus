package tg1;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f419140d = 0;

    public j(tg1.k kVar, tg1.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f419140d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f419140d;
        this.f419140d = i17 + 1;
        if (i17 == 0) {
            return tg1.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
