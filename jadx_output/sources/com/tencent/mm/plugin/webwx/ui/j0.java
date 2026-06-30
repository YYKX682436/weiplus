package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f188017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f188018e;

    public j0(ug3.k kVar, com.tencent.mm.plugin.webwx.ui.k0 k0Var) {
        this.f188017d = kVar;
        this.f188018e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ug3.k kVar = this.f188017d;
        int i17 = kVar.f392471n;
        com.tencent.mm.plugin.webwx.ui.r rVar = this.f188018e.f188022e;
        if (rVar != null) {
            int i18 = kVar.f392464d;
            int i19 = kVar.f392470m;
            java.lang.String exitConfirm = kVar.f427557u;
            kotlin.jvm.internal.o.f(exitConfirm, "exitConfirm");
            java.lang.String str = kVar.f392473p;
            if (str == null) {
                str = "";
            }
            com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI loginDeviceListUI = (com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI) rVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginDeviceListUI", "logoutDevice targetDeviceType: " + i18 + " exitConfirm: " + exitConfirm);
            if (loginDeviceListUI.f187983e == ug3.i.f427539m) {
                db5.e1.A(loginDeviceListUI.getContext(), exitConfirm, loginDeviceListUI.getString(com.tencent.mm.R.string.f490573yv), loginDeviceListUI.getString(com.tencent.mm.R.string.l7x), loginDeviceListUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.webwx.ui.q(i18, i19, str, loginDeviceListUI), null);
            } else {
                loginDeviceListUI.finish();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
