package h14;

/* loaded from: classes.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278211d = 0;

    public v(h14.w wVar, h14.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278211d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278211d;
        this.f278211d = i17 + 1;
        if (i17 == 0) {
            return h14.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
