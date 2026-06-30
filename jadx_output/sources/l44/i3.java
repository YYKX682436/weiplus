package l44;

/* loaded from: classes4.dex */
public abstract class i3 {
    public static int a(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo, int i17, int i18, java.lang.String str) {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
        if (adSnsInfo == null) {
            com.tencent.mars.xlog.Log.w("AdPullDeleteHelper", "deleteAd, adSnsInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
            return 1;
        }
        long j18 = adSnsInfo.field_snsId;
        java.lang.String t07 = ca4.z0.t0(j18);
        try {
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(adSnsInfo.field_attrBuf);
            if (snsObject == null) {
                com.tencent.mars.xlog.Log.w("AdPullDeleteHelper", "deleteAd, snsObject==null, snsId=" + t07);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                return 4;
            }
            boolean U = ca4.m0.U(snsObject, c01.z1.r());
            boolean z17 = (adSnsInfo.field_localFlag & 128) > 0;
            java.lang.Long valueOf = java.lang.Long.valueOf(j18);
            java.util.Set set = i64.b1.f289085z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdExposured", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            boolean contains = i64.b1.f289085z.contains(valueOf);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdExposured", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            com.tencent.mars.xlog.Log.i("AdPullDeleteHelper", "deleteAd, hasCommentLike=" + U + ", isExposure=" + z17 + ", isMemExposured=" + contains + ", delCondition=" + i18 + ", snsId=" + t07 + ", deleteType=" + i17);
            if (i18 == 0 && (z17 || contains || U)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                return 3;
            }
            if (i18 == 1 && U) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                return 2;
            }
            a84.n.e(adSnsInfo);
            try {
                j17 = j18;
                try {
                    ca4.c0.c(i17, j18, adSnsInfo.getAdInfo(), adSnsInfo.getAdXml(), str);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    try {
                        com.tencent.mars.xlog.Log.e("AdPullDeleteHelper", "deleteAd, reportAdDel exp=" + th.toString());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                        return 0;
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        com.tencent.mars.xlog.Log.e("AdPullDeleteHelper", "deleteAD, snsId=" + ca4.z0.t0(j17) + ", exp=" + e.toString());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
                        return 4;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                j17 = j18;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
            return 0;
        } catch (java.lang.Exception e18) {
            e = e18;
            j17 = j18;
        }
    }

    public static void b(java.util.LinkedList linkedList, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleAdPullDelete", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
        if (i17 > 0) {
            com.tencent.mars.xlog.Log.i("AdPullDeleteHelper", "handleAdPullDelete, count=" + i17 + ", scene=" + i18);
            if (linkedList == null || linkedList.size() != i17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleAdPullDelete, count=");
                sb6.append(i17);
                sb6.append(", list.size=");
                sb6.append(linkedList != null ? linkedList.size() : 0);
                com.tencent.mars.xlog.Log.e("AdPullDeleteHelper", sb6.toString());
            } else {
                l44.t5 b17 = l44.t5.b();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                for (int i19 = 0; i19 < i17; i19++) {
                    long j17 = ((r45.pb0) linkedList.get(i19)).f382919d;
                    java.lang.String t07 = ca4.z0.t0(j17);
                    sb7.append(t07);
                    sb7.append("|");
                    if (j17 != 0) {
                        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(j17);
                        if (y07 == null) {
                            sb7.append("1, ");
                            b17.a("", t07, 1, 1);
                            com.tencent.mars.xlog.Log.i("AdPullDeleteHelper", "handleAdPullDelete, adSnsInfo==null, snsId=" + t07);
                        } else {
                            int a17 = a(y07, 0, 1, "");
                            b17.a(y07.getAdInfo().uxInfo, t07, 1, a17);
                            sb7.append(a17);
                            sb7.append(", ");
                        }
                    }
                }
                b17.c();
                com.tencent.mars.xlog.Log.i("AdPullDeleteHelper", "handleAdPullDelete, ret=" + sb7.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAdPullDelete", "com.tencent.mm.plugin.sns.ad.helper.AdPullDeleteHelper");
    }
}
