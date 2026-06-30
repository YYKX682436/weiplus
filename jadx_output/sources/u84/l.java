package u84;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f425576a;

    /* renamed from: b, reason: collision with root package name */
    public s34.g1 f425577b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f425578c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f425579d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f425580e;

    /* renamed from: f, reason: collision with root package name */
    public s34.g1 f425581f;

    public static final u84.l b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo$Companion");
        u84.l lVar = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo$Companion");
        } else if (map.containsKey(str)) {
            lVar = new u84.l();
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".title"));
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            lVar.f425576a = str2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            s34.f1 f1Var = s34.g1.f402646c;
            s34.g1 a17 = f1Var.a(map, str.concat(".titleColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            lVar.f425577b = a17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".numberRequestId"));
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberRequestId", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            lVar.f425578c = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberRequestId", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".numberDefaultTitle"));
            if (str4 == null) {
                str4 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            lVar.f425580e = str4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            java.lang.String str5 = (java.lang.String) map.get(str.concat(".numberDesc"));
            java.lang.String str6 = str5 != null ? str5 : "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            lVar.f425579d = str6;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            s34.g1 a18 = f1Var.a(map, str.concat(".numberTitleColor"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            lVar.f425581f = a18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
        return lVar;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
        java.lang.String str = this.f425580e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
        return str;
    }
}
