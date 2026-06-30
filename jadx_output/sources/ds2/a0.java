package ds2;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f242852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ds2.b0 b0Var) {
        super(0);
        this.f242852d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ds2.b0 b0Var = this.f242852d;
        if (!b0Var.f242856d.isEmpty()) {
            int size = b0Var.f242853a.f464689f - b0Var.f242855c.size();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[pollWaiting] continue to preload next video. count=");
            sb6.append(size);
            sb6.append(" size=");
            java.util.LinkedList linkedList = b0Var.f242856d;
            sb6.append(linkedList.size());
            com.tencent.mars.xlog.Log.i(b0Var.f242859g, sb6.toString());
            kz5.g0.s(linkedList);
            for (int i17 = 0; i17 < size; i17++) {
                cs2.p pVar = (cs2.p) linkedList.pollFirst();
                if (pVar != null) {
                    b0Var.b(pVar);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
