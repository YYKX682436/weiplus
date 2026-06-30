package n74;

/* loaded from: classes4.dex */
public abstract class o0 {
    public static boolean a(boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAdTagClickable", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdTagClickable", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
            return false;
        }
        boolean z18 = i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 9 || i17 == 19 || i17 == 45;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdTagClickable", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        return z18;
    }

    public static void b(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i18, i64.b1 b1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdTagReport", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i17, i17 == 0 ? 1 : 2, snsInfo.field_snsId, i18, 45);
        ca4.m0.f(snsAdClick, b1Var, snsInfo, i18);
        ca4.z0.x0(snsAdClick);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdTagReport", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
    }

    public static void c(android.app.Activity activity, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i18) {
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdTagReport", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdTagClickableHelper", th6.toString());
        }
        if (activity instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) {
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) activity;
            snsCommentDetailUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            b1Var = snsCommentDetailUI.f166869l1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
            b(i17, snsInfo, i18, b1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdTagReport", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        }
        b1Var = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        b(i17, snsInfo, i18, b1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdTagReport", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
    }
}
