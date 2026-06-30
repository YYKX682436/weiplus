package f23;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259011d = 0;

    public j(f23.k kVar, f23.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259011d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259011d;
        this.f259011d = i17 + 1;
        if (i17 == 0) {
            return f23.h2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
