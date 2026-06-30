package qh0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f363398d = 0;

    public j(qh0.k kVar, qh0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f363398d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f363398d;
        this.f363398d = i17 + 1;
        if (i17 == 0) {
            return qh0.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
