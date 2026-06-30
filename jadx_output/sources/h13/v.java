package h13;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278163d = 0;

    public v(h13.w wVar, h13.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278163d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278163d;
        this.f278163d = i17 + 1;
        if (i17 == 0) {
            return h13.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
