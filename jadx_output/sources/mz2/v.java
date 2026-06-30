package mz2;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333192d = 0;

    public v(mz2.w wVar, mz2.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333192d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333192d;
        this.f333192d = i17 + 1;
        if (i17 == 0) {
            return mz2.i1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
