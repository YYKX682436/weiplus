package dk0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f233108d = 0;

    public f(dk0.g gVar, dk0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f233108d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f233108d;
        this.f233108d = i17 + 1;
        if (i17 == 0) {
            return oy4.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
