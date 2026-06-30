package rx;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f400900d = 0;

    public w(rx.x xVar, rx.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f400900d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f400900d;
        this.f400900d = i17 + 1;
        if (i17 == 0) {
            return rx.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
