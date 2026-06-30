package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.n1 f153949e;

    public l1(java.lang.String str, com.tencent.mm.plugin.profile.ui.mod.components.n1 n1Var) {
        this.f153948d = str;
        this.f153949e = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components/PhonePreviewUI$loadCustomView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("copy phone num, size: ");
        java.lang.String str = this.f153948d;
        sb6.append(str.length());
        com.tencent.mars.xlog.Log.i("MicroMsg.PhonePreviewUI", sb6.toString());
        com.tencent.mm.plugin.profile.ui.mod.components.n1 n1Var = this.f153949e;
        com.tencent.mm.sdk.platformtools.b0.d(n1Var.getContext(), null, str, null);
        android.app.Activity context = n1Var.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.d(com.tencent.mm.R.string.f490361st);
        e4Var.f211779f = false;
        e4Var.c();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components/PhonePreviewUI$loadCustomView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
