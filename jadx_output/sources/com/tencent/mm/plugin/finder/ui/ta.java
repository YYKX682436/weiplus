package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class ta implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderModifyNameUI f129870d;

    public ta(com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI) {
        this.f129870d = finderModifyNameUI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI = this.f129870d;
        android.widget.EditText editText = finderModifyNameUI.f128629u;
        if (editText == null) {
            kotlin.jvm.internal.o.o("edit");
            throw null;
        }
        if (kotlin.jvm.internal.o.b(view, editText)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                android.widget.ScrollView scrollView = finderModifyNameUI.A;
                if (scrollView == null) {
                    kotlin.jvm.internal.o.o("scrollView");
                    throw null;
                }
                scrollView.requestDisallowInterceptTouchEvent(true);
            } else if (actionMasked == 1 || actionMasked == 3) {
                android.widget.ScrollView scrollView2 = finderModifyNameUI.A;
                if (scrollView2 == null) {
                    kotlin.jvm.internal.o.o("scrollView");
                    throw null;
                }
                scrollView2.requestDisallowInterceptTouchEvent(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
