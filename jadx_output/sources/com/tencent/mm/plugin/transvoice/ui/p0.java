package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175457d;

    public p0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175457d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175457d;
        if (v0Var.f175499z) {
            v0Var.B = com.tencent.mm.plugin.transvoice.ui.w.f175501e;
            v0Var.M(false);
            com.tencent.mm.plugin.transvoice.ui.v0.I(v0Var, true);
            android.widget.ImageView imageView = v0Var.f175489r;
            if (imageView != null) {
                imageView.setImageResource(com.tencent.mm.R.drawable.f481236o2);
            }
        } else {
            v0Var.B = com.tencent.mm.plugin.transvoice.ui.w.f175502f;
            v0Var.M(true);
            com.tencent.mm.plugin.transvoice.ui.v0.I(v0Var, false);
            android.widget.ImageView imageView2 = v0Var.f175489r;
            if (imageView2 != null) {
                imageView2.setImageResource(com.tencent.mm.R.drawable.f481235o1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
