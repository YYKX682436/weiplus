package rc4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static rc4.a f394141f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f394142g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f394143h;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f394146k;

    /* renamed from: a, reason: collision with root package name */
    public static final rc4.e f394136a = new rc4.e();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f394137b = com.tencent.mm.sdk.platformtools.o4.L();

    /* renamed from: c, reason: collision with root package name */
    public static long f394138c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static long f394139d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f394140e = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f394144i = "";

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.HashSet f394145j = new java.util.HashSet();

    public final void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addReasonData", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        f394140e.add(new rc4.a(f394139d, 0, 0, null, i17, null, null, 0, 238, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addReasonData", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
    }

    public final long b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finderExposeInterval", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        long integer = ((c61.h9) ((c50.w0) i95.n0.c(c50.w0.class))).aj().getInteger(9) * 1000;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTierManager", "finderExposeInterval interval:" + integer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderExposeInterval", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        return integer;
    }

    public final int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReqPositionOffset", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int fj6 = ((c61.h9) ((c50.w0) i95.n0.c(c50.w0.class))).fj();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTierManager", "getReqPositionOffset offset:" + fj6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReqPositionOffset", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        return fj6;
    }

    public final int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUpdateCountLimit", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        c61.h9 h9Var = (c61.h9) ((c50.w0) i95.n0.c(c50.w0.class));
        h9Var.getClass();
        int integer = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.I1().r()).intValue() > 0 ? 1 : h9Var.aj().getInteger(4);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTierManager", "getUpdateCountLimit limit:" + integer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUpdateCountLimit", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        return integer;
    }

    public final void e(java.lang.String reason) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeFinderTier", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        kotlin.jvm.internal.o.g(reason, "reason");
        f394138c = -1L;
        f394139d = -1L;
        f(reason);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTierManager", "removeFinderTierId");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeFinderTier", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
    }

    public final void f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showDebugDialog", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        if (gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FINDER_TIER_DIALOG_INT_SYNC, 0) == 2) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.g("错误码：" + str);
            u1Var.m(com.tencent.mm.R.string.f490568yq);
            u1Var.l(rc4.d.f394135a);
            u1Var.q(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDebugDialog", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
    }

    public final void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerFetchSnsDeliveryBubbleSync", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        c50.w0 w0Var = (c50.w0) i95.n0.c(c50.w0.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finderSyncTimeCheck", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.tencent.mm.sdk.platformtools.o4 o4Var = f394137b;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - o4Var.q("MicroMsg.FinderTierManager", 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderSyncInterval", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        ((c61.h9) ((c50.w0) i95.n0.c(c50.w0.class))).getClass();
        long integer = (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.I1().r()).intValue() > 0 ? 30 : r2.aj().getInteger(1)) * 1000;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTierManager", "getFinderSyncInterval interval:" + integer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderSyncInterval", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        boolean z17 = currentTimeMillis >= integer;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderSyncTimeCheck", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderTierManager", "triggerFetchSnsDeliveryBubbleSync");
            o4Var.B("MicroMsg.FinderTierManager", java.lang.System.currentTimeMillis());
            c61.h9 h9Var = (c61.h9) w0Var;
            h9Var.getClass();
            com.tencent.mars.xlog.Log.i("Finder.SnsDeliveryBubbleService", "[disposeSnsDeliveryRedDotCtrlInfo] ...");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("FinderSnsDeliveryEntrance");
            h9Var.getClass();
            com.tencent.mars.xlog.Log.i("Finder.SnsDeliveryBubbleService", "[triggerFetchSnsDeliveryBubbleSync] doSync...");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).P.e(12288, 21);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderTierManager", "finder sync fail for time check");
            rc4.a aVar = f394141f;
            if (aVar != null) {
                aVar.b(7);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerFetchSnsDeliveryBubbleSync", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
    }

    public final void h(java.util.LinkedList list, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        kotlin.jvm.internal.o.g(list, "list");
        i();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("serverConfigEnable", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.tencent.mm.sdk.platformtools.o4 o4Var = f394137b;
        int o17 = o4Var.o("FinderTierManager.SERVER_KEY", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTierManager", "serverConfigEnable value:" + o17);
        boolean z17 = o17 == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("serverConfigEnable", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finderConfigEnable", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            c61.h9 h9Var = (c61.h9) ((c50.w0) i95.n0.c(c50.w0.class));
            h9Var.getClass();
            boolean z18 = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.I1().r()).intValue() > 0 || h9Var.aj().getInteger(0) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderTierManager", "finderConfigEnable enable:" + z18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finderConfigEnable", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            if (z18) {
                if (list.isEmpty()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FinderTierManager", "null list");
                    f394141f = new rc4.a(java.lang.System.currentTimeMillis(), 0, 0, null, 5, null, null, 0, 238, null);
                    e("5:拉到的新 feeds 小于 " + d() + " 值");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
                    return;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis() - o4Var.q("FinderTierManager.EXPOSE_KEY", 0L);
                if (currentTimeMillis <= b()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FinderTierManager", "expose interval disable:" + currentTimeMillis);
                    f394141f = new rc4.a(java.lang.System.currentTimeMillis(), 0, 0, null, 11, null, null, 0, 238, null);
                    e("11:曝光频控限制(" + currentTimeMillis + '<' + b() + ')');
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
                    return;
                }
                java.util.Iterator it = list.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else {
                        if (((com.tencent.mm.protocal.protobuf.SnsObject) it.next()).Id == j17) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                int size = i17 >= 0 ? i17 : list.size();
                if (size < d()) {
                    long q17 = o4Var.q("FinderTierManager.UI_KEY", -1L);
                    com.tencent.mars.xlog.Log.w("MicroMsg.FinderTierManager", "new feed count limit:" + size + " uiKey:" + ca4.z0.t0(q17) + " indicator:" + ca4.z0.t0(j17));
                    if (q17 != -1 && j17 != q17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTierManager", "do retry");
                        o4Var.B("FinderTierManager.UI_KEY", -1L);
                        h(list, q17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
                        return;
                    }
                    f394141f = new rc4.a(java.lang.System.currentTimeMillis(), 0, 0, null, 5, null, null, 0, 238, null);
                    e("5:拉到的新 feeds 小于 " + d() + " 值");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
                    return;
                }
                o4Var.A("FinderTierManager.SHOW_ID", 0);
                int c17 = i17 > 0 ? i17 - c() : (list.size() - c()) - 1;
                f394141f = new rc4.a(f394139d, 0, 0, null, 0, null, null, 0, 254, null);
                if (c17 <= 0 || list.isEmpty()) {
                    f394138c = -1L;
                    rc4.a aVar = f394141f;
                    if (aVar != null) {
                        aVar.b(2);
                    }
                    g();
                } else {
                    long j18 = ((com.tencent.mm.protocal.protobuf.SnsObject) list.get(c17)).Id;
                    f394138c = j18;
                    if (j18 <= j17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FinderTierManager", "requestTierId:" + ca4.z0.t0(f394138c) + " <= finderTierId:" + ca4.z0.t0(f394139d));
                    }
                    if (f394145j.contains(java.lang.Long.valueOf(f394138c))) {
                        g();
                        rc4.a aVar2 = f394141f;
                        if (aVar2 != null) {
                            aVar2.b(2);
                        }
                    }
                }
                rc4.a aVar3 = f394141f;
                if (aVar3 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIndicator", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                    aVar3.f394121a = j17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIndicator", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                }
                f394139d = j17;
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderTierManager", "update count:" + size + " requestTierId:" + ca4.z0.t0(f394138c) + " finderTierId:" + ca4.z0.t0(f394139d));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FinderTierManager", "server disable");
        e("0:总开关 关闭");
        f394141f = new rc4.a(java.lang.System.currentTimeMillis(), 0, 0, null, 0, null, null, 0, 238, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderTierId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
    }

    public final void i() {
        rc4.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateReportPageFeedId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.tencent.mm.plugin.finder.extension.reddot.jb cj6 = ((c61.h9) ((c50.w0) i95.n0.c(c50.w0.class))).cj();
        cl0.g bj6 = ((c61.h9) ((c50.w0) i95.n0.c(c50.w0.class))).bj(new c50.v0(0, null, cj6, null, 8, null));
        rc4.a aVar2 = f394141f;
        if (aVar2 != null) {
            java.lang.String optString = bj6.optString("next_page_feedid");
            if (optString == null) {
                optString = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNextPageFeedid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            aVar2.f394124d = optString;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNextPageFeedid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        }
        rc4.a aVar3 = f394141f;
        if (aVar3 != null) {
            java.lang.String optString2 = bj6.optString("show_username");
            if (optString2 == null) {
                optString2 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShow_username", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            aVar3.f394126f = optString2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShow_username", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        }
        rc4.a aVar4 = f394141f;
        boolean z17 = false;
        if (aVar4 != null) {
            int optInt = bj6.optInt("contenttype", 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContent_type", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            aVar4.f394128h = optInt;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContent_type", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        }
        rc4.a aVar5 = f394141f;
        if (aVar5 != null) {
            java.lang.String optString3 = bj6.optString("tips_uuid");
            java.lang.String str = optString3 != null ? optString3 : "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTips_uuid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            aVar5.f394127g = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTips_uuid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        }
        if (cj6 == null) {
            rc4.a aVar6 = f394141f;
            if (aVar6 != null) {
                aVar6.b(9);
            }
        } else {
            rc4.a aVar7 = f394141f;
            if (aVar7 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderbar_unexpose_reason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                int i17 = aVar7.f394125e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderbar_unexpose_reason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                if (i17 == 6) {
                    z17 = true;
                }
            }
            if (z17 && (aVar = f394141f) != null) {
                aVar.b(2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateReportPageFeedId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
    }
}
