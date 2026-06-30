package d84;

/* loaded from: classes4.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f227102a;

    /* renamed from: b, reason: collision with root package name */
    public int f227103b;

    /* renamed from: c, reason: collision with root package name */
    public mb4.e f227104c;

    /* renamed from: d, reason: collision with root package name */
    public mb4.e f227105d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f227106e;

    /* renamed from: f, reason: collision with root package name */
    public s34.g1 f227107f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f227108g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f227109h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f227110i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f227111j;

    /* renamed from: k, reason: collision with root package name */
    public mb4.e f227112k;

    /* renamed from: l, reason: collision with root package name */
    public mb4.e f227113l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f227114m;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f227101o = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(d84.l0.class, "titleIcon", "getTitleIcon()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(d84.l0.class, "titleDarkIcon", "getTitleDarkIcon()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(d84.l0.class, "clickActionInfo", "getClickActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0))};

    /* renamed from: n, reason: collision with root package name */
    public static final d84.k0 f227100n = new d84.k0(null);

    public l0() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f227108g = new com.tencent.mm.plugin.sns.storage.r0();
        this.f227109h = new com.tencent.mm.plugin.sns.storage.r0();
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr2 = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f227114m = new com.tencent.mm.plugin.sns.storage.k0();
    }

    public static final d84.l0 a(java.util.Map values, java.lang.String prefKey) {
        s34.g1 g1Var;
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
        f227100n.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo$Companion");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(prefKey, "prefKey");
        d84.l0 l0Var = null;
        l0Var = null;
        if (a84.b0.c(values) || com.tencent.mm.sdk.platformtools.t8.K0(prefKey)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo$Companion");
        } else if (values.containsKey(prefKey)) {
            d84.l0 l0Var2 = new d84.l0();
            java.lang.String str = (java.lang.String) values.get(prefKey.concat(".containerWidth"));
            l0Var2.f227102a = (str == null || (h18 = r26.h0.h(str)) == null) ? 0 : h18.intValue();
            java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".containerHeight"));
            l0Var2.f227103b = (str2 == null || (h17 = r26.h0.h(str2)) == null) ? 0 : h17.intValue();
            mb4.d dVar = mb4.e.f325395f;
            l0Var2.f227104c = dVar.a(values, prefKey.concat(".animationPagInfo"));
            l0Var2.f227105d = dVar.a(values, prefKey.concat(".animationPagDarkInfo"));
            java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".title"));
            if (str3 == null) {
                str3 = "";
            }
            l0Var2.f227106e = str3;
            java.lang.String concat = prefKey.concat(".titleColor");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
            if (concat == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
                g1Var = null;
            } else {
                java.lang.String str4 = (java.lang.String) values.get(concat.concat(".color"));
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String str5 = (java.lang.String) values.get(concat.concat(".colorDark"));
                if (str5 == null) {
                    str5 = "";
                }
                g1Var = new s34.g1(str4, str5);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.ColorEntity$Companion");
            }
            l0Var2.f227107f = g1Var;
            java.lang.String str6 = (java.lang.String) values.get(prefKey.concat(".titleIcon"));
            if (str6 == null) {
                str6 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            com.tencent.mm.plugin.sns.storage.h1 h1Var = l0Var2.f227108g;
            f06.v[] vVarArr = f227101o;
            ((com.tencent.mm.plugin.sns.storage.r0) h1Var).b(l0Var2, vVarArr[0], str6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            java.lang.String str7 = (java.lang.String) values.get(prefKey.concat(".titleDarkIcon"));
            if (str7 == null) {
                str7 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleDarkIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            ((com.tencent.mm.plugin.sns.storage.r0) l0Var2.f227109h).b(l0Var2, vVarArr[1], str7);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleDarkIcon", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            java.lang.String str8 = (java.lang.String) values.get(prefKey.concat(".numberDefaultTitle"));
            if (str8 == null) {
                str8 = "";
            }
            l0Var2.f227110i = str8;
            java.lang.String str9 = (java.lang.String) values.get(prefKey.concat(".numberRequestParams"));
            l0Var2.f227111j = str9 != null ? str9 : "";
            l0Var2.f227112k = dVar.a(values, prefKey.concat(".leftDecorPagInfo"));
            l0Var2.f227113l = dVar.a(values, prefKey.concat(".rightDecorPagInfo"));
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f17 = values.containsKey(prefKey.concat(".clickActionInfo")) ? com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(values, prefKey.concat(".clickActionInfo")) : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            ((com.tencent.mm.plugin.sns.storage.k0) l0Var2.f227114m).b(l0Var2, vVarArr[2], f17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo$Companion");
            l0Var = l0Var2;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsInfo");
        return l0Var;
    }
}
