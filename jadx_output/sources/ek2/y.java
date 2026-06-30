package ek2;

/* loaded from: classes5.dex */
public final class y extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final s40.u0 f253568t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253569u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.dr1 f253570v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j17, long j18, com.tencent.mm.protobuf.g liveCookies, org.json.JSONObject jo6, r45.qt2 qt2Var, s40.u0 callback) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(liveCookies, "liveCookies");
        kotlin.jvm.internal.o.g(jo6, "jo");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253568t = callback;
        this.f253569u = "Finder.GameLive.CgiFinderGameLivePlaygameSetTeamupConfig";
        r45.dr1 dr1Var = new r45.dr1();
        this.f253570v = dr1Var;
        dr1Var.set(1, db2.t4.f228171a.a(6917));
        dr1Var.set(2, java.lang.Long.valueOf(j17));
        dr1Var.set(3, java.lang.Long.valueOf(j18));
        dr1Var.set(4, liveCookies);
        dr1Var.set(5, xy2.c.f(qt2Var));
        dr1Var.set(6, 1);
        r45.w63 w63Var = new r45.w63();
        w63Var.set(0, 1);
        w63Var.set(1, java.lang.Integer.valueOf(jo6.optInt("join_team_mode")));
        r45.wd7 wd7Var = new r45.wd7();
        wd7Var.set(0, jo6.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        wd7Var.set(1, jo6.optString("teamup_desc"));
        wd7Var.set(2, jo6.optString("member_desc"));
        wd7Var.set(4, jo6.optString("teamup_extra_data"));
        r45.i41 i41Var = new r45.i41();
        i41Var.set(0, jo6.optString("appid"));
        i41Var.set(2, java.lang.Integer.valueOf(jo6.optInt("versionType")));
        i41Var.set(1, jo6.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH));
        wd7Var.set(5, i41Var);
        w63Var.set(2, wd7Var);
        dr1Var.set(7, w63Var);
        r45.er1 er1Var = new r45.er1();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = dr1Var;
        lVar.f70665b = er1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegamesetteamupconfig";
        lVar.f70667d = 6917;
        p(lVar.a());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appid", jo6.optString("appid"));
        jSONObject.put("type", 2);
        jSONObject.put("gametype", 1);
        jSONObject.put("sourceid", jo6.optString("sourceid"));
        jSONObject.put("teamupsetting", jo6.optString("join_team_mode"));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.Y, jSONObject.toString(), null, 4, null);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.er1 resp = (r45.er1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253569u, "[onCgiBack] scene:" + this.f253570v.getInteger(6) + ",errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + ' ');
        p60.n nVar = (p60.n) this.f253568t;
        nVar.getClass();
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload gameLiveAppbrandEventService$LiveIntPayload = new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveIntPayload(i18);
        com.tencent.mm.ipcinvoker.r rVar = nVar.f352189a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352168d, null, 0, gameLiveAppbrandEventService$LiveIntPayload, 6, null));
        }
    }
}
