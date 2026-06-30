package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f163324a;

    /* renamed from: b, reason: collision with root package name */
    public int f163325b;

    /* renamed from: c, reason: collision with root package name */
    public int f163326c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.adpag.d0 f163327d;

    public static final com.tencent.mm.plugin.sns.ad.widget.adpag.a a(java.util.Map values, java.lang.String prefKey) {
        java.lang.Long j17;
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Integer h19;
        java.lang.Integer h27;
        java.lang.Integer h28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdBarPAGContainerInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdBarPAGContainerInfo$Companion");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(prefKey, "prefKey");
        com.tencent.mm.plugin.sns.ad.widget.adpag.a aVar = null;
        aVar = null;
        r5 = null;
        com.tencent.mm.plugin.sns.ad.widget.adpag.d0 d0Var = null;
        if (a84.b0.c(values) || com.tencent.mm.sdk.platformtools.t8.K0(prefKey)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdBarPAGContainerInfo$Companion");
        } else if (values.containsKey(prefKey)) {
            com.tencent.mm.plugin.sns.ad.widget.adpag.a aVar2 = new com.tencent.mm.plugin.sns.ad.widget.adpag.a();
            java.lang.String str = (java.lang.String) values.get(prefKey.concat(".containerWidth"));
            int i17 = 0;
            aVar2.f163324a = (str == null || (h28 = r26.h0.h(str)) == null) ? 0 : h28.intValue();
            java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".containerHeight"));
            aVar2.f163325b = (str2 == null || (h27 = r26.h0.h(str2)) == null) ? 0 : h27.intValue();
            java.lang.String str3 = (java.lang.String) values.get(prefKey.concat(".bottomOffset"));
            aVar2.f163326c = (str3 == null || (h19 = r26.h0.h(str3)) == null) ? 0 : h19.intValue();
            int i18 = com.tencent.mm.plugin.sns.ad.widget.adpag.d0.f163335h;
            java.lang.String prefKey2 = prefKey.concat(".animationPag");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo$Companion");
            kotlin.jvm.internal.o.g(prefKey2, "prefKey");
            if (a84.b0.c(values) || com.tencent.mm.sdk.platformtools.t8.K0(prefKey2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo$Companion");
            } else if (values.containsKey(prefKey2)) {
                d0Var = new com.tencent.mm.plugin.sns.ad.widget.adpag.d0();
                java.lang.String str4 = (java.lang.String) values.get(prefKey2.concat(".pagThumbUrl"));
                if (str4 == null) {
                    str4 = "";
                }
                d0Var.g(str4);
                java.lang.String str5 = (java.lang.String) values.get(prefKey2.concat(".pagUrl"));
                if (str5 == null) {
                    str5 = "";
                }
                d0Var.h(str5);
                java.lang.String str6 = (java.lang.String) values.get(prefKey2.concat(".pagMD5"));
                d0Var.f(str6 != null ? str6 : "");
                java.lang.String str7 = (java.lang.String) values.get(prefKey2.concat(".width"));
                d0Var.i((str7 == null || (h18 = r26.h0.h(str7)) == null) ? 0 : h18.intValue());
                java.lang.String str8 = (java.lang.String) values.get(prefKey2.concat(".height"));
                if (str8 != null && (h17 = r26.h0.h(str8)) != null) {
                    i17 = h17.intValue();
                }
                d0Var.e(i17);
                java.lang.String str9 = (java.lang.String) values.get(prefKey2.concat(".startDelayTime"));
                long longValue = (str9 == null || (j17 = r26.h0.j(str9)) == null) ? 2000L : j17.longValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStartDelayTime", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo");
                d0Var.f163336g = longValue;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStartDelayTime", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo$Companion");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo$Companion");
            }
            aVar2.f163327d = d0Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdBarPAGContainerInfo$Companion");
            aVar = aVar2;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdBarPAGContainerInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdBarPAGContainerInfo");
        return aVar;
    }
}
