package ua0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425906d = 0;

    public j(ua0.k kVar, ua0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425906d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425906d;
        this.f425906d = i17 + 1;
        if (i17 == 0) {
            return ua0.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
