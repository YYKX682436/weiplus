package u90;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425804d = 0;

    public p(u90.q qVar, u90.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425804d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425804d;
        this.f425804d = i17 + 1;
        if (i17 == 0) {
            return u90.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
