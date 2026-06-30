package ou4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348979d = 0;

    public f(ou4.g gVar, ou4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348979d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348979d;
        this.f348979d = i17 + 1;
        if (i17 == 0) {
            return ou4.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
