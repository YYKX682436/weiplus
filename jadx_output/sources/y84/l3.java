package y84;

/* loaded from: classes4.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public int f460134a;

    /* renamed from: b, reason: collision with root package name */
    public int f460135b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f460136c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460137d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460138e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460139f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460140g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460141h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460142i;

    /* renamed from: j, reason: collision with root package name */
    public s34.g1 f460143j;

    /* renamed from: k, reason: collision with root package name */
    public s34.g1 f460144k;

    /* renamed from: l, reason: collision with root package name */
    public mb4.e f460145l;

    /* renamed from: m, reason: collision with root package name */
    public y84.o3 f460146m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f460147n;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f460133p = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(y84.l3.class, "clickActionInfo", "getClickActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0))};

    /* renamed from: o, reason: collision with root package name */
    public static final y84.k3 f460132o = new y84.k3(null);

    public l3() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f460147n = new com.tencent.mm.plugin.sns.storage.k0();
    }

    public static final y84.l3 b(java.util.Map values, java.lang.String keyPref) {
        java.lang.String str;
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo");
        f460132o.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo$Companion");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(keyPref, "keyPref");
        y84.l3 l3Var = new y84.l3();
        java.lang.String str2 = (java.lang.String) values.get(keyPref.concat(".containerWidth"));
        l3Var.f460134a = (str2 == null || (h18 = r26.h0.h(str2)) == null) ? 0 : h18.intValue();
        java.lang.String str3 = (java.lang.String) values.get(keyPref.concat(".containerHeight"));
        l3Var.f460135b = (str3 == null || (h17 = r26.h0.h(str3)) == null) ? 0 : h17.intValue();
        java.lang.String str4 = (java.lang.String) values.get(keyPref.concat(".title"));
        if (str4 == null) {
            str4 = "";
        }
        l3Var.f460136c = str4;
        java.lang.String str5 = (java.lang.String) values.get(keyPref.concat(".introduceTitle"));
        if (str5 == null) {
            str5 = "";
        }
        l3Var.f460137d = str5;
        java.lang.String str6 = (java.lang.String) values.get(keyPref.concat(".selectedTitlePrefix"));
        if (str6 == null) {
            str6 = "";
        }
        l3Var.f460138e = str6;
        java.lang.String str7 = (java.lang.String) values.get(keyPref.concat(".selectedTitleSuffix"));
        if (str7 == null) {
            str7 = "";
        }
        l3Var.f460139f = str7;
        java.lang.String str8 = (java.lang.String) values.get(keyPref.concat(".doneTitle"));
        if (str8 == null) {
            str8 = "";
        }
        l3Var.f460140g = str8;
        java.lang.String str9 = (java.lang.String) values.get(keyPref.concat(".numberDefaultTitle"));
        if (str9 == null) {
            str9 = "";
        }
        l3Var.f460141h = str9;
        java.lang.String str10 = (java.lang.String) values.get(keyPref.concat(".numberRequestParams"));
        if (str10 == null) {
            str10 = "";
        }
        l3Var.f460142i = str10;
        s34.f1 f1Var = s34.g1.f402646c;
        l3Var.f460143j = f1Var.a(values, keyPref.concat(".titleColor"));
        l3Var.f460144k = f1Var.a(values, keyPref.concat(".descColor"));
        l3Var.f460145l = mb4.e.f325395f.a(values, keyPref.concat(".allDonePagInfo"));
        y84.m3 m3Var = y84.o3.f460170o;
        java.lang.String kePref = keyPref.concat(".cardsInfo");
        m3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$Companion");
        kotlin.jvm.internal.o.g(kePref, "kePref");
        y84.o3 o3Var = new y84.o3();
        java.lang.String str11 = (java.lang.String) values.get(kePref.concat(".pedestalImageUrl"));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str11 == null) {
            str11 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        o3Var.f460172a = str11;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str12 = o3Var.f460172a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(str12);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str13 = o3Var.f460172a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str14 = o3Var.f460172a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPedestalImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        r45.jj4 h19 = m21.y.h(a17, 2, str13, str14, 1, 1, "");
        h19.N = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPedestalImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.tencent.mm.plugin.sns.storage.h1 h1Var = o3Var.f460174c;
        f06.v[] vVarArr = y84.o3.f460171p;
        ((com.tencent.mm.plugin.sns.storage.z) h1Var).b(o3Var, vVarArr[0], h19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPedestalImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str15 = (java.lang.String) values.get(kePref.concat(".pedestalImageUrlDark"));
        if (str15 == null) {
            str15 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPedestalImageUrlDark", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        o3Var.f460173b = str15;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPedestalImageUrlDark", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String b17 = o3Var.b();
        if (b17 == null || b17.length() == 0) {
            str = "";
        } else {
            r45.jj4 h27 = m21.y.h(com.tencent.mm.sdk.platformtools.w2.a(o3Var.b()), 2, o3Var.b(), o3Var.b(), 1, 1, "");
            h27.N = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPedestalImageMediaDark", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
            str = "";
            ((com.tencent.mm.plugin.sns.storage.z) o3Var.f460175d).b(o3Var, vVarArr[1], h27);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPedestalImageMediaDark", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        }
        java.lang.String str16 = (java.lang.String) values.get(kePref.concat(".backgroundImageUrl"));
        if (str16 == null) {
            str16 = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        o3Var.f460176e = str16;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str17 = o3Var.f460176e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String a18 = com.tencent.mm.sdk.platformtools.w2.a(str17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str18 = o3Var.f460176e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str19 = o3Var.f460176e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        r45.jj4 h28 = m21.y.h(a18, 2, str18, str19, 1, 1, "");
        h28.N = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackgroundImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        ((com.tencent.mm.plugin.sns.storage.z) o3Var.f460177f).b(o3Var, vVarArr[2], h28);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackgroundImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str20 = (java.lang.String) values.get(kePref.concat(".starImageUrl"));
        if (str20 == null) {
            str20 = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        o3Var.f460178g = str20;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str21 = o3Var.f460178g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String a19 = com.tencent.mm.sdk.platformtools.w2.a(str21);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str22 = o3Var.f460178g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str23 = o3Var.f460178g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        r45.jj4 h29 = m21.y.h(a19, 2, str22, str23, 1, 1, "");
        h29.N = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStarImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        ((com.tencent.mm.plugin.sns.storage.z) o3Var.f460179h).b(o3Var, vVarArr[3], h29);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStarImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str24 = (java.lang.String) values.get(kePref.concat(".starDropImageUrl"));
        if (str24 == null) {
            str24 = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        o3Var.f460180i = str24;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str25 = o3Var.f460180i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String a27 = com.tencent.mm.sdk.platformtools.w2.a(str25);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str26 = o3Var.f460180i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str27 = o3Var.f460180i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarDropImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        r45.jj4 h37 = m21.y.h(a27, 2, str26, str27, 1, 1, "");
        h37.N = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStarDropImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        ((com.tencent.mm.plugin.sns.storage.z) o3Var.f460181j).b(o3Var, vVarArr[4], h37);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStarDropImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        o3Var.f460182k = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(kePref.concat(".gap")), 0);
        o3Var.f460183l = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(kePref.concat(".distance")), 0);
        o3Var.f460184m = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) values.get(kePref.concat(".itemScaleRatio")));
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(kePref);
            sb6.append(".cardItems.cardItem");
            sb6.append(i17 == 0 ? str : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!values.containsKey(sb7)) {
                break;
            }
            y84.n3 n3Var = new y84.n3();
            java.lang.String str28 = (java.lang.String) values.get(sb7 + ".imageUrl");
            if (str28 == null) {
                str28 = str;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            n3Var.f460159a = str28;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            java.lang.String str29 = n3Var.f460159a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            java.lang.String a28 = com.tencent.mm.sdk.platformtools.w2.a(str29);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            java.lang.String str30 = n3Var.f460159a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            java.lang.String str31 = kePref;
            java.lang.String str32 = n3Var.f460159a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            r45.jj4 h38 = m21.y.h(a28, 2, str30, str32, 1, 1, "");
            h38.N = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageUrlMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            int i18 = i17;
            ((com.tencent.mm.plugin.sns.storage.z) n3Var.f460160b).b(n3Var, y84.n3.f460158f[0], h38);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageUrlMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
            n3Var.f460161c = (int) (com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(sb7 + ".cardWidth"), 0) * o3Var.f460184m);
            n3Var.f460162d = (int) (com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(sb7 + ".cardHeight"), 0) * o3Var.f460184m);
            java.lang.String str33 = (java.lang.String) values.get(sb7 + ".cardId");
            if (str33 == null) {
                str33 = str;
            }
            n3Var.f460163e = str33;
            boolean z18 = str33.length() == 0;
            java.util.List list = o3Var.f460185n;
            if (z18) {
                com.tencent.mars.xlog.Log.e("RandomSelectCardInfo", "cardId is null");
            } else {
                ((java.util.ArrayList) list).add(n3Var);
            }
            if (((java.util.ArrayList) list).size() >= 5) {
                break;
            }
            i17 = i18 + 1;
            kePref = str31;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$Companion");
        l3Var.f460146m = o3Var;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f17 = values.containsKey(keyPref.concat(".clickActionInfo")) ? com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(values, keyPref.concat(".clickActionInfo")) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo");
        ((com.tencent.mm.plugin.sns.storage.k0) l3Var.f460147n).b(l3Var, f460133p[0], f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo");
        y84.o3 o3Var2 = l3Var.f460146m;
        java.util.List list2 = o3Var2 != null ? o3Var2.f460185n : null;
        if (list2 == null || list2.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo$Companion");
            l3Var = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo");
        return l3Var;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo) ((com.tencent.mm.plugin.sns.storage.k0) this.f460147n).a(this, f460133p[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardAdInfo");
        return adClickActionInfo;
    }
}
