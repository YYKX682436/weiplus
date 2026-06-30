package qo3;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f365632d = 0;

    public p(qo3.q qVar, qo3.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f365632d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f365632d;
        this.f365632d = i17 + 1;
        if (i17 == 0) {
            return qo3.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
