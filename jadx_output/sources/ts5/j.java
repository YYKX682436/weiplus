package ts5;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f421738d = 0;

    public j(ts5.k kVar, ts5.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f421738d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f421738d;
        this.f421738d = i17 + 1;
        if (i17 == 0) {
            return b92.y2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
