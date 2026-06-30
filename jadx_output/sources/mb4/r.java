package mb4;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public mb4.o f325454a;

    /* renamed from: b, reason: collision with root package name */
    public mb4.o f325455b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f325456c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f325457d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f325458e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f325459f;

    /* renamed from: g, reason: collision with root package name */
    public mb4.t f325460g;

    /* renamed from: h, reason: collision with root package name */
    public int f325461h;

    /* renamed from: i, reason: collision with root package name */
    public mb4.g f325462i;

    /* renamed from: j, reason: collision with root package name */
    public int f325463j;

    /* renamed from: k, reason: collision with root package name */
    public int f325464k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f325465l;

    /* renamed from: m, reason: collision with root package name */
    public mb4.x f325466m;

    /* renamed from: n, reason: collision with root package name */
    public mb4.c0 f325467n;

    /* renamed from: o, reason: collision with root package name */
    public float f325468o;

    /* renamed from: p, reason: collision with root package name */
    public mb4.j0 f325469p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f325470q;

    /* renamed from: r, reason: collision with root package name */
    public mb4.v f325471r;

    /* renamed from: s, reason: collision with root package name */
    public mb4.a0 f325472s;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f325453u = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(mb4.r.class, "fireworkNormalIcon", "getFireworkNormalIcon()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(mb4.r.class, "fireworkNormalIconDark", "getFireworkNormalIconDark()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(mb4.r.class, "fireworkLikedIcon", "getFireworkLikedIcon()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(mb4.r.class, "fireworkLikedIconDark", "getFireworkLikedIconDark()Ljava/lang/String;", 0))};

    /* renamed from: t, reason: collision with root package name */
    public static final mb4.q f325452t = new mb4.q(null);

    public r() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f325456c = new com.tencent.mm.plugin.sns.storage.r0();
        this.f325457d = new com.tencent.mm.plugin.sns.storage.r0();
        this.f325458e = new com.tencent.mm.plugin.sns.storage.r0();
        this.f325459f = new com.tencent.mm.plugin.sns.storage.r0();
    }

    public static final boolean k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        mb4.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdFireworkCheerComponentExist", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        f325452t.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdFireworkCheerComponentExist", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo$Companion");
        boolean z17 = ((snsInfo == null || (adXml = snsInfo.getAdXml()) == null || (cVar = adXml.adSocialInfo) == null) ? null : cVar.f325388m) != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdFireworkCheerComponentExist", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdFireworkCheerComponentExist", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        return z17;
    }

    public static final mb4.r l(java.util.Map map, java.lang.String str) {
        java.lang.String str2;
        mb4.t tVar;
        java.lang.String str3;
        mb4.r rVar;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Integer h17;
        java.lang.Integer h18;
        mb4.g gVar;
        mb4.r rVar2;
        java.lang.String str6;
        java.lang.Integer h19;
        java.lang.Integer h27;
        mb4.x xVar;
        mb4.r rVar3;
        java.lang.String str7;
        java.lang.Integer h28;
        java.lang.Integer h29;
        mb4.c0 c0Var;
        mb4.r rVar4;
        java.lang.String str8;
        java.lang.Integer h37;
        java.lang.Integer h38;
        mb4.r rVar5;
        mb4.l0 l0Var;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        mb4.j0 j0Var;
        java.lang.Integer h39;
        java.lang.Integer h47;
        mb4.j0 j0Var2;
        mb4.v vVar;
        mb4.a0 a0Var;
        mb4.r rVar6;
        java.lang.Float f17;
        java.lang.Integer h48;
        java.lang.Integer h49;
        java.lang.Integer h57;
        java.lang.String str12 = "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        f325452t.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo$Companion");
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo$Companion");
        } else {
            if (str != null) {
                mb4.r rVar7 = new mb4.r();
                mb4.n nVar = mb4.o.f325446c;
                mb4.o a17 = nVar.a(map, str.concat(".likedColor"));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLikedColor", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                rVar7.f325454a = a17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLikedColor", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                mb4.o a18 = nVar.a(map, str.concat(".likeButtonBgColor"));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLikeButtonBgColor", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                rVar7.f325455b = a18;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLikeButtonBgColor", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                nVar.a(map, str.concat(".likeButtonBgHighlightedColor"));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLikeButtonBgHighlightedColor", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLikeButtonBgHighlightedColor", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                java.lang.String str13 = (java.lang.String) map.get(str.concat(".fireworkNormalIcon"));
                if (str13 == null) {
                    str13 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFireworkNormalIcon", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                com.tencent.mm.plugin.sns.storage.h1 h1Var = rVar7.f325456c;
                f06.v[] vVarArr = f325453u;
                ((com.tencent.mm.plugin.sns.storage.r0) h1Var).b(rVar7, vVarArr[0], str13);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFireworkNormalIcon", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                java.lang.String str14 = (java.lang.String) map.get(str.concat(".fireworkNormalIconDark"));
                if (str14 == null) {
                    str14 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFireworkNormalIconDark", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                ((com.tencent.mm.plugin.sns.storage.r0) rVar7.f325457d).b(rVar7, vVarArr[1], str14);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFireworkNormalIconDark", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                java.lang.String str15 = (java.lang.String) map.get(str.concat(".fireworkLikedIcon"));
                if (str15 == null) {
                    str15 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFireworkLikedIcon", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                ((com.tencent.mm.plugin.sns.storage.r0) rVar7.f325458e).b(rVar7, vVarArr[2], str15);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFireworkLikedIcon", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                java.lang.String str16 = (java.lang.String) map.get(str.concat(".fireworkLikedIconDark"));
                if (str16 == null) {
                    str16 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFireworkLikedIconDark", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                ((com.tencent.mm.plugin.sns.storage.r0) rVar7.f325459f).b(rVar7, vVarArr[3], str16);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFireworkLikedIconDark", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                mb4.s sVar = mb4.t.f325473d;
                java.lang.String concat = str.concat(".fireworkIconPag");
                sVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag$Companion");
                if (concat == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag$Companion");
                    str4 = "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo";
                    str2 = "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo$Companion";
                    rVar = rVar7;
                    str3 = ".pagUrl";
                    str5 = "setHeight";
                    tVar = null;
                } else {
                    str2 = "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo$Companion";
                    tVar = new mb4.t();
                    java.lang.String str17 = (java.lang.String) map.get(concat.concat(".pagUrl"));
                    str3 = ".pagUrl";
                    if (str17 == null) {
                        str17 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag");
                    rVar = rVar7;
                    com.tencent.mm.plugin.sns.storage.h1 h1Var2 = tVar.f325475a;
                    f06.v[] vVarArr2 = mb4.t.f325474e;
                    str4 = "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo";
                    ((com.tencent.mm.plugin.sns.storage.t0) h1Var2).b(tVar, vVarArr2[0], str17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag");
                    java.lang.String str18 = (java.lang.String) map.get(concat.concat(".pagMD5"));
                    if (str18 == null) {
                        str18 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag");
                    tVar.f325476b = str18;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag");
                    java.lang.String str19 = (java.lang.String) map.get(concat.concat(".width"));
                    if (str19 != null && (h18 = r26.h0.h(str19)) != null) {
                        h18.intValue();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag");
                    java.lang.String str20 = (java.lang.String) map.get(concat.concat(".height"));
                    if (str20 != null && (h17 = r26.h0.h(str20)) != null) {
                        h17.intValue();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeight", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeight", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag");
                    java.lang.String str21 = (java.lang.String) map.get(concat.concat(".pagThumbUrl"));
                    if (str21 == null) {
                        str21 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag");
                    str5 = "setHeight";
                    ((com.tencent.mm.plugin.sns.storage.r0) tVar.f325477c).b(tVar, vVarArr2[1], str21);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkIconPag$Companion");
                }
                if (tVar == null) {
                    tVar = null;
                }
                java.lang.String str22 = str4;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFireworkIconPag", str22);
                mb4.r rVar8 = rVar;
                rVar8.f325460g = tVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFireworkIconPag", str22);
                java.lang.String str23 = (java.lang.String) map.get(str.concat(".attractDelayTime"));
                int intValue = (str23 == null || (h57 = r26.h0.h(str23)) == null) ? 0 : h57.intValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAttractDelayTime", str22);
                rVar8.f325461h = intValue;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAttractDelayTime", str22);
                mb4.f fVar = mb4.g.f325407c;
                java.lang.String concat2 = str.concat(".attractPag");
                fVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag$Companion");
                if (concat2 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag$Companion");
                    rVar2 = rVar8;
                    str6 = str5;
                    gVar = null;
                } else {
                    gVar = new mb4.g();
                    java.lang.String str24 = (java.lang.String) map.get(concat2.concat(str3));
                    if (str24 == null) {
                        str24 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag");
                    rVar2 = rVar8;
                    ((com.tencent.mm.plugin.sns.storage.t0) gVar.f325409a).b(gVar, mb4.g.f325408d[0], str24);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag");
                    java.lang.String str25 = (java.lang.String) map.get(concat2.concat(".pagMD5"));
                    if (str25 == null) {
                        str25 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag");
                    gVar.f325410b = str25;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag");
                    java.lang.String str26 = (java.lang.String) map.get(concat2.concat(".width"));
                    if (str26 != null && (h27 = r26.h0.h(str26)) != null) {
                        h27.intValue();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag");
                    java.lang.String str27 = (java.lang.String) map.get(concat2.concat(".height"));
                    if (str27 != null && (h19 = r26.h0.h(str27)) != null) {
                        h19.intValue();
                    }
                    str6 = str5;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str6, "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AttractPag$Companion");
                }
                if (gVar == null) {
                    gVar = null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAttractPag", str22);
                mb4.r rVar9 = rVar2;
                rVar9.f325462i = gVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAttractPag", str22);
                java.lang.String str28 = (java.lang.String) map.get(str.concat(".vibrateDelayTime"));
                int intValue2 = (str28 == null || (h49 = r26.h0.h(str28)) == null) ? 0 : h49.intValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVibrateDelayTime", str22);
                rVar9.f325463j = intValue2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVibrateDelayTime", str22);
                java.lang.String str29 = (java.lang.String) map.get(str.concat(".refreshTime"));
                int intValue3 = (str29 == null || (h48 = r26.h0.h(str29)) == null) ? 0 : h48.intValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRefreshTime", str22);
                rVar9.f325464k = intValue3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRefreshTime", str22);
                java.lang.String str30 = (java.lang.String) map.get(str.concat(".commentDescHint"));
                if (str30 == null) {
                    str30 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentDescHint", str22);
                rVar9.f325465l = str30;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentDescHint", str22);
                mb4.w wVar = mb4.x.f325487c;
                java.lang.String concat3 = str.concat(".fullScreenPag");
                wVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FullScreenPag$Companion");
                if (concat3 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FullScreenPag$Companion");
                    str7 = str22;
                    rVar3 = rVar9;
                    xVar = null;
                } else {
                    xVar = new mb4.x();
                    java.lang.String str31 = (java.lang.String) map.get(concat3.concat(str3));
                    if (str31 == null) {
                        str31 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.FullScreenPag");
                    rVar3 = rVar9;
                    str7 = str22;
                    ((com.tencent.mm.plugin.sns.storage.t0) xVar.f325489a).b(xVar, mb4.x.f325488d[0], str31);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.FullScreenPag");
                    java.lang.String str32 = (java.lang.String) map.get(concat3.concat(".pagMD5"));
                    if (str32 == null) {
                        str32 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.FullScreenPag");
                    xVar.f325490b = str32;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.FullScreenPag");
                    java.lang.String str33 = (java.lang.String) map.get(concat3.concat(".width"));
                    if (str33 != null && (h29 = r26.h0.h(str33)) != null) {
                        h29.intValue();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.FullScreenPag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.FullScreenPag");
                    java.lang.String str34 = (java.lang.String) map.get(concat3.concat(".height"));
                    if (str34 != null && (h28 = r26.h0.h(str34)) != null) {
                        h28.intValue();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str6, "com.tencent.mm.plugin.sns.storage.adsocial.FullScreenPag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, "com.tencent.mm.plugin.sns.storage.adsocial.FullScreenPag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FullScreenPag$Companion");
                }
                if (xVar == null) {
                    xVar = null;
                }
                java.lang.String str35 = str7;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFullScreenPag", str35);
                mb4.r rVar10 = rVar3;
                rVar10.f325466m = xVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFullScreenPag", str35);
                mb4.b0 b0Var = mb4.c0.f325390c;
                java.lang.String concat4 = str.concat(".lowQualityFullScreenPag");
                b0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.LowQualityFullScreenPag$Companion");
                if (concat4 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.LowQualityFullScreenPag$Companion");
                    str8 = str35;
                    rVar4 = rVar10;
                    c0Var = null;
                } else {
                    c0Var = new mb4.c0();
                    java.lang.String str36 = (java.lang.String) map.get(concat4.concat(str3));
                    if (str36 == null) {
                        str36 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.LowQualityFullScreenPag");
                    rVar4 = rVar10;
                    str8 = str35;
                    ((com.tencent.mm.plugin.sns.storage.t0) c0Var.f325392a).b(c0Var, mb4.c0.f325391d[0], str36);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.LowQualityFullScreenPag");
                    java.lang.String str37 = (java.lang.String) map.get(concat4.concat(".pagMD5"));
                    if (str37 == null) {
                        str37 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.LowQualityFullScreenPag");
                    c0Var.f325393b = str37;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.LowQualityFullScreenPag");
                    java.lang.String str38 = (java.lang.String) map.get(concat4.concat(".width"));
                    if (str38 != null && (h38 = r26.h0.h(str38)) != null) {
                        h38.intValue();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.LowQualityFullScreenPag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.LowQualityFullScreenPag");
                    java.lang.String str39 = (java.lang.String) map.get(concat4.concat(".height"));
                    if (str39 != null && (h37 = r26.h0.h(str39)) != null) {
                        h37.intValue();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str6, "com.tencent.mm.plugin.sns.storage.adsocial.LowQualityFullScreenPag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, "com.tencent.mm.plugin.sns.storage.adsocial.LowQualityFullScreenPag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.LowQualityFullScreenPag$Companion");
                }
                if (c0Var == null) {
                    c0Var = null;
                }
                java.lang.String str40 = str8;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLowQualityFullScreenPag", str40);
                mb4.r rVar11 = rVar4;
                rVar11.f325467n = c0Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLowQualityFullScreenPag", str40);
                java.lang.String str41 = (java.lang.String) map.get(str.concat(".fullScreenCanCloseDelayTime"));
                float floatValue = (str41 == null || (f17 = r26.g0.f(str41)) == null) ? 0.0f : f17.floatValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFullScreenCanCloseDelayTime", str40);
                rVar11.f325468o = floatValue;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFullScreenCanCloseDelayTime", str40);
                mb4.i0 i0Var = mb4.j0.f325426d;
                java.lang.String concat5 = str.concat(".topLikeAreaInfo");
                i0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo$Companion");
                if (concat5 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo$Companion");
                    str9 = str40;
                    rVar5 = rVar11;
                    j0Var2 = null;
                } else {
                    mb4.j0 j0Var3 = new mb4.j0();
                    mb4.k0 k0Var = mb4.l0.f325441c;
                    java.lang.String concat6 = concat5.concat(".topLikePag");
                    k0Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikePag$Companion");
                    if (concat6 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikePag$Companion");
                        str10 = "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo$Companion";
                        str9 = str40;
                        rVar5 = rVar11;
                        str11 = concat5;
                        j0Var = j0Var3;
                        l0Var = null;
                    } else {
                        rVar5 = rVar11;
                        l0Var = new mb4.l0();
                        str9 = str40;
                        java.lang.String str42 = (java.lang.String) map.get(concat6.concat(str3));
                        str10 = "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo$Companion";
                        if (str42 == null) {
                            str42 = "";
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikePag");
                        str11 = concat5;
                        j0Var = j0Var3;
                        ((com.tencent.mm.plugin.sns.storage.t0) l0Var.f325443a).b(l0Var, mb4.l0.f325442d[0], str42);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikePag");
                        java.lang.String str43 = (java.lang.String) map.get(concat6.concat(".pagMD5"));
                        if (str43 == null) {
                            str43 = "";
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikePag");
                        l0Var.f325444b = str43;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikePag");
                        java.lang.String str44 = (java.lang.String) map.get(concat6.concat(".width"));
                        if (str44 != null && (h47 = r26.h0.h(str44)) != null) {
                            h47.intValue();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikePag");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikePag");
                        java.lang.String str45 = (java.lang.String) map.get(concat6.concat(".height"));
                        if (str45 != null && (h39 = r26.h0.h(str45)) != null) {
                            h39.intValue();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str6, "com.tencent.mm.plugin.sns.storage.adsocial.TopLikePag");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, "com.tencent.mm.plugin.sns.storage.adsocial.TopLikePag");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikePag$Companion");
                    }
                    if (l0Var == null) {
                        l0Var = null;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTopLikePag", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo");
                    mb4.j0 j0Var4 = j0Var;
                    j0Var4.f325428a = l0Var;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTopLikePag", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo");
                    java.lang.String str46 = str11;
                    java.lang.String str47 = (java.lang.String) map.get(str46.concat(".topLikeTitle"));
                    if (str47 == null) {
                        str47 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTopLikeTitle", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo");
                    j0Var4.f325429b = str47;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTopLikeTitle", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo");
                    java.lang.String str48 = (java.lang.String) map.get(str46.concat(".topLikeBackgroundImage"));
                    if (str48 == null) {
                        str48 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTopLikeBackgroundImage", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo");
                    ((com.tencent.mm.plugin.sns.storage.r0) j0Var4.f325430c).b(j0Var4, mb4.j0.f325427e[0], str48);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTopLikeBackgroundImage", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", str10);
                    j0Var2 = j0Var4;
                }
                if (j0Var2 == null) {
                    j0Var2 = null;
                }
                str12 = str9;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTopLikeAreaInfo", str12);
                mb4.r rVar12 = rVar5;
                rVar12.f325469p = j0Var2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTopLikeAreaInfo", str12);
                java.lang.String str49 = (java.lang.String) map.get(str.concat(".bottomButtonTitle"));
                if (str49 == null) {
                    str49 = "";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBottomButtonTitle", str12);
                rVar12.f325470q = str49;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBottomButtonTitle", str12);
                mb4.u uVar = mb4.v.f325478h;
                java.lang.String concat7 = str.concat(".tagInfo");
                uVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo$Companion");
                if (concat7 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo$Companion");
                    vVar = null;
                } else {
                    vVar = new mb4.v();
                    java.lang.String str50 = (java.lang.String) map.get(concat7.concat(".numberRequestId"));
                    if (str50 == null) {
                        str50 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberRequestId", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    vVar.f325480a = str50;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberRequestId", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    java.lang.String str51 = (java.lang.String) map.get(concat7.concat(".numberDefaultTitle"));
                    if (str51 == null) {
                        str51 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberDefaultTitle", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    vVar.f325481b = str51;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberDefaultTitle", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    java.lang.String str52 = (java.lang.String) map.get(concat7.concat(".numberDesc"));
                    if (str52 == null) {
                        str52 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberDesc", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    vVar.f325482c = str52;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberDesc", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    java.lang.String str53 = (java.lang.String) map.get(concat7.concat(".jumpLinkTitle"));
                    if (str53 == null) {
                        str53 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJumpLinkTitle", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    vVar.f325483d = str53;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJumpLinkTitle", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    java.lang.String str54 = (java.lang.String) map.get(concat7.concat(".jumpLinkIconLight"));
                    if (str54 == null) {
                        str54 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJumpLinkIconLight", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    com.tencent.mm.plugin.sns.storage.h1 h1Var3 = vVar.f325484e;
                    f06.v[] vVarArr3 = mb4.v.f325479i;
                    ((com.tencent.mm.plugin.sns.storage.r0) h1Var3).b(vVar, vVarArr3[0], str54);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJumpLinkIconLight", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    java.lang.String str55 = (java.lang.String) map.get(concat7.concat(".jumpLinkIconDark"));
                    if (str55 == null) {
                        str55 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJumpLinkIconDark", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    ((com.tencent.mm.plugin.sns.storage.r0) vVar.f325485f).b(vVar, vVarArr3[1], str55);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJumpLinkIconDark", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f18 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, concat7.concat(".jumpLinkActionInfo"));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJumpLinkActionInfo", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    ((com.tencent.mm.plugin.sns.storage.k0) vVar.f325486g).b(vVar, vVarArr3[2], f18);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJumpLinkActionInfo", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo$Companion");
                }
                if (vVar == null) {
                    vVar = null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTagInfo", str12);
                rVar12.f325471r = vVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTagInfo", str12);
                mb4.z zVar = mb4.a0.f325364f;
                java.lang.String concat8 = str.concat(".guideHalfScreenInfo");
                zVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo$Companion");
                if (concat8 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo$Companion");
                    a0Var = null;
                } else {
                    a0Var = new mb4.a0();
                    java.lang.String str56 = (java.lang.String) map.get(concat8.concat(".icon"));
                    if (str56 == null) {
                        str56 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIcon", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo");
                    com.tencent.mm.plugin.sns.storage.h1 h1Var4 = a0Var.f325366a;
                    f06.v[] vVarArr4 = mb4.a0.f325365g;
                    ((com.tencent.mm.plugin.sns.storage.r0) h1Var4).b(a0Var, vVarArr4[0], str56);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIcon", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo");
                    java.lang.String str57 = (java.lang.String) map.get(concat8.concat(".iconDark"));
                    if (str57 == null) {
                        str57 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIconDark", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo");
                    ((com.tencent.mm.plugin.sns.storage.r0) a0Var.f325367b).b(a0Var, vVarArr4[1], str57);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIconDark", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo");
                    java.lang.String str58 = (java.lang.String) map.get(concat8.concat(".title"));
                    if (str58 == null) {
                        str58 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitle", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo");
                    a0Var.f325368c = str58;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitle", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo");
                    java.lang.String str59 = (java.lang.String) map.get(concat8.concat(".desc"));
                    if (str59 == null) {
                        str59 = "";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDesc", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo");
                    a0Var.f325369d = str59;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDesc", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo");
                    java.lang.String str60 = (java.lang.String) map.get(concat8.concat(".buttonTitle"));
                    java.lang.String str61 = str60 == null ? "" : str60;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setButtonTitle", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo");
                    a0Var.f325370e = str61;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setButtonTitle", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.GuideHalfScreenInfo$Companion");
                }
                mb4.a0 a0Var2 = a0Var == null ? null : a0Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGuideHalfScreenInfo", str12);
                rVar12.f325472s = a0Var2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGuideHalfScreenInfo", str12);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", str2);
                rVar6 = rVar12;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", str12);
                return rVar6;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo$Companion");
        }
        rVar6 = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", str12);
        return rVar6;
    }

    public final mb4.g a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttractPag", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        mb4.g gVar = this.f325462i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttractPag", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        return gVar;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentDescHint", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        java.lang.String str = this.f325465l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentDescHint", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        return str;
    }

    public final mb4.t c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFireworkIconPag", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        mb4.t tVar = this.f325460g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFireworkIconPag", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        return tVar;
    }

    public final java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFireworkLikedIconDark", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) this.f325459f).a(this, f325453u[3]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFireworkLikedIconDark", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        return str;
    }

    public final java.lang.String e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFireworkNormalIcon", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) this.f325456c).a(this, f325453u[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFireworkNormalIcon", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        return str;
    }

    public final java.lang.String f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFireworkNormalIconDark", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) this.f325457d).a(this, f325453u[1]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFireworkNormalIconDark", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        return str;
    }

    public final mb4.x g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFullScreenPag", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        mb4.x xVar = this.f325466m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullScreenPag", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        return xVar;
    }

    public final mb4.a0 h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGuideHalfScreenInfo", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        mb4.a0 a0Var = this.f325472s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGuideHalfScreenInfo", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        return a0Var;
    }

    public final mb4.v i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagInfo", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        mb4.v vVar = this.f325471r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagInfo", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        return vVar;
    }

    public final mb4.j0 j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopLikeAreaInfo", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        mb4.j0 j0Var = this.f325469p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopLikeAreaInfo", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        return j0Var;
    }
}
