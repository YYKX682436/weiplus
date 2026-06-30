package h12;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278110d = 0;

    public w(h12.x xVar, h12.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278110d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278110d;
        this.f278110d = i17 + 1;
        if (i17 == 0) {
            return h12.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
