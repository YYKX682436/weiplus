package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes3.dex */
public final class b5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187114d;

    public b5(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var) {
        this.f187114d = z5Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        if (view.getId() == com.tencent.mm.R.id.jsh && this.f187114d.B.getLineCount() >= 5) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if (event.getAction() == 1) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
