package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class h4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.o4 f187249d;

    public h4(com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var) {
        this.f187249d = o4Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController$initWebView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            int x17 = (int) motionEvent.getX();
            com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = this.f187249d;
            o4Var.f187475t = x17;
            o4Var.f187476u = (int) motionEvent.getY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithController$initWebView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
