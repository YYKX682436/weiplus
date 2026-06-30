package wa3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f444191d = 0;

    public f(wa3.g gVar, wa3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f444191d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f444191d;
        this.f444191d = i17 + 1;
        if (i17 == 0) {
            return wa3.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
