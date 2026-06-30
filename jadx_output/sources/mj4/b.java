package mj4;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final mj4.b f327056d = new mj4.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_TextStatus_ForceUseNewClusterId_Int, 0);
        if (g17 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusClusterHelper", "isClusterOpen init true by force");
            return java.lang.Integer.valueOf(g17);
        }
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_state_square_new_cluster_and, 1) == 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusClusterHelper", "isClusterOpen init false by xswitch closed");
            return 0;
        }
        int e17 = ai4.m0.f5173a.G().e();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusClusterHelper", "isClusterValid init: %s", java.lang.Integer.valueOf(e17));
        return java.lang.Integer.valueOf(e17);
    }
}
