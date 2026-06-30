package y50;

/* loaded from: classes9.dex */
public final class n implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (kotlin.jvm.internal.o.b(str, "mmsearch_fts_reddot")) {
            r45.io0 io0Var = new r45.io0();
            if (map != null) {
                io0Var.f377206d = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_fts_reddot.android_cli_version"), 0);
                io0Var.f377207e = com.tencent.mm.sdk.platformtools.t8.z1((java.lang.String) map.get(".sysmsg.mmsearch_fts_reddot.msgid"), new java.lang.Object[0]);
                io0Var.f377208f = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(".sysmsg.mmsearch_fts_reddot.h5_version"));
                io0Var.f377209g = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(".sysmsg.mmsearch_fts_reddot.biz_type"));
                io0Var.f377210h = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(".sysmsg.mmsearch_fts_reddot.expose_expire_time"));
                io0Var.f377211i = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_fts_reddot.reddot_action"), 0);
            }
        }
    }
}
