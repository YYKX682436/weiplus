package kn4;

/* loaded from: classes8.dex */
public final class v extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final kn4.v f309754a = new kn4.v();

    /* renamed from: b, reason: collision with root package name */
    public static long f309755b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static long f309756c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static long f309757d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f309758e = false;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f309759f = "Unknown";

    @Override // gp1.a0, gp1.z
    public void F0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, com.tencent.mm.plugin.ball.model.BallInfo ballInfo2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoReplaced replacedScene: ");
        sb6.append(ballInfo != null ? ballInfo.h() : null);
        sb6.append(" targetScene: ");
        sb6.append(ballInfo2 != null ? ballInfo2.h() : null);
        com.tencent.mars.xlog.Log.i("FloatBallInfo", sb6.toString());
    }

    @Override // gp1.a0, gp1.z
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo != null && b(ballInfo)) {
            f309758e = false;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - f309757d;
            long c17 = c(currentTimeMillis);
            if (c17 > 0) {
                f309756c += c17;
                f309755b += currentTimeMillis;
            }
            com.tencent.mars.xlog.Log.i("FloatBallInfo", "onFloatBallInfoRemoved scene: " + ballInfo.h() + ", duration=" + currentTimeMillis + ", predictTraffic=" + c17);
        }
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallDeleteButtonClick scene: ");
        sb6.append(ballInfo != null ? ballInfo.h() : null);
        com.tencent.mars.xlog.Log.i("FloatBallInfo", sb6.toString());
    }

    @Override // gp1.a0, gp1.z
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoExposed scene: ");
        sb6.append(ballInfo != null ? ballInfo.h() : null);
        com.tencent.mars.xlog.Log.i("FloatBallInfo", sb6.toString());
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallPlayButtonClick scene: ");
        sb6.append(ballInfo != null ? ballInfo.h() : null);
        com.tencent.mars.xlog.Log.i("FloatBallInfo", sb6.toString());
    }

    @Override // gp1.a0, gp1.z
    public void X0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo != null && b(ballInfo)) {
            f309757d = java.lang.System.currentTimeMillis();
            f309759f = "<" + ballInfo.h() + '>';
            f309758e = true;
            com.tencent.mars.xlog.Log.i("FloatBallInfo", "onFloatBallInfoAdded scene: ".concat(ballInfo.h()));
        }
    }

    @Override // gp1.a0, gp1.z
    public boolean Y0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAddMessageFloatBall scene: ");
        sb6.append(ballInfo != null ? ballInfo.h() : null);
        com.tencent.mars.xlog.Log.i("FloatBallInfo", sb6.toString());
        return false;
    }

    public final boolean b(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.Integer valueOf = ballInfo != null ? java.lang.Integer.valueOf(ballInfo.f93046d) : null;
        return ((((((valueOf != null && valueOf.intValue() == 9) || (valueOf != null && valueOf.intValue() == 35)) || (valueOf != null && valueOf.intValue() == 21)) || (valueOf != null && valueOf.intValue() == 34)) || (valueOf != null && valueOf.intValue() == 24)) || (valueOf != null && valueOf.intValue() == 32)) || (valueOf != null && valueOf.intValue() == 22);
    }

    public final long c(long j17) {
        if (j17 <= 0) {
            return 0L;
        }
        java.util.Map map = kn4.n0.f309730a;
        if (!((java.util.HashMap) map).containsKey(f309759f)) {
            return 0L;
        }
        kotlin.jvm.internal.o.d(((java.util.HashMap) map).get(f309759f));
        return (long) (((java.lang.Number) r0).longValue() * ((j17 / 1000) / 60));
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FloatBallInfo", "onFloatBallInfoClicked scene: ".concat(ballInfo.h()));
    }
}
