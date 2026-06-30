package qp1;

/* loaded from: classes14.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f365755a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Integer f365756b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Integer f365757c;

    static {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(j62.e.g().i("clicfg_float_ball_message_ball_time_limit_in_ms", 3000, true, true));
        f365757c = valueOf;
        if (valueOf.intValue() <= 0) {
            f365757c = 3000;
        } else if (valueOf.intValue() > 10000) {
            f365757c = 10000;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallUtil", "addMessageBallTimeLimitInMs %s", f365757c);
    }

    public static boolean a(java.util.Collection collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }

    public static boolean b(java.util.List list, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        boolean z17 = false;
        if (!(a(list) && list.size() == 1) || !list.contains(ballInfo)) {
            return false;
        }
        if (ballInfo.f93046d != 16) {
            return true;
        }
        synchronized (ballInfo) {
            if (ballInfo.i("hasWvaTask")) {
                z17 = ballInfo.G.getBoolean("hasWvaTask", false);
            }
        }
        return !z17;
    }

    public static java.util.List c(java.util.List list) {
        java.util.List e17 = e(list);
        if (!a(e17)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = ((java.util.Vector) e17).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
            if (!ballInfo.I) {
                vector.add(ballInfo);
            }
        }
        return vector;
    }

    public static java.util.List d(java.util.List list) {
        if (!a(list)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
            if (r(ballInfo)) {
                vector.add(ballInfo);
            }
        }
        return vector;
    }

    public static java.util.List e(java.util.List list) {
        if (!a(list)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
            if (!ballInfo.f93045J) {
                vector.add(ballInfo);
            }
        }
        return vector;
    }

    public static java.util.List f(java.util.List list) {
        if (!a(list)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
            if (r(ballInfo) && !ballInfo.f93045J) {
                vector.add(ballInfo);
            }
        }
        return vector;
    }

    public static java.util.List g(java.util.List list) {
        if (!a(list)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
            if ((ballInfo.f93048f == 2) && !ballInfo.f93045J) {
                vector.add(ballInfo);
            }
        }
        return vector;
    }

    public static java.util.List h(java.util.List list) {
        if (!a(list)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
            if (!t(ballInfo)) {
                vector.add(ballInfo);
            }
        }
        return vector;
    }

    public static java.util.List i(java.util.List list) {
        if (!a(list)) {
            return new java.util.Vector();
        }
        java.util.Vector vector = new java.util.Vector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
            if (ballInfo.I) {
                vector.add(ballInfo);
            }
        }
        return vector;
    }

    public static com.tencent.mm.plugin.ball.model.BallInfo j(java.util.List list) {
        if (!a(list)) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
            if (t(ballInfo)) {
                return ballInfo;
            }
        }
        return null;
    }

    public static int k() {
        com.tencent.mm.plugin.ball.service.p4.f().getClass();
        return com.tencent.mm.plugin.ball.service.p4.f93194e;
    }

    public static int l() {
        com.tencent.mm.plugin.ball.service.p4.f().getClass();
        return com.tencent.mm.plugin.ball.service.p4.f93195f;
    }

    public static int m(java.util.List list) {
        int i17 = 0;
        if (a(list)) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((com.tencent.mm.plugin.ball.model.BallInfo) it.next()).f93048f == 1) {
                    i17++;
                }
            }
        }
        return i17;
    }

    public static int n(android.content.Context context) {
        if (f365755a == null) {
            f365755a = java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.u(context, false));
        }
        if (!f365755a.booleanValue()) {
            return 0;
        }
        if (f365756b == null) {
            f365756b = java.lang.Integer.valueOf(com.tencent.mm.ui.bk.p(context));
        }
        return f365756b.intValue();
    }

    public static int o(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        int i17 = ballInfo.f93046d;
        return (i17 == 20 && (i17 = ballInfo.f93047e) == 5) ? com.tencent.mm.R.raw.float_ball_icon_game_center_default : i17 != 1 ? i17 != 6 ? i17 != 8 ? i17 != 3 ? i17 != 4 ? com.tencent.mm.R.raw.float_ball_icon_webpage_default : com.tencent.mm.R.raw.float_ball_icon_files_default : com.tencent.mm.R.raw.float_ball_icon_fav_default : com.tencent.mm.R.raw.float_ball_icon_topstory_default : com.tencent.mm.R.raw.float_ball_icon_music_default : com.tencent.mm.R.raw.float_ball_icon_appbrand_default;
    }

    public static int p(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        int i17 = ballInfo.H;
        if (q(i17, 1)) {
            return com.tencent.mm.R.raw.location_filled;
        }
        if (q(i17, 2) || q(i17, 128)) {
            com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo.f93054o;
            return ballButtonInfo != null && ballButtonInfo.f93081s ? ballButtonInfo.f93069d ? com.tencent.mm.R.drawable.cza : com.tencent.mm.R.raw.chatfrom_voice_playing_new_f3 : ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).wi() ? com.tencent.mm.R.raw.float_ball_music_filled : com.tencent.mm.R.raw.float_ball_state_music;
        }
        if (q(i17, 16)) {
            return com.tencent.mm.R.raw.float_ball_download_filled;
        }
        if (q(i17, 32) || q(i17, 64)) {
            return com.tencent.mm.R.raw.voip_filled;
        }
        if (q(i17, 256)) {
            return ballInfo.f93047e == 32 ? ballInfo.f93060u : com.tencent.mm.R.raw.float_ball_state_message;
        }
        if (q(i17, 4096)) {
            return com.tencent.mm.R.raw.bluetooth_filled;
        }
        return -1;
    }

    public static boolean q(int i17, int i18) {
        return (i17 & i18) != 0;
    }

    public static boolean r(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        return ballInfo != null && ballInfo.f93048f == 1;
    }

    public static boolean s(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        int i17 = ballInfo.f93053n;
        return (i17 == 2 || i17 == 1) && ballInfo.f93054o.f93069d;
    }

    public static boolean t(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo == null) {
            return false;
        }
        if ((ballInfo.f93048f == 2) || r(ballInfo)) {
            return false;
        }
        int i17 = ballInfo.f93046d;
        if (i17 == 20) {
            i17 = ballInfo.f93047e;
        }
        return i17 == 9 || i17 == 21 || i17 == 48 || i17 == 22 || i17 == 32 || i17 == 23 || i17 == 24 || i17 == 35 || i17 == 36 || i17 == 39 || i17 == 53 || i17 == 52 || i17 == 64 || i17 == 66 || i17 == 67 || i17 == 68 || i17 == 65 || i17 == 40;
    }
}
