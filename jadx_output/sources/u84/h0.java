package u84;

/* loaded from: classes4.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f425539a;

    /* renamed from: b, reason: collision with root package name */
    public s34.g1 f425540b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f425541c;

    /* renamed from: d, reason: collision with root package name */
    public s34.g1 f425542d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f425543e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f425544f;

    /* renamed from: g, reason: collision with root package name */
    public s34.g1 f425545g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f425546h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f425547i;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f425538k = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(u84.h0.class, "headImageList", "getHeadImageList()Ljava/util/List;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(u84.h0.class, "jumpLinkActionInfo", "getJumpLinkActionInfo()Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", 0))};

    /* renamed from: j, reason: collision with root package name */
    public static final u84.g0 f425537j = new u84.g0(null);

    public h0() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("withList", "com.tencent.mm.plugin.sns.storage.AdImageRes$Companion");
        com.tencent.mm.plugin.sns.storage.q0 q0Var = new com.tencent.mm.plugin.sns.storage.q0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("withList", "com.tencent.mm.plugin.sns.storage.AdImageRes$Companion");
        this.f425546h = q0Var;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr2 = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f425547i = new com.tencent.mm.plugin.sns.storage.k0();
    }

    public static final u84.h0 b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
        f425537j.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo$Companion");
        u84.h0 h0Var = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo$Companion");
        } else if (a84.b0.c(map) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo$Companion");
        } else if (map.containsKey(str)) {
            h0Var = new u84.h0();
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".labelText"));
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLabelText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            h0Var.f425539a = str2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            s34.f1 f1Var = s34.g1.f402646c;
            s34.g1 a17 = f1Var.a(map, str.concat(".labelTextColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLabelTextColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            h0Var.f425540b = a17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelTextColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".title"));
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            h0Var.f425541c = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            s34.g1 a18 = f1Var.a(map, str.concat(".titleColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            h0Var.f425542d = a18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".numberDefaultTitle"));
            if (str4 == null) {
                str4 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            h0Var.f425543e = str4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            java.lang.String str5 = (java.lang.String) map.get(str.concat(".numberRequestParams"));
            if (str5 == null) {
                str5 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberRequestParams", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            h0Var.f425544f = str5;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberRequestParams", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            s34.g1 a19 = f1Var.a(map, str.concat(".numberTitleColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            h0Var.f425545g = a19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String concat = str.concat(".headImageList.headImage");
            int i17 = 0;
            while (true) {
                java.lang.String valueOf = i17 != 0 ? java.lang.String.valueOf(i17) : "";
                if (!map.containsKey(concat + valueOf)) {
                    break;
                }
                java.lang.String str6 = (java.lang.String) map.get(concat + valueOf);
                if (str6 == null) {
                    break;
                }
                if (str6.length() > 0) {
                    arrayList.add(str6);
                }
                i17++;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeadImageList", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            com.tencent.mm.plugin.sns.storage.h1 h1Var = h0Var.f425546h;
            f06.v[] vVarArr = f425538k;
            ((com.tencent.mm.plugin.sns.storage.q0) h1Var).a(h0Var, vVarArr[0], arrayList);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeadImageList", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f17 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str.concat(".jumpLinkActionInfo"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJumpLinkActionInfo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            ((com.tencent.mm.plugin.sns.storage.k0) h0Var.f425547i).b(h0Var, vVarArr[1], f17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJumpLinkActionInfo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
        return h0Var;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
        java.lang.String str = this.f425543e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarInfo");
        return str;
    }
}
