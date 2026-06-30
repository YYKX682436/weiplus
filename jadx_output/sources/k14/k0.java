package k14;

/* loaded from: classes2.dex */
public abstract class k0 {
    public static final void a(com.tencent.mm.ui.widget.MMNeat7extView appNameTextView, android.widget.TextView appTypeTextView, int i17, int i18, int i19, boolean z17) {
        kotlin.jvm.internal.o.g(appNameTextView, "appNameTextView");
        kotlin.jvm.internal.o.g(appTypeTextView, "appTypeTextView");
        if (z17) {
            appNameTextView.setMaxWidth(Integer.MAX_VALUE);
            appTypeTextView.setMaxWidth(Integer.MAX_VALUE);
        }
        appNameTextView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        appTypeTextView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = appNameTextView.getMeasuredWidth();
        int measuredWidth2 = appTypeTextView.getMeasuredWidth();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAuthViewUtils", "updateAuthInfoViewMaxWidth appTypeWidth: " + measuredWidth2 + ", appNameTextViewWidth: " + measuredWidth);
        if (measuredWidth + measuredWidth2 <= i17) {
            appNameTextView.setMaxWidth(Integer.MAX_VALUE);
            appTypeTextView.setMaxWidth(Integer.MAX_VALUE);
        } else if (measuredWidth2 < i19) {
            appNameTextView.setMaxWidth(i17 - measuredWidth2);
            appTypeTextView.setMaxWidth(Integer.MAX_VALUE);
        } else if (measuredWidth <= i18) {
            appNameTextView.setMaxWidth(Integer.MAX_VALUE);
            appTypeTextView.setMaxWidth(i17 - measuredWidth);
        } else {
            appNameTextView.setMaxWidth(i18);
            appTypeTextView.setMaxWidth(i19);
        }
    }
}
