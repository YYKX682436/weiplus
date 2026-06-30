package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.ting.uic.o f174781d = new com.tencent.mm.plugin.ting.uic.o();

    public o() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ting_disable_not_replace_live_floatball, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFloatBallAnimationUIC", "tingConfig disableNotReplacedFinderLiveFloat: " + Ni);
        return java.lang.Boolean.valueOf(Ni == 1);
    }
}
