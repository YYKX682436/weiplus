package j74;

/* loaded from: classes4.dex */
public class b implements a84.r0 {

    /* renamed from: a, reason: collision with root package name */
    public long f298055a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f298056b;

    /* renamed from: c, reason: collision with root package name */
    public int f298057c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298058d;

    /* renamed from: e, reason: collision with root package name */
    public int f298059e;

    /* renamed from: f, reason: collision with root package name */
    public int f298060f;

    /* renamed from: g, reason: collision with root package name */
    public int f298061g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Long f298062h;

    /* renamed from: i, reason: collision with root package name */
    public int f298063i;

    public static a84.r0 b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, com.tencent.mm.plugin.sns.storage.ADXml aDXml, boolean z17, boolean z18, android.view.View view, i64.b1 b1Var) {
        android.view.View e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        if (snsInfo == null || aDInfo == null || aDXml == null || view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return null;
        }
        if (!snsInfo.isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return null;
        }
        j74.b bVar = new j74.b();
        bVar.f298055a = snsInfo.field_snsId;
        bVar.f298056b = ca4.c0.a(aDInfo.uxInfo);
        bVar.f298057c = z17 ? 2 : 1;
        bVar.f298058d = aDXml.adExtInfo;
        bVar.f298063i = z18 ? 2 : 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeAdOffsetScreenTop", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findCommentDetailAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            e17 = bVar.e(view, com.tencent.mm.R.id.f482833p7);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findCommentDetailAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findTimelineAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            e17 = bVar.e(view, com.tencent.mm.R.id.n9g);
            if (e17 instanceof com.tencent.mm.plugin.sns.ui.AdFrameLayout) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findTimelineAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findTimelineAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                e17 = view;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAdItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        }
        if (e17 != null) {
            int[] iArr = new int[2];
            e17.getLocationOnScreen(iArr);
            bVar.f298059e = iArr[1];
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeAdOffsetScreenTop", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeClickPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int width = view.getWidth();
        int height = view.getHeight();
        bVar.f298060f = iArr2[0] + (width / 2);
        bVar.f298061g = iArr2[1] + (height / 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeClickPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        if (b1Var != null && snsInfo.getTimeLine() != null && snsInfo.getTimeLine().ContentObj != null && snsInfo.getTimeLine().ContentObj.f369837e == 15) {
            bVar.f298062h = java.lang.Long.valueOf(b1Var.g(bVar.f298055a));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        return bVar;
    }

    public static a84.r0 c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17, android.view.View view, i64.b1 b1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        if (snsInfo == null || view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return null;
        }
        try {
            if (!snsInfo.isAd()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                return null;
            }
            a84.r0 b17 = b(snsInfo, snsInfo.getAdInfo(), snsInfo.getAdXml(), (b1Var == null || b1Var.f289095j == 0) ? false : true, z17, view, b1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return b17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return null;
        }
    }

    public final org.json.JSONObject a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("baseInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("snsid", java.lang.String.valueOf(this.f298055a));
            java.lang.String str = this.f298056b;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("uxinfo", str);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f298057c);
            java.lang.String str3 = this.f298058d;
            if (str3 != null) {
                str2 = str3;
            }
            jSONObject.put("adExtInfo", str2);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("baseInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        return jSONObject;
    }

    public final org.json.JSONObject d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("extInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("adOffSetTop", this.f298059e);
            jSONObject.put("clickPosX", this.f298060f);
            jSONObject.put("clickPosY", this.f298061g);
            java.lang.Long l17 = this.f298062h;
            if (l17 != null) {
                jSONObject.put("videoPlayTime", l17.longValue());
            }
            jSONObject.put("buttonType", this.f298063i);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("extInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findTargetUpperLevelView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:
    
        if (r5 != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        r2 = r5.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if ((r2 instanceof android.view.View) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r5 = (android.view.View) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r5.getId() != r6) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View e(android.view.View r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "findTargetUpperLevelView"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r5 == 0) goto L1a
        L9:
            android.view.ViewParent r2 = r5.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L1a
            r5 = r2
            android.view.View r5 = (android.view.View) r5
            int r2 = r5.getId()
            if (r2 != r6) goto L9
        L1a:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j74.b.e(android.view.View, int):android.view.View");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        return "timeline_ad_feedback_and_sns_button_click";
    }

    @Override // a84.r0
    public java.lang.String j() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            try {
                org.json.JSONObject a17 = a();
                a17.put("extInfo", d());
                str = a17.toString();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            } catch (java.lang.Throwable unused) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                str = "{}";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return str;
        } catch (java.lang.Throwable unused2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
            return "";
        }
    }
}
