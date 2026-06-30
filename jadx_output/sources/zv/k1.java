package zv;

/* loaded from: classes7.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv.e2 f476010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(zv.e2 e2Var) {
        super(0);
        this.f476010d = e2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_flutter_check_surface_on_stop_or_pause, 1) == 1);
        boolean booleanValue = valueOf.booleanValue();
        com.tencent.mars.xlog.Log.i(this.f476010d.f475946d, "checkSurfaceOnStopOrPause " + booleanValue);
        return valueOf;
    }
}
