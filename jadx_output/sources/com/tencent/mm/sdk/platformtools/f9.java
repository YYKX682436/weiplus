package com.tencent.mm.sdk.platformtools;

/* loaded from: classes11.dex */
public enum f9 {
    GlobalScan("pay", 0),
    GlobalAppbrand("mp", 1),
    GlobalWeCom("wecom", 1),
    Global3rdSrv(2),
    HomeMorePayment("pay", 1),
    HomeMoreFeedback(2),
    HomeAppbrandDrawer("mp", 1),
    HomeNotifyMessage("oa", 1),
    HomeServiceOa("oa", 1),
    /* JADX INFO: Fake field, exist only in values array */
    HomeServiceMp("oa", 1),
    HomePluginQQMail("third_party", 2),
    HomePluginSports("cross_data", 1),
    HomePluginWePay("pay", 1),
    HomePluginWeGame("oa", 1),
    ContactNewFriendOa("oa", 1),
    ContactNewFriendWeWeCom("wecom", 1),
    ContactOa("oa", 1),
    ContactWeCom("wecom", 1),
    DiscoveryScanPayCode("pay", 1),
    DiscoveryScanPayReward("pay", 1),
    /* JADX INFO: Fake field, exist only in values array */
    DiscoveryScanSecondary("mp", 1),
    DiscoveryScanFace2Face("pay", 1),
    DiscoveryScanRecognize("cross_data", 1),
    DiscoveryScanTranslate("cross_data", 1),
    /* JADX INFO: Fake field, exist only in values array */
    DiscoveryScanSecondary("secondary", 1),
    DiscoveryScanExtDevice(2),
    DiscoveryChannels("channels", 2),
    DiscoveryChannelsLive("channels", 2),
    DiscoveryShake("cross_data", 1),
    DiscoveryLooks(ya.a.SEARCH, 1),
    DiscoverySearch(ya.a.SEARCH, 1),
    DiscoveryNearby("cross_data", 1),
    DiscoveryNearbyLiveFriends_GP("channels", 2),
    DiscoveryNearbyLiveFriends("cross_data", 1),
    DiscoveryShop("third_party", 1),
    DiscoveryGame("third_party", 1),
    DiscoveryAppbrand("mp", 1),
    DiscoveryWeChatOut("wechat_out", 1),
    DiscoveryTing(ya.a.SEARCH, 1),
    MePayment("pay", 1),
    MeCouponCard("pay", 1),
    MeAvatarAddress("pay", 1),
    MeAvatarInvoiceTitle("pay", 1),
    MeAvatarWeChatId(2),
    /* JADX INFO: Fake field, exist only in values array */
    SessionSpeech2TextRcv(2),
    MeSetSecurityVoicePrint(2),
    MeSetSecurityQQ(2),
    MeSetSecurityFacebook(2),
    /* JADX INFO: Fake field, exist only in values array */
    SessionSpeech2TextRcv(2),
    MeSetNewMsgChannels("channels", 2),
    MeSetPrivacyAddByQQ(2),
    MeSetPrivacyPermissions("open", 1),
    MeSetAboutIntros(2),
    MeSetPlugin(2),
    MeSetDiscoveryChannels(0),
    MeSetDiscoveryFinderLive(0),
    MeSetDiscoveryShake(0),
    MeSetDiscoveryLooks(0),
    MeSetDiscoverySearch(0),
    MeSetDiscoveryNearby(0),
    MeSetDiscoveryNearbyLiveFriends(0),
    MeSetDiscoveryNearbyLiveFriendsPerson(0),
    MeSetDiscoveryShop(0),
    MeSetDiscoveryGame(0),
    MeSetDiscoveryAppbrand(0),
    MeSetDiscoveryWeChatOut(0),
    MeSetDiscoveryTing(0),
    /* JADX INFO: Fake field, exist only in values array */
    SessionSpeech2TextRcv(2),
    /* JADX INFO: Fake field, exist only in values array */
    SessionSpeech2TextRcv(2),
    /* JADX INFO: Fake field, exist only in values array */
    SessionSpeech2TextRcv(2),
    /* JADX INFO: Fake field, exist only in values array */
    SessionSpeech2TextRcv(2),
    /* JADX INFO: Fake field, exist only in values array */
    SessionSpeech2TextRcv(2),
    LoginPasswordReset(0),
    ContextTranslate("cross_data", 1),
    ContextSearch(ya.a.SEARCH, 1),
    SessionSpeech2TextSnd("cross_data", 1),
    /* JADX INFO: Fake field, exist only in values array */
    SessionSpeech2TextRcv("cross_data", 1),
    SessionMusic("cross_data", 1),
    SessionLocation("cross_data", 1),
    SessionAppbrand("mp", 1),
    SessionOa("oa", 1),
    SessionLuckyMoney("pay", 1),
    SessionPayment("pay", 1),
    SessionCouponCard("pay", 1),
    SessionGroupTools("mp", 1),
    SessionGroupSolitaire("mp", 0),
    SessionGroupLive("live", 1),
    SessionChannels("channels", 2),
    SessionVoiceMsg("cross_data", 1),
    PaymentH5Jsb("pay", 1),
    PaymentAppbrandJsb("pay", 1),
    PaymentOpenSdk("pay", 1),
    MomentChannels("channels", 2),
    MomentAds("ads", 1),
    /* JADX INFO: Fake field, exist only in values array */
    MomentApprand("mp", 1),
    /* JADX INFO: Fake field, exist only in values array */
    Unknown("unknownKey", "unknownGroup", 2);


    /* renamed from: d, reason: collision with root package name */
    public final int f192709d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f192710e;

    f9(int i17) {
        this.f192710e = "";
        this.f192709d = i17;
    }

    public static boolean i(int i17) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        if (yp5.a.f464409a.a()) {
            return false;
        }
        boolean z17 = i17 == 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatBrands", "Business.Entry#isBanned = " + z17);
        return z17;
    }

    public static boolean m(com.tencent.mm.sdk.platformtools.f9 f9Var) {
        if (f9Var == SessionLocation) {
            return fp.q.b("xmap");
        }
        if (f9Var == MomentAds) {
            return fp.q.b("pag");
        }
        if (f9Var.f192710e.equals("channels") || f9Var.f192710e.equals("live")) {
            return fp.q.b("live_sdk");
        }
        return true;
    }

    public static boolean o(int i17) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        if (yp5.a.f464409a.a()) {
            return false;
        }
        boolean z17 = i17 != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatBrands", "Business.Entry#isRestricted = " + z17);
        return z17;
    }

    public static boolean p(int i17) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        if (yp5.a.f464409a.a()) {
            return false;
        }
        boolean z17 = i17 == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatBrands", "Business.Entry#signRequsted = " + z17);
        return z17;
    }

    public boolean h() {
        return !m(this) || i(this.f192709d);
    }

    public boolean j(android.content.Context context) {
        return k(context, null);
    }

    public boolean k(android.content.Context context, m3.a aVar) {
        if (m(this)) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
            if (yp5.a.f464409a.a() || !((java.lang.Boolean) com.tencent.mm.sdk.platformtools.g9.f192718a.apply(this)).booleanValue()) {
                return true;
            }
            if (!((java.lang.Boolean) com.tencent.mm.sdk.platformtools.g9.f192719b.apply(this)).booleanValue()) {
                return false;
            }
        }
        com.tencent.mm.sdk.platformtools.e9 e9Var = new com.tencent.mm.sdk.platformtools.e9(context, aVar);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            e9Var.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(e9Var);
        }
        return false;
    }

    public boolean l(android.content.Context context, m3.a aVar) {
        if (!m(this)) {
            return false;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        if (yp5.a.f464409a.a() || !((java.lang.Boolean) com.tencent.mm.sdk.platformtools.g9.f192718a.apply(this)).booleanValue()) {
            return true;
        }
        if (!(context instanceof android.app.Activity) || !((java.lang.Boolean) com.tencent.mm.sdk.platformtools.g9.f192719b.apply(this)).booleanValue() || aVar == null) {
            return false;
        }
        aVar.accept(com.tencent.mm.sdk.platformtools.g9.f192720c);
        return false;
    }

    public boolean n() {
        return !m(this) || o(this.f192709d);
    }

    f9(java.lang.String str, int i17) {
        this.f192710e = str;
        this.f192709d = i17;
    }

    f9(java.lang.String str, java.lang.String str2, int i17) {
        this.f192710e = str2;
        this.f192709d = i17;
    }
}
