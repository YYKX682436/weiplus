package mb4;

/* loaded from: classes4.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final mb4.e a(java.util.Map values, java.lang.String prefKey) {
        java.lang.Long j17;
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AnimationMediaPagInfo$Companion");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(prefKey, "prefKey");
        if (a84.b0.c(values) || com.tencent.mm.sdk.platformtools.t8.K0(prefKey)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AnimationMediaPagInfo$Companion");
            return null;
        }
        if (!values.containsKey(prefKey)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AnimationMediaPagInfo$Companion");
            return null;
        }
        mb4.e eVar = new mb4.e();
        java.lang.String str = (java.lang.String) values.get(prefKey.concat(".pagThumbUrl"));
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        eVar.f325397a = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str2 = eVar.f325397a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str3 = eVar.f325397a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str4 = eVar.f325397a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        r45.jj4 h19 = m21.y.h(a17, 2, str3, str4, 1, 1, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagThumbMedia", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        com.tencent.mm.plugin.sns.storage.h1 h1Var = eVar.f325398b;
        f06.v[] vVarArr = mb4.e0.f325396e;
        ((com.tencent.mm.plugin.sns.storage.z) h1Var).b(eVar, vVarArr[0], h19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagThumbMedia", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        r45.jj4 b17 = eVar.b();
        if (b17 != null) {
            b17.N = true;
        }
        java.lang.String str5 = (java.lang.String) values.get(prefKey.concat(".pagUrl"));
        if (str5 == null) {
            str5 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        ((com.tencent.mm.plugin.sns.storage.t0) eVar.f325399c).b(eVar, vVarArr[1], str5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str6 = (java.lang.String) values.get(prefKey.concat(".pagMD5"));
        java.lang.String str7 = str6 != null ? str6 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        eVar.f325400d = str7;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str8 = (java.lang.String) values.get(prefKey.concat(".width"));
        if (str8 != null && (h18 = r26.h0.h(str8)) != null) {
            h18.intValue();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str9 = (java.lang.String) values.get(prefKey.concat(".height"));
        if (str9 != null && (h17 = r26.h0.h(str9)) != null) {
            h17.intValue();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeight", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeight", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str10 = (java.lang.String) values.get(prefKey.concat(".startDelayTime"));
        if (str10 != null && (j17 = r26.h0.j(str10)) != null) {
            j17.longValue();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStartDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AnimationMediaPagInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStartDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AnimationMediaPagInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.adsocial.AnimationMediaPagInfo$Companion");
        return eVar;
    }
}
