package ml2;

/* loaded from: classes10.dex */
public final class t5 {

    /* renamed from: a, reason: collision with root package name */
    public static final ml2.t5 f328020a = new ml2.t5();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f328021b = jz5.h.b(ml2.s5.f327927d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f328022c = kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_ERR_NET_DISCONNECT), java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_ERR_GET_RTMP_ACC_URL_FAIL), java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_ERR_FILE_NOT_FOUND), -2304, java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_ERR_HLS_KEY), java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_ERR_GET_PLAYINFO_FAIL), java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_ERR_STREAM_SWITCH_FAIL)});

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f328023d = kz5.z.D0(new java.lang.Integer[]{2101, 2102, java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_RECONNECT), java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_RECV_DATA_LAG), 2105, 2106, java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_DISCONTINUITY), 2108, 3001, 3002, 3003, 3005});

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f328024e = jz5.h.b(ml2.q5.f327859d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f328025f = jz5.h.b(ml2.r5.f327914d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f328026g = jz5.h.b(ml2.p5.f327810d);

    public final void a(long j17, java.lang.String nickname, int i17) {
        kotlin.jvm.internal.o.g(nickname, "nickname");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDisconnect_");
        int i18 = ml2.n5.f327765a;
        sb6.append(i17);
        e(sb6.toString(), j17, nickname);
        ml2.x5.f328235a.b(false, j17, nickname, i17);
    }

    public final void b(long j17, java.lang.String nickname, int i17) {
        kotlin.jvm.internal.o.g(nickname, "nickname");
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i("LiveVisitorPlayReporter", "firstFrameCallback source:" + i17 + ", liveRoom size:" + ((java.util.HashMap) ((jz5.n) f328024e).getValue()).size() + ",nearby size:" + ((java.util.HashMap) ((jz5.n) f328025f).getValue()).size() + ",liveFeed size:" + ((java.util.HashMap) ((jz5.n) f328026g).getValue()).size() + '!');
        }
        e("onFirstFrame_" + i17, j17, nickname);
        ml2.x5.f328235a.b(true, j17, nickname, i17);
        d(j17, i17, 2);
    }

    public final int c(long j17, int i17) {
        if (i17 == 1) {
            java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) f328024e).getValue()).get(java.lang.Long.valueOf(j17));
            return (num != null ? num : -1).intValue();
        }
        if (i17 == 2) {
            java.lang.Integer num2 = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) f328025f).getValue()).get(java.lang.Long.valueOf(j17));
            return (num2 != null ? num2 : -1).intValue();
        }
        if (i17 != 3) {
            return -1;
        }
        java.lang.Integer num3 = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) f328026g).getValue()).get(java.lang.Long.valueOf(j17));
        return (num3 != null ? num3 : -1).intValue();
    }

    public final void d(long j17, int i17, int i18) {
        jz5.g gVar = f328026g;
        jz5.g gVar2 = f328025f;
        jz5.g gVar3 = f328024e;
        if (i17 == 1) {
            ((java.util.HashMap) ((jz5.n) gVar3).getValue()).put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
        } else if (i17 == 2) {
            ((java.util.HashMap) ((jz5.n) gVar2).getValue()).put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
        } else if (i17 == 3) {
            ((java.util.HashMap) ((jz5.n) gVar).getValue()).put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
        }
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i("LiveVisitorPlayReporter", "recordStage liveRoom size:" + ((java.util.HashMap) ((jz5.n) gVar3).getValue()).size() + ",nearby size:" + ((java.util.HashMap) ((jz5.n) gVar2).getValue()).size() + ",liveFeed size:" + ((java.util.HashMap) ((jz5.n) gVar).getValue()).size() + '!');
        }
    }

    public final void e(java.lang.String scene, long j17, java.lang.String nickname) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct finderLivePlayErrorStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct();
        finderLivePlayErrorStruct.f57287i = 4L;
        finderLivePlayErrorStruct.f57282d = finderLivePlayErrorStruct.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, scene, true);
        finderLivePlayErrorStruct.f57283e = 0;
        finderLivePlayErrorStruct.f57285g = finderLivePlayErrorStruct.b("liveId", pm0.v.u(j17), true);
        finderLivePlayErrorStruct.f57286h = finderLivePlayErrorStruct.b("nickname", nickname, true);
        finderLivePlayErrorStruct.k();
    }

    public final void f(int i17, android.os.Bundle bundle, long j17, java.lang.String nickname, int i18) {
        java.lang.String str;
        java.lang.String string;
        kotlin.jvm.internal.o.g(nickname, "nickname");
        int c17 = c(j17, i18);
        boolean contains = f328022c.contains(java.lang.Integer.valueOf(i17));
        if (contains || f328023d.contains(java.lang.Integer.valueOf(i17))) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.lang.String str2 = ((bundle == null || (string = bundle.getString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION)) == null) ? null : r26.i0.t(string, ",", ";", false)) + ";netType:" + netType;
            if (contains) {
                str = "onPlayError_stage" + c17 + '_' + i18;
            } else {
                str = "onPlayWarning_stage" + c17 + '_' + i18;
            }
            com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct finderLivePlayErrorStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct();
            finderLivePlayErrorStruct.f57287i = 4L;
            finderLivePlayErrorStruct.f57282d = finderLivePlayErrorStruct.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str, true);
            finderLivePlayErrorStruct.f57283e = i17;
            finderLivePlayErrorStruct.f57284f = finderLivePlayErrorStruct.b("errMsg", str2, true);
            finderLivePlayErrorStruct.f57285g = finderLivePlayErrorStruct.b("liveId", pm0.v.u(j17), true);
            finderLivePlayErrorStruct.f57286h = finderLivePlayErrorStruct.b("nickname", nickname, true);
            finderLivePlayErrorStruct.k();
        }
    }

    public final void g(java.lang.String msg, long j17, java.lang.String nickname, int i17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        d(j17, i17, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(msg + ";netType:" + com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a));
        if (((java.lang.Boolean) ((jz5.n) f328021b).getValue()).booleanValue()) {
            sb6.append(";supportWidevine");
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct finderLivePlayErrorStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct();
        finderLivePlayErrorStruct.f57287i = 4L;
        finderLivePlayErrorStruct.f57282d = finderLivePlayErrorStruct.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "pluginStartPlay_" + i17, true);
        finderLivePlayErrorStruct.f57283e = 0;
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        finderLivePlayErrorStruct.f57284f = finderLivePlayErrorStruct.b("errMsg", r26.i0.t(sb7, ",", "_", false), true);
        finderLivePlayErrorStruct.f57285g = finderLivePlayErrorStruct.b("liveId", pm0.v.u(j17), true);
        finderLivePlayErrorStruct.f57286h = finderLivePlayErrorStruct.b("nickname", nickname, true);
        finderLivePlayErrorStruct.k();
    }
}
