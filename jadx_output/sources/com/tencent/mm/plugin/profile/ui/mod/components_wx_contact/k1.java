package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.m1 f154090e;

    public k1(java.lang.String str, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.m1 m1Var) {
        this.f154089d = str;
        this.f154090e = m1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/PhonePreviewUIWxContact$loadCustomView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("copy phone num, size: ");
        java.lang.String str = this.f154089d;
        sb6.append(str.length());
        com.tencent.mars.xlog.Log.i("MicroMsg.PhonePreviewUI", sb6.toString());
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.m1 m1Var = this.f154090e;
        com.tencent.mm.sdk.platformtools.b0.d(m1Var.getContext(), null, str, null);
        android.app.Activity context = m1Var.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.d(com.tencent.mm.R.string.f490361st);
        e4Var.f211779f = false;
        e4Var.c();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/PhonePreviewUIWxContact$loadCustomView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
