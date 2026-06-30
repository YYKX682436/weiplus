package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class a4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f117722d;

    public a4(kotlin.jvm.internal.h0 h0Var) {
        this.f117722d = h0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterNextLiveInfoWidget$updateNoticeDesc$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (!((com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView) this.f117722d.f310123d).isFolding) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 1) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterNextLiveInfoWidget$updateNoticeDesc$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
