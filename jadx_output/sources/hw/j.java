package hw;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f285388d = 0;

    public j(hw.k kVar, hw.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f285388d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f285388d;
        this.f285388d = i17 + 1;
        if (i17 == 0) {
            return hw.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
