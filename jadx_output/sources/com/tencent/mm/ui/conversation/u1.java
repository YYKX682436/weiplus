package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class u1 extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.conversation.u1 f208091a = new com.tencent.mm.ui.conversation.u1();

    @Override // gp1.a0, gp1.z
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("BizFloatBallListener", "onFloatBallInfoClicked %s", ballInfo);
        com.tencent.mm.ui.conversation.ConvExposeHelper.f207293d.getClass();
        if (com.tencent.mm.ui.conversation.ConvExposeHelper.f207304r.get()) {
            ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Ri(rv.g3.ClickFloatBall);
        }
    }
}
