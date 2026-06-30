package hw;

/* loaded from: classes7.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw.o0 f285402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(hw.o0 o0Var) {
        super(0);
        this.f285402d = o0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String ij6;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_magic_brand_card_recreate_config, "\n            {\"disconnect_as_crash_frequency_threshold_in_microseconds\": 30000,\n            \"max_crash_limit_before_close_feature\": 3,\n            \"recover_feature_switch_after_in_seconds\": 86400}\n        ", true);
        hw.d0 d0Var = hw.e0.f285369d;
        kotlin.jvm.internal.o.d(Zi);
        hw.e0 a17 = d0Var.a(Zi);
        ij6 = this.f285402d.ij();
        com.tencent.mars.xlog.Log.i(ij6, "hy: getting recreation config " + a17);
        return a17;
    }
}
