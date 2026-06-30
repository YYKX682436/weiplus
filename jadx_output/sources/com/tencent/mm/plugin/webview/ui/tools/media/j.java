package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes3.dex */
public final class j implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185785a;

    public j(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f185785a = mPVideoPlayFullScreenView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185785a;
        if (mPVideoPlayFullScreenView.f185726x0) {
            return;
        }
        android.view.View view = mPVideoPlayFullScreenView.f185713m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "hideToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "hideToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = mPVideoPlayFullScreenView.f185712i;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "hideToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "hideToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = mPVideoPlayFullScreenView.f185709f;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "hideToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "hideToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
