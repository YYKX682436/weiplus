package cx;

/* loaded from: classes7.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.j1 f224406d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(cx.j1 j1Var) {
        super(0);
        this.f224406d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String pj6;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_magic_brand_card_recreate_config, "\n            {\"disconnect_as_crash_frequency_threshold_in_microseconds\": 30000,\n            \"max_crash_limit_before_close_feature\": 3,\n            \"recover_feature_switch_after_in_seconds\": 86400}\n        ", true);
        cx.x0 x0Var = cx.y0.f224485d;
        kotlin.jvm.internal.o.d(Zi);
        cx.y0 a17 = x0Var.a(Zi);
        pj6 = this.f224406d.pj();
        com.tencent.mars.xlog.Log.i(pj6, "hy: getting recreation config " + a17);
        return a17;
    }
}
