package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.t0 f127574d = new com.tencent.mm.plugin.finder.storage.t0();

    public t0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clicfg_ultron_finder_search_only_contact_android: ");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        sb6.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ultron_finder_search_only_contact_android, 1) == 1);
        sb6.append("\nclicfg_ultron_finder_show_reddot_number_attab_android:");
        sb6.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ultron_finder_show_reddot_number_attab_android, 1) == 1);
        sb6.append("\nclicfg_ultron_record_video_max_duration_android:");
        sb6.append(t70Var.L2().f71195h);
        sb6.append("\nclicfg_ultron_record_video_min_duration_android:");
        sb6.append(t70Var.L2().f71196i);
        sb6.append("\nclicfg_ultron_album_video_max_duration_android:");
        sb6.append(t70Var.K2().f71195h);
        sb6.append("\nclicfg_ultron_album_video_min_duration_android:");
        sb6.append(t70Var.K2().f71196i);
        sb6.append("\nclicfg_ultron_album_video_max_select_duration_android:");
        sb6.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ultron_album_video_max_select_duration_android, 300));
        java.lang.String sb7 = sb6.toString();
        ((java.lang.Number) t70Var.t().r()).intValue();
        ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.G0).getValue()).r()).intValue();
        t70Var.F();
        t70Var.Y1();
        t70Var.V1();
        t70Var.X1();
        t70Var.b2();
        t70Var.a2();
        t70Var.W1();
        t70Var.Z1();
        com.tencent.mm.sdk.platformtools.b0.e(sb7);
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, sb7, 1).show();
        return jz5.f0.f302826a;
    }
}
