package qf0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362237d = 0;

    public f(qf0.g gVar, qf0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362237d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362237d;
        this.f362237d = i17 + 1;
        if (i17 == 0) {
            return qf0.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
