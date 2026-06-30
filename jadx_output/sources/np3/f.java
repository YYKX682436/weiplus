package np3;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f338798d = 0;

    public f(np3.g gVar, np3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f338798d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f338798d;
        this.f338798d = i17 + 1;
        if (i17 == 0) {
            return np3.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
