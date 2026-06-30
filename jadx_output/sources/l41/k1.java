package l41;

/* loaded from: classes15.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l41.k1 f315861a = new l41.k1();

    public final int a() {
        e42.d0 d0Var = e42.d0.clicfg_kf_open_kefu_confirm_opt_2_android;
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).mj(d0Var, pInt, pInt2)) {
            return pInt2.value;
        }
        return 0;
    }

    public final boolean b() {
        e42.d0 d0Var = e42.d0.clicfg_kf_open_kefu_confirm_opt_2_android;
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        boolean z17 = false;
        if (e0Var != null && ((h62.d) e0Var).fj(d0Var, false)) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuExptUtil", "clicfg_kf_open_kefu_confirm_opt_2_android: " + z17);
        return z17;
    }
}
