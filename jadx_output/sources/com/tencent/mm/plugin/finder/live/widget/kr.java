package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class kr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mr f118854d;

    public kr(com.tencent.mm.plugin.finder.live.widget.mr mrVar) {
        this.f118854d = mrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePostStrengthenPanel$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.mr mrVar = this.f118854d;
        mrVar.h0(4);
        android.view.View.OnClickListener onClickListener = mrVar.A1;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        java.lang.Object systemService = mrVar.f118183e.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.tencent.mm.ui.widget.MMEditText mMEditText = mrVar.N;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("descEdt");
            throw null;
        }
        inputMethodManager.hideSoftInputFromWindow(mMEditText.getWindowToken(), 0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostStrengthenPanel$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
