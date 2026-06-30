package r63;

/* loaded from: classes14.dex */
public final class p extends gp1.e0 implements gp1.y {
    @Override // gp1.e0, gp1.x
    public void F0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, com.tencent.mm.plugin.ball.model.BallInfo ballInfo2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoReplaced replacedBallInfo ");
        sb6.append(ballInfo != null ? ballInfo.f93063x : null);
        sb6.append(" targetBallInfo ");
        sb6.append(ballInfo2 != null ? ballInfo2.f93063x : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
    }

    @Override // gp1.x
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoRemoved ");
        sb6.append(ballInfo != null ? ballInfo.f93063x : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
        if (ballInfo != null) {
            r63.l lVar = r63.l.f393022a;
            java.lang.String key = ballInfo.f93049g;
            kotlin.jvm.internal.o.f(key, "key");
            if (kotlin.jvm.internal.o.b(r63.l.f393035n, key)) {
                r63.l.f393035n = "";
            }
            r63.l.f393034m.remove(key);
        }
    }

    @Override // gp1.e0, gp1.x
    public void N0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallDeleteButtonClick ");
        sb6.append(ballInfo != null ? ballInfo.f93063x : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
    }

    @Override // gp1.e0, gp1.x
    public void S(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17, int i18, int i19, int i27) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallCollapseStateChanged ");
        sb6.append(ballInfo != null ? ballInfo.f93063x : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
    }

    @Override // gp1.e0, gp1.x
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoExposed ");
        sb6.append(ballInfo != null ? ballInfo.f93063x : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
    }

    @Override // gp1.e0, gp1.x
    public void V0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallPlayButtonClick ");
        sb6.append(ballInfo != null ? ballInfo.f93063x : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
    }

    @Override // gp1.y
    public void X(java.util.List ballInfoList, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kotlin.jvm.internal.o.g(ballInfoList, "ballInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMonitor", "onFloatBallInfoChanged");
    }

    @Override // gp1.e0, gp1.x
    public void X0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoAdded ");
        sb6.append(ballInfo != null ? ballInfo.f93063x : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
        if (ballInfo != null) {
            r63.l lVar = r63.l.f393022a;
            java.lang.String key = ballInfo.f93049g;
            kotlin.jvm.internal.o.f(key, "key");
            java.util.Map map = r63.l.f393034m;
            if (map.containsKey(key)) {
                return;
            }
            map.put(key, java.lang.Integer.valueOf(r63.l.f393027f));
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "key " + key + ", enterType " + r63.l.f393027f);
        }
    }

    @Override // gp1.e0, gp1.x
    public boolean Y0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAddMessageFloatBall ");
        sb6.append(ballInfo != null ? ballInfo.f93063x : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
        return false;
    }

    @Override // gp1.x
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallInfoClicked ");
        sb6.append(ballInfo != null ? ballInfo.f93063x : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMonitor", sb6.toString());
        if (ballInfo != null) {
            r63.l lVar = r63.l.f393022a;
            java.lang.String key = ballInfo.f93049g;
            kotlin.jvm.internal.o.f(key, "key");
            r63.l.f393035n = key;
            o63.e[] eVarArr = o63.e.f343196d;
            java.lang.String key2 = ballInfo.f93049g;
            kotlin.jvm.internal.o.f(key2, "key");
            if (!r63.n.f393042a.p() || kotlin.jvm.internal.o.b(r63.l.f393030i, java.lang.Boolean.FALSE)) {
                r63.l.c(lVar, null, 7, (java.lang.Integer) ((java.util.LinkedHashMap) r63.l.f393034m).get(key2), 0, 8, null);
            }
        }
    }
}
