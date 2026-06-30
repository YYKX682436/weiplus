package zk4;

/* loaded from: classes11.dex */
public final class m extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.e0, gp1.x
    public void R2(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        jm4.h2 h2Var;
        jm4.n5 n5Var;
        jm4.i3 i3Var;
        if (ballInfo == null || ballInfo.f93045J || zk4.f.f473531a) {
            return;
        }
        android.os.Bundle bundle = ballInfo.G;
        if (bundle == null ? false : bundle.getBoolean("key_state_float_ball_need_persist")) {
            byte[] byteArray = ballInfo.G.getByteArray("key_state_float_ball_context_data");
            if (byteArray == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingMusicFloatBallEventListener", "onFloatBallInfoExposed contextData is null");
                return;
            }
            try {
                if (((ef0.c3) ((qk.q8) i95.n0.c(qk.q8.class))).wi()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicFloatBallEventListener", "onFloatBallInfoRestore");
                    bw5.fr0 parseFrom = new bw5.fr0().parseFrom(byteArray);
                    qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
                    if (g9Var != null && (n5Var = (jm4.n5) ((jz5.n) ((rk4.z8) g9Var).f397139m).getValue()) != null && (i3Var = (jm4.i3) urgen.ur_0025.UR_B9B9.UR_7F97(((jm4.p5) n5Var).getCppPointer())) != null) {
                        urgen.ur_0025.UR_04B4.UR_692D(((jm4.j3) i3Var).getCppPointer(), true);
                    }
                    com.tencent.mm.autogen.events.TingFloatBallAddedChangedEvent tingFloatBallAddedChangedEvent = new com.tencent.mm.autogen.events.TingFloatBallAddedChangedEvent();
                    tingFloatBallAddedChangedEvent.f54896g.f6293a = true;
                    tingFloatBallAddedChangedEvent.e();
                    bw5.jq0 jq0Var = new bw5.jq0();
                    boolean[] zArr = jq0Var.f29115m;
                    jq0Var.f29109d = parseFrom.c();
                    zArr[1] = true;
                    jq0Var.f29111f = parseFrom.b();
                    zArr[3] = true;
                    jq0Var.f29112g = parseFrom.f27499n[6] ? parseFrom.f27497i : bw5.eq0.Basic;
                    zArr[4] = true;
                    jq0Var.f29114i = com.tencent.mm.protobuf.g.b(byteArray);
                    zArr[6] = true;
                    jm4.u2 a17 = jm4.w2.f300435d.a();
                    jm4.n2 a18 = a17 != null ? ((jm4.w2) a17).a(bw5.eq0.TingMusic) : null;
                    if (a18 == null || (h2Var = (jm4.h2) urgen.ur_0025.UR_882D.UR_A4E2(((jm4.p2) a18).getCppPointer())) == null) {
                        return;
                    }
                    pm0.v.X(new sl4.j((sl4.l) h2Var, jq0Var));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingMusicFloatBallEventListener", "onFloatBallInfoExposed " + e17.getMessage());
            }
        }
    }

    @Override // gp1.x
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }
}
