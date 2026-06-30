package f23;

/* loaded from: classes.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259069d = 0;

    public v(f23.w wVar, f23.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259069d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259069d;
        this.f259069d = i17 + 1;
        if (i17 == 0) {
            return f23.o2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
