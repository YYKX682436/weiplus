package com.tencent.mm.ui.report;

/* loaded from: classes8.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.e0 f209633a = new com.tencent.mm.ui.report.e0();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f209634b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f209635c = "";

    public static final java.lang.String a() {
        if (android.text.TextUtils.isEmpty(f209635c)) {
            f209635c = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(23, 2, ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).Di(94, 0));
        }
        return f209635c;
    }

    public static final java.lang.String b() {
        if (android.text.TextUtils.isEmpty(f209634b)) {
            if (((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai()) {
                ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
                f209634b = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(12, 2, wo2.n0.f448105a.a());
            } else {
                ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
                f209634b = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(12, 2, wo2.n0.f448105a.a());
            }
        }
        return f209634b;
    }

    public static final void c(long j17) {
        long j18 = j17 != 0 ? 2L : 1L;
        com.tencent.mm.autogen.mmdata.rpt.FinderRedDotNewStruct finderRedDotNewStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderRedDotNewStruct();
        finderRedDotNewStruct.f57716m = finderRedDotNewStruct.b("CurrUI", "1", true);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderRedDotNewStruct.f57723t = finderRedDotNewStruct.b("SessionID", Ri, true);
        finderRedDotNewStruct.f57717n = finderRedDotNewStruct.b("ContextID", b(), true);
        finderRedDotNewStruct.f57707d = 1011L;
        finderRedDotNewStruct.f57708e = finderRedDotNewStruct.b("RedDotTipsID", "FinderLocal_" + ((((float) c01.id.c()) * 1.0f) / 100000), true);
        finderRedDotNewStruct.f57709f = finderRedDotNewStruct.b("RedDotShowInfoPath", "NearbyEntrance", true);
        finderRedDotNewStruct.f57710g = finderRedDotNewStruct.b("RedDotShowInfoParentPath", "Discovery", true);
        finderRedDotNewStruct.f57711h = j18;
        finderRedDotNewStruct.f57712i = j17;
        finderRedDotNewStruct.f57713j = finderRedDotNewStruct.b("RedDotShowInfoTitle", "", true);
        finderRedDotNewStruct.f57714k = finderRedDotNewStruct.b("RedDotShowInfoExt", "", true);
        finderRedDotNewStruct.f57715l = 1;
        finderRedDotNewStruct.f57718o = finderRedDotNewStruct.b("ClickTabContextID", "1011-" + c01.id.c(), true);
        finderRedDotNewStruct.f57719p = 1L;
        finderRedDotNewStruct.f57720q = 1L;
        finderRedDotNewStruct.f57721r = 1L;
        ((zy2.pa) i95.n0.c(zy2.pa.class)).getClass();
        finderRedDotNewStruct.f57722s = 1L;
        finderRedDotNewStruct.f57724u = c01.id.c() / 1000;
        finderRedDotNewStruct.f57725v = finderRedDotNewStruct.b("RedDotShowInfoIconUrl", "", true);
        finderRedDotNewStruct.f57726w = 1L;
        finderRedDotNewStruct.f57727x = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk() ? 1L : 2L;
        finderRedDotNewStruct.k();
    }

    public static final void d() {
        f209633a.e(2L, ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Bi() ? 3L : 1L, a());
    }

    public final void e(long j17, long j18, java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.DiscoverNearbyEntranceStruct discoverNearbyEntranceStruct = new com.tencent.mm.autogen.mmdata.rpt.DiscoverNearbyEntranceStruct();
        discoverNearbyEntranceStruct.f55831d = c01.id.c();
        discoverNearbyEntranceStruct.f55832e = j17;
        discoverNearbyEntranceStruct.f55834g = discoverNearbyEntranceStruct.b("ContextID", str, true);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String str2 = "";
        if (Ri == null) {
            Ri = "";
        }
        discoverNearbyEntranceStruct.f55833f = discoverNearbyEntranceStruct.b("SessionID", Ri, true);
        discoverNearbyEntranceStruct.f55835h = j18;
        if (j18 == 1) {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveEntrance");
            if (L0 != null) {
                com.tencent.mars.xlog.Log.i("FindMoreFriendsReporter", "reportNearByLiveFriends field_tipsId：" + L0.field_tipsId);
                java.lang.String str3 = L0.field_tipsId;
                if (str3 != null) {
                    str2 = str3;
                }
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("is_red", (str2.length() == 0 ? 1 : 0) ^ 1);
            jSONObject.put("reddottipsid", str2);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            discoverNearbyEntranceStruct.f55836i = discoverNearbyEntranceStruct.b("Entrance_Extra", r26.i0.t(jSONObject2, ",", ";", false), true);
        }
        discoverNearbyEntranceStruct.k();
        com.tencent.mars.xlog.Log.i("FindMoreFriendsReporter", "reportNearByLiveFriends report " + discoverNearbyEntranceStruct.n());
    }
}
