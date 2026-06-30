package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.xh f119638d;

    public rh(com.tencent.mm.plugin.finder.live.widget.xh xhVar) {
        this.f119638d = xhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$updateViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.xh xhVar = this.f119638d;
        android.widget.EditText editText = xhVar.f120329o;
        editText.setVisibility(0);
        xhVar.f120328n.setVisibility(8);
        android.view.View view2 = xhVar.f120333s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget", "changeToInputMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget", "changeToInputMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        editText.requestFocus();
        editText.setSelection(editText.getText().length());
        java.lang.Object systemService = xhVar.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$updateViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
