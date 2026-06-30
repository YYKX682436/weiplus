package ml2;

/* loaded from: classes10.dex */
public final class x5 {

    /* renamed from: a, reason: collision with root package name */
    public static final ml2.x5 f328235a = new ml2.x5();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f328236b = jz5.h.b(ml2.v5.f328150d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f328237c = jz5.h.b(ml2.w5.f328199d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f328238d = jz5.h.b(ml2.u5.f328115d);

    public final void a(long j17, int i17) {
        if (i17 == 1) {
            jz5.g gVar = f328236b;
            java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) gVar).getValue();
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) gVar).getValue()).get(java.lang.Long.valueOf(j17));
            hashMap.put(valueOf, java.lang.Integer.valueOf((num != null ? num : 0).intValue() + 1));
        } else if (i17 == 2) {
            jz5.g gVar2 = f328237c;
            java.util.HashMap hashMap2 = (java.util.HashMap) ((jz5.n) gVar2).getValue();
            java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
            java.lang.Integer num2 = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) gVar2).getValue()).get(java.lang.Long.valueOf(j17));
            hashMap2.put(valueOf2, java.lang.Integer.valueOf((num2 != null ? num2 : 0).intValue() + 1));
        } else if (i17 == 3) {
            jz5.g gVar3 = f328238d;
            java.util.HashMap hashMap3 = (java.util.HashMap) ((jz5.n) gVar3).getValue();
            java.lang.Long valueOf3 = java.lang.Long.valueOf(j17);
            java.lang.Integer num3 = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) gVar3).getValue()).get(java.lang.Long.valueOf(j17));
            hashMap3.put(valueOf3, java.lang.Integer.valueOf((num3 != null ? num3 : 0).intValue() + 1));
        }
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i("LiveVisitorUnknowHostReporter", "recordUnknowHostErrMsg liveId:" + j17 + ",source:" + i17);
        }
    }

    public final void b(boolean z17, long j17, java.lang.String nickname, int i17) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(nickname, "nickname");
        java.lang.Integer num = i17 != 1 ? i17 != 2 ? i17 != 3 ? 0 : (java.lang.Integer) ((java.util.HashMap) ((jz5.n) f328238d).getValue()).remove(java.lang.Long.valueOf(j17)) : (java.lang.Integer) ((java.util.HashMap) ((jz5.n) f328237c).getValue()).remove(java.lang.Long.valueOf(j17)) : (java.lang.Integer) ((java.util.HashMap) ((jz5.n) f328236b).getValue()).remove(java.lang.Long.valueOf(j17));
        if (num == null || num.intValue() <= 0) {
            return;
        }
        int c17 = ml2.t5.f328020a.c(j17, i17);
        if (c17 == 1 || c17 == 2) {
            if (z17) {
                str = "fixUnknowHost_stage" + c17 + '_' + i17;
            } else {
                str = "fixUnknowHostFail_stage" + c17 + '_' + i17;
            }
            if (z17) {
                str2 = num.toString();
            } else {
                str2 = num + ";netType:" + com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct finderLivePlayErrorStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct();
            finderLivePlayErrorStruct.f57287i = 4L;
            finderLivePlayErrorStruct.f57282d = finderLivePlayErrorStruct.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str, true);
            finderLivePlayErrorStruct.f57283e = 0;
            finderLivePlayErrorStruct.f57284f = finderLivePlayErrorStruct.b("errMsg", str2, true);
            finderLivePlayErrorStruct.f57285g = finderLivePlayErrorStruct.b("liveId", pm0.v.u(j17), true);
            finderLivePlayErrorStruct.f57286h = finderLivePlayErrorStruct.b("nickname", nickname, true);
            finderLivePlayErrorStruct.k();
        }
    }
}
