package gd4;

/* loaded from: classes4.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.m implements yz5.s {
    public w(java.lang.Object obj) {
        super(5, obj, gd4.y.class, "getClickAreaLayoutParams", "getClickAreaLayoutParams(DILcom/tencent/mm/plugin/sns/storage/AdBreakFrameClickInfo;II)Landroid/widget/FrameLayout$LayoutParams;", 0);
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.lang.String str;
        java.lang.String str2;
        android.widget.FrameLayout.LayoutParams layoutParams;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$2");
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.sns.storage.b0 b0Var = (com.tencent.mm.plugin.sns.storage.b0) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        int intValue3 = ((java.lang.Number) obj5).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$2");
        gd4.y yVar = (gd4.y) this.receiver;
        yVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickAreaLayoutParams", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) ((kotlinx.coroutines.flow.h3) yVar.f270874r.d()).getValue();
        if (b0Var == null || layoutParams2 == null) {
            str = "invoke";
            str2 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$2";
            layoutParams = new android.widget.FrameLayout.LayoutParams(0, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickAreaLayoutParams", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAreaWidth", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAreaWidth", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            int i17 = (int) (b0Var.f165933c * doubleValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAreaHeight", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAreaHeight", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            int i18 = (int) (b0Var.f165934d * doubleValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAreaLeft", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAreaLeft", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            str = "invoke";
            str2 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$2";
            int i19 = (int) (b0Var.f165931a * doubleValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAreaTop", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAreaTop", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            int i27 = ((int) (b0Var.f165932b * doubleValue)) + intValue3;
            int i28 = (intValue - i18) - i27;
            if (i28 < intValue2) {
                i18 -= intValue2 - i28;
            }
            layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i18);
            layoutParams.leftMargin = i19 + layoutParams2.leftMargin;
            layoutParams.topMargin = i27 + layoutParams2.rightMargin;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickAreaLayoutParams", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        }
        java.lang.String str3 = str;
        java.lang.String str4 = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
        return layoutParams;
    }
}
