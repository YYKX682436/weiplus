package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes3.dex */
public class y4 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f158049d;

    public y4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI) {
        this.f158049d = remittanceDetailUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$36", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f158049d;
        if (remittanceDetailUI.f157360n2 == null) {
            remittanceDetailUI.f157360n2 = new rl5.r(remittanceDetailUI.getContext());
        }
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI2 = this.f158049d;
        remittanceDetailUI2.f157360n2.h(view, remittanceDetailUI2, remittanceDetailUI2.f157370r2, remittanceDetailUI2.f157362o2, remittanceDetailUI2.f157366p2);
        remittanceDetailUI.f157368q2 = view.getId();
        yj0.a.i(true, this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$36", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
