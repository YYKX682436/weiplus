package pp0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f357389d = 0;

    public v(pp0.w wVar, pp0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f357389d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f357389d;
        this.f357389d = i17 + 1;
        if (i17 == 0) {
            return yy0.r7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
