package h63;

/* loaded from: classes14.dex */
public final class d1 implements os5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h63.g1 f279224a;

    public d1(h63.g1 g1Var) {
        this.f279224a = g1Var;
    }

    public void a(java.util.List list, r45.mf4 mf4Var) {
        r45.v12 v12Var;
        r45.v12 v12Var2;
        r45.v12 v12Var3;
        r45.v12 v12Var4;
        r45.v12 v12Var5;
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        if (p60.u.f352199g.getBoolean("disableLiveInfo", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "receive onLiveInfoChanged,but is disableLiveInfo");
            return;
        }
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload = new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload(0L, 0L, 0L, 0L, 0L, null);
        if (mf4Var != null) {
            gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload.f142015d = mf4Var.getLong(3);
            gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload.f142016e = mf4Var.getLong(4);
            gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload.f142017f = mf4Var.getLong(1);
            gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload.f142018g = mf4Var.getLong(0);
            gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload.f142019h = mf4Var.getLong(5);
        }
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.nf4 nf4Var = (r45.nf4) it.next();
                nf4Var.getInteger(0);
                nf4Var.getString(2);
                nf4Var.getString(17);
                com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveSingleCommentPayload gameLiveAppbrandEventService$LiveSingleCommentPayload = new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveSingleCommentPayload(0, null, null, null, 0, 0L, 0, 0, null, null, null, 0, 0, null, null, null, null, null, null, 0, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142040d = java.lang.Integer.valueOf(nf4Var.getInteger(0));
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142041e = nf4Var.getString(1);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142042f = nf4Var.getString(9);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142043g = nf4Var.getString(2);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.H = nf4Var.getString(17);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142044h = java.lang.Integer.valueOf(nf4Var.getInteger(3));
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142045i = java.lang.Long.valueOf(nf4Var.getLong(4));
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142046m = java.lang.Integer.valueOf(nf4Var.getInteger(15));
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142047n = java.lang.Integer.valueOf(nf4Var.getInteger(8));
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142048o = nf4Var.getString(10);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142049p = nf4Var.getString(12);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142051q = nf4Var.getString(13);
                r45.u12 u12Var = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142053s = u12Var != null ? java.lang.Integer.valueOf(u12Var.f386927d) : null;
                r45.u12 u12Var2 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142054t = u12Var2 != null ? u12Var2.f386928e : null;
                r45.u12 u12Var3 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142055u = u12Var3 != null ? u12Var3.f386929f : null;
                r45.u12 u12Var4 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142058x = u12Var4 != null ? u12Var4.f386931h : null;
                r45.u12 u12Var5 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142060y = u12Var5 != null ? u12Var5.f386932i : null;
                r45.u12 u12Var6 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142062z = u12Var6 != null ? java.lang.Integer.valueOf(u12Var6.f386933m) : null;
                r45.u12 u12Var7 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.A = u12Var7 != null ? java.lang.Integer.valueOf(u12Var7.f386934n) : null;
                r45.u12 u12Var8 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.B = u12Var8 != null ? u12Var8.f386935o : null;
                r45.u12 u12Var9 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142056v = u12Var9 != null ? u12Var9.f386930g : null;
                r45.u12 u12Var10 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142057w = u12Var10 != null ? u12Var10.f386939s : null;
                r45.u12 u12Var11 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.C = (u12Var11 == null || (v12Var5 = u12Var11.f386936p) == null) ? null : v12Var5.f387797d;
                r45.u12 u12Var12 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.D = (u12Var12 == null || (v12Var4 = u12Var12.f386936p) == null) ? null : java.lang.Integer.valueOf(v12Var4.f387798e);
                r45.u12 u12Var13 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.E = (u12Var13 == null || (v12Var3 = u12Var13.f386936p) == null) ? null : v12Var3.f387799f;
                r45.u12 u12Var14 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.F = (u12Var14 == null || (v12Var2 = u12Var14.f386936p) == null) ? null : v12Var2.f387800g;
                r45.u12 u12Var15 = (r45.u12) nf4Var.getCustom(16);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.G = (u12Var15 == null || (v12Var = u12Var15.f386936p) == null) ? null : v12Var.f387801h;
                r45.iy1 iy1Var = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.I = iy1Var != null ? java.lang.Integer.valueOf(iy1Var.getInteger(0)) : null;
                r45.iy1 iy1Var2 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142039J = iy1Var2 != null ? iy1Var2.getString(1) : null;
                r45.iy1 iy1Var3 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.K = iy1Var3 != null ? iy1Var3.getString(2) : null;
                r45.iy1 iy1Var4 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.L = iy1Var4 != null ? java.lang.Integer.valueOf(iy1Var4.getInteger(3)) : null;
                r45.iy1 iy1Var5 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.M = iy1Var5 != null ? iy1Var5.getString(4) : null;
                r45.iy1 iy1Var6 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.N = iy1Var6 != null ? iy1Var6.getString(5) : null;
                r45.iy1 iy1Var7 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.P = iy1Var7 != null ? iy1Var7.getString(6) : null;
                r45.iy1 iy1Var8 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.Q = iy1Var8 != null ? java.lang.Integer.valueOf(iy1Var8.getInteger(7)) : null;
                r45.iy1 iy1Var9 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.R = iy1Var9 != null ? iy1Var9.getString(8) : null;
                r45.iy1 iy1Var10 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.S = iy1Var10 != null ? java.lang.Integer.valueOf(iy1Var10.getInteger(9)) : null;
                r45.iy1 iy1Var11 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.T = iy1Var11 != null ? iy1Var11.getString(10) : null;
                r45.iy1 iy1Var12 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.U = iy1Var12 != null ? java.lang.Integer.valueOf(iy1Var12.getInteger(11)) : null;
                r45.iy1 iy1Var13 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.V = iy1Var13 != null ? java.lang.Integer.valueOf(iy1Var13.getInteger(12)) : null;
                r45.iy1 iy1Var14 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.W = iy1Var14 != null ? java.lang.Integer.valueOf(iy1Var14.getInteger(13)) : null;
                r45.iy1 iy1Var15 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142050p0 = iy1Var15 != null ? iy1Var15.getString(14) : null;
                r45.iy1 iy1Var16 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142059x0 = iy1Var16 != null ? iy1Var16.getList(15) : null;
                r45.iy1 iy1Var17 = (r45.iy1) nf4Var.getCustom(18);
                gameLiveAppbrandEventService$LiveSingleCommentPayload.f142061y0 = iy1Var17 != null ? iy1Var17.getString(17) : null;
                if (nf4Var.getInteger(15) != 0) {
                    gameLiveAppbrandEventService$LiveSingleCommentPayload.f142052r = nf4Var.getInteger(11) / nf4Var.getInteger(15);
                } else {
                    gameLiveAppbrandEventService$LiveSingleCommentPayload.f142052r = nf4Var.getInteger(11);
                }
                arrayList.add(gameLiveAppbrandEventService$LiveSingleCommentPayload);
            }
            gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload.f142020i = arrayList;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "decide to send IPC msg");
        com.tencent.mm.ipcinvoker.extension.l.a(((p60.u) i95.n0.c(p60.u.class)).wi(), new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.F, null, 0, gameLiveAppbrandEventService$LiveCommentWrapperInfoPayload, 6, null), p60.q.class, null);
    }

    public void b(int i17) {
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        if (p60.u.f352199g.getBoolean("disableMicInfo", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "receive LiveVoiceVolume msg, but disableMicInfo");
        } else {
            com.tencent.mm.ipcinvoker.extension.l.a(((p60.u) i95.n0.c(p60.u.class)).wi(), new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.G, null, 0, new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload(kz5.b1.e(new jz5.l("micVolume", java.lang.Integer.valueOf(i17)))), 6, null), p60.q.class, null);
        }
    }

    public void c(boolean z17, java.lang.String str, java.lang.Integer num) {
        java.lang.String str2 = "zbql:onMiniWindowStatusChange,isShown:" + z17 + ",isGameLiving:%b,appid:" + str + ",versionType:" + num + ",state:%s";
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = ((p60.u) i95.n0.c(p60.u.class)).Bi(str == null ? "" : str, num != null ? num.intValue() : 0);
        objArr[1] = ((p60.u) i95.n0.c(p60.u.class)).Ai().h();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", str2, objArr);
        if (z17) {
            p60.u uVar = (p60.u) i95.n0.c(p60.u.class);
            if (str == null) {
                str = "";
            }
            if (uVar.Bi(str, num != null ? num.intValue() : 0).booleanValue() && ((p60.u) i95.n0.c(p60.u.class)).Ai() == p60.j.f352163h) {
                this.f279224a.getClass();
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
                dk2.ef efVar = dk2.ef.f233372a;
                pm0.v.X(new dk2.ld(false, context));
                com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "hide MinimizeGameLive");
            }
        }
    }

    public void d(boolean z17, int i17) {
        h63.g1 g1Var = this.f279224a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:receive startLive success callback from finder");
            g1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "enableAudio");
            g1Var.f279234d = false;
            g1Var.Ai(true);
            g1Var.Bi();
            com.tencent.mm.ipcinvoker.extension.l.a(((p60.u) i95.n0.c(p60.u.class)).wi(), new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.D, null, 0, null, 14, null), p60.q.class, null);
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:invalid errType");
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveMainProcessService", "zbql:PostErrType.ENTER_ROOM_FAIL");
            ((p60.u) i95.n0.c(p60.u.class)).Ni();
            g1Var.Vi();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:PostErrType.USER_CANCEL");
        p60.l lVar = p60.l.B;
        com.tencent.mm.plugin.appbrand.menu.u[] uVarArr = com.tencent.mm.plugin.appbrand.menu.u.f85992d;
        com.tencent.mm.plugin.appbrand.menu.t[] tVarArr = com.tencent.mm.plugin.appbrand.menu.t.f85989d;
        g1Var.Ri(lVar, 3, 0);
        ((p60.u) i95.n0.c(p60.u.class)).Ni();
        g1Var.Vi();
    }

    public void e(boolean z17, int i17, int i18) {
        if (z17) {
            com.tencent.mm.ipcinvoker.extension.l.a(((p60.u) i95.n0.c(p60.u.class)).wi(), new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.E, null, 0, new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$SimpleLiveStateChangePayload(kz5.c1.k(new jz5.l("shareUserCount", java.lang.Integer.valueOf(i17)), new jz5.l("shareRoomCount", java.lang.Integer.valueOf(i18)))), 6, null), p60.q.class, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "ShareLiveToConversation failed");
        }
    }
}
