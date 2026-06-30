package m40;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323426d = 0;

    public v(m40.w wVar, m40.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323426d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323426d;
        this.f323426d = i17 + 1;
        if (i17 == 0) {
            return wx2.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
