package l42;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f316012d = 0;

    public v(l42.w wVar, l42.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f316012d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f316012d;
        this.f316012d = i17 + 1;
        if (i17 == 0) {
            return p30.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
