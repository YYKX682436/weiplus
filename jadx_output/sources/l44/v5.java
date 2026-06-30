package l44;

/* loaded from: classes4.dex */
public final class v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final l44.v5 f316394a = new l44.v5();

    public final int a(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleBarBottomY", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
        if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
            com.tencent.mars.xlog.Log.e("TimelineAdVisibleAreaHelper", "getTitleBarBottomY, activity !is MMActivity");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleBarBottomY", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
            return 0;
        }
        androidx.appcompat.app.b supportActionBar = ((com.tencent.mm.ui.MMActivity) context).getSupportActionBar();
        android.view.View j17 = supportActionBar != null ? supportActionBar.j() : null;
        if (j17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleBarBottomY", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
            return 0;
        }
        if (j17.getHeight() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleBarBottomY", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
            return 0;
        }
        int[] iArr = {0, 0};
        j17.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        j17.getLocalVisibleRect(rect);
        j17.getBottom();
        rect.toString();
        j17.getHeight();
        int height = iArr[1] + j17.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleBarBottomY", "com.tencent.mm.plugin.sns.ad.helper.TimelineAdVisibleAreaHelper");
        return height;
    }
}
