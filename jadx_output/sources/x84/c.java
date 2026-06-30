package x84;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final x84.a f452583a = new x84.a(null);

    public static final void a(android.widget.TextView textView, java.lang.String str, int i17, int i18, int i19, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendImageSpanToTextViewEndPosition", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendImageSpanToTextViewEndPosition", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        if (textView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendImageSpanToTextViewEndPosition", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        } else {
            com.tencent.mars.xlog.Log.i("AdHandleImageSpanLogic", "appendImageSpanToTextViewEndPosition, imgUrl is " + str + ", isRefresh is " + z17);
            if (str == null || str.length() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendImageSpanToTextViewEndPosition", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
            } else {
                textView.setTag(com.tencent.mm.R.id.n5q, str);
                a84.m.g(str, new x84.b(textView, str, i17, i18, i19, z17));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendImageSpanToTextViewEndPosition", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendImageSpanToTextViewEndPosition", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic");
    }

    public static final java.lang.String b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        x84.e eVar;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.storage.ADXml adXml2;
        x84.e eVar2;
        com.tencent.mm.plugin.sns.storage.ADXml adXml3;
        x84.e eVar3;
        com.tencent.mm.plugin.sns.storage.ADXml adXml4;
        x84.e eVar4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImgUrlFromReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic");
        x84.a aVar = f452583a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImgUrlFromReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        str = "";
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        } else {
            java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
            java.lang.String a17 = aVar.a(t07 != null ? t07 : "");
            com.tencent.mars.xlog.Log.i("AdHandleImageSpanLogic", "getReadState, snsId is " + t07 + ", key is " + a17);
            str = p34.o.c(a17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        }
        if (kotlin.jvm.internal.o.b(str, "1")) {
            if (com.tencent.mm.ui.bk.C()) {
                if (snsInfo != null && (adXml4 = snsInfo.getAdXml()) != null && (eVar4 = adXml4.adHeadStateInfo) != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
                    str2 = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) eVar4.f452589d).a(eVar4, x84.e.f452585f[3]);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
                }
                str2 = null;
            } else {
                if (snsInfo != null && (adXml3 = snsInfo.getAdXml()) != null && (eVar3 = adXml3.adHeadStateInfo) != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
                    str2 = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) eVar3.f452588c).a(eVar3, x84.e.f452585f[2]);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
                }
                str2 = null;
            }
        } else if (com.tencent.mm.ui.bk.C()) {
            if (snsInfo != null && (adXml2 = snsInfo.getAdXml()) != null && (eVar2 = adXml2.adHeadStateInfo) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnreadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
                str2 = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) eVar2.f452587b).a(eVar2, x84.e.f452585f[1]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnreadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            }
            str2 = null;
        } else {
            if (snsInfo != null && (adXml = snsInfo.getAdXml()) != null && (eVar = adXml.adHeadStateInfo) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnreadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
                str2 = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) eVar.f452586a).a(eVar, x84.e.f452585f[0]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnreadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            }
            str2 = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImgUrlFromReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImgUrlFromReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic");
        return str2;
    }

    public static final void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic");
        x84.a aVar = f452583a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        } else if (snsInfo.isAd() && snsInfo.isValidAdHeadStateInfo()) {
            java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
            java.lang.String a17 = aVar.a(t07 == null ? "" : t07);
            com.tencent.mars.xlog.Log.i("AdHandleImageSpanLogic", "setReadState, snsId is " + t07 + ", key is " + a17);
            p34.o.g(a17, "1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic");
    }
}
