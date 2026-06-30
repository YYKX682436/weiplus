package gb3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270014d = 0;

    public f(gb3.g gVar, gb3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270014d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270014d;
        this.f270014d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.luckymoney.model.a3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
