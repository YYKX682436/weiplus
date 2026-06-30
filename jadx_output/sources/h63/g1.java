package h63;

@j95.b(dependencies = {p60.x.class})
/* loaded from: classes7.dex */
public final class g1 extends i95.w implements h63.s1 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f279234d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f279235e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f279236f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f279237g;

    /* renamed from: h, reason: collision with root package name */
    public final os5.n f279238h = new h63.d1(this);

    public final void Ai(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "enableVoiceCapture %b", java.lang.Boolean.valueOf(z17));
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        int i17 = z17 ? 100 : 0;
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var != null && c1Var.Y4) {
            mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var2 != null) {
                c1Var2.Z4 = i17;
            }
            mm2.t2 t2Var = (mm2.t2) efVar.i(mm2.t2.class);
            if (t2Var != null && t2Var.f329428g) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "setVoiceCaptureVolume " + i17 + ": anchor isVerifying, mute volume");
                tn0.w0 w0Var2 = dk2.ef.f233378d;
                if (w0Var2 != null) {
                    w0Var2.B0(0);
                    return;
                }
                return;
            }
        }
        tn0.w0 w0Var3 = dk2.ef.f233378d;
        if (w0Var3 != null) {
            w0Var3.B0(i17);
        }
    }

    public final void Bi() {
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        r45.wp1 wp1Var = dk2.ef.f233390j.f233684b;
        p60.u uVar = (p60.u) i95.n0.c(p60.u.class);
        if (wp1Var != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wp1Var.getString(3))) {
                java.lang.String string = wp1Var.getString(3);
                uVar.getClass();
                p60.u.f352199g.putString("Game_Live_Nickname", string);
            }
            if (wp1Var.getLong(1) != 0) {
                long j17 = wp1Var.getLong(1);
                uVar.getClass();
                p60.u.f352199g.putLong("Game_Live_liveId", j17);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wp1Var.getString(2))) {
                java.lang.String string2 = wp1Var.getString(2);
                uVar.getClass();
                p60.u.f352199g.putString("Game_Live_joinLiveTips", string2);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wp1Var.getString(4))) {
                java.lang.String string3 = wp1Var.getString(4);
                uVar.getClass();
                p60.u.f352199g.putString("Game_Live_anchorHeadUrl", string3);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wp1Var.getString(5))) {
                java.lang.String string4 = wp1Var.getString(5);
                uVar.getClass();
                p60.u.f352199g.putString("Game_Live_finderGameExportId", string4);
            }
        }
        java.lang.String Ui = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(null);
        uVar.getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = p60.u.f352199g;
        o4Var.putString("Game_Live_finderUsrName", Ui);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:getStartData:gameLiveNickname:%s ,gameLiveAnchorHeadUrl:%s , exportId:%s", o4Var.getString("Game_Live_Nickname", ""), o4Var.getString("Game_Live_anchorHeadUrl", ""), o4Var.getString("Game_Live_finderGameExportId", ""));
    }

    public void Di(android.content.Context context, java.lang.String appId, int i17, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Long l17) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        long longValue = l17.longValue();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "launchWAGameForFinderLive " + appId + ' ' + i17 + ' ' + booleanValue + ' ' + booleanValue2);
        p60.u uVar = (p60.u) i95.n0.c(p60.u.class);
        if (booleanValue) {
            wi(true);
            uVar.Vi(appId);
            com.tencent.mm.sdk.platformtools.o4 o4Var = p60.u.f352199g;
            o4Var.putInt("onLiveVersionType", i17);
            uVar.Ri(p60.j.f352162g);
            o4Var.putInt("gameLivePrepareScene", (booleanValue2 ? p60.s.f352194g : p60.s.f352195h).f352197d);
            o4Var.putBoolean("onLivingStatusForCrashCheck", true);
            uVar.f352202f = false;
            o4Var.putString("onLiveAppIdForCrashCheck", appId);
            o4Var.putInt("onLiveVersionTypeForCrashCheck", i17);
            Ni();
        } else if (uVar.f352202f) {
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = p60.u.f352199g;
            if (appId.equals(o4Var2.getString("onLiveAppIdForCrashCheck", "")) && i17 == o4Var2.getInt("onLiveVersionTypeForCrashCheck", 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "zbql: resumeGameLiveFromCrash");
                Ni();
                Bi();
                p60.u uVar2 = (p60.u) i95.n0.c(p60.u.class);
                com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:resumeGameLiveFromCrash reset GameLiveCommonService params");
                uVar2.Di();
                uVar2.Vi(appId);
                o4Var2.putInt("onLiveVersionType", i17);
                uVar2.Ri(p60.j.f352165m);
                com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:resumeGameLiveFromCrash reset GameLiveCommonService params done");
                uVar.f352202f = false;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveMainProcessService", "zbql:wrong!!!! reset crash state in launchWAGameForFinderLive,but the appid or versionType is wrong");
            }
        }
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        if (h6Var != null) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = appId;
            b1Var.f317016c = i17;
            b1Var.f317032k = booleanValue ? 1198 : 1197;
            java.lang.String Ui = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(null);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:" + Ui + ':' + longValue);
            b1Var.f317034l = Ui + ':' + longValue;
            ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(context, b1Var);
        }
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        p60.u.f352199g.putLong("Game_Live_liveId", longValue);
    }

    public final void Ni() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:registerFinderLiveCallback");
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        os5.n nVar = this.f279238h;
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        if (nVar != null) {
            dk2.k6 k6Var = dk2.ef.f233390j;
            k6Var.getClass();
            pm0.v.X(new dk2.h6(k6Var, nVar));
        }
        this.f279237g = true;
    }

    public final void Ri(p60.l action, int i17, int i18) {
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.ipcinvoker.extension.l.a(((p60.u) i95.n0.c(p60.u.class)).wi(), new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(action, null, 0, new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload(kz5.c1.k(new jz5.l("event", java.lang.Integer.valueOf(i17)), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, java.lang.Integer.valueOf(i18)))), 6, null), p60.q.class, null);
    }

    public final void Ui(android.content.Context context, java.lang.String appId, int i17, boolean z17, java.lang.String path, java.lang.String reportInfo, int i18, long j17) {
        android.view.WindowManager windowManager;
        android.view.Display defaultDisplay;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        ((h63.g1) i95.n0.c(h63.g1.class)).Ni();
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("APPID", appId);
        intent.putExtra("VERSION_TYPE", i17);
        intent.putExtra("IGNORE_CONTINUE_LIVE", z17);
        intent.putExtra("WXA_DEVELOPER_CUSTOM_PARAM", path);
        intent.putExtra("REPORT_INFO", reportInfo);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", i18);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", j17);
        boolean z18 = context instanceof android.app.Activity;
        android.app.Activity activity = z18 ? (android.app.Activity) context : null;
        java.lang.Integer valueOf = (activity == null || (windowManager = activity.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? null : java.lang.Integer.valueOf(defaultDisplay.getRotation());
        if (valueOf != null && valueOf.intValue() == 1) {
            intent.putExtra("LANDSCAPE_TYPE", 1);
        } else if (valueOf != null && valueOf.intValue() == 3) {
            intent.putExtra("LANDSCAPE_TYPE", 2);
        } else {
            intent.putExtra("LANDSCAPE_TYPE", 0);
        }
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
        com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "FinderGameLivePostVerifyUI");
        android.content.Intent intent2 = z18 ? null : intent;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.E).getValue());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGameLivePostVerifyUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGameLivePostVerifyUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Vi() {
        if (this.f279237g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:unRegisterFinderLiveCallback");
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            os5.n nVar = this.f279238h;
            ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
            if (nVar != null) {
                dk2.k6 k6Var = dk2.ef.f233390j;
                k6Var.getClass();
                pm0.v.X(new dk2.j6(k6Var, nVar));
            }
            this.f279237g = false;
        }
    }

    public final synchronized void wi(boolean z17) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "enableForegroundService current:" + this.f279235e + " request:" + z17);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (z17) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new h63.b1(this, context, null), 3, null);
        } else if (this.f279235e) {
            kotlinx.coroutines.r2 r2Var2 = this.f279236f;
            boolean z18 = false;
            if (r2Var2 != null && r2Var2.a()) {
                z18 = true;
            }
            if (z18 && (r2Var = this.f279236f) != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f279236f = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new h63.c1(context, this, null), 3, null);
        }
    }
}
