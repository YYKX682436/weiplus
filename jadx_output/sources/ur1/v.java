package ur1;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f430376d = 0;

    public v(ur1.w wVar, ur1.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f430376d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f430376d;
        this.f430376d = i17 + 1;
        if (i17 == 0) {
            return ur1.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
