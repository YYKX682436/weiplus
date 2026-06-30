package wj;

/* loaded from: classes3.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final wj.e1 f446398d = new wj.e1();

    public e1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.c0 c0Var = e42.c0.clicfg_miniprogram_reward_ad_mb_preload_opt_0312;
        h62.d dVar = (h62.d) e0Var;
        boolean mj6 = dVar.mj(c0Var, pInt, pInt2);
        int Ni = dVar.Ni(c0Var, -1);
        com.tencent.mars.xlog.Log.i("MagicAdvertiseFeatureService", "[MBAd] preloadOpt0312 value: " + Ni + ", groupId: " + pInt2.value + ", hit:" + mj6);
        return new jz5.o(java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(mj6 ? pInt2.value : 0), java.lang.Boolean.valueOf(mj6));
    }
}
