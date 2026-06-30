package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class y7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174451d;

    public y7(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f174451d = textStatusDoWhatActivityV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174451d;
        android.view.View findViewById = textStatusDoWhatActivityV2.findViewById(com.tencent.mm.R.id.d9q);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = textStatusDoWhatActivityV2.f173537e;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        android.view.View a76 = textStatusDoWhatActivityV2.a7();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(a76, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a76.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(a76, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View e76 = textStatusDoWhatActivityV2.e7();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(e76, arrayList4.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e76.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(e76, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bi4.d1 d1Var = textStatusDoWhatActivityV2.f173544n;
        if (d1Var != null) {
            d1Var.f354945o = 1;
        }
        if (textStatusDoWhatActivityV2.c7().y() || textStatusDoWhatActivityV2.c7().z()) {
            textStatusDoWhatActivityV2.b7().setVisibility(0);
        } else if (textStatusDoWhatActivityV2.c7().x() || textStatusDoWhatActivityV2.c7().D()) {
            textStatusDoWhatActivityV2.b7().setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
