package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class b4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.c4 f116204d;

    public b4(com.tencent.mm.plugin.finder.live.view.c4 c4Var, java.lang.String str) {
        this.f116204d = c4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.text.Editable text;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditWidget$refreshTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.c4 c4Var = this.f116204d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = c4Var.K;
        if (mMEditText != null) {
            mMEditText.setText("");
        }
        android.widget.TextView textView = c4Var.L;
        if (textView != null) {
            textView.setVisibility(4);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = c4Var.K;
        if (mMEditText2 != null) {
            mMEditText2.setSelection((mMEditText2 == null || (text = mMEditText2.getText()) == null) ? 0 : text.length());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditWidget$refreshTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
