package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public final class u7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage f157977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f157978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f157979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f157980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f157981h;

    public u7(com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage, com.tencent.mm.ui.widget.MMEditText mMEditText, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, java.util.ArrayList arrayList) {
        this.f157977d = remittanceRemarkInputHalfPage;
        this.f157978e = mMEditText;
        this.f157979f = c0Var;
        this.f157980g = h0Var;
        this.f157981h = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceRemarkInputHalfPage$showDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("launch_from_remittance", true);
        com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage = this.f157977d;
        remittanceRemarkInputHalfPage.f157561d.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.remittance.ui.t7(this.f157978e, this.f157979f, this.f157980g, this.f157981h, remittanceRemarkInputHalfPage));
        com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage2 = this.f157977d;
        remittanceRemarkInputHalfPage2.f157561d.hideVKB(this.f157978e);
        intent.putExtra("enter_scene_address", 4);
        j45.l.n(remittanceRemarkInputHalfPage2.f157561d, "address", ".ui.WalletSelectAddrUI", intent, 123);
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceRemarkInputHalfPage$showDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
