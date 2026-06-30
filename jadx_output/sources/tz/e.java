package tz;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f423159d = 0;

    public e(tz.f fVar, tz.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f423159d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f423159d;
        this.f423159d = i17 + 1;
        if (i17 == 0) {
            return tz.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
