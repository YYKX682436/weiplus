package w64;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final w64.t f443336a = new w64.t();

    public static final void b(android.content.Context context, f54.c0 c0Var, w64.o oVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
        if (c0Var == null || context == null || oVar == null) {
            com.tencent.mars.xlog.Log.e("AdJumpTextStatusUIHelper", "jump() called with: textStatusBtnInfo is " + c0Var + ", context is " + context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
            return;
        }
        w64.t tVar = f443336a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpiredTime", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpiredTime", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpiredToast", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpiredToast", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        long j17 = c0Var.I1;
        java.lang.String str = c0Var.J1;
        if (tVar.a(j17, str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpiredToast", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpiredToast", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            db5.t7.g(context, str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 175);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourceFooterData", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceFooterData", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        java.lang.String str2 = c0Var.E1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIconId", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIconId", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        java.lang.String str3 = c0Var.B1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCustomIconDescription", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCustomIconDescription", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        java.lang.String str4 = c0Var.C1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        java.lang.String str5 = c0Var.D1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourceVerifyInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceVerifyInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        java.lang.String str6 = c0Var.F1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmoticonMd5", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmoticonMd5", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        java.lang.String str7 = c0Var.H1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        java.lang.String str8 = c0Var.A1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        java.lang.String str9 = c0Var.f259702z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        c(context, str2, str3, str4, str5, str6, str7, str8, str9, c0Var.G1, oVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
    
        if (r9 != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, w64.o r26) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w64.t.c(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, w64.o):void");
    }

    public static final void d(android.content.Context context, s34.d dVar, w64.o oVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
        if (dVar == null || context == null || oVar == null) {
            com.tencent.mars.xlog.Log.e("AdJumpTextStatusUIHelper", "jump() called with: info is " + dVar + ", context is " + context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
            return;
        }
        w64.t tVar = f443336a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpiredTime", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpiredTime", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpiredToast", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpiredToast", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        long j17 = dVar.f402615l;
        java.lang.String str = dVar.f402616m;
        if (tVar.a(j17, str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpiredToast", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpiredToast", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            db5.t7.g(context, str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 175);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourceFooterData", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceFooterData", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str2 = dVar.f402608e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIconId", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIconId", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str3 = dVar.f402606c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCustomIconDescription", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCustomIconDescription", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str4 = dVar.f402607d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDesc", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDesc", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str5 = dVar.f402610g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourceVerifyInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceVerifyInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str6 = dVar.f402609f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmoticonMd5", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmoticonMd5", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str7 = dVar.f402612i;
        java.lang.String a17 = dVar.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        java.lang.String str8 = dVar.f402605b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        c(context, str2, str3, str4, str5, str6, str7, a17, str8, dVar.f402611h, oVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
    }

    public static final void e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadTextStatusResource", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
        com.tencent.mars.xlog.Log.i("AdJumpTextStatusUIHelper", "preloadTextStatusResource, emojiUrl is " + str + ", imageUrl is " + str2 + ", videoUrl is " + str3);
        if (!(str == null || str.length() == 0)) {
            a84.m.d(str, new w64.q(str));
        }
        if (!(str2 == null || str2.length() == 0)) {
            a84.m.d(str2, new w64.r(str2));
        }
        if (!(str3 == null || str3.length() == 0)) {
            n74.r.f335421a.b(str3, true, new w64.s(str3));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadTextStatusResource", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
    }

    public final boolean a(long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkExpireStatue", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
        if (j17 > 0) {
            if (!(str == null || str.length() == 0)) {
                long a17 = c01.id.a() / 1000;
                if (a17 > j17) {
                    com.tencent.mars.xlog.Log.i("AdJumpTextStatusUIHelper", "currentServerTime is " + a17 + ", expiredTime is " + j17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkExpireStatue", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
                    return true;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkExpireStatue", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
        return false;
    }
}
