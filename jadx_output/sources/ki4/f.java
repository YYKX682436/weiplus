package ki4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308129d = 0;

    public f(ki4.g gVar, ki4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308129d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308129d;
        this.f308129d = i17 + 1;
        if (i17 == 0) {
            return ki4.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
