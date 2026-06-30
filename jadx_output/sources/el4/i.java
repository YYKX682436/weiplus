package el4;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f254019d = 0;

    public i(el4.j jVar, el4.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f254019d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f254019d;
        this.f254019d = i17 + 1;
        if (i17 == 0) {
            return el4.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
