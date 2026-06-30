package es2;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f256343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(es2.h0 h0Var) {
        super(0);
        this.f256343d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        es2.h0 h0Var = this.f256343d;
        if (!h0Var.f256372e.isEmpty()) {
            int size = h0Var.f256368a.f464689f - h0Var.f256371d.size();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[pollWaiting] continue to preload next video. count=");
            sb6.append(size);
            sb6.append(" size=");
            java.util.LinkedList linkedList = h0Var.f256372e;
            sb6.append(linkedList.size());
            com.tencent.mars.xlog.Log.i(h0Var.f256375h, sb6.toString());
            kz5.g0.s(linkedList);
            for (int i17 = 0; i17 < size; i17++) {
                cs2.p pVar = (cs2.p) linkedList.pollFirst();
                if (pVar != null) {
                    h0Var.b(pVar);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
