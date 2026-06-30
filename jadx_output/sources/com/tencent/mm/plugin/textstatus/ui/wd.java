package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class wd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.yd f174412d;

    public wd(com.tencent.mm.plugin.textstatus.ui.yd ydVar) {
        this.f174412d = ydVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusNotifyItemUIC$showNotifyView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bj4.a.f21163a.a(this.f174412d.getContext(), 0, true);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusNotifyItemUIC$showNotifyView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
