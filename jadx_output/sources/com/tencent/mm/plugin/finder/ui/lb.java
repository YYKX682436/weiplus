package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class lb implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f129469d;

    public lb(java.util.ArrayList arrayList) {
        this.f129469d = arrayList;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        java.util.ArrayList<android.view.View> arrayList = this.f129469d;
        for (android.view.View view : arrayList) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderMsgFeedDetailUI$showThankTips$1$1$1$1$2", "onDismiss", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderMsgFeedDetailUI$showThankTips$1$1$1$1$2", "onDismiss", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        arrayList.clear();
    }
}
