package on;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f346755d = 0;

    public v(on.w wVar, on.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f346755d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f346755d;
        this.f346755d = i17 + 1;
        if (i17 == 0) {
            return on.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
