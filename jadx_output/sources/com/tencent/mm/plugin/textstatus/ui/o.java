package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.p f174137d;

    public o(com.tencent.mm.plugin.textstatus.ui.p pVar) {
        this.f174137d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/HalfScreenLikeActionBarUIC$onCreateAfter$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f174137d.getActivity().finish();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/HalfScreenLikeActionBarUIC$onCreateAfter$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
