package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes3.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI f176965d;

    public j0(com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI repairerVoipQoSUI) {
        this.f176965d = repairerVoipQoSUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/ui/RepairerVoipQoSUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.ui.widget.dialog.k2) ((jz5.n) this.f176965d.e).getValue()).show();
        yj0.a.h(this, "com/tencent/mm/plugin/voip/ui/RepairerVoipQoSUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
