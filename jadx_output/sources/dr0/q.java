package dr0;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f242498d = 0;

    public q(dr0.r rVar, dr0.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f242498d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f242498d;
        this.f242498d = i17 + 1;
        if (i17 == 0) {
            return dr0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
