package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes8.dex */
public class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI f179451d;

    public o1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI wcPayRealnameVerifyBindcardEntranceUI) {
        this.f179451d = wcPayRealnameVerifyBindcardEntranceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyBindcardEntranceUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI wcPayRealnameVerifyBindcardEntranceUI = this.f179451d;
        wcPayRealnameVerifyBindcardEntranceUI.getInput().putBoolean("realname_verify_process_do_bind", true);
        com.tencent.mm.wallet_core.a.d(wcPayRealnameVerifyBindcardEntranceUI.getContext(), wcPayRealnameVerifyBindcardEntranceUI.getInput());
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyBindcardEntranceUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
