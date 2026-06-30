package wj;

/* loaded from: classes3.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final wj.d1 f446395d = new wj.d1();

    public d1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17;
        try {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
            e42.c0 c0Var = e42.c0.clicfg_miniprogram_reward_ad_mb_preload_cache_time_0507;
            h62.d dVar = (h62.d) e0Var;
            boolean mj6 = dVar.mj(c0Var, pInt, pInt2);
            j17 = dVar.Ni(c0Var, 600);
            com.tencent.mars.xlog.Log.i("MagicAdvertiseFeatureService", "[MBAd] preloadAutoDestroySeconds0507 value:" + j17 + ", groupId:" + pInt2.value + ", hit:" + mj6);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MagicAdvertiseFeatureService", "[MBAd] preloadAutoDestroySeconds expt read failed: " + e17);
            j17 = 600;
        }
        return java.lang.Long.valueOf(j17);
    }
}
