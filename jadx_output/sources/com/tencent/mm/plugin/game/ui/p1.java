package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDebugView f141703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f141704e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView, n0.v2 v2Var) {
        super(0);
        this.f141703d = gameDebugView;
        this.f141704e = v2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.o4.M("game_redot").A("gamecenter.reddot.signatureConfigCount", 0);
        com.tencent.mm.plugin.game.model.d2 d2Var = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().f140335a;
        ((java.util.ArrayList) d2Var.f140260c).clear();
        ((java.util.ArrayList) d2Var.f140262e).clear();
        com.tencent.mm.sdk.platformtools.o4.M("game_redot").A("gamecenter.reddot.signatureConfigCount", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameReddotMsgVerify", "gamelog.reddot, verify, debug: clearVerifyConfig");
        this.f141704e.setValue(this.f141703d.V6());
        return jz5.f0.f302826a;
    }
}
