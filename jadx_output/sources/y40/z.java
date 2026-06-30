package y40;

/* loaded from: classes7.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y40.i0 f459340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y40.i0 i0Var) {
        super(0);
        this.f459340d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_biz_time_use_flutter, 1) == 1);
        boolean booleanValue = valueOf.booleanValue();
        com.tencent.mars.xlog.Log.i(this.f459340d.f459295d, "openFlutter " + booleanValue);
        return valueOf;
    }
}
