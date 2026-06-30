package s34;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public int f402822a;

    /* renamed from: b, reason: collision with root package name */
    public s34.v f402823b;

    @za4.k1
    public s34.p dropCardAnimInfo;

    @za4.k1
    public s34.q flyingFlipInfo;

    @za4.k1
    public s34.r hugeDiskAnimInfo;

    @za4.k1
    public s34.t pagThemeAnimInfo;

    @za4.k1
    public s34.u randomSpriteAnimInfo;

    @za4.k1
    public s34.w twistCardAnimInfo;

    public static s34.x a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
        s34.x xVar = new s34.x();
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".animationType"), 0);
        xVar.f402822a = D1;
        s34.v vVar = null;
        s34.q qVar = null;
        s34.r rVar = null;
        s34.u uVar = null;
        s34.t tVar = null;
        switch (D1) {
            case 1:
                xVar.twistCardAnimInfo = s34.w.a(map, str + ".hugeDiskInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            case 2:
                java.lang.String str2 = str + ".simpleTwistAnimInfo";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$SimpleTwistAnimInfo");
                if (map.containsKey(str2)) {
                    vVar = new s34.v();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str2);
                    sb6.append(".clockwise");
                    vVar.f402786a = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(sb6.toString()), 0) == 1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$SimpleTwistAnimInfo");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$SimpleTwistAnimInfo");
                }
                xVar.f402823b = vVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            case 3:
                xVar.dropCardAnimInfo = s34.p.a(map, str + ".dropCardAnimInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            case 4:
                java.lang.String str3 = str + ".pagThemeAnimInfo";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$PagThemeAnimInfo");
                if (map.containsKey(str3)) {
                    s34.t tVar2 = new s34.t();
                    s34.s sVar = new s34.s();
                    java.lang.String str4 = (java.lang.String) map.get(str3 + ".pagUrl");
                    if (str4 == null) {
                        str4 = "";
                    }
                    sVar.pagUrl = str4;
                    if (android.text.TextUtils.isEmpty(str4)) {
                        java.lang.String str5 = (java.lang.String) map.get(str3 + ".simpleTransitionAnimationUrl");
                        if (str5 == null) {
                            str5 = "";
                        }
                        sVar.pagUrl = str5;
                    }
                    java.lang.String str6 = (java.lang.String) map.get(str3 + ".pagMD5");
                    if (str6 == null) {
                        str6 = "";
                    }
                    sVar.f402756a = str6;
                    if (android.text.TextUtils.isEmpty(str6)) {
                        java.lang.String str7 = (java.lang.String) map.get(str3 + ".simpleTransitionAnimationMD5");
                        if (str7 == null) {
                            str7 = "";
                        }
                        sVar.f402756a = str7;
                    }
                    if (!android.text.TextUtils.isEmpty(sVar.pagUrl) && !android.text.TextUtils.isEmpty(sVar.f402756a)) {
                        tVar2.pagInfo = sVar;
                    }
                    s34.s sVar2 = new s34.s();
                    java.lang.String str8 = (java.lang.String) map.get(str3 + ".lowQualityPagUrl");
                    if (str8 == null) {
                        str8 = "";
                    }
                    sVar2.pagUrl = str8;
                    java.lang.String str9 = (java.lang.String) map.get(str3 + ".lowQualityPagMD5");
                    sVar2.f402756a = str9 != null ? str9 : "";
                    if (!android.text.TextUtils.isEmpty(sVar2.pagUrl) && !android.text.TextUtils.isEmpty(sVar2.f402756a)) {
                        tVar2.lowQualityPagInfo = sVar2;
                    }
                    tVar2.f402765a = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str3 + ".pagDuration"), 0);
                    if (tVar2.pagInfo != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$PagThemeAnimInfo");
                        tVar = tVar2;
                        xVar.pagThemeAnimInfo = tVar;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                        return xVar;
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$PagThemeAnimInfo");
                xVar.pagThemeAnimInfo = tVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            case 5:
                java.lang.String str10 = str + ".randomSpriteAnimInfo";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$RandomSpriteAnimInfo");
                if (map.containsKey(str10)) {
                    uVar = new s34.u();
                    uVar.f402782a = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str10 + ".spriteType"), 0);
                    uVar.f402783b = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str10 + ".spriteSizeType"), 0);
                    uVar.f402784c = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str10 + ".spriteDuration"), 0);
                    java.lang.String str11 = (java.lang.String) map.get(str10 + ".spriteImageUrl");
                    uVar.spriteImageUrl = str11 != null ? str11 : "";
                    if (uVar.f402784c == 0) {
                        uVar.f402784c = 4000;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$RandomSpriteAnimInfo");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$RandomSpriteAnimInfo");
                }
                xVar.randomSpriteAnimInfo = uVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            case 6:
                java.lang.String str12 = str + ".hugeDiskImprovedInfo";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$HugeDiskAnimInfo");
                if (map.containsKey(str12)) {
                    rVar = new s34.r();
                    java.lang.String str13 = (java.lang.String) map.get(str12 + ".transitionImg");
                    if (str13 == null) {
                        str13 = "";
                    }
                    rVar.cardImageUrl = str13;
                    java.lang.String str14 = (java.lang.String) map.get(str12 + ".transitionColor");
                    rVar.f402744a = ca4.n0.e(str14 != null ? str14 : "", 0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$HugeDiskAnimInfo");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$HugeDiskAnimInfo");
                }
                xVar.hugeDiskAnimInfo = rVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            case 7:
                java.lang.String str15 = str + ".flyingFlipInfo";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$FlyingFlipInfo");
                if (map.containsKey(str15)) {
                    qVar = new s34.q();
                    java.lang.String str16 = (java.lang.String) map.get(str15 + ".transitionImg");
                    if (str16 == null) {
                        str16 = "";
                    }
                    qVar.cardImageUrl = str16;
                    java.lang.String str17 = (java.lang.String) map.get(str15 + ".transitionColor");
                    qVar.f402742a = ca4.n0.e(str17 != null ? str17 : "", 0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$FlyingFlipInfo");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$FlyingFlipInfo");
                }
                xVar.flyingFlipInfo = qVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return null;
        }
    }

    public static s34.x b(java.util.Map map, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
        if (map == null || map.size() == 0 || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
            return null;
        }
        if (i17 == 2) {
            java.lang.String str2 = str + ".adCanvasInfo.eggAnimationInfo";
            if (map.containsKey(str2)) {
                s34.x a17 = a(map, str2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return a17;
            }
            java.lang.String str3 = str + ".adFullCardGestureCanvasInfo.eggAnimationInfo";
            if (map.containsKey(str3)) {
                s34.x a18 = a(map, str3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return a18;
            }
        } else {
            java.lang.String str4 = str + ".adCanvasInfo.eggAnimationInfo";
            if (map.containsKey(str4)) {
                s34.x a19 = a(map, str4);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return a19;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
        return null;
    }

    public static s34.x c(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
        if (map == null || map.size() == 0 || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
            return null;
        }
        s34.x a17 = a(map, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
        return a17;
    }
}
