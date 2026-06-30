package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes.dex */
public class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView f190875d;

    public i2(com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView profileMobilePhoneView) {
        this.f190875d = profileMobilePhoneView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String charSequence = ((android.widget.TextView) view).getText().toString();
        int i17 = com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView.f189813n;
        com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView profileMobilePhoneView = this.f190875d;
        profileMobilePhoneView.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(profileMobilePhoneView.getContext(), false, 1);
        k0Var.f211872n = new com.tencent.mm.pluginsdk.ui.j2(profileMobilePhoneView);
        k0Var.f211881s = new com.tencent.mm.pluginsdk.ui.k2(profileMobilePhoneView, charSequence);
        k0Var.v();
        profileMobilePhoneView.f189819m.onClick(view);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
