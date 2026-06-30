package hb4;

/* loaded from: classes.dex */
public class a implements androidx.viewpager.widget.m {
    public void a(android.view.View view, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("transformPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.transforms.DefaultTransformer");
        float f18 = 0.0f;
        if (0.0f <= f17 && f17 <= 1.0f) {
            f18 = 1.0f - f17;
        } else if (-1.0f < f17 && f17 < 0.0f) {
            f18 = f17 + 1.0f;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/transforms/DefaultTransformer", "transformPage", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/transforms/DefaultTransformer", "transformPage", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setTranslationX(view.getWidth() * (-f17));
        view.setTranslationY(f17 * view.getHeight());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("transformPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.transforms.DefaultTransformer");
    }
}
