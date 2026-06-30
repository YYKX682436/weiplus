package h45;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278937d = 0;

    public b(h45.c cVar, h45.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278937d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278937d;
        this.f278937d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.kinda.framework.WxCrossServicesProvider.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
