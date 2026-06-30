package vh0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436975d = 0;

    public v(vh0.w wVar, vh0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436975d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436975d;
        this.f436975d = i17 + 1;
        if (i17 == 0) {
            return vh0.q3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
