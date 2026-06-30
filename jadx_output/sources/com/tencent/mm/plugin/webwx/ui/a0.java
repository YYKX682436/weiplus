package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f187993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug3.k f187994e;

    public a0(com.tencent.mm.plugin.webwx.ui.k0 k0Var, ug3.k kVar) {
        this.f187993d = k0Var;
        this.f187994e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", "filehelper");
        intent.putExtra("key_show_bottom_app_panel", true);
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        com.tencent.mm.plugin.webwx.ui.k0 k0Var = this.f187993d;
        y7Var.j(intent, k0Var.f188021d);
        int i17 = this.f187994e.f392471n;
        com.tencent.mm.plugin.webwx.ui.r rVar = k0Var.f188022e;
        if (rVar != null) {
            ((com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI) rVar).finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
