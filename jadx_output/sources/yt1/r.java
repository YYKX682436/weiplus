package yt1;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f465281d = 0;

    public r(yt1.s sVar, yt1.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f465281d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f465281d;
        this.f465281d = i17 + 1;
        if (i17 == 0) {
            return yt1.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
