package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class w2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f158006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gq f158007e;

    public w2(com.tencent.mm.plugin.remittance.ui.h3 h3Var, r45.gq gqVar) {
        this.f158006d = h3Var;
        this.f158007e = gqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.remittance.ui.h3 h3Var = this.f158006d;
        com.tencent.mm.plugin.wallet_core.utils.z1.c(h3Var.f157735d, this.f158007e.f375463e, null);
        h3Var.f157747s = true;
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
