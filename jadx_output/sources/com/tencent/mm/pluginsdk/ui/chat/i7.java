package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class i7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190399d;

    public i7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        this.f190399d = c8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$fullScreenEdtLayout$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190399d;
        c8Var.f190221c.k();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((jz5.n) c8Var.f190228j).getValue();
        com.tencent.mars.xlog.Log.i("ChatFooterKt", "fulledt container click called " + (inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(c8Var.f190221c.j(), 0)) : null));
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$fullScreenEdtLayout$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
