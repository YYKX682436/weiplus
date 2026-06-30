package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.r2 f203052d;

    public p2(com.tencent.mm.ui.chatting.view.r2 r2Var) {
        this.f203052d = r2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/view/QuoteTipsPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.view.r2 r2Var = this.f203052d;
        android.view.View.OnClickListener onClickListener = r2Var.f203079j;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        r2Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/view/QuoteTipsPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
