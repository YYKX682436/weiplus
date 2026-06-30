package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f188014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f188015e;

    public i0(ug3.k kVar, com.tencent.mm.plugin.webwx.ui.k0 k0Var) {
        this.f188014d = kVar;
        this.f188015e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ug3.k kVar = this.f188014d;
        boolean z17 = kVar.N;
        com.tencent.mm.plugin.webwx.ui.k0 k0Var = this.f188015e;
        if (!z17) {
            android.content.Context context = k0Var.f188021d;
            java.lang.String str = kVar.C;
            java.lang.String string = context.getString(com.tencent.mm.R.string.n3k);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = string;
            }
            db5.e1.A(context, str, k0Var.f188021d.getString(com.tencent.mm.R.string.n3l), k0Var.f188021d.getString(com.tencent.mm.R.string.l7q), k0Var.f188021d.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.webwx.ui.g0(kVar, k0Var), com.tencent.mm.plugin.webwx.ui.h0.f188012d);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(kVar.D)) {
            ug3.i.I(kVar, r45.l44.kKeepLoggedInDisabled);
            kVar.N = false;
            k0Var.F.setChecked(!r11.isChecked());
        } else {
            android.content.Context context2 = k0Var.f188021d;
            db5.e1.A(context2, kVar.D, context2.getString(com.tencent.mm.R.string.n3j), k0Var.f188021d.getString(com.tencent.mm.R.string.f490356so), k0Var.f188021d.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.webwx.ui.e0(kVar, k0Var), com.tencent.mm.plugin.webwx.ui.f0.f188006d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
