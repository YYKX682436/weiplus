package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public final class rd extends gp1.a0 {
    @Override // gp1.a0, gp1.z
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.a0, gp1.z
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.a0, gp1.z
    public void X0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceStateHolder", "onFloatBallInfoClicked, ballInfo:" + ballInfo);
        if (ballInfo != null) {
            com.tencent.mm.ui.tools.sd sdVar = com.tencent.mm.ui.tools.sd.f210742a;
            int i17 = ballInfo.f93046d;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceStateHolder", "open ball page type: " + i17);
            if (i17 != 6 && i17 != 8 && i17 != 9) {
                switch (i17) {
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceStateHolder", "need stop set to false for other float ball");
                        sdVar.b(false);
                        return;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceStateHolder", "need stop set to true for voice/video ball");
            sdVar.b(true);
        }
    }
}
