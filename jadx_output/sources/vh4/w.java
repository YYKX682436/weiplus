package vh4;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f437166d = 0;

    public w(vh4.x xVar, vh4.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f437166d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f437166d;
        this.f437166d = i17 + 1;
        if (i17 == 0) {
            return vh4.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
