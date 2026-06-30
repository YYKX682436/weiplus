package n74;

/* loaded from: classes4.dex */
public abstract class i1 {
    public static void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animHideView", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        if (view.getVisibility() == 0) {
            view.hashCode();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/helper/FullCardCoverImageHelper", "animHideView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/helper/FullCardCoverImageHelper", "animHideView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            view.startAnimation(alphaAnimation);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animHideView", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
    }

    public static void b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animShowView", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        if (view.getVisibility() != 0) {
            view.hashCode();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/helper/FullCardCoverImageHelper", "animShowView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/helper/FullCardCoverImageHelper", "animShowView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            view.startAnimation(alphaAnimation);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animShowView", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
    }

    public static void c(com.tencent.mm.plugin.sns.storage.n nVar, int i17, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkCoverImageState", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        if (nVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCoverImageState", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new n74.h1(i17, nVar, imageView, nVar.f166074i, imageView2, nVar.f166075j));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCoverImageState", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        }
    }

    public static void d(java.lang.String str, android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkResetCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
            imageView.setVisibility(4);
            imageView.setImageDrawable(null);
            imageView.setTag(com.tencent.mm.R.id.n1z, "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        } else if (!str.equals((java.lang.String) imageView.getTag(com.tencent.mm.R.id.n1z))) {
            imageView.setImageDrawable(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkResetCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
    }
}
