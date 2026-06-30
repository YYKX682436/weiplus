package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public class zc implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.GestureDetector f187727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f187728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.ld f187730g;

    public zc(com.tencent.mm.plugin.webview.ui.tools.ld ldVar, android.view.GestureDetector gestureDetector, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f187730g = ldVar;
        this.f187727d = gestureDetector;
        this.f187728e = atomicBoolean;
        this.f187729f = webViewUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.GestureDetector gestureDetector = this.f187727d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 1 && this.f187728e.getAndSet(false)) {
            com.tencent.mm.plugin.webview.ui.tools.ld.a(this.f187730g, this.f187729f, motionEvent, "longpress_end");
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
