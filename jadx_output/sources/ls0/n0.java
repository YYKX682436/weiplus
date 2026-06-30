package ls0;

/* loaded from: classes10.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(ls0.r0 r0Var) {
        super(0);
        this.f320875d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ls0.r0 r0Var = this.f320875d;
        com.tencent.mars.xlog.Log.i(r0Var.f320916t, "onEncodeEnd: " + r0Var.Y);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 162L, 1L, false);
        gs0.b bVar = r0Var.C;
        if (bVar != null) {
            bVar.f();
        }
        r0Var.g(true);
        return jz5.f0.f302826a;
    }
}
