package oh1;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f345233d = 0;

    public j(oh1.k kVar, oh1.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f345233d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f345233d;
        this.f345233d = i17 + 1;
        if (i17 == 0) {
            return oh1.f1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
