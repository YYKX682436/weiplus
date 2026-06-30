package je4;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final je4.f f299319a = new je4.f();

    public final android.graphics.Rect a(android.app.Activity activity) {
        android.graphics.Rect rect;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
        kotlin.jvm.internal.o.g(activity, "activity");
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNavigationHeightApi30", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
            android.view.WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            kotlin.jvm.internal.o.f(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            android.graphics.Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(android.view.WindowInsets.Type.navigationBars());
            kotlin.jvm.internal.o.f(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
            rect = new android.graphics.Rect(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationHeightApi30", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
        } else if (i17 >= 29) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNavigationHeightApi29", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
            android.view.WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets == null) {
                android.graphics.Rect rect2 = new android.graphics.Rect();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationHeightApi29", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
                rect = rect2;
            } else {
                rect = new android.graphics.Rect(rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), rootWindowInsets.getSystemWindowInsetBottom());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationHeightApi29", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
            }
        } else {
            rect = new android.graphics.Rect();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.util.SystemNavigationBarUtils");
        return rect;
    }
}
