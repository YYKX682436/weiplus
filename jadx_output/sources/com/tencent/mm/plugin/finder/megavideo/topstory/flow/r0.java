package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes10.dex */
public final class r0 extends gp1.a0 {
    @Override // gp1.a0, gp1.z
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        qg3.i0 a17;
        com.tencent.mars.xlog.Log.i("Finder.MegaVideo.MegaVideoFlutterViewStrategy", "onFloatBallInfoRemoved: ballInfo=" + ballInfo);
        if (!(ballInfo != null && ballInfo.f93046d == 32) || (a17 = qg3.k0.f362826d.a()) == null) {
            return;
        }
        urgen.ur_54A4.UR_E667.UR_32EF(((qg3.k0) a17).getCppPointer());
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        qg3.i0 a17;
        com.tencent.mars.xlog.Log.i("Finder.MegaVideo.MegaVideoFlutterViewStrategy", "onFloatBallDeleteButtonClick " + ballInfo);
        if (!(ballInfo != null && ballInfo.f93046d == 32) || (a17 = qg3.k0.f362826d.a()) == null) {
            return;
        }
        urgen.ur_54A4.UR_E667.UR_32EF(((qg3.k0) a17).getCppPointer());
    }
}
