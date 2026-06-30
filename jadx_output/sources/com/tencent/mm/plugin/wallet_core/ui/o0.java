package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes7.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI f180546d;

    public o0(com.tencent.mm.plugin.wallet_core.ui.ShowWxPayAgreementsUI showWxPayAgreementsUI) {
        this.f180546d = showWxPayAgreementsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/ShowWxPayAgreementsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f180546d.f179848d.evaluateJavascript("marketingSwitchClosed()", new com.tencent.mm.plugin.wallet_core.ui.n0(this));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/ShowWxPayAgreementsUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
