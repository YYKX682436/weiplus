package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class z0 extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.v0 f206270a;

    public z0(com.tencent.mm.ui.chatting.v0 v0Var) {
        this.f206270a = v0Var;
    }

    @Override // gp1.a0, gp1.z
    public void F0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, com.tencent.mm.plugin.ball.model.BallInfo ballInfo2) {
    }

    @Override // gp1.a0, gp1.z
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "onFloatBallInfoRemoved() called with: ballInfo = [" + ballInfo + "]");
        if (ballInfo.M.f93090m == 9) {
            yd5.r.f461147a.c("chat_voice_msg_float_close", true, false);
        }
        this.f206270a.J(true);
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "onFloatBallDeleteButtonClick: ");
        this.f206270a.J(true);
    }

    @Override // gp1.a0, gp1.z
    public void S(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17, int i18, int i19, int i27) {
    }

    @Override // gp1.a0, gp1.z
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        yd5.r.f461147a.c("chat_voice_msg_float", true, true);
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.a0, gp1.z
    public void X0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }
}
