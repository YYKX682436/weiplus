package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ab implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f183910d;

    public ab(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f183910d = webViewUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$29", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f183910d;
        com.tencent.mm.plugin.webview.core.e3 e3Var = webViewUI.L1;
        if (e3Var != null) {
            e3Var.f181820v1.f181980a = true;
        }
        android.view.View view2 = webViewUI.f183863v;
        if (view2 != null && view2.getVisibility() == 0) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(webViewUI, com.tencent.mm.R.anim.f477802bv);
            loadAnimation.setAnimationListener(new com.tencent.mm.plugin.webview.ui.tools.za(this));
            webViewUI.f183863v.startAnimation(loadAnimation);
            android.view.View view3 = webViewUI.f183863v;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$29", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$29", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            if (!view.hasFocus()) {
                view.requestFocus();
            }
            if (motionEvent.getAction() == 0) {
                webViewUI.f183827j2 = (int) motionEvent.getX();
                webViewUI.f183829k2 = (int) motionEvent.getY();
                com.tencent.mm.plugin.webview.core.e3 e3Var2 = webViewUI.L1;
                if (e3Var2 != null) {
                    int i17 = webViewUI.f183827j2;
                    int i18 = webViewUI.f183829k2;
                    com.tencent.mm.plugin.webview.core.t2 t2Var = e3Var2.f181820v1;
                    android.graphics.Point point = t2Var.f181982c;
                    if (point == null) {
                        t2Var.f181982c = new android.graphics.Point(i17, i18);
                    } else {
                        point.x = i17;
                        point.y = i18;
                    }
                    t2Var.f181983d = java.lang.System.currentTimeMillis();
                }
            }
        }
        if (webViewUI.f183815f == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$29", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 5 || motionEvent.getAction() == 5 || motionEvent.getAction() == 261 || motionEvent.getAction() == 517) {
            if (motionEvent.getPointerCount() > 1) {
                webViewUI.f183815f.getSettings().r(true);
                webViewUI.f183815f.getSettings().N(true);
            } else {
                webViewUI.f183815f.getSettings().r(false);
                webViewUI.f183815f.getSettings().N(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$29", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
