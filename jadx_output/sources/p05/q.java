package p05;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350654d = 0;

    public q(p05.r rVar, p05.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350654d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350654d;
        this.f350654d = i17 + 1;
        if (i17 == 0) {
            return p05.m2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
