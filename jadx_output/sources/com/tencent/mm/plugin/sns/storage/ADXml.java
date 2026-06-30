package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class ADXml extends n64.b {
    public static final int AD_CONTENT_STYLE_CARD = 1;
    public static final int AD_CONTENT_STYLE_COMBINED_GRID_1_ABOVE_3 = 7;
    public static final int AD_CONTENT_STYLE_FINDER_TOPIC_CARD = 5;
    public static final int AD_CONTENT_STYLE_FLIP_CARD = 9;
    public static final int AD_CONTENT_STYLE_FULL_CARD = 3;
    public static final int AD_CONTENT_STYLE_LINK = 2;
    public static final int AD_CONTENT_STYLE_LOOKBOOK_CARD_AD = 8;
    public static final int AD_CONTENT_STYLE_SLIDE_CARD = 10;
    public static final int AD_CONTENT_STYLE_SLIDE_FULL_CARD = 6;
    public static final int AD_CONTENT_STYLE_SPHERE_CARD = 4;
    public static final int AD_FULL_CARD_MEDIA_SIZE_W1_H1 = 1;
    public static final int AD_FULL_CARD_MEDIA_SIZE_W4_H3 = 0;
    public static final int AD_FULL_CARD_TITLE_LEFT_BOTTOM = 1;
    public static final int AD_FULL_CARD_TITLE_LEFT_TOP = 0;
    public static final int AD_MEDIA_DISPLAY_CENTER = 1;
    public static final int AD_MEDIA_DISPLAY_LEFT = 0;
    public static final int AD_MEDIA_DISPLAY_RIGHT = 2;
    public static final int AD_TURN_CARD_ANIMATION_TIME = 374;
    public static final int BREAK_FRAME_GESTURE_FLAG = 1;
    public static final int FULL_CARD_GESTURE_FLAG = 0;
    public static final java.lang.String PRE_KEY_AD_ARGS = ".adxml.adArgs.arg";
    public static final java.lang.String PRE_KEY_CARD_TAG_LIST = ".adxml.adCardInfo.adRatingCardInfo.tagList.tag";
    public static final java.lang.String PRE_KEY_GESTURE_LIST = ".pointsItem";
    public static final java.lang.String SUFF_KEY_CARD_TAG_BACKGROUND_DARK_MODE_COLOR = ".$tag_dark_bg_color";
    public static final java.lang.String SUFF_KEY_CARD_TAG_BACKGROUND_LIGHT_MODE_COLOR = ".$tag_light_bg_color";
    public static final java.lang.String SUFF_KEY_CARD_TAG_CONTENT_DARK_MODE_COLOR = ".$tag_dark_name_color";
    public static final java.lang.String SUFF_KEY_CARD_TAG_CONTENT_LIGHT_MODE_COLOR = ".$tag_light_name_color";
    public static final java.lang.String SUFF_KEY_CARD_TAG_ICON_DARK_MODE_URL = ".$dark_mode_url";
    public static final java.lang.String SUFF_KEY_CARD_TAG_ICON_LIGHT_MODE_URL = ".$light_mode_url";
    public static final java.lang.String TAG = "MicroMsg.ADXml";
    public static java.lang.ThreadLocal<java.util.List<com.tencent.mm.plugin.sns.storage.x0>> sPreloadListThreadLocal = new java.lang.ThreadLocal<>();
    public java.lang.String adActionLink;

    @za4.k1(resType = 5)
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adActionLinkClickInfo;
    public java.lang.String adActionTitle;
    public s34.b adAvatarFinderTopicInfo;
    public com.tencent.mm.plugin.sns.ad.widget.adpag.a adBarPAGContainerInfo;
    public int adBasicRemWidth;
    public int adBasicRootFontSize;

    @za4.k1
    public f84.v adBrandTopicInfo;

    @za4.k1
    public com.tencent.mm.plugin.sns.storage.d0 adBreakFrameInfo;
    public int adBtnDisplayType;
    public java.lang.String adCard3dHeadTitle;
    public java.lang.String adCard3dHeadUrl;

    @za4.k1
    public com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo adCardActionBtnInfo;
    public java.lang.String adCardDesc;
    public com.tencent.mm.plugin.sns.storage.j adCardTagInfo;
    public java.lang.String adCardTitle;
    public a44.a adCheckDownloadAppInfo;

    @za4.k1
    public com.tencent.mm.plugin.sns.storage.m0 adCombinedGridInfo;
    public s34.e adConsultBarCarouselInfo;
    public int adContentDisplayType;
    public int adContentStyle;
    public java.lang.String adDynamicAttr;
    public org.json.JSONObject adDynamicAttrJson;
    public s34.l adDynamicFeedUpdateInfo;
    public java.lang.String adDynamicInfo;
    public s34.n adDynamicUpdateInfo;

    @za4.k1
    public s34.x adEggAnimationInfo;
    public java.lang.String adExtInfo;
    public com.tencent.mm.plugin.sns.storage.l adFeedbackInfo;
    public com.tencent.mm.plugin.sns.storage.g adFinderInfo;
    public s34.c0 adFinderLiveInfo;
    public s34.b0 adFinderLivePreviewInfo;
    public s34.d0 adFinderLiveProductInfo;

    @za4.k1
    public s34.g0 adFinderLiveStreamInfo;
    public s34.h0 adFinderTopicInfo;

    @za4.k1
    public t74.a2 adFlipCardInfo;
    public com.tencent.mm.plugin.sns.storage.v adFloatWebViewInfo;

    @za4.k1
    public com.tencent.mm.plugin.sns.storage.n adFullCardInfo;
    public s34.m0 adHeadFinderProfile;
    public s34.n0 adHeadLivingInfo;
    public x84.e adHeadStateInfo;
    public u84.l adHighlightTagInfo;
    public u84.h0 adHotDiscussedBarInfo;
    public u84.k0 adInteractionLabelInfo;

    @za4.k1
    public u84.m0 adInteractionTagInfo;

    @za4.k1
    public s34.r0 adLiveInfo;

    @za4.k1
    public v74.m adLookbookInfo;
    public float adMediaDisplayHeight;
    public int adMediaDisplayMode;
    public float adMediaDisplayWidth;
    public float adMediaIconHeight;
    public float adMediaIconPaddingBottom;
    public float adMediaIconPaddingRight;
    public java.lang.String adMediaIconUrl;
    public float adMediaIconWidth;

    @za4.k1
    public com.tencent.mm.plugin.sns.storage.s0 adMultiProductsInfo;
    public s34.t0 adPromotionInfo;
    public d84.l0 adRockPaperScissorsInfo;

    @za4.k1
    public s34.u0 adRollInfo;

    @za4.k1
    public com.tencent.mm.plugin.sns.storage.h adScanJumpInfo;
    public s34.w0 adScratchCardInfo;

    @za4.k1
    private com.tencent.mm.plugin.sns.storage.o adSelectInfo;
    public com.tencent.mm.plugin.sns.storage.y0 adSellingPointInfo;

    @za4.k1
    public a94.a adShakeInfo;

    @za4.k1
    public s34.a1 adSliderFullCardInfo;

    @za4.k1
    public mb4.c adSocialInfo;
    public com.tencent.mm.plugin.sns.storage.p adSphereCardInfo;
    public u84.o1 adStateSettingBarInfo;

    @za4.k1
    public s34.b1 adTagBtnInfo;
    public com.tencent.mm.plugin.sns.storage.q adTurnInfo;
    public com.tencent.mm.plugin.sns.storage.r adTwistInfo;
    public int adType;
    public com.tencent.mm.plugin.sns.storage.s adVoteInfo;

    @za4.k1
    public s34.c1 adWeAppGameGiftTagInfo;
    public m84.w adWorldCupAvatarInfo;
    public int addPlayIconOnCover;
    public java.lang.String appGiftPackCode;
    public java.lang.String appGiftPackCodeTips;
    public android.content.Intent appMarketIntent;
    boolean bLandingPagesAd;
    boolean bTurnLandingPagesAd;
    public s34.c bulletScreenInfo;
    public int clientMaxVersion;
    public int clientMinVersion;
    public s34.e1 collectedAdInfo;
    public java.lang.String compatibleUrl;
    public java.lang.String eggCanvasPageId;
    public java.lang.String feedbackWeAppPath;
    public java.lang.String feedbackWeAppUsername;
    public java.lang.String feedbackWording;
    public java.lang.String firstDownloadApkPkgName;

    @za4.k1(resType = 5)
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo headAdClickActionInfo;
    public s34.j1 headWeWorkProfileInfo;
    public boolean imageUseAVIF;
    public java.util.Map<java.lang.String, java.lang.String> mValuesMap;
    public java.lang.String nickname;
    public long originSnsId;
    public java.lang.String passThrough;
    public java.lang.String preferAvatar;
    public java.lang.String preferNickName;
    public java.util.List<com.tencent.mm.plugin.sns.storage.x0> preloaderList;

    @za4.k1
    public p44.r randomPickCardAdInfo;
    public y84.l3 randomSelectCardAdInfo;
    public int recExpId;
    public int recSrc;
    public int recType;
    public s34.t1 singleProductInfo;

    @za4.k1
    public d94.f touchParticleAnimConfig;
    public boolean usePreferedInfo;
    public com.tencent.mm.plugin.sns.storage.y weAppInfo;
    public java.lang.String xml = "";
    public int webrightBar = 0;
    public int adActionLinkHidden = 0;
    public java.lang.String adActionLinkName = "";
    public java.lang.String adActionLinkIcon = "";
    public java.lang.String adActionLinkTitle_cn = "";
    public java.lang.String adActionLinkTitle_en = "";
    public java.lang.String adActionLinkTitle_tw = "";
    public int attachShareLinkIsHidden = 0;
    public java.lang.String attachShareLinkWording = "";
    public java.lang.String attachShareLinkUrl = "";
    public int headClickType = 0;
    public java.lang.String headClickParam = "";
    public int headClickRightBarShow = 0;
    public java.lang.String expandOutsideTitle_cn = "";
    public java.lang.String expandOutsideTitle_en = "";
    public java.lang.String expandOutsideTitle_tw = "";
    public java.lang.String expandInsideTitle_cn = "";
    public java.lang.String expandInsideTitle_en = "";
    public java.lang.String expandInsideTitle_tw = "";
    public java.util.Map<java.lang.String, java.lang.String> adArgs = new java.util.HashMap();
    public boolean adVideoContinuePlay = false;
    public java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> adCanvasValidMap = new java.util.concurrent.ConcurrentHashMap<>();
    public java.lang.String mKeyPrefix = "";
    public int toAdMarket = 0;
    public int newFeedbackPanel = 0;
    public int videoPlayInStreamingMode = 0;
    public int isValidJumpCanvas = -1;
    public int verticalVideoDisplayType = 0;
    public boolean forbiddenCustomAnimation = false;
    public boolean preloadWeAppPkg = false;
    public q34.a dynamicCommonConfig = new q34.a();
    public int previewFlag = 0;
    public long previewExpiredTime = 0;
    public int adPriority = 0;

    /* loaded from: classes4.dex */
    public static class AdCardActionBtnInfo {
        public com.tencent.mm.plugin.sns.storage.i alphaAnimBtnInfo;
        public java.lang.String btnBgColor;
        public java.lang.String btnBgDarkColor;
        public java.lang.String btnColor;
        public java.lang.String btnDarkColor;
        public java.lang.String btnTitle;

        @za4.k1(resType = 5)
        public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo;
        public java.lang.String iconUrl;
        public int singleLineBtn;

        public void parse(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo");
            java.lang.String str2 = map.get(str + ".iconUrl");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            this.iconUrl = str2;
            java.lang.String str3 = map.get(str + ".btnTitle");
            if (str3 == null) {
                str3 = "";
            }
            this.btnTitle = str3;
            java.lang.String str4 = map.get(str + ".btnColor");
            if (str4 == null) {
                str4 = "";
            }
            this.btnColor = str4;
            java.lang.String str5 = map.get(str + ".btnBgColor");
            if (str5 == null) {
                str5 = "";
            }
            this.btnBgColor = str5;
            java.lang.String str6 = map.get(str + ".btnDarkColor");
            if (str6 == null) {
                str6 = "";
            }
            this.btnDarkColor = str6;
            java.lang.String str7 = map.get(str + ".btnBgDarkColor");
            if (str7 == null) {
                str7 = "";
            }
            this.btnBgDarkColor = str7;
            this.singleLineBtn = com.tencent.mm.sdk.platformtools.t8.D1(map.get(str + ".singleLineBtn"), 0);
            if (map.containsKey(str + ".alphaAnimBtnInfo")) {
                com.tencent.mm.plugin.sns.storage.i iVar = new com.tencent.mm.plugin.sns.storage.i();
                this.alphaAnimBtnInfo = iVar;
                iVar.f166011a = com.tencent.mm.sdk.platformtools.t8.D1(map.get(str + ".alphaAnimBtnInfo.animTime"), 0);
                this.alphaAnimBtnInfo.f166012b = com.tencent.mm.sdk.platformtools.t8.D1(map.get(str + ".alphaAnimBtnInfo.animDelayTime"), 0);
                com.tencent.mm.plugin.sns.storage.i iVar2 = this.alphaAnimBtnInfo;
                java.lang.String str8 = map.get(str + ".alphaAnimBtnInfo.btnColor");
                if (str8 == null) {
                    str8 = "";
                }
                iVar2.f166013c = str8;
                com.tencent.mm.plugin.sns.storage.i iVar3 = this.alphaAnimBtnInfo;
                java.lang.String str9 = map.get(str + ".alphaAnimBtnInfo.btnBgColor");
                if (str9 == null) {
                    str9 = "";
                }
                iVar3.f166014d = str9;
                com.tencent.mm.plugin.sns.storage.i iVar4 = this.alphaAnimBtnInfo;
                java.lang.String str10 = map.get(str + ".alphaAnimBtnInfo.btnDarkColor");
                if (str10 == null) {
                    str10 = "";
                }
                iVar4.f166015e = str10;
                com.tencent.mm.plugin.sns.storage.i iVar5 = this.alphaAnimBtnInfo;
                java.lang.String str11 = map.get(str + ".alphaAnimBtnInfo.btnBgDarkColor");
                iVar5.f166016f = str11 != null ? str11 : "";
            }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f17 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str);
            this.clickActionInfo = f17;
            f17.f162569a = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo");
        }
    }

    public ADXml(java.lang.String str) {
        feed(str);
    }

    private void feed(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feed", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.trim().startsWith("<RecXml")) {
            feedAdXml(str);
        } else {
            feedRecXml(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feed", "com.tencent.mm.plugin.sns.storage.ADXml");
    }

    private void feedAdXml(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feedAdXml", "com.tencent.mm.plugin.sns.storage.ADXml");
        feedXml(str, "", dm.n.COL_ADXML);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedAdXml", "com.tencent.mm.plugin.sns.storage.ADXml");
    }

    private void feedRecXml(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feedRecXml", "com.tencent.mm.plugin.sns.storage.ADXml");
        java.util.Map<java.lang.String, java.lang.String> feedXml = feedXml(str, ".RecXml", "RecXml");
        this.mValuesMap = feedXml;
        this.mKeyPrefix = ".RecXml";
        if (feedXml != null && !feedXml.isEmpty()) {
            this.recType = com.tencent.mm.sdk.platformtools.t8.D1(feedXml.get(".RecXml.$type"), 0);
            this.recSrc = com.tencent.mm.sdk.platformtools.t8.D1(feedXml.get(".RecXml.$source"), 0);
            this.recExpId = com.tencent.mm.sdk.platformtools.t8.D1(feedXml.get(".RecXml.$expId"), 0);
            this.originSnsId = ca4.z0.F0(feedXml.get(".RecXml.$expOriginSnsId"));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedRecXml", "com.tencent.mm.plugin.sns.storage.ADXml");
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x0ac8, code lost:
    
        if (r6 == 0) goto L301;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.String> feedXml(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 3050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.ADXml.feedXml(java.lang.String, java.lang.String, java.lang.String):java.util.Map");
    }

    public static boolean isShakeAdCanvas(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShakeAdCanvas", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = str != null && str.contains("<isShakeAnimView>1</isShakeAnimView>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShakeAdCanvas", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public static boolean isSimpleShakeAd(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSimpleShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = str != null && str.contains("<simpleTransitionAnimationUrl>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSimpleShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public static boolean isSimpleSharedShakeAd(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSimpleSharedShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = isSimpleShakeAd(str) && str != null && str.contains("<isInteractiveCanvas>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSimpleSharedShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public static boolean isTwistAdCanvas(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTwistAdCanvas", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = str != null && str.contains("<isTwistAnimView>1</isTwistAnimView>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTwistAdCanvas", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public void findDownloadApkPkgName(java.util.Map<java.lang.String, java.lang.String> map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findDownloadApkPkgName", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (map == null || map.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findDownloadApkPkgName", "com.tencent.mm.plugin.sns.storage.ADXml");
            return;
        }
        for (java.lang.String str : map.keySet()) {
            if (str.endsWith(".pkg") || str.endsWith(".appPackage")) {
                java.lang.String str2 = map.get(str);
                if (!android.text.TextUtils.isEmpty(str2)) {
                    this.firstDownloadApkPkgName = str2;
                    com.tencent.mars.xlog.Log.i(TAG, "findDownloadApkPkgName, key=" + str + ", pkg=" + str2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findDownloadApkPkgName", "com.tencent.mm.plugin.sns.storage.ADXml");
                    return;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findDownloadApkPkgName", "com.tencent.mm.plugin.sns.storage.ADXml");
    }

    public com.tencent.mm.plugin.sns.storage.o getAdSelectInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdSelectInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        com.tencent.mm.plugin.sns.storage.o oVar = this.adSelectInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdSelectInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return oVar;
    }

    public java.lang.String getAdVoteComponentUrl() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdVoteComponentUrl", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (!hasVoteInfo()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdVoteComponentUrl", "com.tencent.mm.plugin.sns.storage.ADXml");
            return "";
        }
        java.lang.String str = this.adVoteInfo.f166123a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdVoteComponentUrl", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str;
    }

    public java.lang.String getCardSelectLeftTitle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardSelectLeftTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (hasSelectInfo()) {
            java.lang.String str = this.adSelectInfo.f166080a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardSelectLeftTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
            return str;
        }
        if (!hasVoteInfo()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardSelectLeftTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
            return "";
        }
        java.lang.String str2 = ((com.tencent.mm.plugin.sns.storage.t) this.adVoteInfo.f166125c.get(0)).f166134a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardSelectLeftTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str2;
    }

    public java.lang.String getCardSelectRightTitle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardSelectRightTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (hasSelectInfo()) {
            java.lang.String str = this.adSelectInfo.f166081b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardSelectRightTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
            return str;
        }
        if (!hasVoteInfo()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardSelectRightTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
            return "";
        }
        java.lang.String str2 = ((com.tencent.mm.plugin.sns.storage.t) this.adVoteInfo.f166125c.get(1)).f166134a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardSelectRightTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str2;
    }

    public java.lang.String getDynamicInfoId() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicInfoId", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (!hasAdDynamicInfo()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicInfoId", "com.tencent.mm.plugin.sns.storage.ADXml");
            return "";
        }
        java.lang.String str2 = this.adDynamicInfo;
        s74.x2 x2Var = s74.x2.f404589a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicTemplateId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        if (str2 == null) {
            str = "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicTemplateId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        } else {
            java.util.Map map = s74.x2.f404594f;
            synchronized (map) {
                try {
                    if (map.containsKey(str2)) {
                        str = (java.lang.String) ((java.util.LinkedHashMap) map).get(str2);
                        if (str == null) {
                            str = "";
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicTemplateId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                    } else {
                        org.json.JSONObject c17 = s74.x2.f404589a.c(str2);
                        if (c17 == null) {
                            com.tencent.mars.xlog.Log.e("DynamicView.DynamicInfoChecker", "parse json error!!");
                            str = "";
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicTemplateId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                        } else {
                            org.json.JSONObject optJSONObject = c17.optJSONObject("configs");
                            java.lang.String optString = optJSONObject != null ? optJSONObject.optString("template-id") : null;
                            if (optString == null) {
                                optString = "";
                            }
                            if (!r26.n0.N(optString)) {
                                synchronized (map) {
                                    try {
                                        map.put(str2, optString);
                                    } catch (java.lang.Throwable th6) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicTemplateId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                                        throw th6;
                                    }
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicTemplateId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                                str = optString;
                            } else {
                                str = "";
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicTemplateId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                            }
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicTemplateId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                    throw th7;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicInfoId", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str;
    }

    public java.lang.String getGestureCanvasInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGestureCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        java.lang.String str = this.xml;
        java.lang.String str2 = "";
        if (this.adFullCardInfo != null && str.contains("<adFullCardGestureCanvasInfo>")) {
            str2 = str.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("adFullCardGestureCanvasInfo", "adCanvasInfo");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGestureCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str2;
    }

    public java.lang.String getLeftCanvasInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLeftCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        java.lang.String str = this.xml;
        if (str.contains("<adCanvasInfoLeft>")) {
            str = str.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("(?s)<adCanvasInfoRight[^>]*>.*?</adCanvasInfoRight>", "").replaceAll("adCanvasInfoLeft", "adCanvasInfo");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLeftCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str;
    }

    public java.lang.String getRightCanvasInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRightCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        java.lang.String str = this.xml;
        if (str.contains("<adCanvasInfoRight>")) {
            str = str.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("(?s)<adCanvasInfoLeft[^>]*>.*?</adCanvasInfoLeft>", "").replaceAll("adCanvasInfoRight", "adCanvasInfo");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRightCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str;
    }

    public java.lang.String getTurnCanvasInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTurnCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        java.lang.String str = this.xml;
        if (str.contains("<adTurnCanvasInfo>")) {
            str = str.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("adTurnCanvasInfo", "adCanvasInfo");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTurnCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str;
    }

    public boolean hasActionBtn() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasActionBtn", "com.tencent.mm.plugin.sns.storage.ADXml");
        com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo adCardActionBtnInfo = this.adCardActionBtnInfo;
        boolean z17 = adCardActionBtnInfo != null && adCardActionBtnInfo.clickActionInfo.f162571b >= 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasActionBtn", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean hasAdDynamicInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasAdDynamicInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(this.adDynamicInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAdDynamicInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean hasSelectInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasSelectInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.adSelectInfo != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasSelectInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r2.f166125c.size() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean hasVoteInfo() {
        /*
            r4 = this;
            java.lang.String r0 = "hasVoteInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.ADXml"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.storage.s r2 = r4.adVoteInfo
            if (r2 == 0) goto L16
            java.util.ArrayList r2 = r2.f166125c
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.ADXml.hasVoteInfo():boolean");
    }

    public boolean isAdBreakFrameVideo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdBreakFrameVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
        com.tencent.mm.plugin.sns.storage.d0 d0Var = this.adBreakFrameInfo;
        if (d0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdBreakFrameVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        try {
            com.tencent.mm.plugin.sns.storage.o1 b17 = d0Var.a().b();
            b17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayMode", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayMode", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            boolean z17 = b17.f166082a == 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdBreakFrameVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return z17;
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdBreakFrameVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
    }

    public boolean isAdIpInteractVideo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
        com.tencent.mm.plugin.sns.storage.d0 d0Var = this.adBreakFrameInfo;
        if (d0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        try {
            com.tencent.mm.plugin.sns.storage.o1 b17 = d0Var.a().b();
            b17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayMode", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayMode", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            boolean z17 = b17.f166082a == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return z17;
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
    }

    public boolean isAdSolidBreakFrameVideo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdSolidBreakFrameVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
        com.tencent.mm.plugin.sns.storage.d0 d0Var = this.adBreakFrameInfo;
        if (d0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdSolidBreakFrameVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        try {
            com.tencent.mm.plugin.sns.storage.o1 b17 = d0Var.a().b();
            b17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayMode", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayMode", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            boolean z17 = b17.f166082a == 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdSolidBreakFrameVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return z17;
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdSolidBreakFrameVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
    }

    public boolean isBreakFrameGestureAd() {
        s34.l0 l0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBreakFrameGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = false;
        if (!isAdSolidBreakFrameVideo()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBreakFrameGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.n nVar = this.adFullCardInfo;
        if (nVar != null && nVar.f166071f == 1 && (l0Var = nVar.f166072g) != null) {
            long j17 = l0Var.f402699a;
            if (j17 >= 0 && l0Var.f402700b > j17) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBreakFrameGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.adContentStyle == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isCombinedGridAD() {
        com.tencent.mm.plugin.sns.storage.m0 m0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCombinedGridAD", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.adContentStyle == 7 && (m0Var = this.adCombinedGridInfo) != null && m0Var.c() != null && this.adCombinedGridInfo.c().size() >= 3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCombinedGridAD", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isDynamicAD() {
        /*
            r12 = this;
            java.lang.String r0 = "isDynamicAD"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.ADXml"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = r12.adDynamicInfo
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            r3 = 1
            r2 = r2 ^ r3
            r4 = 0
            if (r2 == 0) goto L69
            java.lang.String r5 = r12.adDynamicInfo
            boolean r5 = s74.x2.a(r5)
            if (r5 == 0) goto L69
            java.lang.String r5 = "DynamicView.DynamicInfoChecker"
            java.lang.String r6 = "isDynamicViewDisabled called "
            java.lang.String r7 = "isDynamicViewDisabled"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.Class<e42.e0> r9 = e42.e0.class
            i95.m r9 = i95.n0.c(r9)     // Catch: java.lang.Throwable -> L4a
            e42.e0 r9 = (e42.e0) r9     // Catch: java.lang.Throwable -> L4a
            e42.c0 r10 = e42.c0.clicfg_ad_timeline_dynamic_feed_disabled_android     // Catch: java.lang.Throwable -> L4a
            h62.d r9 = (h62.d) r9     // Catch: java.lang.Throwable -> L4a
            int r9 = r9.Ni(r10, r4)     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r10.<init>(r6)     // Catch: java.lang.Throwable -> L48
            r10.append(r9)     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> L48
            com.tencent.mars.xlog.Log.i(r5, r6)     // Catch: java.lang.Throwable -> L48
            goto L5e
        L48:
            r6 = move-exception
            goto L4c
        L4a:
            r6 = move-exception
            r9 = r4
        L4c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "isDynamicViewDisabled, exp="
            r10.<init>(r11)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            com.tencent.mars.xlog.Log.e(r5, r6)
        L5e:
            if (r9 <= 0) goto L62
            r5 = r3
            goto L63
        L62:
            r5 = r4
        L63:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            if (r5 != 0) goto L69
            r4 = r3
        L69:
            if (r4 != 0) goto L88
            if (r2 == 0) goto L88
            com.tencent.mm.plugin.report.service.g0 r2 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r5 = 2008(0x7d8, float:2.814E-42)
            r2.A(r5, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "dynamicCheckFalse|dynamicInfo="
            r2.<init>(r3)
            java.lang.String r3 = r12.adDynamicInfo
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            ca4.q.c(r2, r3)
        L88:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.ADXml.isDynamicAD():boolean");
    }

    public boolean isFinderTopicCard() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinderTopicCard", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.adContentStyle == 5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderTopicCard", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isFlipCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFlipCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.adContentStyle == 9 && this.adFlipCardInfo != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFlipCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isForbidAutoPlay() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isForbidAutoPlay", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.dynamicCommonConfig.f359957a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForbidAutoPlay", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isFullCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFullCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.adContentStyle == 3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFullCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isGestureAd() {
        com.tencent.mm.plugin.sns.storage.n nVar;
        s34.l0 l0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (isFullCardAd() && (nVar = this.adFullCardInfo) != null && nVar.f166071f == 0 && (l0Var = nVar.f166072g) != null) {
            long j17 = l0Var.f402699a;
            if (j17 >= 0 && l0Var.f402700b > j17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return false;
    }

    public boolean isHideAdChainStrengthenLabel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHideAdChainStrengthenLabel", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.dynamicCommonConfig.f359962f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHideAdChainStrengthenLabel", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isHideConsultBar() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHideConsultBar", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.dynamicCommonConfig.f359961e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHideConsultBar", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isHideGameGiftTag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHideGameGiftTag", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.dynamicCommonConfig.f359960d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHideGameGiftTag", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isLandingPagesAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLandingPagesAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.bLandingPagesAd || this.bTurnLandingPagesAd;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLandingPagesAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isLinkAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLinkAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.adContentStyle == 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLinkAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isLongPressGestureAd() {
        com.tencent.mm.plugin.sns.storage.n nVar;
        com.tencent.mm.plugin.sns.storage.x xVar;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (!isFullCardAd() || (nVar = this.adFullCardInfo) == null || (xVar = nVar.f166076k) == null || (i17 = xVar.f166158a) <= 0 || xVar.f166159b <= i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return true;
    }

    public boolean isLookBookAdHasPagTheme() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLookBookAdHasPagTheme", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = isLookbookCardAd() && !(this.adLookbookInfo.g() == null && this.adLookbookInfo.e() == null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLookBookAdHasPagTheme", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isLookBookAdHasSplashCard() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLookBookAdHasSplashCard", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = false;
        if (isLookbookCardAd()) {
            v74.m mVar = this.adLookbookInfo;
            mVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasSplashCardInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
            boolean z18 = mVar.f433870f != null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasSplashCardInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
            if (z18) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLookBookAdHasSplashCard", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isLookbookCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLookbookCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.adContentStyle == 8 && this.adLookbookInfo != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLookbookCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isNewStyleVote() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNewStyleVote", "com.tencent.mm.plugin.sns.storage.ADXml");
        com.tencent.mm.plugin.sns.storage.s sVar = this.adVoteInfo;
        if (sVar == null || sVar.f166125c.size() <= 1 || android.text.TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.t) this.adVoteInfo.f166125c.get(0)).f166139f) || android.text.TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.t) this.adVoteInfo.f166125c.get(1)).f166139f)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewStyleVote", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNewStyleVote", "com.tencent.mm.plugin.sns.storage.ADXml");
        return true;
    }

    public boolean isNormalAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNormalAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (isCardAd() || isFullCardAd() || isSphereCardAd() || isFinderTopicCard() || isSlideFullCard() || isCombinedGridAD() || isLookbookCardAd() || isFlipCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNormalAd", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNormalAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return true;
    }

    public boolean isRandomPickCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRandomPickCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.randomPickCardAdInfo != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRandomPickCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isRecExpAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.recSrc == 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isRecSrcAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRecSrcAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.recSrc == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRecSrcAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isShakeAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (!isFullCardAd() || this.adShakeInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return true;
    }

    public boolean isShowPlayIconOnCover() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowPlayIconOnCover", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.addPlayIconOnCover == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowPlayIconOnCover", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isSlideCard() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSlideCard", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.adContentStyle == 10;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSlideCard", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isSlideFullCard() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSlideFullCard", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.adContentStyle == 6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSlideFullCard", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isSphereCardAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSphereCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z17 = this.adContentStyle == 4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSphereCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z17;
    }

    public boolean isTwistAd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTwistAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (!isFullCardAd() || this.adTwistInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTwistAd", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTwistAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return true;
    }

    public static java.lang.String getGestureCanvasInfo(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGestureCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGestureCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return "";
        }
        java.lang.String replaceAll = str.contains("<adFullCardGestureCanvasInfo>") ? str.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("adFullCardGestureCanvasInfo", "adCanvasInfo") : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGestureCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return replaceAll;
    }
}
