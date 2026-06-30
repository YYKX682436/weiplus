package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class ADInfo extends n64.b {
    public static final int AD_ACTION_TYPE_CARD_DETAIL = 1;
    public static final int AD_ACTION_TYPE_FINDER = 9;
    public static final int AD_ACTION_TYPE_FINDER_LIVE = 10;
    public static final int AD_ACTION_TYPE_FINDER_TOPIC = 11;
    public static final int AD_ACTION_TYPE_IOS_APPSTORE = 2;
    public static final int AD_ACTION_TYPE_IOS_SCHEMA_JUMP = 7;
    public static final int AD_ACTION_TYPE_LANDING_PAGE = 3;
    public static final int AD_ACTION_TYPE_SCAN = 8;
    public static final int AD_ACTION_TYPE_WEAPP = 4;
    public static final int AD_ACTION_TYPE_WEB = 0;
    public static final java.lang.String TAG = "MicroMsg.ADInfo";
    public com.tencent.mm.plugin.sns.storage.a actionExtAppJump;
    public com.tencent.mm.plugin.sns.storage.b actionExtWeApp;
    public java.lang.String adActionCardExt;
    public java.lang.String adActionCardTitle;
    public java.lang.String adActionCardTpId;
    public java.lang.String adActionExtTailFormattedWording;
    public java.lang.String adActionExtTailLink;
    public int adActionExtTailType;
    public java.lang.String adActionExtTailUserDisplayName;
    public java.lang.String adActionExtTailWording;
    public java.util.LinkedList<java.lang.String> adActionExtUserList;
    public java.lang.String adActionLink;
    public java.lang.String adActionPOIId;
    public java.lang.String adActionPOILink;
    public java.lang.String adActionPOIName;
    public int adActionPOIType;
    public int adActionType;
    public java.lang.String adCanvasExtXml;
    public com.tencent.mm.plugin.sns.storage.i0 adChainExtInfo;
    public int adChainType;
    public int adChainTypeExpireTime;

    @za4.l1(resType = 5)
    public java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> adClickActionInfoList;
    public java.lang.String adDislikeInfoTitle_cn;
    public java.lang.String adDislikeInfoTitle_en;
    public java.lang.String adDislikeInfoTitle_tw;
    public int adDupSnsIdDel;
    public org.json.JSONObject adExpParams;
    public java.lang.String adExtTailWording;
    public int adExtTailWordingExchangeValue;
    public java.lang.String adIPv4Url;
    public java.lang.String adInfoSyncBuffer;
    public boolean adInfoSyncBufferImm;
    private q34.b adPreloadConfig;
    public com.tencent.mm.plugin.sns.storage.d adUnlikeInfo;
    public com.tencent.mm.plugin.sns.storage.e adVoteInfoExt;
    public int ad_sns_pos;
    public boolean addClickTimeToWeAppPath;
    public java.lang.String aid;
    boolean bLandingPagesAd;
    public b94.a commonShakeInfo;
    public int contractAdEndTime;
    public java.lang.String costLevel;
    public long exposureClickExpireTime;
    public long exposureNoActionExpireTime;
    public boolean forbidClick;
    public boolean forbiddenShowRelievedBuy;
    public boolean isPersonalizedAdClose;
    public java.util.HashMap<java.lang.String, java.lang.String> mappedCanvasCardExt;
    public long noExposureExpireTime;
    public java.lang.String pId;
    public boolean preloadFinderFeed;
    public boolean preloadFinderLive;
    public float score;
    public java.lang.String sessionKeyAd;
    public java.lang.String traceid;
    public java.lang.String uxInfo;
    public java.lang.String viewId;
    public java.lang.String waidPkg;
    public java.lang.String xml;
    private static java.util.HashMap<java.lang.String, java.lang.String> waidPkgCache = new java.util.HashMap<>();
    public static int ADChainStrengthenDefaultWording = 0;
    public static int ADChainStrengthenUserInfoFormatWording = 1;

    public ADInfo() {
        this.xml = "";
        this.uxInfo = "";
        this.adActionType = 0;
        this.adActionCardTitle = "";
        this.adActionCardTpId = "";
        this.adActionCardExt = "";
        this.adActionLink = "";
        this.adActionPOIType = 0;
        this.adActionPOIId = "";
        this.adActionPOIName = "";
        this.adActionPOILink = "";
        this.adActionExtTailType = ADChainStrengthenDefaultWording;
        this.adActionExtTailWording = "";
        this.adActionExtTailLink = "";
        this.adActionExtUserList = new java.util.LinkedList<>();
        this.adCanvasExtXml = "";
        this.adUnlikeInfo = new com.tencent.mm.plugin.sns.storage.d();
        this.adDislikeInfoTitle_cn = "";
        this.adDislikeInfoTitle_en = "";
        this.adDislikeInfoTitle_tw = "";
        this.forbidClick = false;
        this.isPersonalizedAdClose = false;
        this.adInfoSyncBuffer = "";
        this.adInfoSyncBufferImm = false;
        this.pId = "";
        this.sessionKeyAd = "";
        this.costLevel = "";
    }

    private static boolean enableAdPreloadConfig() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableAdPreloadConfig", "com.tencent.mm.plugin.sns.storage.ADInfo");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_enable_adinfo_preload_cfg, 1) == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdPreloadConfig", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(TAG, "enableAdPreloadConfig, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableAdPreloadConfig", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x0276, code lost:
    
        if (r9 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x025c, code lost:
    
        if (r9 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x025e, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027d, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r9) != false) goto L244;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void feed(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 1855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.ADInfo.feed(java.lang.String):void");
    }

    public static java.lang.String getWaidPkgByUxInfo(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWaidPkgByUxInfo", "com.tencent.mm.plugin.sns.storage.ADInfo");
        java.lang.String str2 = "";
        java.lang.String E = ca4.m0.E(str);
        if (android.text.TextUtils.isEmpty(E)) {
            com.tencent.mars.xlog.Log.e(TAG, "getWaidPkgByUxInfo, aid is empty, uxinfo=" + str);
        } else {
            synchronized (waidPkgCache) {
                try {
                    java.lang.String str3 = waidPkgCache.get(E);
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str3 == null) {
                        str3 = "";
                    }
                    str2 = str3;
                } finally {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWaidPkgByUxInfo", "com.tencent.mm.plugin.sns.storage.ADInfo");
                }
            }
        }
        return str2;
    }

    public static boolean isNewStyleFeedback(com.tencent.mm.plugin.sns.storage.ADInfo aDInfo) {
        com.tencent.mm.plugin.sns.storage.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNewStyleFeedback", "com.tencent.mm.plugin.sns.storage.ADInfo");
        boolean z17 = (aDInfo == null || (dVar = aDInfo.adUnlikeInfo) == null || !dVar.f165961g) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewStyleFeedback", "com.tencent.mm.plugin.sns.storage.ADInfo");
        return z17;
    }

    private void parseAdClickActionInfoList(java.util.Map<java.lang.String, java.lang.String> map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseAdClickActionInfoList", "com.tencent.mm.plugin.sns.storage.ADInfo");
        try {
            if (map.containsKey(".ADInfo.clickActionInfoList")) {
                if (this.adClickActionInfoList == null) {
                    this.adClickActionInfoList = new java.util.ArrayList();
                }
                int i17 = 0;
                while (true) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(".ADInfo.clickActionInfoList.clickActionInfo");
                    sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                    java.lang.String sb7 = sb6.toString();
                    if (!map.containsKey(sb7)) {
                        break;
                    }
                    this.adClickActionInfoList.add(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, sb7));
                    i17++;
                }
                com.tencent.mars.xlog.Log.i(TAG, "parseAdClickActionInfoList, list.size=" + this.adClickActionInfoList.size());
            } else {
                com.tencent.mars.xlog.Log.i(TAG, "parseAdClickActionInfoList, no clickActionInfoList");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(TAG, "parseAdClickActionInfoList, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseAdClickActionInfoList", "com.tencent.mm.plugin.sns.storage.ADInfo");
    }

    public boolean checkCurIndexCanJump(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkCurIndexCanJump", "com.tencent.mm.plugin.sns.storage.ADInfo");
        if (i17 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCurIndexCanJump", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return false;
        }
        if (a84.b0.b(this.adClickActionInfoList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCurIndexCanJump", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return false;
        }
        boolean z17 = i17 < this.adClickActionInfoList.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCurIndexCanJump", "com.tencent.mm.plugin.sns.storage.ADInfo");
        return z17;
    }

    public q34.b getAdPreloadConfig() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdPreloadConfig", "com.tencent.mm.plugin.sns.storage.ADInfo");
        if (enableAdPreloadConfig()) {
            q34.b bVar = this.adPreloadConfig;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPreloadConfig", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return bVar;
        }
        com.tencent.mars.xlog.Log.e(TAG, "adVideoPreload, getAdPreloadConfig==null, for X cfg close");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPreloadConfig", "com.tencent.mm.plugin.sns.storage.ADInfo");
        return null;
    }

    public boolean isSuperAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSuperAd", "com.tencent.mm.plugin.sns.storage.ADInfo");
        boolean z17 = this.forbidClick;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSuperAd", "com.tencent.mm.plugin.sns.storage.ADInfo");
        return z17;
    }

    public boolean isWeApp(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWeApp", "com.tencent.mm.plugin.sns.storage.ADInfo");
        boolean z17 = false;
        if (adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWeApp", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return false;
        }
        if (adClickActionInfo.f162571b == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(adClickActionInfo.f162583h)) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWeApp", "com.tencent.mm.plugin.sns.storage.ADInfo");
        return z17;
    }

    public boolean isWeapp() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWeapp", "com.tencent.mm.plugin.sns.storage.ADInfo");
        boolean z17 = this.adActionType == 4 && this.actionExtWeApp != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWeapp", "com.tencent.mm.plugin.sns.storage.ADInfo");
        return z17;
    }

    public ADInfo(java.lang.String str) {
        this.xml = "";
        this.uxInfo = "";
        this.adActionType = 0;
        this.adActionCardTitle = "";
        this.adActionCardTpId = "";
        this.adActionCardExt = "";
        this.adActionLink = "";
        this.adActionPOIType = 0;
        this.adActionPOIId = "";
        this.adActionPOIName = "";
        this.adActionPOILink = "";
        this.adActionExtTailType = ADChainStrengthenDefaultWording;
        this.adActionExtTailWording = "";
        this.adActionExtTailLink = "";
        this.adActionExtUserList = new java.util.LinkedList<>();
        this.adCanvasExtXml = "";
        this.adUnlikeInfo = new com.tencent.mm.plugin.sns.storage.d();
        this.adDislikeInfoTitle_cn = "";
        this.adDislikeInfoTitle_en = "";
        this.adDislikeInfoTitle_tw = "";
        this.forbidClick = false;
        this.isPersonalizedAdClose = false;
        this.adInfoSyncBuffer = "";
        this.adInfoSyncBufferImm = false;
        this.pId = "";
        this.sessionKeyAd = "";
        this.costLevel = "";
        this.bLandingPagesAd = false;
        feed(str);
    }
}
