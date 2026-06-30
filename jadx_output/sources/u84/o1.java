package u84;

/* loaded from: classes4.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f425626a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f425627b;

    /* renamed from: c, reason: collision with root package name */
    public s34.g1 f425628c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f425629d;

    /* renamed from: e, reason: collision with root package name */
    public s34.g1 f425630e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f425631f;

    /* renamed from: g, reason: collision with root package name */
    public s34.g1 f425632g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f425633h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f425634i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f425635j;

    /* renamed from: k, reason: collision with root package name */
    public long f425636k;

    /* renamed from: l, reason: collision with root package name */
    public int f425637l;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f425625n = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(u84.o1.class, "jumpLinkIconLight", "getJumpLinkIconLight()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(u84.o1.class, "jumpLinkIconDark", "getJumpLinkIconDark()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(u84.o1.class, "jumpLinkActionInfo", "getJumpLinkActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final u84.n1 f425624m = new u84.n1(null);

    public o1() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f425633h = new com.tencent.mm.plugin.sns.storage.r0();
        this.f425634i = new com.tencent.mm.plugin.sns.storage.r0();
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr2 = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f425635j = new com.tencent.mm.plugin.sns.storage.k0();
        this.f425636k = 3000L;
    }

    public static final u84.o1 c(java.util.Map map, java.lang.String str) {
        java.lang.Integer h17;
        java.lang.Long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        f425624m.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo$Companion");
        u84.o1 o1Var = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo$Companion");
        } else if (a84.b0.c(map) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo$Companion");
        } else if (map.containsKey(str)) {
            o1Var = new u84.o1();
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".numberDefaultTitle"));
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f425626a = str2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".numberRequestParams"));
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberRequestParams", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f425627b = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberRequestParams", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            s34.f1 f1Var = s34.g1.f402646c;
            s34.g1 a17 = f1Var.a(map, str.concat(".numberTitleColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f425628c = a17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".jumpLinkTitle"));
            if (str4 == null) {
                str4 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJumpLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f425629d = str4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJumpLinkTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            s34.g1 a18 = f1Var.a(map, str.concat(".linkTitleColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLinkTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f425630e = a18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLinkTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str5 = (java.lang.String) map.get(str.concat(".desc"));
            if (str5 == null) {
                str5 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f425631f = str5;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            s34.g1 a19 = f1Var.a(map, str.concat(".descColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDescEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f425632g = a19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDescEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str6 = (java.lang.String) map.get(str.concat(".jumpLinkIconLight"));
            if (str6 == null) {
                str6 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJumpLinkIconLight", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            com.tencent.mm.plugin.sns.storage.h1 h1Var = o1Var.f425633h;
            f06.v[] vVarArr = f425625n;
            int i17 = 0;
            ((com.tencent.mm.plugin.sns.storage.r0) h1Var).b(o1Var, vVarArr[0], str6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJumpLinkIconLight", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str7 = (java.lang.String) map.get(str.concat(".jumpLinkIconDark"));
            java.lang.String str8 = str7 != null ? str7 : "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJumpLinkIconDark", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            ((com.tencent.mm.plugin.sns.storage.r0) o1Var.f425634i).b(o1Var, vVarArr[1], str8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJumpLinkIconDark", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f17 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str.concat(".jumpLinkActionInfo"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJumpLinkActionInfo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            ((com.tencent.mm.plugin.sns.storage.k0) o1Var.f425635j).b(o1Var, vVarArr[2], f17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJumpLinkActionInfo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str9 = (java.lang.String) map.get(str.concat(".stateTriggerTime"));
            long longValue = (str9 == null || (j17 = r26.h0.j(str9)) == null) ? 3000L : j17.longValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStateTriggerTime", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f425636k = longValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStateTriggerTime", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            java.lang.String str10 = (java.lang.String) map.get(str.concat(".stateTriggerType"));
            if (str10 != null && (h17 = r26.h0.h(str10)) != null) {
                i17 = h17.intValue();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStateTriggerType", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            o1Var.f425637l = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStateTriggerType", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        return o1Var;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        java.lang.String str = this.f425626a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        return str;
    }

    public final int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStateTriggerType", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        int i17 = this.f425637l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStateTriggerType", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
        return i17;
    }
}
