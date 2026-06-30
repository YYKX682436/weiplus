package t74;

/* loaded from: classes4.dex */
public final class a2 {

    /* renamed from: r, reason: collision with root package name */
    public static final t74.z1 f416085r = new t74.z1(null);

    /* renamed from: a, reason: collision with root package name */
    public r45.jj4 f416086a;

    /* renamed from: b, reason: collision with root package name */
    public r45.jj4 f416087b;

    /* renamed from: c, reason: collision with root package name */
    public r45.jj4 f416088c;

    /* renamed from: d, reason: collision with root package name */
    public r45.jj4 f416089d;

    /* renamed from: e, reason: collision with root package name */
    public r45.jj4 f416090e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jj4 f416091f;

    @za4.k1(resType = 2)
    private java.lang.String flipIntroduceIcon;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f416096k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f416097l;

    @za4.k1(resType = 5)
    private com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo learnMoreClickActionInfo;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f416098m;

    @za4.k1(resType = 5)
    private com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo mediaClickActionInfo;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f416101p;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f416092g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f416093h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f416094i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public float f416095j = 0.17f;

    /* renamed from: n, reason: collision with root package name */
    public long f416099n = 1000;

    /* renamed from: o, reason: collision with root package name */
    public long f416100o = 2580;

    /* renamed from: q, reason: collision with root package name */
    public long f416102q = 2500;

    public static final void a(i64.q qVar, t74.a2 a2Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSetH265", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSetH265", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
        if (qVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSetH265", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
        } else if (a2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSetH265", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
        } else {
            java.util.Iterator it = ((java.util.ArrayList) a2Var.h()).iterator();
            while (it.hasNext()) {
                r45.jj4 jj4Var = (r45.jj4) it.next();
                if (jj4Var != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                    boolean z17 = jj4Var.f377856e == 6;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                    if (z17) {
                        l44.c0.c(qVar, jj4Var, str);
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSetH265", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSetH265", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
    }

    public static final t74.a2 i(java.util.Map values, java.lang.String pref) {
        t74.a2 a2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(pref, "pref");
        if (a84.b0.c(values)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
            a2Var = null;
        } else {
            t74.a2 a2Var2 = new t74.a2();
            v74.p pVar = v74.q.f433878d;
            r45.jj4 a17 = pVar.a(values, pref.concat(".frontTopMedia"), 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFrontTopMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416086a = a17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFrontTopMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            r45.jj4 a18 = pVar.a(values, pref.concat(".frontMiddleMedia"), 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFrontMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416087b = a18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFrontMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            r45.jj4 a19 = pVar.a(values, pref.concat(".frontBottomMedia"), 2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFrontBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416088c = a19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFrontBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            r45.jj4 a27 = pVar.a(values, pref.concat(".backTopMedia"), 3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackTopMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416089d = a27;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackTopMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            r45.jj4 a28 = pVar.a(values, pref.concat(".backMiddleMedia"), 4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416090e = a28;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            r45.jj4 a29 = pVar.a(values, pref.concat(".backBottomMedia"), 5);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416091f = a29;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            java.util.ArrayList arrayList = (java.util.ArrayList) a2Var2.h();
            arrayList.add(a2Var2.e());
            arrayList.add(a2Var2.d());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFrontBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            r45.jj4 jj4Var = a2Var2.f416088c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFrontBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            arrayList.add(jj4Var);
            arrayList.add(a2Var2.b());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            r45.jj4 jj4Var2 = a2Var2.f416090e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            arrayList.add(jj4Var2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            r45.jj4 jj4Var3 = a2Var2.f416091f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackBottomMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            arrayList.add(jj4Var3);
            t74.z1 z1Var = f416085r;
            java.util.List a37 = z1Var.a(values, pref.concat(".frontMiddleMediaCardHoles"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFrontMiddleMediaCardHoles", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416093h = a37;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFrontMiddleMediaCardHoles", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            java.util.List a38 = z1Var.a(values, pref.concat(".backMiddleMediaCardHoles"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackMiddleMediaCardHoles", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416094i = a38;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackMiddleMediaCardHoles", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            float B1 = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) values.get(pref.concat(".mediaOffsetFactor")));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaOffsetFactor", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416095j = B1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaOffsetFactor", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaOffsetFactor", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            float f17 = a2Var2.f416095j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaOffsetFactor", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            if (f17 == 0.0f) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaOffsetFactor", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
                a2Var2.f416095j = 0.17f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaOffsetFactor", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            }
            a2Var2.l(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(values, pref.concat(".mediaClickActionInfo")));
            java.lang.String str = (java.lang.String) values.get(pref.concat(".backTitleWording"));
            if (str == null) {
                str = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackTitleWording", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416096k = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackTitleWording", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            java.lang.String str2 = (java.lang.String) values.get(pref.concat(".backSubTitleWording"));
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackSubTitleWording", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416097l = str2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackSubTitleWording", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            java.lang.String str3 = (java.lang.String) values.get(pref.concat(".backLearnMoreWording"));
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackLearnMoreWording", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416098m = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackLearnMoreWording", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            long F1 = com.tencent.mm.sdk.platformtools.t8.F1((java.lang.String) values.get(pref.concat(".backTVCAnimationDelayInterval")), 1000L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackTVCAnimationDelayInterval", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416099n = F1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackTVCAnimationDelayInterval", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.k(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(values, pref.concat(".learnMoreClickActionInfo")));
            long F12 = com.tencent.mm.sdk.platformtools.t8.F1((java.lang.String) values.get(pref.concat(".learnMoreDelayShowInterval")), 2580L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLearnMoreDelayShowInterval", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416100o = F12;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLearnMoreDelayShowInterval", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            java.lang.String str4 = (java.lang.String) values.get(pref.concat(".flipIntroduceTitle"));
            if (str4 == null) {
                str4 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFlipIntroduceTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416101p = str4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFlipIntroduceTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            java.lang.String str5 = (java.lang.String) values.get(pref.concat(".flipIntroduceIcon"));
            a2Var2.j(str5 != null ? str5 : "");
            long F13 = com.tencent.mm.sdk.platformtools.t8.F1((java.lang.String) values.get(pref.concat(".flipIntroduceSwitchInterval")), 2500L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFlipIntroduceSwitchInterval", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            a2Var2.f416102q = F13;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFlipIntroduceSwitchInterval", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
            a2Var = a2Var2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        return a2Var;
    }

    public final r45.jj4 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackTopMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        r45.jj4 jj4Var = this.f416089d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackTopMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        return jj4Var;
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFlipIntroduceIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        java.lang.String str = this.flipIntroduceIcon;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFlipIntroduceIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        return str;
    }

    public final r45.jj4 d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFrontMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        r45.jj4 jj4Var = this.f416087b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFrontMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        return jj4Var;
    }

    public final r45.jj4 e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFrontTopMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        r45.jj4 jj4Var = this.f416086a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFrontTopMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        return jj4Var;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLearnMoreClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.learnMoreClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLearnMoreClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        return adClickActionInfo;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.mediaClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        return adClickActionInfo;
    }

    public final java.util.List h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaList", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        java.util.List list = this.f416092g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaList", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        return list;
    }

    public final void j(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFlipIntroduceIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        this.flipIntroduceIcon = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFlipIntroduceIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
    }

    public final void k(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLearnMoreClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        this.learnMoreClickActionInfo = adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLearnMoreClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
    }

    public final void l(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        this.mediaClickActionInfo = adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
    }
}
