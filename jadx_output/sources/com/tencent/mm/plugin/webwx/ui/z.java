package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f188076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug3.k f188077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f188078f;

    public z(com.tencent.mm.plugin.webwx.ui.k0 k0Var, ug3.k kVar, android.animation.Animator animator) {
        this.f188076d = k0Var;
        this.f188077e = kVar;
        this.f188078f = animator;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webwx.ui.k0 k0Var = this.f188076d;
        if (k0Var.K) {
            k0Var.f188035u.setBackgroundResource(com.tencent.mm.R.drawable.f481266oy);
            k0Var.f188036v.setIconColor(k0Var.f188021d.getResources().getColor(com.tencent.mm.R.color.FG_0));
        } else {
            k0Var.f188035u.setBackgroundResource(com.tencent.mm.R.drawable.f481267oz);
            k0Var.f188036v.setIconColor(k0Var.f188021d.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ug3.k kVar = this.f188077e;
        sb6.append(kVar.f392471n);
        sb6.append(", lockUnlockWebEx isLock:");
        sb6.append(k0Var.K);
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginDeviceAdapter", sb6.toString());
        int i17 = k0Var.K ? 2 : 1;
        int i18 = kVar.f392464d;
        k0Var.getClass();
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) iy4.w0.f296018g).get(java.lang.Integer.valueOf(i18));
        if (num != null) {
            i18 = num.intValue();
        }
        new iy4.w0(i17, i18, kVar.f392473p, 1).doScene(gm0.j1.d().f70764d, new com.tencent.mm.plugin.webwx.ui.y(k0Var, kVar));
        k0Var.f188038x.setVisibility(0);
        this.f188078f.start();
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
