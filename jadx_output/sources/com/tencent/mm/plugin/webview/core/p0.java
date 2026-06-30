package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class p0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181905d;

    public p0(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        this.f181905d = r0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/core/BaseWebViewController$webPageOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent != null && motionEvent.getAction() == 0) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181905d;
            r0Var.f181923d0.f182029b = java.lang.System.currentTimeMillis();
            android.graphics.Point point = r0Var.f181923d0.f182028a;
            point.x = x17;
            point.y = y17;
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/core/BaseWebViewController$webPageOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
