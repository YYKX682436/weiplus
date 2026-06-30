package h63;

@j95.b(dependencies = {p60.x.class})
/* loaded from: classes7.dex */
public final class v0 extends i95.w implements h63.r1 {

    /* renamed from: d, reason: collision with root package name */
    public h63.q1 f279285d;

    /* renamed from: e, reason: collision with root package name */
    public j63.p f279286e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f279287f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f279288g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f279289h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.gamelive.playgame.a f279290i;

    /* renamed from: m, reason: collision with root package name */
    public h63.p1 f279291m;

    /* renamed from: n, reason: collision with root package name */
    public int f279292n;

    /* renamed from: o, reason: collision with root package name */
    public long f279293o;

    public static final void wi(h63.v0 v0Var, java.lang.String str, android.content.Context context, boolean z17) {
        v0Var.f279289h = true;
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = p60.u.f352199g;
        o4Var.putBoolean("onLivingStatusForCrashCheck", false);
        o4Var.putString("onLiveAppIdForCrashCheck", "");
        o4Var.putInt("onLiveVersionTypeForCrashCheck", 0);
        v0Var.Ui();
        h63.v[] vVarArr = h63.v.f279284d;
        com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest gameLiveAppbrandProcessService$EnterFinderLiveRequest = new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest(str, 0, 4, z17 ? 1 : 0, null, null, 0, 0L, 242, null);
        h63.s0 s0Var = h63.s0.f279279a;
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, gameLiveAppbrandProcessService$EnterFinderLiveRequest, s0Var, null);
    }

    public void Ai(java.lang.String appId, int i17, android.content.Context context, int i18, h63.l1 l1Var) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(context, "context");
        ((ku5.t0) ku5.t0.f312615d).B(new h63.b0(appId, i17, context, this, i18, l1Var));
    }

    public void Bi(int i17) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.A, null, 0, new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$AnchorLiveEntrance(i17, this.f279292n, this.f279293o), 6, null), p60.q.class, null);
    }

    public final void Di(int i17, int i18, com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload gameLiveAppbrandEventService$LiveStartInfoPayload) {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        j63.p pVar = this.f279286e;
        if (pVar == null || (o6Var = pVar.f297901a) == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.menu.s sVar = new com.tencent.mm.plugin.appbrand.menu.s();
        sVar.u(o6Var.C0());
        sVar.t(kz5.c1.k(new jz5.l("event", java.lang.Integer.valueOf(i17)), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, java.lang.Integer.valueOf(i18))));
        com.tencent.mars.xlog.Log.i("GameLiveAppbrandEventService", "zbql: send Event:" + i17 + ",reason:" + i18);
        com.tencent.mm.plugin.appbrand.menu.u[] uVarArr = com.tencent.mm.plugin.appbrand.menu.u.f85992d;
        if (i17 == 1) {
            ((p60.u) i95.n0.c(p60.u.class)).getClass();
            com.tencent.mm.sdk.platformtools.o4 o4Var = p60.u.f352199g;
            java.util.Map k17 = kz5.c1.k(new jz5.l("nickname", o4Var.getString("Game_Live_Nickname", "")), new jz5.l("headerUrl", o4Var.getString("Game_Live_anchorHeadUrl", "")), new jz5.l("joinLiveTips", o4Var.getString("Game_Live_joinLiveTips", "")), new jz5.l("liveId", java.lang.Long.valueOf(o4Var.getLong("Game_Live_liveId", 0L))), new jz5.l("finderUsername", o4Var.getString("Game_Live_finderUsrName", "")), new jz5.l("wxaGameExportId", o4Var.getString("Game_Live_finderGameExportId", "")));
            com.tencent.mars.xlog.Log.i("GameLiveAppbrandEventService", "zbql: start Event,nickname:%s", o4Var.getString("Game_Live_Nickname", ""));
            sVar.s("extra", k17);
        }
        sVar.m();
    }

    public void Ni(java.lang.Boolean bool) {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352181t, null, 0, null, 14, null), p60.q.class, null);
        } else {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352182u, null, 0, null, 14, null), p60.q.class, null);
        }
        j63.p pVar = this.f279286e;
        if (pVar != null && (o6Var = pVar.f297901a) != null) {
            j63.c cVar = new j63.c();
            com.tencent.mars.xlog.Log.i("GameLiveAppbrandEventService", "send LiveMute event without volumn，mute:" + booleanValue);
            cVar.u(o6Var.C0());
            cVar.s("mute", java.lang.Boolean.valueOf(booleanValue ^ true));
            cVar.m();
        }
        this.f279288g = booleanValue;
        ((i63.b0) ((i63.k0) i95.n0.c(i63.k0.class))).wi(false, false);
    }

    public void Ri(java.lang.Boolean bool, int i17) {
        boolean booleanValue = bool.booleanValue();
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        p60.u.f352199g.putBoolean("disableLiveInfo", !booleanValue);
        if (booleanValue) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352183v, null, 0, new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload(i17), 6, null), p60.q.class, null);
        }
    }

    public final void Ui() {
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = p60.u.f352199g;
        if (!o4Var.getBoolean("isPushing", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandProcessService", "stopPushing: isNotPushing return");
            return;
        }
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        o4Var.putBoolean("isPushing", false);
        h63.q1 q1Var = this.f279285d;
        if (q1Var != null) {
            h63.u0 u0Var = h63.u0.f279283d;
            pa1.t tVar = (pa1.t) q1Var;
            tVar.f40686g.getMagicBrush().e();
            tVar.f40686g.e(false, 0, new pa1.r(tVar, u0Var));
        }
    }
}
