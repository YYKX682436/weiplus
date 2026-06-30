package ex4;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex4.o f257211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f257212e;

    public b(ex4.o oVar, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f257211d = oVar;
        this.f257212e = webViewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper$enterSnapshotMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ex4.o oVar = this.f257211d;
        oVar.getClass();
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI context = this.f257212e;
        kotlin.jvm.internal.o.g(context, "context");
        if (oVar.f257227c && java.lang.Math.abs(java.lang.System.currentTimeMillis() - oVar.f257244t) >= 2000) {
            oVar.f257244t = java.lang.System.currentTimeMillis();
            android.view.View view2 = oVar.f257237m;
            if ((view2 != null ? view2.getVisibility() : 8) == 0) {
                android.view.View view3 = oVar.f257238n;
                if (view3 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper", "snapshotTipsToHighlightState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper", "snapshotTipsToHighlightState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 0.2f);
                    alphaAnimation.setRepeatCount(1);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setRepeatMode(2);
                    alphaAnimation.setAnimationListener(new ex4.g(oVar));
                    view3.startAnimation(alphaAnimation);
                }
            } else {
                android.view.View view4 = oVar.f257237m;
                if (view4 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper", "snapshotTipsToHighlightState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper", "snapshotTipsToHighlightState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view5 = oVar.f257237m;
                if (view5 != null) {
                    android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, ((java.lang.Number) ((jz5.n) oVar.f257226b).getValue()).intValue() - ((java.lang.Number) ((jz5.n) oVar.f257225a).getValue()).intValue(), 0.0f);
                    translateAnimation.setDuration(120L);
                    translateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
                    translateAnimation.setAnimationListener(new ex4.h());
                    view5.startAnimation(translateAnimation);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper$enterSnapshotMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
