package m54;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.t f324306a = new m54.t();

    public final java.lang.String a(m54.l pageParam, m54.u shareParam) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createShareXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareHelper");
        kotlin.jvm.internal.o.g(pageParam, "pageParam");
        kotlin.jvm.internal.o.g(shareParam, "shareParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShareTitle", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        java.lang.String str = shareParam.f324308b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShareTitle", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShareDesc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        java.lang.String str2 = shareParam.f324309c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShareDesc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShareWebUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        java.lang.String str3 = shareParam.f324310d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShareWebUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShareThumbUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        java.lang.String str4 = shareParam.f324307a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShareThumbUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createCanvasXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareHelper");
        java.lang.String str5 = "<adCanvasInfo><shareTitle>" + android.text.TextUtils.htmlEncode(str) + "</shareTitle><shareDesc>" + android.text.TextUtils.htmlEncode(str2) + "</shareDesc><shareWebUrl>" + android.text.TextUtils.htmlEncode(str3) + "</shareWebUrl><shareThumbUrl>" + android.text.TextUtils.htmlEncode(str4) + "</shareThumbUrl><PageList><Page><componentItemList><componentItem><type>2147483647</type></componentItem></componentItemList></Page></PageList></adCanvasInfo>";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createCanvasXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<canvasShareInfo><uxInfo>");
        sb6.append(a54.h.a(pageParam));
        sb6.append("</uxInfo><canvasId>");
        java.lang.String i17 = pageParam.i();
        if (i17 == null) {
            i17 = "";
        }
        sb6.append(i17);
        sb6.append("</canvasId><canvasDynamicInfo>");
        sb6.append(android.text.TextUtils.htmlEncode(pageParam.D()));
        sb6.append("</canvasDynamicInfo><canvasDynamicExtInfo>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCanvasDynamicExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        java.lang.String str6 = shareParam.f324311e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanvasDynamicExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        sb6.append(android.text.TextUtils.htmlEncode(str6));
        sb6.append("</canvasDynamicExtInfo><canvasDynamicLoadExtInfo>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCanvasDynamicLoadExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        java.lang.String str7 = shareParam.f324312f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanvasDynamicLoadExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        sb6.append(android.text.TextUtils.htmlEncode(str7));
        sb6.append("</canvasDynamicLoadExtInfo></canvasShareInfo>");
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("<originAdType>");
        sb8.append(pageParam.C());
        sb8.append("</originAdType><originAid>");
        sb8.append(pageParam.c());
        sb8.append("</originAid><originTraceId>");
        sb8.append(pageParam.m());
        sb8.append("</originTraceId> <originSnsId>");
        sb8.append(pageParam.j());
        sb8.append("</originSnsId>\n<originUxInfo>");
        sb8.append(a54.h.a(pageParam));
        sb8.append("</originUxInfo><originAdCanvasExt>");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdCanvasExtXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        java.lang.String str8 = pageParam.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCanvasExtXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        sb8.append(str8);
        sb8.append("</originAdCanvasExt>");
        java.lang.String str9 = "<adxml>" + sb7 + sb8.toString() + str5 + "</adxml>";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createShareXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareHelper");
        return str9;
    }

    public final java.lang.String b(m54.l pageParam) {
        java.lang.String str = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("statExtStr", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareHelper");
        kotlin.jvm.internal.o.g(pageParam, "pageParam");
        try {
            r45.ud6 ud6Var = new r45.ud6();
            ud6Var.f387269f = a54.h.a(pageParam);
            java.lang.String j17 = pageParam.j();
            if (j17 == null) {
                j17 = "";
            }
            ud6Var.f387268e = j17;
            ud6Var.f387267d = pageParam.C();
            r45.td6 td6Var = new r45.td6();
            td6Var.f386329d = ud6Var;
            java.lang.String encodeToString = android.util.Base64.encodeToString(td6Var.toByteArray(), 2);
            kotlin.jvm.internal.o.d(encodeToString);
            str = encodeToString;
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("statExtStr", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareHelper");
        return str;
    }
}
