package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class gc extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusHalfScreenLikeListUI f173912a;

    public gc(com.tencent.mm.plugin.textstatus.ui.TextStatusHalfScreenLikeListUI textStatusHalfScreenLikeListUI) {
        this.f173912a = textStatusHalfScreenLikeListUI;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusHalfScreenLikeListUI textStatusHalfScreenLikeListUI = this.f173912a;
        android.view.View view = textStatusHalfScreenLikeListUI.f173631h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusHalfScreenLikeListUI$initData$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusHalfScreenLikeListUI$initData$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (textStatusHalfScreenLikeListUI.f173628e.isEmpty()) {
            android.widget.TextView textView = textStatusHalfScreenLikeListUI.f173630g;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        android.widget.TextView textView2 = textStatusHalfScreenLikeListUI.f173630g;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }
}
