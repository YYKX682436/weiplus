package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i8 f120422d;

    public y7(com.tencent.mm.plugin.finder.live.widget.i8 i8Var) {
        this.f120422d = i8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Context context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.i8 i8Var = this.f120422d;
        android.widget.EditText editText = i8Var.f118649J;
        i8Var.getClass();
        if (editText != null) {
            editText.requestFocus();
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
