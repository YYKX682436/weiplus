package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f188001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f188002e;

    public d0(ug3.k kVar, com.tencent.mm.plugin.webwx.ui.k0 k0Var) {
        this.f188001d = kVar;
        this.f188002e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ug3.k kVar = this.f188001d;
        boolean z17 = kVar.L;
        com.tencent.mm.plugin.webwx.ui.k0 k0Var = this.f188002e;
        if (z17) {
            ug3.i.H(kVar, com.tencent.mm.modelsimple.r1.f71403e);
            kVar.L = false;
            k0Var.D.setChecked(!r9.isChecked());
        } else {
            android.content.Context context = k0Var.f188021d;
            java.lang.String str = kVar.A;
            java.lang.String string = context.getString(com.tencent.mm.R.string.l7p);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = string;
            }
            db5.e1.A(context, str, k0Var.f188021d.getString(com.tencent.mm.R.string.l7r), k0Var.f188021d.getString(com.tencent.mm.R.string.l7q), k0Var.f188021d.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.webwx.ui.b0(kVar, k0Var), com.tencent.mm.plugin.webwx.ui.c0.f187999d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
