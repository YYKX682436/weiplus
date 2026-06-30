package my1;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332713d = 0;

    public o(my1.p pVar, my1.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332713d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332713d;
        this.f332713d = i17 + 1;
        if (i17 == 0) {
            return my1.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
