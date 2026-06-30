package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f188067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug3.k f188068e;

    public v(com.tencent.mm.plugin.webwx.ui.k0 k0Var, ug3.k kVar) {
        this.f188067d = k0Var;
        this.f188068e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webwx.ui.k0 k0Var = this.f188067d;
        boolean z17 = k0Var.f188020J;
        ug3.k kVar = this.f188068e;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0(k0Var.f188021d, 1, true);
            k0Var2.r(k0Var.f188021d.getString(com.tencent.mm.R.string.ghu), 17, i65.a.b(k0Var.f188021d, 14), null);
            k0Var2.f211872n = new com.tencent.mm.plugin.webwx.ui.t(k0Var);
            k0Var2.f211881s = new com.tencent.mm.plugin.webwx.ui.u(kVar, k0Var);
            k0Var2.v();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginDeviceAdapter", kVar.f392471n + ", open message notify");
            com.tencent.mm.plugin.webwx.ui.k0.i(k0Var, kVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
