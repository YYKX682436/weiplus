package z71;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f470546d = 0;

    public y(z71.z zVar, z71.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f470546d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f470546d;
        this.f470546d = i17 + 1;
        if (i17 == 0) {
            return z71.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
