package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.ting.uic.p f174786d = new com.tencent.mm.plugin.ting.uic.p();

    public p() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((ef0.c3) ((qk.q8) i95.n0.c(qk.q8.class))).wi());
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFloatBallAnimationUIC", "tingConfig disableTingFloatBallAnimation: " + valueOf.booleanValue());
        return valueOf;
    }
}
