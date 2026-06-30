package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class i1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.m1 f187260d;

    public i1(com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var) {
        this.f187260d = m1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView$initView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f187260d.A();
        yj0.a.i(true, this, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView$initView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
