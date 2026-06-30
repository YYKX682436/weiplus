package ty;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f422713d = 0;

    public b(ty.c cVar, ty.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f422713d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f422713d;
        this.f422713d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.chatting.p2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
