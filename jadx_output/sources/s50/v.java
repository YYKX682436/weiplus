package s50;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f403125d = 0;

    public v(s50.w wVar, s50.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f403125d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f403125d;
        this.f403125d = i17 + 1;
        if (i17 == 0) {
            return s50.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
