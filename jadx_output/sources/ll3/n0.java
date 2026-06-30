package ll3;

/* loaded from: classes10.dex */
public final class n0 implements com.tencent.mm.sdk.platformtools.j5 {
    public void b(int i17) {
        if (gm0.j1.h() && gm0.j1.a()) {
            if (b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.READ_PHONE_STATE") != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GlobalMusicFloatBallManager", "initPhoneStatusWatcher not have read_phone_state perm");
                return;
            }
            if (i17 == 1 || i17 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicFloatBallManager", "onPhoneCall, removeCurrentBall, state:%s", java.lang.Integer.valueOf(i17));
                ((ku5.t0) ku5.t0.f312615d).B(ll3.m0.f319192d);
            }
        }
    }
}
