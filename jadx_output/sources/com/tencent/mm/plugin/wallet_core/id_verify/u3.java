package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI f179503d;

    public u3(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI wcPayRealnameVerifyMainUI) {
        this.f179503d = wcPayRealnameVerifyMainUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyMainUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("wallet_lock_jsapi_scene", 2);
        if (com.tencent.mm.wallet_core.b.a().e()) {
            ((h45.q) i95.n0.c(h45.q.class)).startPaySecurityUseCase(2, null);
        } else {
            j45.l.j(this.f179503d.getContext(), "wallet", ".pwd.ui.WalletSecuritySettingUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyMainUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
