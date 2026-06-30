package ct;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222182d = 0;

    public r(ct.s sVar, ct.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222182d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222182d;
        this.f222182d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.chatting.manager.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
