package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.model.c1 f175574d = new com.tencent.mm.plugin.vlog.model.c1();

    public c1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_tav_mux_min_time, 800);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionExptConfig", "getMuxMiniDuration: " + Ni);
        return java.lang.Integer.valueOf(Ni);
    }
}
