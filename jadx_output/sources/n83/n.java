package n83;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335645d = 0;

    public n(n83.o oVar, n83.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335645d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335645d;
        this.f335645d = i17 + 1;
        if (i17 == 0) {
            return n83.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
