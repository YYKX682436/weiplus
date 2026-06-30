package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.h f132059d;

    public f(com.tencent.mm.plugin.finder.view.h hVar) {
        this.f132059d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.h hVar = this.f132059d;
        android.view.View.OnClickListener onClickListener = hVar.f132199i;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        hVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
