package rh0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f395599d = 0;

    public f(rh0.g gVar, rh0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f395599d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f395599d;
        this.f395599d = i17 + 1;
        if (i17 == 0) {
            return qh0.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
