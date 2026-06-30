package ls0;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ls0.r0 r0Var) {
        super(0);
        this.f320815d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f320815d.f320916t, "onDrawFrameOnFrameAvailableFailed!! force use request draw");
        this.f320815d.f320900g0 = true;
        fs0.g gVar = this.f320815d.B;
        if (gVar != null) {
            gVar.d(false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxOnFrameAvailableDrawFailed");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 86L, 1L);
        ls0.k kVar = this.f320815d.F;
        if (kVar != null) {
            kVar.f320863q = null;
        }
        return jz5.f0.f302826a;
    }
}
