package u84;

/* loaded from: classes4.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f425571a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f425572b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f425573c = new java.util.ArrayList();

    public static u84.k0 a(java.util.Map map, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionLabeInfo");
        java.lang.String str3 = (java.lang.String) map.get(str + ".title");
        if (android.text.TextUtils.isEmpty(str3)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionLabeInfo");
            return null;
        }
        u84.k0 k0Var = new u84.k0();
        k0Var.f425571a = str3;
        com.tencent.mm.sdk.platformtools.t8.C1((java.lang.String) map.get(str + ".interactionType"));
        java.lang.String str4 = (java.lang.String) map.get(str + ".themeColor");
        if (str4 == null) {
            str4 = "";
        }
        java.lang.String str5 = (java.lang.String) map.get(str + ".themeColorAlpha");
        if (str5 == null) {
            str5 = "";
        }
        if (!android.text.TextUtils.isEmpty(str4) && !android.text.TextUtils.isEmpty(str5)) {
            str4 = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf((int) (com.tencent.mm.sdk.platformtools.t8.A1(str5) * 255.0d)), str4.substring(1));
        }
        k0Var.f425572b = str4;
        java.lang.String str6 = str + ".rollingLabels.item";
        int i17 = 0;
        while (true) {
            if (i17 != 0) {
                str2 = str6 + i17;
            } else {
                str2 = str6;
            }
            java.lang.String str7 = (java.lang.String) map.get(str2);
            if (str7 == null) {
                str7 = "";
            }
            if (android.text.TextUtils.isEmpty(str7)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionLabeInfo");
                return k0Var;
            }
            k0Var.f425573c.add(str7);
            i17++;
        }
    }
}
