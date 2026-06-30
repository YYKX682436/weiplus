package gb4;

/* loaded from: classes4.dex */
public class n extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment f270069a;

    public n(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment) {
        this.f270069a = contentFragment;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$8");
        java.lang.String action = intent.getAction();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceive, action=");
        sb6.append(action);
        sb6.append(", isSphereCom=");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment = this.f270069a;
        sb6.append(contentFragment.H);
        sb6.append(", isFullScreen=");
        sb6.append(contentFragment.I);
        com.tencent.mars.xlog.Log.i("ContentFragmentSphereImageView", sb6.toString());
        if ("com.tencent.mm.adlanding.sphereimage.next_page_view_show".equals(action)) {
            androidx.fragment.app.FragmentActivity activity = contentFragment.getActivity();
            if (activity instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) {
                boolean E7 = ((com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) activity).E7();
                com.tencent.mars.xlog.Log.i("ContentFragmentSphereImageView", "hasNextPage=" + E7);
                if (E7) {
                    android.view.View view = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(contentFragment).f270075e;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$8", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$8", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(500L);
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(contentFragment).f270075e.startAnimation(alphaAnimation);
                }
            }
        } else if ("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_none".equals(action)) {
            if (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(contentFragment).f270075e.getVisibility() == 0) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(contentFragment).f270075e, "alpha", 0.5f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
        } else if ("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_half".equals(action)) {
            if (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(contentFragment).f270075e.getVisibility() == 0) {
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(contentFragment).f270075e, "alpha", 1.0f, 0.5f);
                ofFloat2.setDuration(300L);
                ofFloat2.start();
            }
        } else if ("com.tencent.mm.adlanding.sphereimage.next_page_view_hide".equals(action) && com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(contentFragment).f270075e.getVisibility() == 0) {
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(250L);
            alphaAnimation2.setFillAfter(true);
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m0(contentFragment).f270075e.startAnimation(alphaAnimation2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$8");
    }
}
