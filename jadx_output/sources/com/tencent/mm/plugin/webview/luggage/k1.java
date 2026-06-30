package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class k1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182546d;

    public k1(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182546d = e0Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/luggage/LuggageMMWebPage$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182546d;
        if (e0Var.f182188v.isShown()) {
            e0Var.f182188v.a();
        }
        if (motionEvent.getAction() == 0) {
            e0Var.f182191x0 = (int) motionEvent.getRawX();
            e0Var.f182194y0 = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/luggage/LuggageMMWebPage$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
