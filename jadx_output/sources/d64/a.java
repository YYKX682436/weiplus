package d64;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d64.a f226779a = new d64.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f226780b = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f226781c;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("adAddDownloadTask", b64.g.class);
        linkedHashMap.put("adLaunchApplicationByAppId", b64.h.class);
        linkedHashMap.put("adDowngrade", b64.i.class);
        linkedHashMap.put("adGetCoupon", b64.j.class);
        linkedHashMap.put("adFollowBrandUser", b64.k.class);
        linkedHashMap.put("adFollowFinderUser", b64.l.class);
        linkedHashMap.put("adGetAdChannelAppInfo", b64.m.class);
        linkedHashMap.put("adGetDynamicCanvas", b64.n.class);
        linkedHashMap.put("adGetDynamicCanvasExtra", b64.o.class);
        linkedHashMap.put("adGetLocation", b64.p.class);
        linkedHashMap.put("adInstallDownloadTask", b64.q.class);
        linkedHashMap.put("adJumpWeApp", b64.r.class);
        linkedHashMap.put("adLaunchApp", b64.s.class);
        linkedHashMap.put("adMakeSmartPhone", b64.t.class);
        linkedHashMap.put("adOpenAuthManagementUI", b64.v.class);
        linkedHashMap.put("adOpenBusinessChat", b64.w.class);
        linkedHashMap.put("adOpenBrandChatUI", b64.x.class);
        linkedHashMap.put("adOpenCouponHomeUI", b64.y.class);
        linkedHashMap.put("adOpenCustomerServiceChat", b64.z.class);
        linkedHashMap.put("adOpenEmojiStore", b64.a0.class);
        linkedHashMap.put("adOpenFinderDetailUI", b64.b0.class);
        linkedHashMap.put("adOpenFinderLiveUI", b64.c0.class);
        linkedHashMap.put("adOpenFinderProfileUI", b64.d0.class);
        linkedHashMap.put("adOpenLocationPage", b64.e0.class);
        linkedHashMap.put("adOpenBrandProfileUI", b64.f0.class);
        linkedHashMap.put("adOpenScanner", b64.g0.class);
        linkedHashMap.put("adOpenWebView", b64.h0.class);
        linkedHashMap.put("adOperateDownloadTask", b64.i0.class);
        linkedHashMap.put("adQueryBrandContactState", b64.j0.class);
        linkedHashMap.put("adQueryDownloadTask", b64.k0.class);
        linkedHashMap.put("adQueryFinderLivingNoticeState", b64.l0.class);
        linkedHashMap.put("adQueryFinderLiveState", b64.m0.class);
        linkedHashMap.put("adQueryFinderUserInfo", b64.n0.class);
        linkedHashMap.put("adQueryHbCoverState", b64.o0.class);
        linkedHashMap.put("adRecordPageState", b64.p0.class);
        linkedHashMap.put("adReportAdChannel", b64.q0.class);
        linkedHashMap.put("adRequestAppointment", b64.r0.class);
        linkedHashMap.put("adRequestPhoneNumber", b64.s0.class);
        linkedHashMap.put("adScanQRCode", b64.t0.class);
        linkedHashMap.put("adShareToFriend", b64.u0.class);
        linkedHashMap.put("adShareToTimeline", b64.v0.class);
        linkedHashMap.put("adShowPhoneNumberMenu", b64.w0.class);
        linkedHashMap.put("adShowPhoneRequestDialog", b64.x0.class);
        linkedHashMap.put("adStartApkWatcher", b64.y0.class);
        linkedHashMap.put("adStartAppMarket", b64.z0.class);
        linkedHashMap.put("adStopApkWatcher", b64.a1.class);
        linkedHashMap.put("adSubscribeFinderLivingNotice", b64.b1.class);
        linkedHashMap.put("adHalfScreenExpandToTop", b64.d.class);
        linkedHashMap.put("adNotifyTimelineComment", b64.e.class);
        linkedHashMap.put("adGetRandomSelectCardDone", b64.c.class);
        linkedHashMap.put("adWorldCupAvatarUpdateDone", b64.f.class);
        f226781c = linkedHashMap;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerAll", "com.tencent.mm.plugin.sns.ad.liteapp.register.AdLiteJsApiRegister");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJsApis", "com.tencent.mm.plugin.sns.ad.liteapp.register.AdLiteJsApiRegister");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) f226781c).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJsApis", "com.tencent.mm.plugin.sns.ad.liteapp.register.AdLiteJsApiRegister");
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("wxalite0c45e912005759856ea55eb382e8c509", linkedHashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerAll", "com.tencent.mm.plugin.sns.ad.liteapp.register.AdLiteJsApiRegister");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerOfflineTask", "com.tencent.mm.plugin.sns.ad.liteapp.register.AdLiteJsApiRegister");
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        c64.a aVar = new c64.a();
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        com.tencent.mm.plugin.lite.logic.g1 s17 = com.tencent.mm.plugin.lite.logic.g1.s();
        s17.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0("wxalite0c45e912005759856ea55eb382e8c509")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "appId null.");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "registerOfflineResourceCallback appId:%s", "wxalite0c45e912005759856ea55eb382e8c509");
            java.util.HashMap hashMap = s17.f143962p;
            java.util.HashSet hashSet = (java.util.HashSet) hashMap.get("wxalite0c45e912005759856ea55eb382e8c509");
            if (hashSet == null) {
                java.util.HashSet hashSet2 = new java.util.HashSet();
                hashSet2.add(aVar);
                hashMap.put("wxalite0c45e912005759856ea55eb382e8c509", hashSet2);
            } else {
                hashSet.add(aVar);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerOfflineTask", "com.tencent.mm.plugin.sns.ad.liteapp.register.AdLiteJsApiRegister");
    }
}
