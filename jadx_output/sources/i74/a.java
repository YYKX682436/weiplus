package i74;

/* loaded from: classes4.dex */
public class a implements i74.k {

    /* renamed from: a, reason: collision with root package name */
    public ca4.j f289455a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f289456b;

    /* renamed from: c, reason: collision with root package name */
    public int f289457c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f289458d = "zh_CN";

    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a() {
        /*
            java.lang.String r0 = "FeedbackDataSupplier"
            java.lang.String r1 = "enableOpenPersonalizedAd called"
            java.lang.String r2 = "enableOpenPersonalizedAd"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = 0
            java.lang.Class<e42.e0> r5 = e42.e0.class
            i95.m r5 = i95.n0.c(r5)     // Catch: java.lang.Throwable -> L2e
            e42.e0 r5 = (e42.e0) r5     // Catch: java.lang.Throwable -> L2e
            e42.d0 r6 = e42.d0.clicfg_sns_ad_enable_open_personalize_in_feedback_android     // Catch: java.lang.Throwable -> L2e
            h62.d r5 = (h62.d) r5     // Catch: java.lang.Throwable -> L2e
            int r5 = r5.Ni(r6, r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            r6.append(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L2c
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2c
            goto L41
        L2c:
            r1 = move-exception
            goto L30
        L2e:
            r1 = move-exception
            r5 = r4
        L30:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "enableOpenPersonalizedAd, exp="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.tencent.mars.xlog.Log.e(r0, r1)
        L41:
            if (r5 <= 0) goto L44
            r4 = 1
        L44:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i74.a.a():boolean");
    }

    public a84.r0 b(boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdActTypeData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f289456b;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdActTypeData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        ca4.a aVar = new ca4.a(snsInfo.getUxinfo(), z17 ? 2 : 1, i17, null, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdActTypeData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return aVar;
    }

    public final int c() {
        ca4.i iVar;
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdDelayDay", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        ca4.j jVar = this.f289455a;
        if (jVar == null || (iVar = jVar.f39952a) == null || (aDInfo = iVar.f39940b) == null) {
            com.tencent.mars.xlog.Log.e("FeedbackDataSupplier", "the data tag is null!");
        } else {
            com.tencent.mm.plugin.sns.storage.d dVar = aDInfo.adUnlikeInfo;
            if (dVar != null) {
                int i17 = dVar.f165955a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDelayDay", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                return i17;
            }
            com.tencent.mars.xlog.Log.e("FeedbackDataSupplier", "the adUnlikeInfo is null in data tag!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDelayDay", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return 7;
    }

    public final com.tencent.mm.plugin.sns.storage.ADInfo d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        ca4.j jVar = this.f289455a;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f289456b;
        if (jVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        ca4.i iVar = jVar.f39952a;
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = iVar != null ? iVar.f39940b : null;
        if (snsInfo != null) {
            aDInfo = snsInfo.getAdInfo(this.f289457c);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return aDInfo;
    }

    public final com.tencent.mm.plugin.sns.storage.ADXml e() {
        ca4.i iVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdXml", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        ca4.j jVar = this.f289455a;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f289456b;
        com.tencent.mm.plugin.sns.storage.ADXml aDXml = (jVar == null || (iVar = jVar.f39952a) == null) ? null : iVar.f39939a;
        if (aDXml == null && snsInfo != null) {
            aDXml = snsInfo.getAdXml();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdXml", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return aDXml;
    }

    public android.content.Intent f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        try {
            android.content.Intent h17 = h();
            if (h17 != null) {
                h17.putExtra("complaint_weapp", true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                return h17;
            }
            android.content.Intent g17 = g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return g17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
    }

    public final android.content.Intent g() {
        com.tencent.mm.plugin.sns.storage.l lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplaintNormalIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplaintUrl", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.tencent.mm.plugin.sns.storage.ADXml e17 = e();
        java.lang.String str = "";
        if (e17 == null || (lVar = e17.adFeedbackInfo) == null) {
            com.tencent.mars.xlog.Log.e("FeedbackDataSupplier", "there is no feedback info!!!");
        } else {
            java.util.List list = lVar.f166039a;
            if (a84.b0.b(list)) {
                com.tencent.mars.xlog.Log.e("FeedbackDataSupplier", "there is no feedback item!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintUrl", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f289456b;
                if (!android.text.TextUtils.isEmpty(str) || snsInfo == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintNormalIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                    return null;
                }
                try {
                    str = za4.z0.d(str, java.lang.String.format("snsid=%s", snsInfo.getTimeLine().Id), java.lang.String.format("aid=%s", snsInfo.getAid()), java.lang.String.format("traceid=%s", snsInfo.getTraceid()), java.lang.String.format("uin=%s", gm0.j1.b().j()));
                } catch (java.lang.Exception unused) {
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("useJs", true);
                intent.putExtra("KPublisherId", "sns_" + ca4.z0.t0(snsInfo.field_snsId));
                intent.putExtra("pre_username", snsInfo.field_userName);
                intent.putExtra("prePublishId", "sns_" + ca4.z0.t0(snsInfo.field_snsId));
                intent.putExtra("preUsername", snsInfo.field_userName);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintNormalIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                return intent;
            }
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.sns.storage.m mVar = (com.tencent.mm.plugin.sns.storage.m) it.next();
                if (mVar != null && !android.text.TextUtils.isEmpty(mVar.f166060d)) {
                    str = mVar.f166060d;
                    break;
                }
            }
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.e("FeedbackDataSupplier", "there is feedback item, but no url!!!");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintUrl", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f289456b;
        if (android.text.TextUtils.isEmpty(str)) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintNormalIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return null;
    }

    public final android.content.Intent h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplaintWeAppIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.tencent.mm.plugin.sns.storage.ADXml e17 = e();
        com.tencent.mm.plugin.sns.storage.ADInfo d17 = d();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f289456b;
        if (e17 == null || android.text.TextUtils.isEmpty(e17.feedbackWeAppUsername) || android.text.TextUtils.isEmpty(e17.feedbackWeAppPath) || snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintWeAppIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        java.lang.String T = ca4.z0.T(snsInfo);
        java.lang.String aid = snsInfo.getAid();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (aid == null) {
            aid = "";
        }
        java.lang.String traceid = snsInfo.getTraceid();
        if (traceid == null) {
            traceid = "";
        }
        java.lang.String j17 = gm0.j1.b().j();
        if (j17 == null) {
            j17 = "";
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = e17.feedbackWeAppPath;
        java.lang.String str2 = d17 != null ? d17.uxInfo : "";
        intent.putExtra("appUserName", e17.feedbackWeAppUsername);
        za4.z0.c(str, "snsid=" + T, "aid=".concat(aid), "traceid=".concat(traceid), "uin=".concat(j17));
        if (d17 != null) {
            str = ca4.m0.d(str, d17.addClickTimeToWeAppPath);
        }
        intent.putExtra("appPagePath", str);
        intent.putExtra("aId", aid);
        intent.putExtra("sceneNote", T + ":" + str2 + ":" + com.tencent.mm.plugin.sns.model.l4.sj() + ":" + java.lang.System.currentTimeMillis());
        intent.putExtra("uxInfo", str2);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f289457c == 0 ? 1045 : 1046);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintWeAppIntent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return intent;
    }

    public java.util.Map i(java.lang.String str) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        try {
            if ("ad_delay_interval_day".equals(str)) {
                arrayMap.put(str, java.lang.Integer.valueOf(c()));
            } else if ("reason_list".equals(str)) {
                arrayMap.put(str, m());
            } else if ("expand_title".equals(str)) {
                arrayMap.put(str, j());
            } else if ("special_prompt".equals(str)) {
                arrayMap.put(str, n());
            } else if ("is_special".equals(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                com.tencent.mm.plugin.sns.storage.ADInfo d17 = d();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                if (d17 != null) {
                    z17 = d17.forbidClick;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                    z17 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                arrayMap.put(str, java.lang.Boolean.valueOf(z17));
            } else if ("unlike_tag".equals(str)) {
                ca4.j jVar = this.f289455a;
                if (jVar != null) {
                    arrayMap.put(str, jVar);
                }
            } else if ("complaint_content".equals(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                com.tencent.mm.plugin.sns.storage.ADXml e17 = e();
                java.lang.String str2 = "";
                if (e17 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                } else if (android.text.TextUtils.isEmpty(e17.feedbackWording)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                } else {
                    str2 = e17.feedbackWording;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                }
                arrayMap.put(str, str2);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("FeedbackDataSupplier", "there is something wrong in getData. the key is " + str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return arrayMap;
    }

    public final java.lang.String j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.tencent.mm.plugin.sns.storage.ADXml e17 = e();
        if (e17 == null) {
            com.tencent.mars.xlog.Log.w("FeedbackDataSupplier", "the ad xml is null in data");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return "";
        }
        if ("zh_CN".equals(this.f289458d)) {
            java.lang.String str = e17.expandInsideTitle_cn;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return str;
        }
        if ("zh_TW".equals(this.f289458d) || "zh_HK".equals(this.f289458d)) {
            java.lang.String str2 = e17.expandInsideTitle_tw;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return str2;
        }
        java.lang.String str3 = e17.expandInsideTitle_en;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpandInsideTitle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return str3;
    }

    public com.tencent.mm.plugin.sns.model.q2 k(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNetSceneSnsObjectOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f289456b;
        ca4.j jVar = this.f289455a;
        if (snsInfo == null || jVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNetSceneSnsObjectOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.c cVar = new com.tencent.mm.plugin.sns.storage.c();
        cVar.f165946e = 1;
        java.util.LinkedList linkedList = cVar.f165947f;
        if (i17 == 0) {
            linkedList.add(101);
        } else {
            linkedList.add(0);
        }
        cVar.f165948g = jVar.f39956e;
        if (i17 == 0) {
            cVar.f165949h = 0L;
        } else {
            cVar.f165949h = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.sns.model.q2 q2Var = new com.tencent.mm.plugin.sns.model.q2(snsInfo.field_snsId, 8, cVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNetSceneSnsObjectOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return q2Var;
    }

    public com.tencent.mm.plugin.sns.model.q2 l(java.util.Set set) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNoInterestingReasonNetSceneOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.tencent.mm.plugin.sns.storage.ADInfo d17 = d();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f289456b;
        ca4.j jVar = this.f289455a;
        if (jVar == null || snsInfo == null || d17 == null || d17.adUnlikeInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNoInterestingReasonNetSceneOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List<com.tencent.mm.plugin.sns.storage.c> a17 = d17.adUnlikeInfo.a();
        if (a84.b0.e(a17)) {
            for (com.tencent.mm.plugin.sns.storage.c cVar : a17) {
                if (cVar != null && set.contains(java.lang.Integer.valueOf(cVar.f165945d))) {
                    linkedList.add(java.lang.Integer.valueOf(cVar.f165945d));
                }
            }
        }
        if (a84.b0.b(linkedList)) {
            linkedList.add(10006);
        }
        com.tencent.mm.plugin.sns.storage.c cVar2 = new com.tencent.mm.plugin.sns.storage.c();
        cVar2.f165946e = linkedList.size();
        cVar2.f165947f.addAll(linkedList);
        cVar2.f165948g = jVar.f39956e;
        cVar2.f165949h = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.model.q2 q2Var = new com.tencent.mm.plugin.sns.model.q2(snsInfo.field_snsId, 8, cVar2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNoInterestingReasonNetSceneOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return q2Var;
    }

    public final java.util.List m() {
        com.tencent.mm.plugin.sns.storage.d dVar;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReasons", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.sns.storage.ADInfo d17 = d();
        if (d17 != null && (dVar = d17.adUnlikeInfo) != null) {
            java.util.List<com.tencent.mm.plugin.sns.storage.c> a17 = dVar.a();
            if (a84.b0.e(a17)) {
                for (com.tencent.mm.plugin.sns.storage.c cVar : a17) {
                    int i17 = cVar.f165945d;
                    if (i17 != 10006) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                        if ("zh_CN".equals(this.f289458d)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                            str = cVar.f165942a;
                        } else if ("zh_HK".equals(this.f289458d) || "zh_TW".equals(this.f289458d)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                            str = cVar.f165943b;
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                            str = cVar.f165944c;
                        }
                        arrayList.add(new j74.c(i17, str));
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReasons", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return arrayList;
    }

    public final java.lang.String n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpecialData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        com.tencent.mm.plugin.sns.storage.ADInfo d17 = d();
        java.lang.String str = (d17 == null || d17.adUnlikeInfo == null) ? "" : "zh_CN".equals(this.f289458d) ? d17.adUnlikeInfo.f165958d : ("zh_HK".equals(this.f289458d) || "zh_TW".equals(this.f289458d)) ? d17.adUnlikeInfo.f165959e : d17.adUnlikeInfo.f165960f;
        if (android.text.TextUtils.isEmpty(str)) {
            str = j();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpecialData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return str;
    }

    public i74.j o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUIModel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        i74.j jVar = new i74.j();
        jVar.f289502b = i74.e.a(d());
        jVar.f289501a = p() && a() && !com.tencent.mm.sdk.platformtools.t8.K0(jVar.f289502b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUIModel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        return jVar;
    }

    public boolean p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        boolean z17 = false;
        try {
            com.tencent.mm.plugin.sns.storage.ADInfo d17 = d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            if (d17 != null) {
                boolean z18 = d17.isPersonalizedAdClose;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                z17 = z18;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return z17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            return false;
        }
    }

    public void q(ca4.j jVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        try {
            this.f289455a = jVar;
            if (snsInfo != null) {
                this.f289456b = snsInfo;
            } else if (jVar != null) {
                this.f289456b = com.tencent.mm.plugin.sns.model.l4.Fj().k1(jVar.f39954c);
            }
            this.f289458d = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("FeedbackDataSupplier", "there is something wrong in updateData");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
    }
}
