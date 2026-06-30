package yn1;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f463715d = 0;

    public j(yn1.k kVar, yn1.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f463715d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f463715d;
        this.f463715d = i17 + 1;
        if (i17 == 0) {
            return yn1.j4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
