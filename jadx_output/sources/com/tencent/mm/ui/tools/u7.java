package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public final class u7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.NewCountryCodeUI f210816d;

    public u7(com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI) {
        this.f210816d = newCountryCodeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/NewCountryCodeUI$setActionBar$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI = this.f210816d;
        newCountryCodeUI.hideVKB();
        int i17 = com.tencent.mm.ui.tools.NewCountryCodeUI.E;
        newCountryCodeUI.X6();
        yj0.a.h(this, "com/tencent/mm/ui/tools/NewCountryCodeUI$setActionBar$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
