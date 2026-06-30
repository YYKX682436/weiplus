package gi;

/* loaded from: classes12.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f272074d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(boolean z17) {
        super(1);
        this.f272074d = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wh.s0 it = (wh.s0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object value = ((jz5.n) it.f445868f).getValue();
        boolean z17 = this.f272074d;
        synchronized (value) {
            if (it.k()) {
                it.m();
                if (z17) {
                    wh.f.a("Matrix.battery.ThreadWatch", "CallStack", "dump callstacks sampling from Thread WatchDog:\n".concat(wh.s0.e(it, null, 0.0f, false, 7, null)), 0, 8, null);
                }
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
