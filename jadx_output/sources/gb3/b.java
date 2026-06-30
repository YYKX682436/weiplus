package gb3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270011d = 0;

    public b(gb3.c cVar, gb3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270011d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270011d;
        this.f270011d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.luckymoney.model.b3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
