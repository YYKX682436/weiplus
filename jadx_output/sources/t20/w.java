package t20;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f414693d = 0;

    public w(t20.x xVar, t20.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f414693d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f414693d;
        this.f414693d = i17 + 1;
        if (i17 == 0) {
            return t20.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
