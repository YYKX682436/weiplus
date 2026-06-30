package wj;

/* loaded from: classes3.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final wj.f1 f446404d = new wj.f1();

    public f1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.c0 c0Var = e42.c0.clicfg_miniprogram_reward_ad_mb_convert_opt_0225;
        h62.d dVar = (h62.d) e0Var;
        if (dVar.mj(c0Var, pInt, pInt2)) {
            int Ni = dVar.Ni(c0Var, 0);
            com.tencent.mars.xlog.Log.i("MagicAdvertiseFeatureService", "[MBAd] preloadOpt value: " + Ni + ", groupId: " + pInt2.value + ", hit:true, source:0225");
            return new jz5.o(java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(pInt2.value), java.lang.Boolean.TRUE);
        }
        e42.c0 c0Var2 = e42.c0.clicfg_miniprogram_reward_ad_mb_preload_switch_0407;
        boolean mj6 = dVar.mj(c0Var2, pInt, pInt2);
        int Ni2 = dVar.Ni(c0Var2, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[MBAd] preloadOpt value: ");
        sb6.append(Ni2);
        sb6.append(", groupId: ");
        sb6.append(pInt2.value);
        sb6.append(", hit:");
        sb6.append(mj6);
        sb6.append(", source:");
        sb6.append(mj6 ? "preload_0407" : com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE);
        com.tencent.mars.xlog.Log.i("MagicAdvertiseFeatureService", sb6.toString());
        return new jz5.o(java.lang.Integer.valueOf(Ni2), java.lang.Integer.valueOf(mj6 ? pInt2.value : 0), java.lang.Boolean.valueOf(mj6));
    }
}
