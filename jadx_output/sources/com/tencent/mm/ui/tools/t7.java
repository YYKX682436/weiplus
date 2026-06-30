package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public final class t7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.NewCountryCodeUI f210773d;

    public t7(com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI) {
        this.f210773d = newCountryCodeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/NewCountryCodeUI$initMaskView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.tools.NewCountryCodeUI.E;
        this.f210773d.U6();
        yj0.a.h(this, "com/tencent/mm/ui/tools/NewCountryCodeUI$initMaskView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
